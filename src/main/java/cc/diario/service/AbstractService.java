package cc.diario.service;

import javax.enterprise.context.RequestScoped;

import cc.diario.dao.AbstractDao;

@RequestScoped
public abstract class AbstractService<T> {
	
	public T add(T entity) {
		return getDao().save(entity);
	}
	
	public T findById(Long id) {
		return getDao().findById(id);
	}
	
	public T save(T instance) {
		setDefaultValues(instance);
		return getDao().save(instance);
	}
	
	protected void setDefaultValues(T instance) {
		// Must be implemented on Concrete Service
	}
	
	protected abstract AbstractDao<T> getDao();
	

}
