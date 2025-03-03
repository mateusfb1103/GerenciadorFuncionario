package com.example.gerenciador_funcionarios.repository;

import com.example.gerenciador_funcionarios.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

}
