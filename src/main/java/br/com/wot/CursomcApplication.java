package br.com.wot;


import java.util.Arrays;

import br.com.wot.domain.Cidade;
import br.com.wot.domain.Estado;
import br.com.wot.repositories.CidadeRepository;
import br.com.wot.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.wot.domain.Categoria;
import br.com.wot.domain.Produto;
import br.com.wot.repositories.CategoriaRepository;
import br.com.wot.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository catRepository;

	@Autowired
	private ProdutoRepository prodRepository;

	@Autowired
	private CidadeRepository cidRepository;

	@Autowired
	private EstadoRepository estRepository;


	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}



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

		Estado es1 = new Estado(null, "Minas Gerais");
		Estado es2 = new Estado(null, "São Paulo");

		Cidade c1 = new Cidade(null, "Uberlandia", es1);
		Cidade c2 = new Cidade(null, "São Paulo", es2);
		Cidade c3 = new Cidade(null, "Campinas", es2);

		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(p1,p2,p3));
		estRepository.saveAll(Arrays.asList(es1, es2));
		cidRepository.saveAll(Arrays.asList(c1, c2, c3));




	}

	

}
