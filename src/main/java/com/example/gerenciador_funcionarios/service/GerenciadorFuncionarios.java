package com.example.gerenciador_funcionarios.service;

import com.example.gerenciador_funcionarios.model.Funcionario;
import com.example.gerenciador_funcionarios.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GerenciadorFuncionarios {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    // Adicionar um funcionário
    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    // Listar todos os funcionários
    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    // Metodo para listar um funcionário específico pelo ID
    public Optional<Funcionario> listarFuncionarioPorId(int id) {
        return funcionarioRepository.findById(id);
    }

    // Atualizar o salário de um funcionário
    public Optional<Funcionario> atualizarSalario(int id, double salario) {
        Optional<Funcionario> funcionario = funcionarioRepository.findById(id);
        if (funcionario.isPresent()) {
            funcionario.get().setSalario(salario);
            return Optional.of(funcionarioRepository.save(funcionario.get()));
        }
        return Optional.empty();
    }

    // Remover um funcionário
    public boolean removerFuncionario(int id) {
        if (funcionarioRepository.existsById(id)) {
            funcionarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
