package com.infotel.TpMavenSpringData.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpMavenSpringData.metier.Personne;

@Transactional
public interface PersonneRepository extends JpaRepository<Personne, Integer> {
	
	public List<Personne> findByNom(String x);
	
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> rechercheParMC(@Param("x") String nom);
	
	@Modifying
	@Query("update Personne SET nom = :x where id = :y")
	public int modifierNomPersonne(@Param("x") String nom, @Param("y") int id);
	
	@Modifying
	@Query("update Personne SET prenom = :x where id = :y")
	public int modifierPrenomPersonne(@Param("x") String prenom, @Param("y") int id);
	
	@Modifying
	@Query("update Personne SET age = :x where id = :y")
	public int modifierAgePersonne(@Param("x") int age, @Param("y") int id);
	
	@Modifying
	@Query("update Personne SET adresse.idAdresse = :x where id = :y")
	public int ajouterPersonneAdresse(@Param("x") int idAdresse, @Param("y") int id);
}
