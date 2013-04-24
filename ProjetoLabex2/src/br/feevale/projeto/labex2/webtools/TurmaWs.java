package br.feevale.projeto.labex2.webtools;

import java.util.ArrayList;

import br.feevale.projeto.labex2.pojo.ListaDeTurmas;
import br.feevale.projeto.labex2.pojo.Turma;

public class TurmaWs extends Webservice {

	public ListaDeTurmas getTurmas() {
		
		Turma turma = new Turma();
		turma.id = 1;
		turma.nome = "Turma";
		turma.professor = false;
		
		Turma turma1 = new Turma();
		turma1.id = 2;
		turma1.nome = "Turma 2";
		turma1.professor = false;
		
		Turma turma2 = new Turma();
		turma2.id = 3;
		turma2.nome = "Turma 3";
		turma2.professor = true;
		
		ArrayList<Turma> turmas = new ArrayList<Turma>();
		turmas.add(turma);
		turmas.add(turma1);
		turmas.add(turma2);
		
		ListaDeTurmas listaDeTurmas = new ListaDeTurmas();
		listaDeTurmas.turmas = turmas;
		return listaDeTurmas;
	}
}
