package cc.diario.controller;

import javax.inject.Inject;

import cc.diario.model.Disciplina;
import cc.diario.service.DisciplinaService;
import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;

@Controller
@Path("/disciplina")
public class DisciplinaController {
	
	@Inject
	private Result result;
	
	@Inject
	private DisciplinaService service;
	
	@Put("/add")
	@Consumes({ "application/json", "application/xml" })
	public void add(Disciplina disciplina) {
		service.add(disciplina);
		ok();
	}
	
	private void ok() {
		result.use(Results.http()).setStatusCode(200);
	}
}
