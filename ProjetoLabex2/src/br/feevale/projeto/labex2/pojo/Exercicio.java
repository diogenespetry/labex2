package br.feevale.projeto.labex2.pojo;

import java.util.ArrayList;

public class Exercicio {

	public long id;
	public String questao;
	public String tipoExercicio;
	public long idCategoria;
	public ArrayList<Resposta> respostas = new ArrayList<Resposta>();
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestao() {
		return questao;
	}
	public void setQuestao(String questao) {
		this.questao = questao;
	}
	public String getTipoExercicio() {
		return tipoExercicio;
	}
	public void setTipoExercicio(String tipoExercicio) {
		this.tipoExercicio = tipoExercicio;
	}
	public long getIdCategoria() {
		return idCategoria;
	}
	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}
	public ArrayList<Resposta> getRespostas() {
		return respostas;
	}
	public void setRespostas(ArrayList<Resposta> respostas) {
		this.respostas = respostas;
	}
	
	
}
