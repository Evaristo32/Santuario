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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
 
@AllArgsConstructor
@NoArgsConstructor
@Data 

@Entity
public class Dizimista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long  id;
	private String nomeCompleto;
	private String cpf;
	
	
	/*
	 *  @Getter/@Setter: Geração dos métodos Get/Set;
	    @EqualsAndHasCode: Criação dos métodos equals() e hashCode();
		@NoArgsConstructor: Criação de um construtor sem argumentos;
		@AllArgsContructor: Criação de um construtor com todos os atributos da classe;
		@ToString: Criação do método toString().
	 * */
	
}
