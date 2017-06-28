package br.com.casadocodigo.loja.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.dao.ProductDAO;
import br.com.casadocodigo.models.Product;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductDAO dao;
	
	@RequestMapping("/produtos")
	public String save(Product product) {
		dao.save(product);
		return "produtos/ok";
	}
	
	@RequestMapping("/produtos/cadastro")
	public String form() {
		return "produtos/form";
	}

}
