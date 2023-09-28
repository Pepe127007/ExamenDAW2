package org.cibertec.edu.pe.InterfaceService;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.Model.TiendaVirtual;

public interface ITiendaVirtualService {
	public List<TiendaVirtual> Listar();
	public Optional<TiendaVirtual> Buscar(String Id);
	public int Grabar(TiendaVirtual ObjC);
	public void Suprimir(String Id);
}
