import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando professores
        Professor prof1 = new Professor("Dr. João");
        Professor prof2 = new Professor("Prof. Maria");

        // Criando disciplinas
        Disciplina d1 = new Disciplina("Programação I", 60, prof1);
        Disciplina d2 = new Disciplina("Matemática", 45, prof1);
        Disciplina d3 = new Disciplina("Banco de Dados", 30, prof2);

        // Criando curso
        Curso curso = new Curso("Ciência da Computação");
        curso.adicionarDisciplina(d1);
        curso.adicionarDisciplina(d2);
        curso.adicionarDisciplina(d3);
        curso.adicionarProfessor(prof1);
        curso.adicionarProfessor(prof2);

        // Criando aluno
        Aluno aluno = new Aluno("Carlos");
        aluno.matricular(d1);
        aluno.matricular(d3);

        curso.adicionarAluno(aluno);

        // Visualizando disciplinas do aluno
        System.out.println("Disciplinas de " + aluno.getNome() + ":");
        for (Disciplina disciplina : aluno.getDisciplinasMatriculadas()) {
            System.out.println(disciplina);
        }

        // Calculando horas cursadas
        int horasCursadas = aluno.calcularHorasCursadas();
        System.out.println("Horas cursadas: " + horasCursadas);

        // Listando disciplinas pendentes
        List<Disciplina> pendentes = curso.disciplinasPendentes(aluno);
        System.out.println("Disciplinas pendentes:");
        for (Disciplina disciplina : pendentes) {
            System.out.println(disciplina);
        }
    }
}
