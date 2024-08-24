package br.com.fiap.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
}
