package aufgaben;

public class Basketball extends Mannschaftssport{

    private double zeit = 55;

    @Override
    public double kalkuliereZeit() {
        return zeit;
    }

    public void setZeit(double zeit) {
        this.zeit = zeit;
    }
}
