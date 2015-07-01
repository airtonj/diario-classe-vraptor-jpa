package cc.diario.controller;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import cc.diario.model.Disciplina;
import cc.diario.model.TurmaDisciplina;

@Controller
@Path("/turmaDisciplina")
public class TurmaDisciplinaController {

	private static final String XML_FORMAT = "xml";
	private static final String JSON_FORMAT = "json";

	@Inject
	private Result result;

	@Get("/estudante/{id}.{formato}")
	public void add(Long id, String formato) {
		TurmaDisciplina classe = new TurmaDisciplina();
		Disciplina disciplina = new Disciplina();
		disciplina.setNome("Nome Disciplina");
		classe.setDisciplina(disciplina);
		serializeResult(formato, Arrays.asList(classe));
		ok();
	}

	private void serializeResult(String formato, List<TurmaDisciplina> classes) {
		switch (formato) {
		case JSON_FORMAT:
			result.use(Results.json()).from(classes).include("disciplina")
					.serialize();
			break;
		case XML_FORMAT:
			result.use(Results.xml()).from(classes).include("disciplina")
					.serialize();
			break;

		default:
			break;
		}

		ok();
	}

	private void ok() {
		result.use(Results.http()).setStatusCode(200);
	}

}
