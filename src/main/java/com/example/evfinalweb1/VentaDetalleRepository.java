package com.example.evfinalweb1;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "ventadetalles", path = "ventadetalles")
public interface VentaDetalleRepository extends CrudRepository<VentaDetalle, Long>{
    
}
