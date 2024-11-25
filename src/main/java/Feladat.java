import kozostarolo.model.*;

import java.util.ArrayList;
import java.util.List;

public class Feladat {
    private List<AbstractIdom> ai;

    public Feladat() {
        ai = new ArrayList<>();
        ai.add(new MertaniHenger(2.3, 3.6));
        ai.add(new LyukasHenger(2.8, 6.3, 2.2));
        ai.add(new Hasab(3.2, 5.5, 2.2));
        ai.add(new Gomb(2.2));
    }

    public void run(){
        System.out.println(terfogatKi());
    }

    public String terfogatKi(){
        String s = "Térfogatok: \n";
        for (AbstractIdom abidom : ai) {
           s += abidom;
           s += "\n V: " +abidom.terfogat();
           s+="\n\n";
        }
       return s;
    }

}
