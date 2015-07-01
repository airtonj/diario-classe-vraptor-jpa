package cc.diario.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Consumes;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Put;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import cc.diario.model.Estudante;
import cc.diario.model.Frequencia;
import cc.diario.model.TurmaDisciplina;
import cc.diario.service.FrequenciaService;

@Controller
@Path("/frequencia")
public class FrequenciaController {
	
	@Inject
	private Result result;
	@Inject
	private FrequenciaService service;

	@Put("/add")
	@Consumes({ "application/json", "application/xml" })
	public void add(Frequencia frequencia) {
		/*TurmaDisciplina turma = new TurmaDisciplina();
		turma.setId((long) 1);
		Estudante aluno = new Estudante();
		aluno.setId((long) 1);
		frequencia.setAluno(aluno);
		frequencia.setTurmaDisciplina(turma);*/
		service.add(frequencia);
		ok();
	}
	
	/*@Put("/add/{aluno}/{turma}")
	@Consumes({ "application/json", "application/xml" })
	public void add(Estudante aluno, TurmaDisciplina turma, Frequencia frequencia) {
		TurmaDisciplina turmaId = new TurmaDisciplina();
		turmaId.setId(turma);
		Estudante alunoId = new Estudante();
		alunoId.setId(aluno);
		frequencia.setAluno(aluno);
		frequencia.setTurmaDisciplina(turma);
		service.add(frequencia);
		ok();
	}*/
		

	private void ok() {
		result.use(Results.http()).setStatusCode(200);
	}

}
