package org.ummisco.generic;

import java.util.List;

import org.ummisco.entities.BaseEntity;
import org.ummisco.exeption.UmmiscoExeption;

/**
 * 
 * @author Romaric Okemba
 * Classe  générique des composants  service
 */

public abstract class GenericService <T extends BaseEntity> implements IGenericService<BaseEntity>{

	/**
	 * 
	 * @return GenericDao
	 * méthode qui permet de specifier pour chaque couche Service la DAO
	 * qui lui est associé.
	 */
	
	protected abstract GenericDao getGenericDao();
	
	@Override
	public BaseEntity creer(BaseEntity entite) throws UmmiscoExeption {
		
		return null;
	}

	@Override
	public BaseEntity modifier(BaseEntity entite) throws UmmiscoExeption {
		
		return null;
	}

	@Override
	public void supprimer(BaseEntity entite) throws UmmiscoExeption {
	    //Appel de la méthode supprimer de la classe GenericDao
		getGenericDao().supprimer(entite);
		
	}

	@Override
	public List<BaseEntity> lister() throws UmmiscoExeption {
	
		return null;
	}

	@Override
	public BaseEntity rechercherParId(BaseEntity entite) throws UmmiscoExeption {
	
		return null;
	}

	@Override
	public List<BaseEntity> rechercherParCritere(BaseEntity entite)throws UmmiscoExeption {

		return null;
	}

}
