package com.santuario.ws.controle;

import java.util.Collection;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.santuario.model.Dizimista;
import com.santuario.services.DizimistaService;




@Controller
@RestController
public class DizimistaControler {

	@Autowired
	DizimistaService dizimistaService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/dizimista",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dizimista> cadastrar(@RequestBody Dizimista dizimista) {
		Dizimista dizimistaCadastrado = dizimistaService.salvar(dizimista);
		return new ResponseEntity<Dizimista>(dizimistaCadastrado, HttpStatus.CREATED);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/dizimista", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Dizimista>> buscarTodos() {
		System.out.println("####################################### chegamos buscarTodos");
		Collection<Dizimista> dzimistasBuscados = dizimistaService.consultar();
		return new ResponseEntity<Collection<Dizimista>>(dzimistasBuscados, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/dizimista/{id}",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Dizimista> BuscarPorId(@PathVariable Long id) {
		
		System.out.println("####################################### chegamos BuscarPorId");
		Dizimista dizimistaEncontrado = dizimistaService.buscarPorId(id);
		if(dizimistaEncontrado != null){
		return new ResponseEntity<>(dizimistaEncontrado, HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/dizimista/{id}")
	public ResponseEntity<Dizimista> deletar(@PathVariable Long id) {
		
		System.out.println("####################################### chegamos deletar");
		Dizimista dizimistaParaExcluir = dizimistaService.buscarPorId(id);
		if(dizimistaParaExcluir != null){
			dizimistaService.deletar(dizimistaParaExcluir);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	
		
	}

}
