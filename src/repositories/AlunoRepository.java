package repositories;

import entities.Aluno;
import factories.ConnectionFactory;

/*
 * Classe para inserir, consultar, editar e excluir
 * produtos no banco de dados (CRUD)
 */

public class AlunoRepository {

	// Método para inserir um produto na tabela do banco de dados 
	
	public void inserir (Aluno aluno) {
		
		try {
			
			// Abrir conexão com o banco de dados
			var factory = new ConnectionFactory();
			var connection = factory.obterConexao();
			
			/*
			 * Escrevendo comando SQL que será 
			 * executando no banco de dados
			 */
			var sql = """
					 		 	INSERT INTO alunos
					 		 			(nome, telefone, matricula, data_nascimento)
					 		 	VALUES (?, ?, ?, ?)
					""";
			
			 //Preparando o comando SQL para ser executado no banco
			var statement = connection.prepareStatement(sql);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getTelefone());
			statement.setString(3, aluno.getMatricula());
			statement.setDate(4, new java.sql.Date(aluno.getDataNascimento().getTime()));
			statement.execute(); // Executando 
			
			connection.close(); // Fechando a conexão com o banco 
			
			System.out.println("\nAluno cadastrado com sucesso!");
		}
		
		catch (Exception e) {
			System.out.println("\nFalha ao cadastrar o aluno: " + e.getMessage());
		}
		
	}
	
}
