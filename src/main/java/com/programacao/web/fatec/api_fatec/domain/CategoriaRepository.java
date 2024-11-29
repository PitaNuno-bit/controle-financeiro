package com.programacao.web.fatec.api_fatec.domain;
import org.springframework.data.jpa.repository.JpaRepository;
import com.programacao.web.fatec.api_fatec.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
    boolean existsByDescricao(String descricao);
}
