package controllers;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Aluno;
import repositories.AlunoRepository;

/*
 * Classe para fazer as capturas dados
 * preenchidos pelo usuário do sistema
 */

public class AlunoController {

	 /*
	  * Método para fazer a captura do cadastro do produto 
	  */
	
		public void cadastrarAluno() {
			
			try {
				

			var scanner = new Scanner(System.in);
			
			// Criando um objeto da classe aluno
			var aluno = new Aluno();
			
			// Capturando o nome
			System.out.print("NOME DO ALUNO.........................: ");
			aluno.setNome(scanner.nextLine());
			
			// Capturando o telefone
			System.out.print("TELEFONE DO ALUNO.....................: ");
			aluno.setTelefone(scanner.nextLine());
			
			// Capturando a matrícula
			System.out.print("MATRÍCULA DO ALUNO.....................: ");
			aluno.setMatricula(scanner.nextLine());
			
			// Capturando a data de nascimento
			System.out.print("DATA DE NASCIMENTO (dd/MM/yyyy).........: ");
			var dataNascimentoString = scanner.nextLine();
			
			// Convertendo a data de String para Date
			var formato = new SimpleDateFormat("dd/MM/yyyy");
			aluno.setDataNascimento(formato.parse(dataNascimentoString));
			
			// Criando um objeto da classe AlunoRepository
			var alunoRepository = new AlunoRepository();
			
			// Inserindo o produto no banco de dados
			alunoRepository.inserir(aluno);
			
			scanner.close();
			
		} 
			catch (Exception e) {
			System.out.println("\nData inválida. Use o formato dd/MM/yyyy");
			
			}
			
		}
	
}
