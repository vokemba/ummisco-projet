package org.ummisco.generic;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.ummisco.entities.BaseEntity;
import org.ummisco.exeption.UmmiscoExeption;

/**
 * Classe générique concernant la persistence des données d'une manière
 * générique
 * @author Romaric Okemba
 * @version 1.0.0
 */
public abstract class GenericDao <T extends BaseEntity> implements IGenericDao<T>{

	/**
	 * Permet de retourner le type de la classe concrete dans laquelle
	 * on travaille dans les classes filles. Toutes les classes DAO comme
	 * par exemple EtudiantDAO devrait heriter de la classe GenericDao et chacune
	 * de ces classes devrait preciser la classe persistence concernée par la DAO comme
	 * par exemple Etudiant.class.
	 * @return
	 */
	
	protected abstract Class getNameClasse();
	
	
	/**
	 * propriété qui permet de se connecter de la base de données
	 * Il va se connecter à l'unité de persistence par défaut 
	 */
	@PersistenceContext
	protected EntityManager em;
	
	@Override
	public T creer(T entite) throws UmmiscoExeption {
	
		return null;
	}

	@Override
	public T modifier(T entite) throws UmmiscoExeption {
		//Taches aim�
		return null;
	}

	
	@Override
	public void supprimer(T entite) throws UmmiscoExeption {
		
		try {
			em.remove(em.merge(entite));
			
		} catch (Exception e) {
			
			throw new UmmiscoExeption("Une Erreur s'est produite lors de la suppréssion de l'objet");
		}
		
	}

	@Override
	public List<T> lister() throws UmmiscoExeption {
	
		return null;
	}

	@Override
	public T rechercherParId(T entite) throws UmmiscoExeption{
		return null;
	}

	@Override
	public List<T> rechercherParCritere(T entite) throws UmmiscoExeption {
		
		return null;
	}

}
