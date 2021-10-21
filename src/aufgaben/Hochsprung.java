package aufgaben;

public class Hochsprung extends Leichtatletik{

    private double zeit = 20;

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
