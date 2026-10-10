import java.util.Date;

public abstract class Voo {
    private int nVoo;
    private Date horaPartida;
    private String portaDeEmbarque;
    private float custoBase;

    private Aeronave aeronave;
    private Companhia companhia;
    private Aeroporto destino;

    public float getCusto() {
        // TODO
        return 0;
    }
}
