package org.ummisco.generic;

import org.ummisco.entities.BaseEntity;

/**
 * 
 * @author root
 *Classe généric des Beans managers
 * @param <T>
 */

public abstract class GenericBean <T extends BaseEntity>{
	
	public abstract IGenericService getGenericService();

}
