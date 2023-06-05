package com.example.restservices.repositories;

import com.example.restservices.entities.FuncionarioProjeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioProjetoRepository extends JpaRepository<FuncionarioProjeto, Integer> {
}
