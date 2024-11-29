package com.programacao.web.fatec.api_fatec.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoriaDto {

    private int id;
    private String descricao;
    private boolean ativo;

    public CategoriaDto() {
    }

    public CategoriaDto(int id, String descricao, boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.ativo = ativo;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @JsonProperty("descricao")
    public String getDescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    @JsonProperty("ativo")
    public boolean getativo() {
        return ativo;
    }

    public void setativo(boolean ativo) {
        this.ativo = ativo;
    }
}
