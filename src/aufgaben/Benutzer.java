package aufgaben;

import java.util.List;

public class Benutzer {

    String vorName;
    String nachName;
    List<Sport> sport;

    public Benutzer(String vorName, String nachName, List<Sport> sport) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.sport = sport;
    }

    /**
     * calculeaza timpul necesar pt practicarea tuturor sporturilor alese de utilizator
     * @return timpul total
     */
    double kalkuliereZeit(){

        double zeit = 0;

        for(Sport sport : this.sport) {
            zeit += sport.kalkuliereZeit();
        }
        return zeit;
    }

    /**
     * specifica timpul atribuit unui sport anume
     * @param sport variabila de tip Sport
     * @return timpul pt a practica 'sport'
     */
    double kalkuliereZeit(Sport sport){

        return sport.kalkuliereZeit();
    }

    /**
     * calculeaza media de timp a sporturilor alese de utilizator
     * @return media
     */
    double kalkuliereDurchschnittszeit(){

        double gesamtZeit = kalkuliereZeit();
        int anzahlSport = this.sport.size();

        return gesamtZeit/anzahlSport;
    }
}
