package com.ufcg.psoft.tccmanager.service.aluno;

import com.ufcg.psoft.tccmanager.dto.AlunoDto;
import com.ufcg.psoft.tccmanager.model.Aluno;
import com.ufcg.psoft.tccmanager.repository.AlunoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    AlunoRepository alunoRepository;

    //@Autowired
    ModelMapper modelMapper;

    @Override
    public AlunoDto cadastraAluno(AlunoDto alunoDto) {
        Aluno aluno = modelMapper.map(alunoDto, Aluno.class);
        alunoRepository.save(aluno);
        return modelMapper.map(aluno, AlunoDto.class);
    }

    @Override
    public AlunoDto atualizaAluno(AlunoDto alunoDto) {
        return null;
    }

    @Override
    public AlunoDto buscaAlunoMatricula(long matricula) {
        Aluno aluno = alunoRepository.findByMatricula(matricula);
        return new AlunoDto(aluno.getId(), aluno.getNome(), aluno.getMatricula(), aluno.getEmail(), aluno.getConclusao_curso());
    }
}
