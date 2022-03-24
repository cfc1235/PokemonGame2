package PokemonCreation;

import javax.swing.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class PokeColors {

    public static AbstractBorder getBorder(Pokemon pokemon){
        Color color1 = new Color(237,164,237);
        Color color2 = null;
        if(pokemon.type2.equals("Fairy")){
            color2 = new Color(237,164,237);
        }
        if(pokemon.type1.equals("Water")){
            color1 = new Color(39,134,231);
        }
        if(pokemon.type2.equals("Water")){
            color2 = new Color(39,134,231);
        }
        if(pokemon.type1.equals("Ice")){
            color1 = new Color(109,211,245);
        }
        if(pokemon.type2.equals("Ice")){
            color2 = new Color(109,211,245);
        }
        if(pokemon.type1.equals("Psychic")){
            color1 = new Color(221,50,103);
        }
        if(pokemon.type2.equals("Psychic")){
            color2 = new Color(221,50,103);
        }
        if(pokemon.type1.equals("Steel")){
            color1 = new Color(180,180,194);
        }
        if(pokemon.type2.equals("Steel")){
            color2 = new Color(180,180,194);
        }
        if(pokemon.type1.equals("Ghost")){
            color1 = new Color(91,91,172);
        }
        if(pokemon.type2.equals("Ghost")){
            color2 = new Color(91,91,172);
        }
        if(pokemon.type1.equals("Normal")){
            color1 = new Color(199,194,187);
        }
        if(pokemon.type2.equals("Normal")){
            color2 = new Color(199,194,187);
        }
        if(pokemon.type1.equals("Fighting")){
            color1 = new Color(122,49,27);
        }
        if(pokemon.type2.equals("Fighting")){
            color2 = new Color(122,49,27);
        }
        if(pokemon.type1.equals("Dragon")){
            color1 = new Color(114,91,218);
        }
        if(pokemon.type2.equals("Dragon")){
            color2 = new Color(114,91,218);
        }
        if(pokemon.type1.equals("Poison")){
            color1 = new Color(145,68,147);
        }
        if(pokemon.type2.equals("Poison")){
            color2 = new Color(145,68,147);
        }
        if(pokemon.type1.equals("Ground")){
            color1 = new Color(215,182,95);
        }
        if(pokemon.type2.equals("Ground")){
            color2 = new Color(215,182,95);
        }
        if(pokemon.type1.equals("Flying")){
            color1 = new Color(133,152,233);
        }
        if(pokemon.type2.equals("Flying")){
            color2 = new Color(133,152,233);
        }
        if(pokemon.type1.equals("Dark")){
            color1 = new Color(60,45,35);
        }
        if(pokemon.type2.equals("Dark")){
            color2 = new Color(60,45,35);
        }
        if(pokemon.type1.equals("Rock")){
            color1 = new Color(164,140,66);
        }
        if(pokemon.type2.equals("Rock")){
            color2 = new Color(164,140,66);
        }
        if(pokemon.type1.equals("Grass")){
            color1 = new Color(72,167,16);
        }
        if(pokemon.type2.equals("Grass")){
            color2 = new Color(72,167,16);
        }
        if(pokemon.type1.equals("Fire")){
            color1 = new Color(202,35,1);
        }
        if(pokemon.type2.equals("Fire")){
            color2 = new Color(202,35,1);
        }
        if(pokemon.type1.equals("Electric")){
            color1 = new Color(243,171,15);
        }
        if(pokemon.type2.equals("Electric")){
            color2 = new Color(243,171,15);
        }
        if(pokemon.type1.equals("Bug")){
            color1 = new Color(148,163,20);
        }
        if(pokemon.type2.equals("Bug")){
            color2 = new Color(148,163,20);
        }
        if(color2 == null){
            return new LineBorder(color1, 5);
        }
        return BorderFactory.createCompoundBorder(new LineBorder(color1, 3), new LineBorder(color2, 3));
    }
}
