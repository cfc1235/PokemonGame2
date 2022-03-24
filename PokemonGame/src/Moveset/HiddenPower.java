package Moveset;

import BattleMechanics.Moves;

import java.util.Random;

public class HiddenPower extends Moves {

    private void getType(){
        int num = new Random().nextInt(18);
        if(num == 0){
            this.type = "Normal";
        }
        if(num == 1){
            this.type = "Fighting";
        }
        if(num == 2){
            this.type = "Flying";
        }
        if(num == 3){
            this.type = "Poison";
        }
        if(num == 4){
            this.type = "Ground";
        }
        if(num == 5){
            this.type = "Rock";
        }
        if(num == 6){
            this.type = "Bug";
        }
        if(num == 7){
            this.type = "Ghost";
        }
        if(num == 8){
            this.type = "Steel";
        }
        if(num == 9){
            this.type = "Fire";
        }
        if(num == 10){
            this.type = "Water";
        }
        if(num == 11){
            this.type = "Grass";
        }
        if(num == 12){
            this.type = "Electric";
        }
        if(num == 13){
            this.type = "Psychic";
        }
        if(num == 14){
            this.type = "Ice";
        }
        if(num == 15){
            this.type = "Dragon";
        }
        if(num == 16){
            this.type = "Dark";
        }
        if(num == 17){
            this.type = "Fairy";
        }
    }

    public HiddenPower(){
        this.getType();
        this.PP = 15;
        isSpecial = true;
        this.savedPP = this.PP;
        this.power = 60;
        this.name = "Hidden Power";
        this.CanMiss = true;
        this.acc = 100;
        this.TMNum = 10;
        this.dealsDamage = true;
    }
}
