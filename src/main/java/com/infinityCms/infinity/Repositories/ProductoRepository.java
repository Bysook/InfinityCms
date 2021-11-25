package com.infinityCms.infinity.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.infinityCms.infinity.Models.ProductoModel;

@Repository
public interface ProductoRepository extends CrudRepository<ProductoModel, Long>{

}
