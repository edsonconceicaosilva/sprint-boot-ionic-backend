package com.edsonconceicao.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsonconceicao.cursomc.domain.Pedido;
import com.edsonconceicao.cursomc.repositories.PedidoRepository;
import com.edsonconceicao.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoServices {

	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
