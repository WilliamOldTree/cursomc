package br.com.wot.repositories;

import br.com.wot.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository <Cidade, Long> {
}
