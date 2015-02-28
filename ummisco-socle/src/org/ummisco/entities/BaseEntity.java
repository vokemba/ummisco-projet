package org.ummisco.entities;

import java.io.Serializable;

/**
 * 
 * @author Romaric OKEMBA
 * Cette classe est la base de toutes les classes de lapplication
 * Toutes les classes persistentes de l'application doivent heriter de
 * cette classe
 * @version 1.0.0
 * 
 *
 */

public abstract class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Méthode qui permet de renvoyer l'id d'une entité
	 * @return
	 */
	
	public abstract Serializable getId();
	
	/**
	 * 
	 * @param id
	 * 
	 * permet d'affecter la valuer à un identifiant d'une entité
	 */
	
	public abstract void setId(Serializable id);

}
