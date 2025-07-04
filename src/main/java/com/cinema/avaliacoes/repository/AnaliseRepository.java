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
