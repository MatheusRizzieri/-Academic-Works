package Composite;

import java.util.ArrayList;

public class Turma {
	
	private String idTurma;
	private ArrayList<Aluno> listaAlunos;
	
	
	public Turma(String id){
		this.idTurma = id;
		listaAlunos = new ArrayList<Aluno>();
	}
	
	public void adicionarAluno(Aluno alunoNovo) {
		listaAlunos.add(alunoNovo);
	}
	
	public void removerAluno(Aluno alunoRemovido) {
		listaAlunos.remove(alunoRemovido);
	}
	
	public ArrayList<Aluno> getlistaAlunos(){
		return listaAlunos;
	}
	
	public String getIdTurma() {
		return idTurma;
	}
}
