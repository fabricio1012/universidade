import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private List<Disciplina> disciplinas;
    private List<Professor> professores;
    private List<Aluno> alunos;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<>();
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Disciplina> disciplinasPendentes(Aluno aluno) {
        List<Disciplina> pendentes = new ArrayList<>(disciplinas);
        pendentes.removeAll(aluno.getDisciplinasMatriculadas());
        return pendentes;
    }
}
