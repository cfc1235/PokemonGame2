package Weather;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    protected String name;
    protected String increaseType = "";
    protected String decreaseType = "";
    protected double increaseBy = 1;
    protected double decreaseBy = 1;
    protected List<String> protectedType = new ArrayList<>();
    protected Boolean dealsDamage = false;

    public List<String>  showProtectedType(){return protectedType;}
    public Boolean showDealsDamage(){return dealsDamage;}
    public String showName(){return name;}
    public String showIncreaseType(){return increaseType;}
    public String showDecreaseType(){return decreaseType;}
    public double showIncreaseBy(){return increaseBy;}
    public double showDecreasedBy(){return decreaseBy;}
}
