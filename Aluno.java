import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private List<Double> notas;
    private Status status;

    public double calcularMedia(){
        double soma = this.notas.stream().mapToDouble(Double::doubleValue).sum();
        double media = soma/this.notas.size();
        if(media > 6){
            this.status = AlunoStatus.APROVADO;
        }else if(media >= 4){
            this.status = AlunoStatus.REPOSICAO;
        }else{
            this.status = AlunoStatus.REPROVADO;
        }
        return media;
    }

    public String getStatus(){
        this.calcularMedia();
        return status.getValue();
    }

    public void addNota(double nota){
        if(notas == null){
            notas = new ArrayList<>();
        }
        notas.add(nota);
    }

    private enum AlunoStatus implements Status{
        APROVADO{
            @Override
            public String getValue() {
                return "Aprovado";
            }
        },
        REPOSICAO{
            @Override
            public String getValue() {
                return "Reposição da Menor Nota";
            }
        },
        REPROVADO{
            @Override
            public String getValue() {
                return "Reprovado";
            }
        }
    }

}
