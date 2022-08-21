package br.com.wot.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResoucers {
	
	@RequestMapping(method = RequestMethod.GET)
	public String listar() {
		return "Listou rest";
	}

}
