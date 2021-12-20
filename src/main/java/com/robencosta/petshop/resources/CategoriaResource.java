package com.robencosta.petshop.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.robencosta.petshop.domain.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> mostrar() {
	
		Categoria cat = new Categoria(1, "Alimento");
		Categoria cat2 = new Categoria(2, "Cosmético");
		Categoria cat3 = new Categoria(3, "Remédio");
		
		return Arrays.asList(cat, cat2, cat3);
	}
}
