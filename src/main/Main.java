package main;

import controllers.AlunoController;

public class Main {

	public static void main(String[] args) {

		//Criando um objeto da classe de controle
		var alunoController = new AlunoController();
		
		//Executar o cadastro do aluno
		alunoController.cadastrarAluno();
		
	}

}
