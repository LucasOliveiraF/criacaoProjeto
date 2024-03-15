package com.ufcg.psoft.tccmanager.service.aluno;

import com.ufcg.psoft.tccmanager.dto.AlunoDto;
import com.ufcg.psoft.tccmanager.model.Aluno;

public interface AlunoService {
    public AlunoDto cadastraAluno(AlunoDto alunoDto);
    public AlunoDto atualizaAluno(AlunoDto alunoDto);
    public AlunoDto buscaAlunoMatricula(long matricula);
}
