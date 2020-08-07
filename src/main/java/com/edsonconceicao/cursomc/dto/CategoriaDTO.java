package com.edsonconceicao.cursomc.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.edsonconceicao.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="Preenchimento Obrigatório")
	@Size(min = 5, max = 80, message="Deve ter no mínimo 5 caracteres e no máximo 80")
	private String nome;

	public CategoriaDTO() {
		
	}

	public CategoriaDTO(Categoria obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
