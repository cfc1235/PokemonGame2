package Weather;

public class Sunny extends Weather {
    public Sunny(){
        name = "Sunny";
        increaseType = "Fire";
        decreaseType = "Water";
        increaseBy = 1.5;
        decreaseBy = .5;
    }
}
