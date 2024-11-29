package com.programacao.web.fatec.api_fatec.controllers;

import com.programacao.web.fatec.api_fatec.dto.CategoriaDto;
import com.programacao.web.fatec.api_fatec.entities.Categoria;
import com.programacao.web.fatec.api_fatec.service.CategoriaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService CategoriaService;

    // Método para criar um novo Categoria
    @PostMapping
    public ResponseEntity<CategoriaDto> criar(@RequestBody CategoriaDto CategoriaDto) {
        try {
            Categoria Categoria = new Categoria();
            Categoria.setDescricao(CategoriaDto.getDescricao());

            Categoria savedCategoria = CategoriaService.salvar(Categoria);

            CategoriaDto savedCategoriaDto = new CategoriaDto(savedCategoria.getId(), savedCategoria.getDescricao(), savedCategoria.getAtivo());

            return new ResponseEntity<>(savedCategoriaDto, HttpStatus.CREATED);
        } catch (Throwable th) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}