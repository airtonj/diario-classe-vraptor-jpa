package cc.diario.controller;

import javax.inject.Inject;
import br.com.caelum.vraptor.*;
import br.com.caelum.vraptor.view.Results;
import cc.diario.model.Professor;
import cc.diario.service.ProfessorService;

@Controller
@Path("/professor")
public class ProfessorController {

	private static final String XML_FORMAT = "xml";
	private static final String JSON_FORMAT = "json";

	@Inject
	private Result result;

	@Inject
	private ProfessorService service;

	@Put("/add")
	@Consumes({ "application/json", "application/xml" })
	public void add(Professor professor) {
		service.add(professor);
		ok();
	}

	@Get("/{id}.{formato}")
	public void buscarPorId(Long id, String formato) {
		Professor professor = service.findById(id);
		if (professor == null) {
			notFound();
			return;
		}
		buildProfessorResult(professor, formato);

	}

	private void buildProfessorResult(Professor entity, String formato) {
		if (entity == null) {
			notFound();
			return;
		}

		serializeStudent(entity, formato);
	}

	private void serializeStudent(Professor entity, String formato) {
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
