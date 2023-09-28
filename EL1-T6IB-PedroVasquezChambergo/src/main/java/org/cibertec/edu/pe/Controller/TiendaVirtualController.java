package org.cibertec.edu.pe.Controller;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.InterfaceService.ITiendaVirtualService;
import org.cibertec.edu.pe.Model.TiendaVirtual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class TiendaVirtualController {
    @Autowired
    private ITiendaVirtualService service;
    
 // Método para Listar
 	@GetMapping("/listar")	// http://localhost:8080/listar
 	public String Listado(Model m) {
 		List<TiendaVirtual> lista = service.Listar();
 		m.addAttribute("colaboradores", lista);
 		return "listado";	
 	}
 	
 	// Método para Buscar
 	@GetMapping("/ver/{id}") // http://localhost:8080/ver/1
 	public String Buscar(@PathVariable String id,Model m) {
 		Optional<TiendaVirtual> ObjC = service.Buscar(id);
 		m.addAttribute("colaborador", ObjC);
 		return "ver";		
 	}
 	
 	// Método para insertar
 	@GetMapping("/nuevo")
 	public String agregar(Model m) {
 		m.addAttribute("Tiendavirtual",new TiendaVirtual());
 		return "form";	
 	}
 	
 	// Método para salvar
 	@PostMapping("/salvar")
 	public String salvar(@Validated TiendaVirtual ObjC, Model m) {
 		service.Grabar(ObjC);
 		return "redirect:/listar";
 	}
 	
 	// Método para actualizar
 	@GetMapping("/editar/{id}")
 	public String editar(@PathVariable String id, Model m) {
 		Optional<TiendaVirtual> ObjC = service.Buscar(id);
 		m.addAttribute("colaborador", ObjC);
 		return "form";	
 	}
 	
 	// Método para eliminar
 	@GetMapping("/eliminar/{id}")
 	public String eliminar(@PathVariable String id, Model m) {
 		service.Suprimir(id);
 		return "redirect:/listar";		
 	}
}
