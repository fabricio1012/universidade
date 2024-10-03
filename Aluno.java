import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String nome) {
        this.nome = nome;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    public void matricular(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }

    public List<Disciplina> getDisciplinasMatriculadas() {
        return disciplinasMatriculadas;
    }

    public int calcularHorasCursadas() {
        return disciplinasMatriculadas.stream().mapToInt(Disciplina::getCargaHoraria).sum();
    }

    public String getNome() {
        return nome;
    }
}
