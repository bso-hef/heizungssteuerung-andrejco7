import java.util.ArrayList;
import java.util.List;
package org.example
public class Temperaturmanager {

    private List<Raum> raeume = new ArrayList<>();

    public void regeleTemperatur() {
        for (Raum raum : raeume) {
            raum.regeleTemperatur();
        }
    }
}


}
