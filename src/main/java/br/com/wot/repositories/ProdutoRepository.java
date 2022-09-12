package br.com.wot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wot.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
