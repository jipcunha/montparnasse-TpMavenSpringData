package com.infotel.TpMavenSpringData.presentation;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpMavenSpringData.metier.Adresse;
import com.infotel.TpMavenSpringData.metier.Personne;
import com.infotel.TpMavenSpringData.service.Iservice;
import com.infotel.TpMavenSpringData.service.ServiceImpl;

/**
 * Hello world!
 *
 */
public class Lanceur 
{
    public static void main( String[] args )  {
    	
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	    	
    	Iservice service = context.getBean("serviceImpl", ServiceImpl.class);
    	
    	Personne p = context.getBean("personne", Personne.class);    	

    	
   // 	p = service.getPersonne(3);
   // 	p = service.affichagePersonne(4);
    	
  /*  	p.setNom("Mary");
    	p.setPrenom("Jane");
    	p.setAge(24);
    	
    	
    	service.ajouterPersonne(p);  */
    	
   // 	System.out.println(service.getPersonne(2));
    
  /*  	p.setId(3);
    	p.setNom("Doe");
    	p.setPrenom("Jane");
    	p.setAge(25);
    	service.modifierToutPersonne(p); */
    	
   /* 	p.setId(2);
    	service.supprimerPersonne(p);  */
    	
    	
   // 	System.out.println(service.findAllPersonnes());
    	
   // 	System.out.println(service.chercherParNom("Doe"));
    	
   /* 	for (Personne  pers : service.rechercheParMC("o")) {
			System.out.println(pers);
		}
    	
    	//ou
    	//System.out.println(service.rechercheParMC("o")); */
   // 	service.modifierNomPersonne("Curie", 3);
    	
   /* 	Adresse a = context.getBean("adresse", Adresse.class);
    	a.setNumRue("15");
    	a.setNomRue("Bv des Capucines");
    	a.setCp("75000");
    	a.setVille("Paris");
    	
    	service.ajouterAdresse(a);  */
    	
    	service.ajouterPersonneAdresse(1, 3);
    	
    	context.close();
    	}
}
