package br.com.wot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.wot.domain.Categoria;
import br.com.wot.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResoucers {
	
	//injecao dependencia
	@Autowired
	private CategoriaService service;
	
	
							//METODOS	
	//busca por Id
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> findById(@PathVariable Long id){
		Categoria obj = service.findById(id);
		return ResponseEntity.ok(obj);
	}
	
	//listar categorias
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Categoria>> findAll(){
		List<Categoria>list=service.findAll();
		return ResponseEntity.ok(list);
	}
	
	//atualizar
	
	//deletar
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deletar(@PathVariable Long id){
		service.deletar(id);
		return ResponseEntity.noContent().build();
	}

}//end class
