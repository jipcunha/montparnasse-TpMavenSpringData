package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

public interface Iservice {
	public Personne ajouterPersonne(Personne p);
	public Optional<Personne> afficherPersonne(int id);
	public Personne getPersonne(int id);
	public void supprimerPersonne(Personne p);
	public Personne modifierToutPersonne(Personne p);
	public Iterable<Personne> findAllPersonnes();
	public List<Personne> chercherParNom(String x);
	public List<Personne> rechercheParMC(String nom);
	public int modifierNomPersonne(String nom, int id);
	public int modifierPrenomPersonne(String prenom, int id);
	public int modifierAgePersonne(int age, int id);
	public int ajouterPersonneAdresse(int idAdresse, int id);


	public Adresse ajouterAdresse(Adresse a);
	public Optional<Adresse> afficherAdresse(int idAdresse);
	public Adresse getAdresse(int idAdresse);
	public void supprimerAdresse(Adresse a);
	public Iterable<Adresse> findAllAdresses();

}

