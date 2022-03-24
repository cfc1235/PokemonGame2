package Weather;

import java.util.Collections;

public class Sandstorm extends Weather{

    public Sandstorm(){
        this.name = "Sandstorm";
        Collections.addAll(this.protectedType, "Rock," +
                "Ground", "Steel");
        this.dealsDamage = true;
    }
}
