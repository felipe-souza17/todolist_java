package br.com.felipesouza.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/primeiraRota")
public class MinhaPrimeiraController {
    
    /*
     * Métodos do Http
     * GET - Buscar informação.
     * POST - Adicionar informação.
     * PUT - Alterar uma informação
     * DELETE - Deletar uma informação.
     * PATCH - Alterar somente uma parte da informação.
     */

     // Método (Funcionalidade) de uma classe.
     @GetMapping("/primeiroMetodo")
    public String primeiraMensagem() {
        return "Funcionou";
    }
}
