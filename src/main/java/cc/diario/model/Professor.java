package cc.diario.model;

import javax.persistence.*;
import static cc.diario.model.type.TipoPessoa.*;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "pessoa_codigo", sequenceName = "pessoa_codigo")
public class Professor extends Pessoa {
	@Column(name = "tipo")
	private Character pessoaProfessor = PROFESSOR.getTipo();
}