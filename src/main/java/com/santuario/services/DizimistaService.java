package com.santuario.services;


import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.santuario.model.Dizimista;
import com.santuario.repository.DizimistaRepository;

@Service
public class DizimistaService{
	
	@Autowired
	DizimistaRepository  dizimistaRepository;
	
	
	public Dizimista salvar(Dizimista dizimista){
		return dizimistaRepository.save(dizimista);
	}
	public Collection<Dizimista> consultar(){
		return dizimistaRepository.findAll();
	}
	
	
	public void deletar(Dizimista dizimista){
		dizimistaRepository.delete(dizimista);
	}
	
	public Dizimista buscarPorId(Long id){
		return dizimistaRepository.findOne(id);
	}

}
