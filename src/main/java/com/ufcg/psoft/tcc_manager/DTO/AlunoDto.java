package com.ufcg.psoft.tcc_manager.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {
    private String nome;
    //private Long matricula;
    private String email;
    private String conclusao_curso;
}
