package cc.diario.service;

import javax.inject.Inject;

import cc.diario.dao.AbstractDao;
import cc.diario.dao.ProfessorDao;
import cc.diario.model.Professor;

public class ProfessorService extends AbstractService<Professor> {
	@Inject
	private ProfessorDao dao;

	@Override
	protected AbstractDao<Professor> getDao() {
		return this.dao;
	}

}
