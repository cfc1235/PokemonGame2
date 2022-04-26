package PlayerMechanics;

import Interfaces.GlobalVariables;

public class Wallet {

    private Boolean isInf;
    private Integer money = 0;

    public Wallet(Boolean isInf){
        this.isInf = isInf;
    }

    public void addWinnings(int cash){
        this.money += cash;
    }
    public Boolean buyItem(int owed){
        if(this.isInf){
            return true;
        }
        else {
            if(this.money < owed){
                return false;
            }
            else {
                this.money -= owed;
                return true;
            }
        }
    }
}
