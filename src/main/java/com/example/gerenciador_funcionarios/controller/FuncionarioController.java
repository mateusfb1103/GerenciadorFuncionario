package com.example.gerenciador_funcionarios.controller;

import com.example.gerenciador_funcionarios.model.Funcionario;
import com.example.gerenciador_funcionarios.service.GerenciadorFuncionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private GerenciadorFuncionarios gerenciadorFuncionarios;

    // Adicionar um funcionário
    @PostMapping
    public String adicionarFuncionario(@RequestBody Funcionario funcionario) {
        gerenciadorFuncionarios.adicionarFuncionario(funcionario);
        return "Funcionário adicionado com sucesso!";
    }

    // Listar todos os funcionários
    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return gerenciadorFuncionarios.listarFuncionarios();
    }

    // Listar um funcionário específico pelo ID
    @GetMapping("/{id}")
    public Funcionario listarFuncionarioPorId(@PathVariable int id) {
        Optional<Funcionario> funcionario = gerenciadorFuncionarios.listarFuncionarioPorId(id);
        return funcionario.orElse(null); // Retorna o funcionário ou null se não encontrado
    }


    // Atualizar o salário de um funcionário
    @PutMapping("/{id}")
    public String atualizarSalario(@PathVariable int id, @RequestParam double salario) {
        Optional<Funcionario> funcionario = gerenciadorFuncionarios.atualizarSalario(id, salario);
        return funcionario.isPresent() ? "Salário atualizado com sucesso!" : "Funcionário não encontrado!";
    }

    // Remover um funcionário
    @DeleteMapping("/{id}")
    public String removerFuncionario(@PathVariable int id) {
        return gerenciadorFuncionarios.removerFuncionario(id) ? "Funcionário removido com sucesso!" : "Funcionário não encontrado!";
    }
}
