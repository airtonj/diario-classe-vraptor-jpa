package cc.diario.model;

import javax.persistence.*;

@MappedSuperclass
public class Pessoa implements ModelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pessoa_codigo")
	@Column(name = "codigo")
	private Long id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "ddd")
	private String ddd;
	@Column(name = "telefone")
	private String telefone;
	@Column(name = "endereco")
	private String endereco;
	@Column(name = "email")
	private String email;
	@Column(name = "senha")
	private String senha;

	public Pessoa() {
		super();
	}

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

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
