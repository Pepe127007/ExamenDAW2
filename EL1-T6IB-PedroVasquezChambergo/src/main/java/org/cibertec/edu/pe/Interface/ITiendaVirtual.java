package org.cibertec.edu.pe.Interface;

import org.cibertec.edu.pe.Model.TiendaVirtual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITiendaVirtual extends JpaRepository<TiendaVirtual,String> {

}
