package com.ufcg.psoft.tcc_manager.service;

import com.ufcg.psoft.tcc_manager.DTO.AlunoDto;
import com.ufcg.psoft.tcc_manager.model.Aluno;

public interface AlunoService {
    public Aluno cadastraAluno(AlunoDto alunoDto);
    public Aluno atualizaAluno(AlunoDto alunoDto);
    public Aluno buscaAlunoMatricula(long matricula);
}
