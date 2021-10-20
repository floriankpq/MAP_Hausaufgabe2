package aufgaben;

public class Fussball extends Mannschaftssport{

    private double zeit = 65;

    @Override
    public double kalkuliereZeit() {
        return zeit;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }
}
