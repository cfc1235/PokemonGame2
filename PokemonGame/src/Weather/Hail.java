package Weather;

public class Hail extends Weather{
    public Hail(){
        this.name = "Hail";
        this.protectedType.add("Ice");
        this.dealsDamage = true;
    }
}
