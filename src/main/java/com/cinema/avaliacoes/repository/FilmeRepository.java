/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinema.avaliacoes.repository;

import com.cinema.avaliacoes.model.Filme;
import java.util.ArrayList;
import java.util.List;

public class FilmeRepository {
    private List<Filme> filmes = new ArrayList<>();
    private Long nextId = 1L;

    public void adicionar(Filme filme) {
        filme.setId(nextId++);
        filmes.add(filme);
    }

    public List<Filme> listar() {
        return filmes;
    }

    public Filme buscarPorId(Long id) {
        return filmes.stream()
                     .filter(f -> f.getId().equals(id))
                     .findFirst()
                     .orElse(null);
    }
}

