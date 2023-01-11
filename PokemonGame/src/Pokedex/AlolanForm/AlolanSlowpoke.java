package Pokedex.AlolanForm;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.AllAbilities.O.OwnTempo;
import PokemonCreation.AllAbilities.R.Regenerator;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class AlolanSlowpoke extends Pokemon {
    public AlolanSlowpoke(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Gluttony(),
                new OwnTempo(), new Regenerator());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addPayDay(), addThunderWave(),
                addDig(), addLightScreen(), addSafegaurd(), addRest(),
                addSnore(), addProtect(), addIcyWind(), addAttract(),
                addRainDance(), addSunnyDay(), addHail(), addWhirlpool(),
                addFacade(), addSwift(), addImprison(), addDive(),
                addWeatherBall(), addMudShot(), addBrine(), addTrickRoom(),
                addWonderRoom(), addRound(), addBulldoze(), addPsychicTerrain(),
                addBodySlam(), addFlamethrower(), addHydroPump(), addSurf(),
                addIceBeam(), addBlizzard(), addEarthquake(), addPsychic(),
                addFireBlast(), addAmnesia(), addTriAttack(), addSubstitute(),
                addPsyshock(), addEndure(), addSleepTalk(), addIronTail(),
                addShadowBall(), addFutureSight(), addTrick(), addSkillSwap(),
                addCalmMind(), addZenHeadbutt(), addGrassKnot(), addFoulPlay(),
                addStoredPower(), addScald(), addLiquidation());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addCurse()), new CreateOrderedMap<>(3, addGrowl()),
                new CreateOrderedMap<>(6, addAcid()), new CreateOrderedMap<>(9, addYawn()),
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
                79.4, "Psychic", "Medium Fast",
                level, 99);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Slowpoke.png", globalVariables);
        this.itemEvolReqs.add("Galarica Cuff");
        this.itemEvolReqs.add("Galarica Wreath");
        this.setPokeCry("79Cry.wav");
        this.isAlolan = true;
    }
}
