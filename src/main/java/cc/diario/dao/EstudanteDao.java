package cc.diario.dao;

import static org.hibernate.criterion.Restrictions.eq;

import javax.enterprise.context.RequestScoped;

import cc.diario.model.Estudante;
import cc.diario.model.Pessoa;

@RequestScoped
public class EstudanteDao extends AbstractDao<Estudante> {
	public Pessoa findByDomain(String domain) {
		return getByCriteria(eq("domain", domain));
	}
}
