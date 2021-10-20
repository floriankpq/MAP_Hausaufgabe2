package aufgaben;

public class Hochsprung extends Leichtatletik{

    private double zeit = 20;

    @Override
    public double kalkuliereZeit() {
        return zeit;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }
}
