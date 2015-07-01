package cc.diario.service;

import javax.inject.Inject;

import cc.diario.dao.AbstractDao;
import cc.diario.dao.DisciplinaDao;
import cc.diario.model.Disciplina;

public class DisciplinaService extends AbstractService<Disciplina> {
	
	@Inject
	private DisciplinaDao dao;
	
	@Override
	protected AbstractDao<Disciplina> getDao() {
		return this.dao;
	}
	
	
}
