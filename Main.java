import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {
            while(true) {
                Aluno aluno = new Aluno();
                System.out.println("Quantas notas possui sua disciplina?: ");
                int quant = scan.nextInt();
                IntStream.range(0, quant).forEach(i -> {
                    System.out.println("Digite a sua " + (i+1) + "º nota");
                    aluno.addNota(scan.nextDouble());
                });

                System.out.println(String.format("A sua média é de %.2f", aluno.calcularMedia()));
                System.out.println(String.format("O seu status é de \"%s\"", aluno.getStatus()));
            }
        }catch (InputMismatchException e){
            System.out.println("O valor informado é invalido!");
        }
    }

}
