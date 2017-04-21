package com.santuario.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Entity
public class Dizimista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long  id;
	private String nomeCompleto;
	//private Date dtNascimento;
	private String cpf;
	

}
