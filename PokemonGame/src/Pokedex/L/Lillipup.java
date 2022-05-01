package Pokedex.L;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.P.Pickup;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.AllAbilities.V.VitalSpirit;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Lillipup extends Pokemon {
    public Lillipup(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new RunAway(), new Pickup(), new VitalSpirit());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addGigaImpact(), addThunderWave(),
                addDig(), addRest(), addSnore(), addProtect(), addCharm(),
                addAttract(), addRainDance(), addSunnyDay(), addFacade(),
                addHelpingHand(), addRockTomb(), addPayback(), addThunderFang(),
                addIceFang(), addFireFang(), addRound(), addRetaliate(), addSnarl(),
                addThunderbolt(), addSubstitute(), addReversal(), addEndure(),
                addSleepTalk(), addCrunch(), addShadowBall(), addUproar(),
                addHyperVoice(), addWorkUp(), addWildCharge(), addPlayRough(),
                addPsychicFangs());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(4, addWorkUp()),
                new CreateOrderedMap<>(8, addBite()), new CreateOrderedMap<>(12, addRetaliate()),
                new CreateOrderedMap<>(17, addBabyDollEyes()), new CreateOrderedMap<>(20, addPlayRough()),
                new CreateOrderedMap<>(24, addCrunch()), new CreateOrderedMap<>(28, addTakeDown()),
                new CreateOrderedMap<>(32, addHelpingHand()), new CreateOrderedMap<>(36, addReversal()),
                new CreateOrderedMap<>(40, addRoar()), new CreateOrderedMap<>(44, addLastResort()),
                new CreateOrderedMap<>(48, addGigaImpact()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(45, 60, 45, 25, 45,
                55, 506, 255, 9.0,
                "Normal", "Medium Slow", level, 55);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Lillipup.png", globalVariables);
        this.EvolTiming = 16;
        this.setPokeCry("506Cry.wav");
    }
}
