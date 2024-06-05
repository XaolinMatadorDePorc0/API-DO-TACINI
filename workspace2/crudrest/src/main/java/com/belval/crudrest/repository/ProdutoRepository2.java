package com.belval.crudrest.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.belval.crudrest.model.Produto;

public interface ProdutoRepository2 extends CrudRepository<Produto, Integer>{
	
	List<Produto> findByDescricao(String descricao);
	
}
