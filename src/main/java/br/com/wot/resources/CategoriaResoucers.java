package br.com.wot.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wot.domain.Categorias;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResoucers {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categorias> listar() {
		
		Categorias cat1 = new Categorias(1, "Informatica");
		Categorias cat2 = new Categorias(2, "Escritorio");
		
		List<Categorias> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);
		
		return list;
	}
}
