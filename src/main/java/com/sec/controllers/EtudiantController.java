package com.sec.controllers;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sec.dao.EtudiantRepository;
import com.sec.entities.Etudiant;

@RestController
public class EtudiantController {

	@Autowired
	EtudiantRepository etudiantRepository;
	
	@GetMapping(value="/etudiants")
	public Stream<Etudiant> getAllEtudiant(){
		return etudiantRepository.findAll().stream();
	}
	
	@GetMapping(value= "/saveEtudiant")
	public Etudiant saveEtudiant(Etudiant e) {
		return etudiantRepository.save(e);
	}
}
