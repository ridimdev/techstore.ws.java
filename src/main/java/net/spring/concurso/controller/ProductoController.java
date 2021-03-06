package net.spring.concurso.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.spring.concurso.entity.Cliente;
import net.spring.concurso.entity.Empleado;
import net.spring.concurso.entity.Producto;
import net.spring.concurso.service.ProductoService;

@RestController
@RequestMapping(value = "/producto")
public class ProductoController {

	@Autowired
	private ProductoService productoService;

	@GetMapping(path = "/listProducto")
	@ResponseBody
	public List<Producto> listProducto() {
		return productoService.listAll();
	}
	
	@GetMapping(path = "/admListProducto")
	@ResponseBody
	public List<Producto> amdListProducto() {
		return productoService.admListAll();
	}
	
	@GetMapping(path ="/listById/{id}" )
	@ResponseBody
	public List<Producto> listById(@PathVariable("id") int id){
		List<Producto> list=null;
		list=productoService.listById(id);
		return list;
	}
	//registrar 
	@PostMapping(path = "/saveProducto")
	public void saveProducto(@RequestBody Producto bean) {
		productoService.save(bean);		
	}
	//actualizar 
	@PutMapping(path = "/updateProducto")
	public void updateProducto(@RequestBody Producto bean) {
		productoService.update(bean);		
	}	
	//eliminar 
	@DeleteMapping(path = "/deleteProducto/{cod}")
	public void deleteProducto(@PathVariable("cod") int cod) {
		productoService.delete(cod);
	}

}
