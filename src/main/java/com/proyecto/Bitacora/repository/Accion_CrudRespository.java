package com.proyecto.Bitacora.repository;

import com.proyecto.Bitacora.model.Accion_Crud;
import org.springframework.data.jpa.repository.JpaRepository;
                                                            //llamo a la clase, para pasar su id
public interface Accion_CrudRespository extends JpaRepository<Accion_Crud, Long> {
}
