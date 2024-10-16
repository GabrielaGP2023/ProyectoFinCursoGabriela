package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepositoryGenero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicioGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ServicioGenero extends ServicioImpl<Genero,Integer> implements IServicioGenero {

    @Autowired
    private IRepositoryGenero iCrudGeneroRepositorio;


    @Override
    protected IRepository getRepo() {
        return iCrudGeneroRepositorio;
    }

    public Genero getGeneroPorNombre(String tipoGenero) {
        Genero genero=iCrudGeneroRepositorio.findByTipoGenero(tipoGenero);
        if (genero==null){return null;}
        else {return genero;}
    }
}
