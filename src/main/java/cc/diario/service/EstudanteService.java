package cc.diario.service;

import javax.inject.Inject;

import cc.diario.dao.AbstractDao;
import cc.diario.dao.EstudanteDao;
import cc.diario.model.Estudante;

public class EstudanteService extends AbstractService<Estudante> {
	@Inject
	private EstudanteDao dao;

	@Override
	protected AbstractDao<Estudante> getDao() {
		return this.dao;
	}
}
