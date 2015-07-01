package cc.diario.model;

import javax.persistence.*;

@Entity
@Table(name = "turma")
@SequenceGenerator(name = "turma_codigo", sequenceName = "turma_codigo")
public class TurmaDisciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "turma_codigo")
	@Column(name = "codigo")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "codigo_disciplina")
	private Disciplina disciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
}
