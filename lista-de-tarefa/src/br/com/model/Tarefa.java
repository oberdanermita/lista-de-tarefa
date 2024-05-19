package br.com.model;

public class Tarefa {
	private Integer id;
	private String descricao;
	private Status Status;
	private Integer percentual;
	private Pessoa pessoaPrestador;
	private Pessoa pessoaRequisitante;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Status getStatus() {
		return Status;
	}
	public void setStatus(Status status) {
		Status = status;
	}
	public Integer getPercentual() {
		return percentual;
	}
	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}
	public Pessoa getPessoaPrestador() {
		return pessoaPrestador;
	}
	public void setPessoaPrestador(Pessoa pessoaPrestador) {
		this.pessoaPrestador = pessoaPrestador;
	}
	public Pessoa getPessoaRequisitante() {
		return pessoaRequisitante;
	}
	public void setPessoaRequisitante(Pessoa pessoaRequisitante) {
		this.pessoaRequisitante = pessoaRequisitante;
	}
	
	
	
}
