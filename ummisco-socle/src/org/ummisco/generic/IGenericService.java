package org.ummisco.generic;

import java.util.List;

import org.ummisco.entities.BaseEntity;
import org.ummisco.exeption.UmmiscoExeption;

/**
 * 
 * @author Romaric Okemba
 * Interfaces des composants Métiers de l'application
 *
 * @param <T>
 */
public interface IGenericService<T extends BaseEntity> extends IGenericDao<T> {
	/**
	 * 
	 * @param entite
	 * @return
	 * @throws UmmiscoExeption
	 * Permet de persister une entité dans la base de données
	 */
	
	public T creer(T entite) throws UmmiscoExeption;
	
	/**
	 * 
	 * @param entite
	 * @return
	 * @throws UmmiscoExeption
	 * Permet de modifier une entité dans la base de données
	 */
	
	public T modifier(T entite) throws UmmiscoExeption;
	
	/**
	 * 
	
	 * @throws UmmiscoExeption
	 * Permet de supprimer une entité dans la base de données
	 */
	
	
	public void supprimer(T entite) throws UmmiscoExeption;
	
	/**
	 * 
	 * @param entite
	 * @return
	 * @throws UmmiscoExeption
	 * Permet de lister les entités de la base de données
	 */
	
	public List<T> lister() throws UmmiscoExeption;
	
	/**
	 * 
	 * @param entite
	 * @return
	 * @throws UmmiscoExeption
	 * Permet de retrouver  une entité de la base de données connaisant son identifiant
	 */
	
	public T rechercherParId(T entite) throws UmmiscoExeption;
	
	/**
	 * 
	 * @param entitemodifier
	 * @return
	 * @throws UmmiscoExeption
	 * 
	 * Permet de rechercher des entités de la base de données obeissant aux critères 
	 * de recherche
	 */
	
	public  List<T> rechercherParCritere(T entite) throws UmmiscoExeption;

}
