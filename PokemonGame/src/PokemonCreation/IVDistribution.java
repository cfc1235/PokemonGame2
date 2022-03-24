package PokemonCreation;

//IVs are distributed randomly between random 30 - 35

import java.util.ArrayList;
import java.util.List;

public class IVDistribution {

    public static List<Integer> DistributeIVs(){
        int IVtotal = (int) (Math.floor(Math.random() * ((35 - 31) + 30)) + 30);
        int overkill = 0;
        int range = 0;
        List<Integer> DistributeIVs = new ArrayList<Integer>();
        while(range != 6) {
            int top = IVtotal / 5;
            int IV = - 1;
            while ((IV <= 0) || (IV > 6)) {
                IV = (int) (Math.floor(Math.random() * ((top - 1) + 1)) + 1);}
            overkill += (top - IV);
            DistributeIVs.add(IV);
            range += 1;
        }
        while(overkill != 0) {
            int place = (int) (Math.floor(Math.random() * ((5 - 1) + 0)));
            DistributeIVs.set(place, (DistributeIVs.get(place) + 1));
            overkill -= 1;
        }
        return DistributeIVs;
    }
}
