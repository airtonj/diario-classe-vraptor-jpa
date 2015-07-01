package cc.diario.model.type;

public enum TipoPessoa {

	PROFESSOR('1'), ESTUDANTE('2');

	private TipoPessoa(Character tipo) {
		this.tipo = tipo;
	}

	private Character tipo;

	public Character getTipo() {
		return tipo;
	}
}