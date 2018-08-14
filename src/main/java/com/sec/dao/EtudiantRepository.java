package com.sec.dao;

import java.util.stream.Stream;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sec.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

	/*@Query("select etudiant from etudiant etudiant")
	Stream<Etudiant> getAllEtudiants();
	*/
}
