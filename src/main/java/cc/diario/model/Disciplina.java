package cc.diario.model;

import javax.persistence.*;

@Entity
@Table(name = "disciplina")
@SequenceGenerator(name = "disciplina_codigo", sequenceName = "disciplina_codigo")
public class Disciplina {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "disciplina_codigo")
	@Column(name = "codigo")
	private Long id;
	@Column(name = "nome")
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
