package br.com.wot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.wot.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>, CrudRepository<Categoria, Long>{

}//end interface
