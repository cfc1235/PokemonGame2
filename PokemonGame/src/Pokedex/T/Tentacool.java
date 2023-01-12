package Pokedex.T;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.C.ClearBody;
import PokemonCreation.AllAbilities.L.LiquidOoze;
import PokemonCreation.AllAbilities.R.RainDish;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Tentacool extends Pokemon {
    public Tentacool(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new ClearBody(), new RainDish(),
                new LiquidOoze());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(4, addAcid()),
                new CreateOrderedMap<>(8, addWrap()), new CreateOrderedMap<>(12, addSupersonic()),
                new CreateOrderedMap<>(16, addWaterPulse()), new CreateOrderedMap<>(20, addScreech()),
                new CreateOrderedMap<>(24, addBubbleBeam()), new CreateOrderedMap<>(28, addHex()),
                new CreateOrderedMap<>(32, addAcidArmor()), new CreateOrderedMap<>(36, addPoisonJab()),
                new CreateOrderedMap<>(40, addSurf()), new CreateOrderedMap<>(44, addSludgeWave()),
                new CreateOrderedMap<>(48, addHydroPump()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addScreech(), addSafegaurd(),
                addRest(), addThief(), addSnore(), addProtect(),
                addIcyWind(), addGigaDrain(), addAttract(), addSwift(),
                addIcyWind(), addAirCutter(), addEndure(), addRainDance(),
                addHail(), addWhirlpool(), addFacade(), addDive(),
                addBrine(), addPayback(), addCrossPoison(), addVenoshock(),
                addRound(), addHex(), addBrutalSwing(), addSwordsDance(),
                addHydroPump(), addSurf(), addIceBeam(), addBlizzard(),
                addWaterfall(), addSubstitute(), addSludgeBomb(), addEndure(),
                addSleepTalk(), addMuddyWater(), addToxicSpikes(), addPoisonJab(),
                addSludgeWave(), addScald(), addDazzlingGleam(), addWaterPulse(),
                addDoubleTeam(), addSwordsDance(), addCut());
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 1, 0, 0, 0);
        setBaseStats(35, 40, 40, 50, 100,
                70, 72, 190, 100.3, "Water",
                "Slow", level, 105);
        this.type2 = "Poison";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Tentacool.png", globalVariables);
        this.EvolTiming = 30;
        this.setPokeCry("72Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getPoisonBarb()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
