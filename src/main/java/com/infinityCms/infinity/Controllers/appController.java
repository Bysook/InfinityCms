package com.infinityCms.infinity.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.neo4j.Neo4jProperties.Authentication;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infinityCms.infinity.Models.ProductoModel;
import com.infinityCms.infinity.Models.UsuarioModel;
import com.infinityCms.infinity.Services.ProductoService;
import com.infinityCms.infinity.Services.UsuarioService;

@Controller
public class appController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping({ "/", "/index" })
	public String index(Model model) {
		return "index";
	}
	
	@RequestMapping("/tableUser")
	public String tableUser(Model model) {
		model.addAttribute("usuarios", usuarioService.obtenerUsuarios());
		return "tableUser";
	}
	
	@RequestMapping("/tableProduct")
	public String tableProduct(Model model) {
		model.addAttribute("productos", productoService.obtenerProductos());
		return "tableProduct";
	}

	@RequestMapping("/charts")
	public String charts(Model model) {
		return "charts";
	}
	
	@RequestMapping("/404")
	public String error(Model model) {
		return "404";
	}
	
	@RequestMapping("/deleteUser/{idUser}")
	public String deleteUser(@PathVariable Long idUser) {
		usuarioService.eliminarUsuario(idUser);
		return "redirect:/tableUser";
	}
	
	@RequestMapping("/newUserForm/{idUser}")
	public String nuevaCiudad(@PathVariable Long idUser, Model model) {
		
		if (idUser != null && idUser != 0) {
			model.addAttribute("usuarioModel", usuarioService.obtenerUsuarioPorId(idUser));
		}else {
			model.addAttribute("usuarioModel", new UsuarioModel());
		}
	
		return "newUserForm";
	}
	
	@PostMapping("/addUser")
	public String addUser(UsuarioModel usuarioModel) {
		usuarioService.guardarUsuario(usuarioModel);
		return "redirect:/tableUser";
	}
	
	@RequestMapping("/deleteProduct/{idProduct}")
	public String deleteProduct(@PathVariable Long idProduct) {
		productoService.eliminarProducto(idProduct);
		return "redirect:/tableProduct";
	}
	
	@RequestMapping("/newProductForm/{idProduct}")
	public String nuevoProducto(@PathVariable Long idProduct, Model model) {
		
		if (idProduct != null && idProduct != 0) {
			model.addAttribute("productoModel", productoService.obtenerProductoPorId(idProduct));
		}else {
			model.addAttribute("productoModel", new ProductoModel());
		}
	
		return "newProductForm";
	}
	
	@PostMapping("/addProduct")
	public String addProduct(ProductoModel productoModel) {
		productoService.guardarProducto(productoModel);
		return "redirect:/tableProduct";
	}
}
