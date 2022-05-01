package Pokedex.S;

import PokemonCreation.AllAbilities.R.RainDish;
import PokemonCreation.AllAbilities.T.Torrent;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;

import java.util.Collections;

public class Squirtle extends Pokemon {
    public Squirtle(int level, GlobalVariables globalVariables) {
        setBaseStats(65, 48, 44, 50, 64, 43, 7, 45, 18.7, "Water",
                "Medium Slow", level, 63);
        possibleAbilities.add(new Torrent());
        possibleAbilities.add(new RainDish());
        getAbilities();
        savedAbility = ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(3, addWaterGun()),
                new CreateOrderedMap<>(6, addWithdraw()), new CreateOrderedMap<>(9, addRapidSpin()),
                new CreateOrderedMap<>(12, addBite()), new CreateOrderedMap<>(15, addWaterPulse()),
                new CreateOrderedMap<>(18, addProtect()), new CreateOrderedMap<>(21, addRainDance()),
                new CreateOrderedMap<>(24, addAquaTail()), new CreateOrderedMap<>(27, addShellSmash()),
                new CreateOrderedMap<>(30, addIronDefense()), new CreateOrderedMap<>(33, addHydroPump()),
                new CreateOrderedMap<>(36, addSkullBash()));
        addFirstMoves();
        setFirstEVs();
        Collections.addAll(TMmoves, addMegaKick(), addMegaPunch(), addIcePunch(), addDig(), addRest(), addSnore(),
                addProtect(), addIcyWind(), addAttract(), addRainDance(), addHail(), addWhirlpool(), addFacade(),
                addHelpingHand(), addBrickBreak(), addDive(), addWeatherBall(), addRockTomb(), addBrine(), addFling(),
                addRound(), addFalseSwipe(), addBodySlam(), addHydroPump(), addSurf(), addIceBeam(), addBlizzard(),
                addWaterfall(), addSubstitute(), addEndure(), addSleepTalk(), addIronTail(), addMuddyWater(),
                addIronDefense(), addGyroBall(), addAuraSphere(), addDragonPulse(), addZenHeadbutt(), addScald(),
                addWorkUp());
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        EvolTiming = 16;
        setGivesEVs(0, 0, 0, 1, 0, 0);
        HP = savedHP;
        pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setFullDirName("Squirtly.png", globalVariables);
        this.setPokeCry("007Cry.wav");
    }
}
