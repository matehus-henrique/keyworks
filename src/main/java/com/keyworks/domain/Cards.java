package com.keyworks.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Cards implements Serializable {
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	private String projeto;
	private String descricao;
	private String status;
	private Date data;
	
	public Cards() {
		// TODO Auto-generated constructor stub
	}

	public Cards(Integer id, String nome, String projeto, String descricao, String status, Date data) {
		super();
		this.id = id;
		this.nome = nome;
		this.projeto = projeto;
		this.descricao = descricao;
		this.status = status;
		this.data = data;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cards other = (Cards) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
