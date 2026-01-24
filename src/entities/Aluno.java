package entities;

import java.util.Date;

// Modelo de dados para entidade Aluno

public class Aluno {

	/* Id (Númerico inteiro)
	 * Nome (Texto)
	 * Telefone (Texto)
	 * Matrícula (Texto)
	 * Data de nascimento (Date)
	 */
	
	private Integer id;
	private String nome;
	private String telefone;
	private String matricula;
	private Date dataNascimento;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getMatricula() {
		return matricula;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}  
	
	
	
	
}
