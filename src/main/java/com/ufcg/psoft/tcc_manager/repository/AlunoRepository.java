package com.ufcg.psoft.tcc_manager.repository;

import com.ufcg.psoft.tcc_manager.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno fyndByNome(Long matricula);
    boolean existsByMatricula(long matricula);
    boolean existsByNome(String nome);

}
