package Moveset.Flying;

public class Bounce extends Fly{
    public Bounce(){
        this.name = "Bounce";
        this.PP = 5;
        this.savedPP = this.PP;
        this.acc = 85;
        this.power = 85;
        this.statChangeReqChance = true;
        this.StatChangeReq = 30;
        this.canParalyze = true;
        this.TMNum = 52;
    }
}
