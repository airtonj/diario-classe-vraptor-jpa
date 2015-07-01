package cc.diario.service;

import javax.inject.Inject;

import cc.diario.dao.AbstractDao;
import cc.diario.dao.FrequenciaDao;
import cc.diario.model.Frequencia;

public class FrequenciaService extends AbstractService<Frequencia> {
	@Inject
	private FrequenciaDao dao;
	
	@Override
	protected AbstractDao<Frequencia> getDao() {
		return this.dao;
	}

}
