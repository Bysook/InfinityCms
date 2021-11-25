package com.infinityCms.infinity.Services;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infinityCms.infinity.Models.ProductoModel;
import com.infinityCms.infinity.Repositories.ProductoRepository;

@Service
public class ProductoService {
	
	@Autowired
	ProductoRepository productoRepository;
	
	public ArrayList<ProductoModel> obtenerProductos() {
		return (ArrayList<ProductoModel>) productoRepository.findAll();
	}
	
	public ProductoModel guardarProducto(ProductoModel producto) {
		return productoRepository.save(producto);
	}
	
	public Optional<ProductoModel> obtenerProductoPorId(Long id){
		return productoRepository.findById(id);
	}
	
	public boolean eliminarProducto(Long id) {
		try {
			productoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
