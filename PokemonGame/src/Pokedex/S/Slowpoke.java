package Pokedex.S;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.O.Oblivious;
import PokemonCreation.AllAbilities.O.OwnTempo;
import PokemonCreation.AllAbilities.R.Regenerator;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Slowpoke extends Pokemon {
    public Slowpoke(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Oblivious(),
                new OwnTempo(), new Regenerator());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addTakeDown(), addProtect(),
                addWaterPulse(), addPsybeam(), addChillingWater(),
                addFacade(), addBulldoze(), addSwift(), addIcyWind(),
                addMudShot(), addStoredPower(), addAvalanche(), addEndure(),
                addSunnyDay(), addRainDance(), addSnowscape(), addPsyshock(),
                addDig(), addZenHeadbutt(), addFoulPlay(), addBodySlam(),
                addSleepTalk(), addLightScreen(), addWaterfall(),
                addGrassKnot(), addThunderWave(), addRest(), addImprison(),
                addSkillSwap(), addSubstitute(), addTrick(), addLiquidation(),
                addShadowBall(), addPsychic(), addSurf(), addFlamethrower(),
                addAmnesia(), addCalmMind(), addHelpingHand(), addIceBeam(),
                addPsychicTerrain(), addFireBlast(), addHydroPump(), addBlizzard(),
                addEarthquake(), addTrickRoom());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addCurse()), new CreateOrderedMap<>(3, addGrowl()),
                new CreateOrderedMap<>(6, addWaterGun()), new CreateOrderedMap<>(9, addYawn()),
                new CreateOrderedMap<>(12, addConfusion()), new CreateOrderedMap<>(15, addDisable()),
                new CreateOrderedMap<>(18, addWaterPulse()), new CreateOrderedMap<>(21, addHeadbutt()),
                new CreateOrderedMap<>(24, addZenHeadbutt()), new CreateOrderedMap<>(27, addAmnesia()),
                new CreateOrderedMap<>(30, addSurf()), new CreateOrderedMap<>(33, addSlackOff()),
                new CreateOrderedMap<>(36, addPsychic()), new CreateOrderedMap<>(39, addPsychUp()),
                new CreateOrderedMap<>(42, addRainDance()), new CreateOrderedMap<>(45, addHealPulse()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(65, 65, 90, 40,
                40, 15, 79, 190,
                79.4, "Water", "Medium Fast",
                level, 99);
        this.type2 = "Psychic";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Slowpoke.png", globalVariables);
        this.itemEvolReqs.add("Galarica Cuff");
        this.itemEvolReqs.add("Galarica Cuff");
        this.setPokeCry("79Cry.wav");
    }
}
