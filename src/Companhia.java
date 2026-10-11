import java.util.ArrayList;
import java.util.List;

public class Companhia {
    private String nome;
    private float taxaLucro;

    private List<Voo> voos;

    public Companhia(String nome, float taxaLucro) {
        this.nome = nome;
        this.taxaLucro = taxaLucro;
        this.voos = new ArrayList<>();
    }
}
