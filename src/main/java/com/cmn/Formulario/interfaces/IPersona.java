package com.cmn.Formulario.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.cmn.Formulario.modelo.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersona extends CrudRepository<Persona, Integer> {

}
