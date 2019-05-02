package com.infotel.TpMavenSpringData.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpMavenSpringData.dao.AdresseRepository;
import com.infotel.TpMavenSpringData.dao.PersonneRepository;
import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	PersonneRepository personneRepository;
	
	@Override
	public Personne ajouterPersonne(Personne p) {
		return personneRepository.save(p);
	}

	@Override
	public Optional<Personne> afficherPersonne(int id) {
		return personneRepository.findById(id);
	}

	@Override
	public void supprimerPersonne(Personne p) {
		personneRepository.delete(p);
	}

	@Override
	public Personne modifierToutPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public Iterable<Personne> findAllPersonnes() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public List<Personne> chercherParNom(String x) {
		// TODO Auto-generated method stub
		return personneRepository.findByNom(x);
	}

	@Override
	public Personne getPersonne(int id) {
		// TODO Auto-generated method stub
		return personneRepository.getOne(id);
	}

	@Override
	public List<Personne> rechercheParMC(String nom) {
		// TODO Auto-generated method stub
		return personneRepository.rechercheParMC("%" + nom + "%");
	}

	@Override
	public int modifierNomPersonne(String nom, int id) {
		// TODO Auto-generated method stub
		personneRepository.modifierNomPersonne(nom, id);
		return id;
	}

	@Override
	public int modifierPrenomPersonne(String prenom, int id) {
		personneRepository.modifierPrenomPersonne(prenom, id);
		return id;
	}

	@Override
	public int modifierAgePersonne(int age, int id) {
		personneRepository.modifierAgePersonne(age, id);
		return id;
	}

	
	
	@Autowired
	AdresseRepository adresseRepository;
	
	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public Optional<Adresse> afficherAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(idAdresse);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.getOne(idAdresse);
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		adresseRepository.delete(a);
	}


	@Override
	public Iterable<Adresse> findAllAdresses() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	public int ajouterPersonneAdresse(int idAdresse, int id) {
		personneRepository.ajouterPersonneAdresse(idAdresse, id);
		return id;
	} 


	
}
