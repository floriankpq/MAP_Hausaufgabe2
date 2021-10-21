package aufgaben;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {

        List<Sport> sports = new ArrayList<>();
        Fussball f = new Fussball();
        sports.add(f);

        Benutzer some = new Benutzer("Andrei", "Pop", sports);

        assertEquals(some.kalkuliereZeit(), f.kalkuliereZeit());
    }

    @Test
    void testKalkuliereZeit() {

        Fussball f = new Fussball();
        assertEquals(65.0, f.kalkuliereZeit());

        f.setZeit(90.0);
        assertEquals(90.0, f.kalkuliereZeit());
    }

    @Test
    void kalkuliereDurchschnittszeit() {

        List<Sport> sports = new ArrayList<>();
        Fussball f = new Fussball();
        Basketball b = new Basketball();

        sports.add(f);
        sports.add(b);

        double time = 0;
        time += f.kalkuliereZeit();
        time += b.kalkuliereZeit();
        time /= 2;

        Benutzer some = new Benutzer("Andrei", "Pop", sports);

        assertEquals(time, some.kalkuliereDurchschnittszeit());
    }
}