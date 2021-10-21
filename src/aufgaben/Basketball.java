package aufgaben;

public class Basketball extends Mannschaftssport{

    private double zeit = 55;

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
