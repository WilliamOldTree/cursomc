package br.com.wot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.wot.domain.Produto;

@Repository




public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
