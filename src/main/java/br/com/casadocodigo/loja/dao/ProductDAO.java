package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.com.casadocodigo.models.Product;

@Repository
public class ProductDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void save(Product product) {
		entityManager.persist(product);
	}
}
