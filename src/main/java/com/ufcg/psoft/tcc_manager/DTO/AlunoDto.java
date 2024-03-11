package com.ufcg.psoft.tcc_manager.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlunoDto {
    @NotNull
    private String nome;
    private Long matricula;
    private String email;
    private String conclusao_curso;
}
