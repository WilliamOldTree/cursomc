package br.com.wot.repositories;

import br.com.wot.domain.Estado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoRepository extends JpaRepository <Estado, Long> {
}
