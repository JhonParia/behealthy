package com.dynamis.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.dynamis.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{

}
