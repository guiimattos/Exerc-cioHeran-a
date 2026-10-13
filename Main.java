public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Maria Silva", "111.222.333-44", "2024001", "Analise e Desenvolvimento de Sistemas");
        System.out.println("ALUNO");
        System.out.println(aluno.toString());

        Atendente atendente = new Atendente("Joao Souza", "555.666.777-88", "Secretaria", "Atendimento ao aluno");
        atendente.setNumeroCracha(1010);
        atendente.setSalario(2500.00);
        System.out.println("\nATENDENTE");
        System.out.println(atendente.toString());

        Disciplina d1 = new Disciplina(1, "Programacao Orientada a Objetos");
        Disciplina d2 = new Disciplina(2, "Banco de Dados");
        Disciplina d3 = new Disciplina(3, "Estrutura de Dados");

        Professor professor = new Professor("Carlos Lima", "999.888.777-66", "http://lattes.cnpq.br/123456");
        professor.setNumeroCracha(2020);
        professor.setSalario(7000.00);
        professor.addDisciplina(d1);
        professor.addDisciplina(d2);
        professor.addDisciplina(d3);
        System.out.println("\nPROFESSOR");
        System.out.println(professor.toString());

        System.out.println("\nDisciplina na posicao 1: " + professor.getDisciplina(1).toString());

        professor.removeDisciplina(0);
        professor.removeDisciplina(d3);
        System.out.println("\nPROFESSOR depois de remover disciplinas");
        System.out.println(professor.toString());
    }
}
