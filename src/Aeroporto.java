import java.util.List;
import java.util.ArrayList;

public class Aeroporto {
    private String nome;

    private List<Voo> voos;
    private List<VooIndireto> voosIndiretos;

    public Aeroporto(String nome) {
        this.nome = nome;
        this.voos = new ArrayList<>();
        this.voosIndiretos = new ArrayList<>();
    }
}
