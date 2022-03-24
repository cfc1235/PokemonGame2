package Weather;

public class HeavyRain extends Weather{
    public HeavyRain(){
        name = "Heavy Rain";
        increaseType = "Water";
        decreaseType = "Fire";
        increaseBy = 1.5;
        decreaseBy = .5;
    }
}
