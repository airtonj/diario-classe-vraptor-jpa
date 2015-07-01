package cc.diario.service;

import javax.inject.Inject;

import cc.diario.dao.AbstractDao;
import cc.diario.dao.TurmaDisciplinaDao;
import cc.diario.model.TurmaDisciplina;

public class TurmaDisciplinaService extends AbstractService<TurmaDisciplina> {
	@Inject
	private TurmaDisciplinaDao dao;

	@Override
	protected AbstractDao<TurmaDisciplina> getDao() {
		return this.dao;
	}

}
