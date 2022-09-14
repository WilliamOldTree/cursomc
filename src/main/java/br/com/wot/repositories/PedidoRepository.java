package br.com.wot.repositories;

import br.com.wot.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long > {
}
