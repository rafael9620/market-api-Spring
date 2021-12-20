package com.market.persistence.crud;

import com.market.persistence.entity.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClientesCrudRepository extends CrudRepository<Clientes, Integer> {
}
