package Pokedex.I;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.C.Competitve;
import PokemonCreation.AllAbilities.C.CuteCharm;
import PokemonCreation.AllAbilities.F.FriendGuard;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Igglybuff extends Pokemon {
    public Igglybuff(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new CuteCharm(),
                new Competitve(), new FriendGuard());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addSolarBeam(), addThunderWave(), addDig(), addScreech(),
                addLightScreen(), addReflect(), addSafegaurd(), addRest(),
                addSnore(), addProtect(), addIcyWind(), addCharm(),
                addAttract(), addRainDance(), addSunnyDay(), addFacade(),
                addHelpingHand(), addFakeTears(), addBounce(), addFling(),
                addRound(), addDrainingKiss(), addMistyTerrain(), addBodySlam(),
                addFlamethrower(), addPsychic(), addFireBlast(), addSubstitute(),
                addEndure(), addSleepTalk(), addShadowBall(), addUproar(),
                addHyperVoice(), addGrassKnot(), addWorkUp(), addWildCharge(),
                addPlayRough(), addWaterPulse(), addDoubleTeam(), addShockWave(),
                addFlash(), addThunderWave(), addPsychUp(), addDreamEater(),
                addSwagger());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSing()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(4, addDefenseCurl()), new CreateOrderedMap<>(8, addSweetKiss()),
                new CreateOrderedMap<>(12, addDisarmingVoice()), new CreateOrderedMap<>(16, addDisable()),
                new CreateOrderedMap<>(20, addCharm()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(15, 30, 90, 40, 20,
                15, 174, 170, 2.2,
                "Fairy", "Erratic", level, 42);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Igglybuff.png", globalVariables);
        this.setPokeCry("174Cry.wav");
        this.EvolTiming = 12;
    }
}
