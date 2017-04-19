package com.algaworks.brewer.model;

public enum Sabor {

	ADOCIADA("Adocicada"),
	AMARGA("Amarga"),
	FORTE("Forte"),
	FRUTADA("Frutada"),
	SUAVE("Suave");
	
	private String descricao;
	
	/**
	 * Constructor
	 * @param descricao
	 */
	Sabor(String descricao){
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

}
