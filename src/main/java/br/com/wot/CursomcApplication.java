package br.com.wot;

<<<<<<< HEAD
=======

>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.wot.domain.Categoria;
<<<<<<< HEAD
import br.com.wot.repositories.CategoriaRepository;
=======
import br.com.wot.domain.Produto;
import br.com.wot.repositories.CategoriaRepository;
import br.com.wot.repositories.ProdutoRepository;
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
<<<<<<< HEAD
	CategoriaRepository repository;
=======
	private CategoriaRepository catRepository;
	
	@Autowired
	private ProdutoRepository prodRepository;
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
<<<<<<< HEAD

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria (null, "informatica");
		Categoria cat2 = new Categoria (null, "escritorio");
		
		repository.saveAll(Arrays.asList(cat1, cat2));
			
	}

=======
	
	
	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto (null, "Computador", 2000.00);
		Produto p2 = new Produto (null, "Impressora", 800.00);
		Produto p3 = new Produto (null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
				
		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(p1,p2,p3));
		
	}
	
	
>>>>>>> a192ef30014993b332eff685429e7cf416ba064e
}
