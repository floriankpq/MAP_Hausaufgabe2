package aufgaben;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Sport> favourites = new ArrayList<Sport>();
	    Benutzer user = new Benutzer("Andrei", "Dan", favourites);

        Basketball baschet = new Basketball();
        Hindernislauf laufen = new Hindernislauf();
        Fussball fussball = new Fussball();

        favourites.add(baschet);
        favourites.add(laufen);

        System.out.println("timpul nevcesar practicarii sporturilor : " + user.kalkuliereZeit());
        System.out.println("media timpului : " + user.kalkuliereDurchschnittszeit());
        System.out.println("valoarea standard pt fotbal : " + user.kalkuliereZeit(fussball));

        fussball.setZeit(90.0);
        favourites.add(fussball);

        System.out.println("media timpului dupa adagarea si modificarea duratei fotbalului: " + user.kalkuliereDurchschnittszeit());
    }
}
