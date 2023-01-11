package Weather;

public class HeavyRain extends Weather{
    public HeavyRain(){
        this.name = "Heavy Rain";
        this.increaseType = "Water";
        this.decreaseType = "Fire";
        this.increaseBy = 1.5;
        this.decreaseBy = .5;
    }
}
