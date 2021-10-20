package aufgaben;

public class Hindernislauf extends Leichtatletik{

    private double zeit = 30;

    @Override
    public double kalkuliereZeit() {
        return zeit;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }
}
