package com.ufcg.psoft.tccmanager.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.ufcg.psoft.tccmanager.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;


import com.ufcg.psoft.tccmanager.repository.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.mock.http.server.reactive.MockServerHttpRequest.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@DisplayName("Classe de Teste de Aluno")
public class AlunoV1Test {
    @Autowired
    MockMvc driver;

    @Autowired
    AlunoRepository alunoRepository;

    ObjectMapper objectMapper = new ObjectMapper();

    Aluno aluno;

    AlunoDto alunoDto;

    @BeforeEach
    void setup() {
        objectMapper.registerModule(new JavaTimeModule());
        aluno = alunoRepository.save(Aluno.builder()
                .nome("Aluno 1")
                .email("aluno1@email.com")
                .matricula((long) 123)
                .conclusao_curso((long) 2025)
                .build()
        );
        alunoDto = AlunoDto.builder()
                .nome(aluno.getNome())
                .email(aluno.getEmail())
                .matricula(aluno.getMatricula())
                .conclusao_curso(aluno.getConclusao_curso())
                .build();
    }

    @AfterEach
    void tearDown() {alunoRepository.deleteAll();}
/*
    @Test
    void testeAluno() {
        Aluno alunoTeste = alunoRepository.findByMatricula(123);
        assertEquals(alunoTeste.getNome(), aluno.getNome());
    }
*/
    @Test
    @DisplayName("Quando alteramos o nome do aluno com dados válidos")
    void testeAluno() throws Exception {
        alunoDto.setNome("Aluno Um Alterado");

        String reponseJsonString = driver.perform(put("alunos/" + aluno.getId())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(alunoDto)))
                .andExpect(status().isOk())
                .andDo(print())
                .andReturn().getResponse().getContentAsString();
    }
    //@Nested // Diversas classes dentro de uma classe de Teste

}
