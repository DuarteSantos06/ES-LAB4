import java.util.Iterator;
import java.util.List;

public class VooIndireto extends Voo {
    private float taxaDeAbastecimento;
    private boolean permiteEmbarqueTransito;

    private List<Aeroporto> paragens;

    public Iterator<Aeroporto> paragensIterator() {
        return null;
    }

    @Override
    public float getCusto() {
        return 0;
    }
}
