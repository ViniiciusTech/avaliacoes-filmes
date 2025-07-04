/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinema.avaliacoes.controller;

import com.cinema.avaliacoes.model.Filme;
import com.cinema.avaliacoes.model.Analise;
import com.cinema.avaliacoes.repository.FilmeRepository;
import com.cinema.avaliacoes.repository.AnaliseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FilmeController {

    private FilmeRepository filmeRepo = new FilmeRepository();
    private AnaliseRepository analiseRepo = new AnaliseRepository();

    // Exibe a lista de filmes
    @GetMapping("/filmes")
    public String listarFilmes(Model model) {
        model.addAttribute("filmes", filmeRepo.listar());
        return "lista-filmes";
    }

    // Exibe o formulário para cadastrar um novo filme
    @GetMapping("/filmes/novo")
    public String novoFilme(Model model) {
        model.addAttribute("filme", new Filme());
        return "form-filme";
    }

    // Salva o novo filme
    @PostMapping("/filmes")
    public String salvarFilme(@ModelAttribute Filme filme) {
        filmeRepo.adicionar(filme);
        return "redirect:/filmes";
    }

    // Exibe os detalhes de um filme e suas análises
    @GetMapping("/filmes/{id}")
    public String detalhesFilme(@PathVariable Long id, Model model) {
        Filme filme = filmeRepo.buscarPorId(id);
        model.addAttribute("filme", filme);
        model.addAttribute("analises", analiseRepo.buscarPorFilmeId(id));
        model.addAttribute("analise", new Analise());
        return "detalhes-filme";
    }

    // Adiciona uma análise ao filme
    @PostMapping("/filmes/{id}/analise")
    public String adicionarAnalise(@PathVariable Long id, @ModelAttribute Analise analise) {
        analise.setFilmeId(id);
        analiseRepo.adicionar(analise);
        return "redirect:/filmes/" + id;
    }
}

