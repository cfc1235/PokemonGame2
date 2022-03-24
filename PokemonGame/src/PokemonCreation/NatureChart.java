package PokemonCreation;

import java.util.ArrayList;
import java.util.List;

public class NatureChart {

    public static String NatureType() {
        List<String> natures = new ArrayList<String>();
        //Att up Att Down
        natures.add("Serious");
        //Att up Def Down
        natures.add("Bold");
        //Att up Spec Def down
        natures.add("Adamant");
        //Att up Spec Att down
        natures.add("Naughty");
        //Att up Speed down
        natures.add("Brave");
        //Def Up
        natures.add("Hardy");
        natures.add("Docile");
        natures.add("Impish");
        natures.add("Lonely");
        natures.add("Relaxed");
        //Spec Att up
        natures.add("Modest");
        natures.add("Lax");
        natures.add("Mild");
        natures.add("Rash");
        natures.add("Quiet");
        //SpecDef Up
        natures.add("Calm");
        natures.add("Gentle");
        natures.add("Careful");
        natures.add("Quirky");
        natures.add("Sassy");
        //Speed up
        natures.add("Timid");
        natures.add("Hasty");
        natures.add("Jolly");
        natures.add("Naive");
        natures.add("Bashful");
        int NatNum = (int) (Math.floor(Math.random() * ((15 - 2) + 1)));
        String Nature = natures.get(NatNum);
        return Nature;
    }
}


