package com.ufcg.psoft.tccmanager.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {

    @JsonProperty("id")
    @NotBlank(message = "Nome é obrigatório")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @JsonProperty("nome")
    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @JsonProperty("matricula")
    @NotBlank(message = "Matrícula é obrigatório")
    private Long matricula;

    @JsonProperty("email")
    @NotBlank(message = "Email é obrigatório")
    private String email;

    @JsonProperty("conclusao_curso")
    @NotBlank(message = "Ano de conclusao do curso é obrigatório")
    private Long conclusao_curso;
}
