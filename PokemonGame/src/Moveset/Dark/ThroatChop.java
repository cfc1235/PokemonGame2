package Moveset.Dark;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;

import java.util.Collections;

public class ThroatChop extends Moves {
    public ThroatChop(){
        this.name = "Throat Chop";
        this.type = "Dark";
        this.power = 80;
        this.acc = 100;
        this.PP = 15;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 195;
        this.makesContact = true;
        Collections.addAll(this.prohibitsMoves, new CreateOrderedMap<>("Boomburst", 3),
                new CreateOrderedMap<>("Bug Buzz", 3), new CreateOrderedMap<>("Chatter", 3),
                new CreateOrderedMap<>("Changing Scales", 3), new CreateOrderedMap<>("Clangorous Soulblaze", 3),
                new CreateOrderedMap<>("Confide", 3), new CreateOrderedMap<>("Disarming Voice", 3),
                new CreateOrderedMap<>("Echoed Voice", 3), new CreateOrderedMap<>("Eerie Spell", 3),
                new CreateOrderedMap<>("Grass Whistle", 3), new CreateOrderedMap<>("Growl", 3),
                new CreateOrderedMap<>("Heal Bell", 3), new CreateOrderedMap<>("Howl", 3),
                new CreateOrderedMap<>("Hyper Voice", 3), new CreateOrderedMap<>("Metal Sound", 3),
                new CreateOrderedMap<>("Noble Roar", 3), new CreateOrderedMap<>("Overdrive", 3),
                new CreateOrderedMap<>("Parting Shot", 3), new CreateOrderedMap<>("Perish Song", 3),
                new CreateOrderedMap<>("Relic Song", 3), new CreateOrderedMap<>("Roar", 3),
                new CreateOrderedMap<>("Round", 3), new CreateOrderedMap<>("Screech", 3),
                new CreateOrderedMap<>("Sing", 3), new CreateOrderedMap<>("Snarl", 3),
                new CreateOrderedMap<>("Snore", 3), new CreateOrderedMap<>("Sparkling Aria", 3),
                new CreateOrderedMap<>("Supersonic", 3), new CreateOrderedMap<>("Uproar", 3));
    }
}
