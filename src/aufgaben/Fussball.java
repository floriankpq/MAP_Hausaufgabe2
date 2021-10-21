package aufgaben;

public class Fussball extends Mannschaftssport{

    private double zeit = 65;

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
