package cc.diario.model;

import javax.persistence.*;

@Entity
@Table(name = "frequencia")
@SequenceGenerator(name = "frequencia_codigo", sequenceName = "frequencia_codigo")
public class Frequencia implements ModelEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "frequencia_codigo")
	@Column(name = "codigo")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "codigo_aluno")
	private Estudante aluno;

	@Column(name = "aula")
	private Long aula;

	@Column(name = "presenca")
	private Character presenca;

	@ManyToOne
	@JoinColumn(name = "codigo_turma")
	private TurmaDisciplina turmaDisciplina;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Estudante getAluno() {
		return aluno;
	}

	public void setAluno(Estudante aluno) {
		this.aluno = aluno;
	}

	public Long getAula() {
		return aula;
	}

	public void setAula(Long aula) {
		this.aula = aula;
	}

	public Character getPresenca() {
		return presenca;
	}

	public void setPresenca(Character presenca) {
		this.presenca = presenca;
	}

	public TurmaDisciplina getTurmaDisciplina() {
		return turmaDisciplina;
	}

	public void setTurmaDisciplina(TurmaDisciplina turmaDisciplina) {
		this.turmaDisciplina = turmaDisciplina;
	}
}
