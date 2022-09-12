package br.com.wot.services;

import br.com.wot.domain.Categoria;
import br.com.wot.domain.Cliente;
import br.com.wot.repositories.ClienteRepository;
import br.com.wot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;


    //                      Metodos

    //  busca por id
    public Cliente buscaID(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
    }

}
