package com.infinityCms.infinity.Controllers;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.infinityCms.infinity.Models.ProductoModel;
import com.infinityCms.infinity.Services.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping()
	public ArrayList<ProductoModel> obtenerProductos() {
		return productoService.obtenerProductos();
	}
	
	@PostMapping
	public ProductoModel guardarProducto(@RequestBody ProductoModel producto) {
		return this.productoService.guardarProducto(producto);
	}
	
	@GetMapping( path ="/{id}" )
	public Optional<ProductoModel> obtenerProductoPorId(@PathVariable("id") Long id) {
		return this.productoService.obtenerProductoPorId(id);
	}
	
	@DeleteMapping( path ="/{id}" )
	public String eliminarPorId(@PathVariable("id") Long id) {
		boolean ok = this.productoService.eliminarProducto(id);
		if (ok) {
			return "Se elimino el producto con id " + id;
		}else {
			return "No se pudo eliminar el producto con id " + id;
		}
	}

}
