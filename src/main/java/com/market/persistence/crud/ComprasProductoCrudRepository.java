package com.market.persistence.crud;

import com.market.persistence.entity.ComprasProducto;
import com.market.persistence.entity.ComprasProdutoPK;
import org.springframework.data.repository.CrudRepository;

public interface ComprasProductoCrudRepository extends CrudRepository<ComprasProducto, ComprasProdutoPK> {
}
