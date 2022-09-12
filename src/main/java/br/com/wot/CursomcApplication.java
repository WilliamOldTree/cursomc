package br.com.wot;


import java.util.Arrays;

import br.com.wot.domain.*;
import br.com.wot.enums.TipoCliente;
import br.com.wot.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

	@Autowired
	private ClienteRepository cliRepository;

	@Autowired
	private EnderecoRepository endRepository;


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

		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("20425766", "94024961"));


		Endereco e1 = new Endereco(null, "Rua Flore", "300", "apt 203", "Jardim ", "38220834",c1, cli1 );
		Endereco e2 = new Endereco(null, "Rua Araramboia", "24", "casa 02", "Jardim Ipanema", "03694000", c2, cli1);

		catRepository.saveAll(Arrays.asList(cat1, cat2));
		prodRepository.saveAll(Arrays.asList(p1,p2,p3));
		estRepository.saveAll(Arrays.asList(es1, es2));
		cidRepository.saveAll(Arrays.asList(c1, c2, c3));
		cliRepository.saveAll(Arrays.asList(cli1));
		endRepository.saveAll(Arrays.asList(e1,e2));

	}

}
