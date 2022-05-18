package Moveset.Normal;

import BattleMechanics.Moves;
import Interfaces.AddMoveset;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Random;

public class Metronome extends Moves implements AddMoveset {

    private ArrayList<Moves> moveList = new ArrayList<>();
    private Random random = new Random();

    private void Initialize() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException{
        Class<?> moveset = Class.forName("Interfaces.AddMoveset");
        Method[] methods = moveset.getMethods();
        for(Method move : methods){
            if (move.getName().startsWith("add") && !move.getName().startsWith("addMetronome")){
                this.moveList.add((Moves) move.invoke(moveset));
            }
        }
    }
    public Metronome() {
        try {
            Initialize();
        } catch (ClassNotFoundException
                | InvocationTargetException
                | IllegalAccessException e) {
            e.printStackTrace();
        }
        this.name = "Metronome";
        this.type = "Normal";
        this.PP = 10;
        this.savedPP = this.PP;
        this.TMNum = 114;
    }

    @Override
    public Moves resolveMetronome() {
        int randomBound = this.moveList.size();
        int choice = this.random.nextInt(randomBound);
        return this.moveList.get(choice);
    }
}
