package cc.diario.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import cc.diario.model.Estudante;
import cc.diario.service.EstudanteService;

@Controller
@Path("/estudante")
public class EstudanteController {
	
	private static final String XML_FORMAT = "xml";
	private static final String JSON_FORMAT = "json";

	@Inject
	private Result result;

	@Inject
	private EstudanteService service;

	@Put("/add")
	@Consumes({ "application/json", "application/xml" })
	public void add(Estudante estudante) {
		service.add(estudante);
		ok();
	}

	@Get("/{id}.{formato}")
	public void buscarPorId(Long id, String formato) {
		Estudante estudante = service.findById(id);
		if (estudante == null) {
			notFound();
			return;
		}
		buildEstudanteResult(estudante, formato);

	}

	private void buildEstudanteResult(Estudante entity, String formato) {
		if (entity == null) {
			notFound();
			return;
		}

		serializeEstudante(entity, formato);
	}

	private void serializeEstudante(Estudante entity, String formato) {
		switch (formato) {
		case JSON_FORMAT:
			result.use(Results.json()).from(entity).serialize();
			break;
		case XML_FORMAT:
			result.use(Results.xml()).from(entity).serialize();
			break;

		default:
			break;
		}

		ok();
	}

	private void notFound() {
		result.use(Results.http()).setStatusCode(404);

	}

	private void ok() {
		result.use(Results.http()).setStatusCode(200);
	}
}
