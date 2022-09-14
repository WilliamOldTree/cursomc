package br.com.wot.controller;

import br.com.wot.domain.Categoria;
import br.com.wot.domain.Cliente;
import br.com.wot.repositories.ClienteRepository;
import br.com.wot.services.CategoriaService;
import br.com.wot.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//@RestController
//@RequestMapping(value = "/clientes")
//public class ClienteController {
//
//    @Autowired
//    ClienteService clienteService;
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity<?> buscarId(@PathVariable Long id){
//        Cliente clienteOptional = clienteService.buscaID(id);
//        return ResponseEntity.ok().body(clienteOptional);
//    }
//}

@RestController
@RequestMapping(value = "/clientes")
public class ClienteController {

    //injecao dependencia
    @Autowired
    private ClienteService service;

    //                      METODOS
    //  busca por Id

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Cliente obj = service.buscaID(id);
        return ResponseEntity.ok().body(obj);
    }
}
