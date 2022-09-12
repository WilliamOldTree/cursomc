package br.com.wot.services;

import java.util.List;
import java.util.Optional;


import br.com.wot.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.wot.domain.Categoria;
import br.com.wot.repositories.CategoriaRepository;

@Service
public class CategoriaService {

    //injecao dependencia
    @Autowired
    private CategoriaRepository repository;

    //						Metodos
    // busca por id
    @Transactional
    public Categoria findById(Long id) {
        Optional<Categoria> entity = repository.findById(id);
        return entity.orElseThrow(() -> new ObjectNotFoundException("Categoria nao encontrada"));
    }

    //	listar categorias
    @Transactional
    public List<Categoria> findAll() {
        List<Categoria> list = repository.findAll();
        return list;
    }

    //atualizar
    public Categoria update(Long id) {
        return null;
    }

    //deletar
    public void deletar(Long id) {
        repository.deleteById(id);
    }

}//end class
