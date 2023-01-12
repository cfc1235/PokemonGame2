package Pokedex.F;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.S.StormDrain;
import PokemonCreation.AllAbilities.S.SwiftSwim;
import PokemonCreation.AllAbilities.W.WaterVeil;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Finneon extends Pokemon {
    public Finneon(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new StormDrain(),
                new SwiftSwim(), new WaterVeil());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(),
                addAgility(), addProtect(), addWaterPulse(), addAcrobatics(),
                addPsybeam(), addConfuseRay(), addThief(), addChillingWater(),
                addFacade(), addSwift(), addIcyWind(), addEndure(), addRainDance(),
                addUTurn(), addSleepTalk(), addWaterfall(), addDazzlingGleam(),
                addRest(), addSubstitute(), addTailwind(), addSurf(), addHelpingHand(),
                addIceBeam(), addHydroPump(), addBlizzard());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(6, addWaterGun()), new CreateOrderedMap<>(13, addRainDance()),
                new CreateOrderedMap<>(17, addGust()), new CreateOrderedMap<>(22, addWaterPulse()),
                new CreateOrderedMap<>(26, addAttract()), new CreateOrderedMap<>(29, addSafegaurd()),
                new CreateOrderedMap<>(33, addAquaRing()), new CreateOrderedMap<>(38, addWhirlpool()),
                new CreateOrderedMap<>(42, addUTurn()), new CreateOrderedMap<>(45, addBounce()),
                new CreateOrderedMap<>(49, addTailwind()), new CreateOrderedMap<>(54, addSoak()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(56, 49, 49, 49, 61,
                66, 456, 190, 15.4,
                "Water", "Erratic", level, 90);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Finneon.png", globalVariables);
        this.setPokeCry("456Cry.wav");
        this.EvolTiming = 31;
    }
}
