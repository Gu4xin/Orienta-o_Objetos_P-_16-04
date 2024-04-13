// Classe Alunos
public class Alunos {
    // Atributos
    String nome_aluno;
    String ra_aluno;
    int nota1;
    int nota2;
    int nota3;

    // Construtor
    public Alunos(String nome_aluno, String ra_aluno, int nota1, int nota2, int nota3) {
        this.nome_aluno = nome_aluno;
        this.ra_aluno = ra_aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    // Calcular total de notas
    public int getTotal_notas_aluno() {
        return nota1 + nota2 + nota3;
    }

    // Métodos getters
    public String getNome_aluno() {
        return nome_aluno;
    }

    public String getRa_aluno() {
        return ra_aluno;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }
}

// Classe App
public class App {
    public static void main(String[] args) {
        // Objetos para os dois alunos
        Alunos aluno1 = new Alunos("João", "123456", 25, 30, 35);
        Alunos aluno2 = new Alunos("Maria", "654321", 20, 30, 40);

        System.out.println("Aluno: " + aluno1.getNome_aluno());
        System.out.println("RA: " + aluno1.getRa_aluno());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Total de notas: " + aluno1.getTotal_notas_aluno());

        System.out.println();

        System.out.println("Aluno: " + aluno2.getNome_aluno());
        System.out.println("RA: " + aluno2.getRa_aluno());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Total de notas: " + aluno2.getTotal_notas_aluno());
    }
}
