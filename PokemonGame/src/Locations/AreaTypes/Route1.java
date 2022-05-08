package Locations.AreaTypes;

import Interfaces.CreateOrderedMap;

import java.util.ArrayList;
import java.util.Collections;

public class Route1 extends AreaTypes{
    public Route1() {
        this.isRoute = true;
        this.name = "Route 1";
        this.minLevel = 2;
        this.levelRange = 4;
        Collections.addAll(this.dayChance, new CreateOrderedMap<>(45, 16),
                new CreateOrderedMap<>(30, 19), new CreateOrderedMap<>(20, 161),
                new CreateOrderedMap<>(5, 162), new CreateOrderedMap<>(15, 43),
                new CreateOrderedMap<>(15, 69), new CreateOrderedMap<>(25, 504),
                new CreateOrderedMap<>(25, 506), new CreateOrderedMap<>(2, 531));
        Collections.addAll(this.nightChance, new CreateOrderedMap<>(50, 19),
                new CreateOrderedMap<>(5, 20), new CreateOrderedMap<>(45, 163),
                new CreateOrderedMap<>(15, 43), new CreateOrderedMap<>(15, 69),
                new CreateOrderedMap<>(25, 506), new CreateOrderedMap<>(25, 504),
                new CreateOrderedMap<>(2, 559));
        Collections.addAll(this.heabuttChance, new CreateOrderedMap<>(45, 165),
                new CreateOrderedMap<>(45, 167), new CreateOrderedMap<>(33, 204),
                new CreateOrderedMap<>(33, 265));
        Collections.addAll(this.swarmChance, new CreateOrderedMap<>(33, 261));
        Collections.addAll(this.soundChance, new CreateOrderedMap<>(20, 311),
                new CreateOrderedMap<>(20, 312), new CreateOrderedMap<>(40, 403));
        Collections.addAll(this.champFlightChance, new CreateOrderedMap<>(55, 16),
                new CreateOrderedMap<>(35, 17), new CreateOrderedMap<>(5, 18),
                new CreateOrderedMap<>(6, 1), new CreateOrderedMap<>(144, 1),
                new CreateOrderedMap<>(145, 1), new CreateOrderedMap<>(146, 1),
                new CreateOrderedMap<>(149, 1));
        Collections.addAll(this.surfingChance, new CreateOrderedMap<>(100, 550));
        Collections.addAll(this.fishingChance, new CreateOrderedMap<>(95, 550),
                new CreateOrderedMap<>(5, 349));
        Collections.addAll(this.fishingChampChance, new CreateOrderedMap<>(1, 350));
        createPokeChances();
    }
}
