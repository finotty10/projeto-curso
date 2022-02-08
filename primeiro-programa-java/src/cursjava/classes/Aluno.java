package cursjava.classes;

import java.util.ArrayList;
import java.util.List;

import curso.constantes.StatusAluno;

public class Aluno extends Pessoa {
    private String nome;
    private int idade;
    private String dataNascimento;
    private String registroGeral;
    private String numeroCpf;
    private String nomeMae;
    private String nomePai;
    private String dataMatricula;
    private String nomeEscola;
    private String serieMatriculado;
    
    private List<Disciplina>disciplina = new ArrayList <Disciplina>();
    
    public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}
    public List<Disciplina> getDisciplina() {
		return disciplina;
	}
	
	public Aluno() { //cria os dados na memoria - sendo padrao do java
		
	}
    public Aluno (String nomePadrao) {
    	nome = nomePadrao;
    }
    public Aluno (String nomePadrao, int idadePadrao) {
    	nome = nomePadrao;
    	idade= idadePadrao;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public String getNome() {
    	return nome;
    }
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getRegistroGeral() {
		return registroGeral;
	}
	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}
	public String getNumeroCpf() {
		return numeroCpf;
	}
	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	
	public double getMediaNota() {
		
		double somaNotas = 0;
		
		for(Disciplina disciplina : disciplina) {
			somaNotas+= disciplina.getNota();
		}
		
		return somaNotas/disciplina.size();
	}
	public String getDisciplinaAluno() {
		String nomeDisciplina ="";
		for (Disciplina disciplina : disciplina) {
			nomeDisciplina = disciplina.getDisciplina();
		}
		return nomeDisciplina;
	}
	
	public String getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 50) {
			if(media >= 70) {
			return StatusAluno.APROVADO;
			}else {
				return StatusAluno.RECUPERACAO;
			}
		}else {
			return StatusAluno.REPROVADO;
		}
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}
	
	@Override //Identifica método sobreescrito
	public boolean pessoaMaiorIdade() {
		
		return idade >=21;
	}
	
	public String msgMaiorIdade() {
		return this.pessoaMaiorIdade() ? "maior de idade" : "menor de idade";
	}
	@Override
	public double salario() {
		
		return 1500;
	}
	
}
