import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Integer> notas;

    public int calcularMedia(){
        int soma = this.notas.stream().mapToInt(Integer::intValue).sum();
        int media = (int) Math.round(soma/this.notas.size());
        return media;
    }

    public String getStatus(){
        double media = this.calcularMedia();
        if(media >= 60){
            return "Aprovado";
        }else if(media >= 40){
            return "Reposição da menor nota";
        }else{
            return "Reprovado";
        }
    }

    public void addNota(int nota){
        if(notas == null){
            notas = new ArrayList<>();
        }
        notas.add(nota);
    }

}
