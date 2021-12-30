package com.sic.juluri.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sic.juluri.person.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
