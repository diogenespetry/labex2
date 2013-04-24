package br.feevale.projeto.labex2.webtools;

import java.util.ArrayList;

import br.feevale.projeto.labex2.pojo.Exercicio;
import br.feevale.projeto.labex2.pojo.FolhaDeExercicios;
import br.feevale.projeto.labex2.pojo.Resposta;

public class ExercicioWs extends Webservice {

	
	public ArrayList<FolhaDeExercicios> getFolhasDeExercicios() {
		
		
		Resposta resposta = new Resposta();
		resposta.id = 1;
		resposta.resposta = "Alternativa 1";
		
		Resposta resposta1 = new Resposta();
		resposta1.id = 1;
		resposta1.resposta = "Alternativa 2";
		
		Exercicio exercicio = new Exercicio();
		exercicio.id = 1;
		exercicio.idCategoria = 1;
		exercicio.questao = "Qual é a certa?";
		exercicio.tipoExercicio = "objetivo";
		exercicio.respostas.add(resposta);
		exercicio.respostas.add(resposta1);
		
		FolhaDeExercicios folhaExercicios = new FolhaDeExercicios();
		
		folhaExercicios.exercicios.add(exercicio);
		folhaExercicios.exercicios.add(exercicio);
		
		ArrayList<FolhaDeExercicios> folhasDeExercicios = new ArrayList<FolhaDeExercicios>();
		
		folhasDeExercicios.add(folhaExercicios);
		
		return folhasDeExercicios;
	}
	
	public ArrayList<Exercicio> getExercicios() {
		
		
		Resposta resposta = new Resposta();
		resposta.id = 1;
		resposta.resposta = "Alternativa 1";
		
		Resposta resposta1 = new Resposta();
		resposta1.id = 1;
		resposta1.resposta = "Alternativa 2";
		
		Exercicio exercicio = new Exercicio();
		exercicio.id = 1;
		exercicio.idCategoria = 1;
		exercicio.questao = "Qual é a certa?";
		exercicio.tipoExercicio = "objetivo";
		exercicio.respostas.add(resposta);
		exercicio.respostas.add(resposta1);
		
		Exercicio exercicio2 = new Exercicio();
		exercicio2.id = 2;
		exercicio2.idCategoria = 1;
		exercicio2.questao = "Qual é a certa mesmo?";
		exercicio2.tipoExercicio = "objetivo";
		exercicio2.respostas.add(resposta);
		exercicio2.respostas.add(resposta1);
		
		ArrayList<Exercicio> exercicios = new ArrayList<Exercicio>();
		exercicios.add(exercicio2);
		exercicios.add(exercicio);
		
		return exercicios;
	}
	

	
}
