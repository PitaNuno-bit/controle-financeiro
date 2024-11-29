package com.programacao.web.fatec.api_fatec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.programacao.web.fatec.api_fatec.domain.CategoriaRepository;
import com.programacao.web.fatec.api_fatec.entities.Categoria;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria salvar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public boolean existsByDescricao(String descricao){
        return categoriaRepository.existsByDescricao(descricao);
    }
    
}
