package aufgaben;

public class Hindernislauf extends Leichtatletik{

    private double zeit = 30;

    /**
     * @return variabila de tip clasa 'zeit'
     */
    @Override
    public double kalkuliereZeit() {
        return zeit;
    }

    /**
     * setter, modifica variabila zeit
     * @param zeit - double
     */
    public void setZeit(double zeit) {
        this.zeit = zeit;
    }
}
