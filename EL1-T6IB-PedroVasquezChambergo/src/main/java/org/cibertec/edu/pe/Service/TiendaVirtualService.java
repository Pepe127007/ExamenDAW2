package org.cibertec.edu.pe.Service;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.Interface.ITiendaVirtual;
import org.cibertec.edu.pe.InterfaceService.ITiendaVirtualService;
import org.cibertec.edu.pe.Model.TiendaVirtual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TiendaVirtualService implements ITiendaVirtualService {
    
	
	@Autowired
	private ITiendaVirtual data;
	
	@Override
	public List<TiendaVirtual> Listar() {
		return (List<TiendaVirtual>)data.findAll();
		
	}

	@Override
	public Optional<TiendaVirtual> Buscar(String Id) {
		
		return data.findById(Id);
	}

	@Override
	public int Grabar(TiendaVirtual ObjC) {
		int res = 0;
		TiendaVirtual Obj = data.save(ObjC);
		if(!Obj.equals(null))res = 1;
		return res;
	}

	@Override
	public void Suprimir(String Id) {
		data.deleteById(Id);
		
	}

}
