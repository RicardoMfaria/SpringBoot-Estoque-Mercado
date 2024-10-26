package com.estoque.estoque.repository;

import com.estoque.estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // O JpaRepository já fornece métodos CRUD prontos, então nenhum código adicional é necessário aqui inicialmente.
}
