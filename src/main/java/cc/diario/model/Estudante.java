package cc.diario.model;

import javax.persistence.*;
import cc.diario.model.type.TipoPessoa;

@Entity
@Table(name = "pessoa")
@SequenceGenerator(name = "pessoa_codigo", sequenceName = "pessoa_codigo")
public class Estudante extends Pessoa {
	@Column(name = "tipo")
	private Character pessoaEstudante = TipoPessoa.ESTUDANTE.getTipo();
}