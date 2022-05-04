public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.addNota(20);
        aluno.addNota(30);
        aluno.addNota(40);

        System.out.println(String.format("A média do aluno é %d",aluno.calcularMedia()));
        System.out.println(String.format("O status do aluno é \"%s\"",aluno.getStatus()));
    }

}
