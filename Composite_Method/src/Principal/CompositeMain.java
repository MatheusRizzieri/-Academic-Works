package Principal;

import Composite.Aluno;
import Composite.Turma;

public class CompositeMain {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Joao",30000);
		
		Aluno aluno2 = new Aluno("Ana",12233);
		
		Aluno aluno3 = new Aluno("Matheus",33221);
		
		Turma novaTurma = new Turma("2020.1A");
		novaTurma.adicionarAluno(aluno1);
		novaTurma.adicionarAluno(aluno2);
		novaTurma.adicionarAluno(aluno3);
		
		Aluno aluno4 = new Aluno("Maria",4000);
		Aluno aluno5 = new Aluno("Guilherme",66231);
		
		novaTurma.adicionarAluno(aluno4);
		novaTurma.adicionarAluno(aluno5);
		
		//Dois Alunos Resolveram Sair da turma, Então:
		
		novaTurma.removerAluno(aluno1);
		novaTurma.removerAluno(aluno2);
		
		System.out.println("Alunos da Turma " + novaTurma.getIdTurma());
		
		for (Aluno aluno : novaTurma.getlistaAlunos()) {
			System.out.println(aluno.getNome() + "  "+ aluno.getMatricula());
		}
		
		

	}

}

