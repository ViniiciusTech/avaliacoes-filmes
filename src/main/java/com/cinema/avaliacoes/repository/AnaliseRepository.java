/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cinema.avaliacoes.repository;

import com.cinema.avaliacoes.model.Analise;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnaliseRepository {
    private List<Analise> analises = new ArrayList<>();
    private Long nextId = 1L;

    public void adicionar(Analise analise) {
        analise.setId(nextId++);
        analises.add(analise);
    }

    public List<Analise> buscarPorFilmeId(Long filmeId) {
        return analises.stream()
                       .filter(a -> a.getFilmeId().equals(filmeId))
                       .collect(Collectors.toList());
    }
}
