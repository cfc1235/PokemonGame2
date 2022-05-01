package Pokedex.A;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Interfaces.GetItem;
import PokemonCreation.AllAbilities.H.Healer;
import PokemonCreation.AllAbilities.K.Klutz;
import PokemonCreation.AllAbilities.R.Regenerator;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Audino extends Pokemon {
    public Audino(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Healer(),
                new Klutz(), new Regenerator());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addThunderWave(), addDig(),
                addLightScreen(), addReflect(), addSafegaurd(), addRest(),
                addSnore(), addProtect(), addIcyWind(), addAttract(),
                addRainDance(), addSunnyDay(), addFacade(), addHelpingHand(),
                addFling(), addDrainPunch(), addTrickRoom(), addRound(),
                addRetaliate(), addDrainingKiss(), addMistyTerrain(),
                addStompingTantrum(), addBodySlam(), addSurf(), addIceBeam(),
                addBlizzard(), addLowKick(), addThunderbolt(), addThunder(),
                addPsychic(), addFireBlast(), addAmnesia(), addSubstitute(),
                addPsyshock(), addEndure(), addSleepTalk(), addEncore(),
                addIronTail(), addShadowBall(), addUproar(), addSkillSwap(),
                addHyperVoice(), addCalmMind(), addZenHeadbutt(), addGrassKnot(),
                addAllySwitch(), addWorkUp(), addWildCharge(), addDazzlingGleam(),
                addThroatChop());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(0, addPlayNice()), new CreateOrderedMap<>(4, addDisarmingVoice()),
                new CreateOrderedMap<>(9, addBabyDollEyes()), new CreateOrderedMap<>(12, addHelpingHand()),
                new CreateOrderedMap<>(16, addGrowl()), new CreateOrderedMap<>(20, addZenHeadbutt()),
                new CreateOrderedMap<>(24, addLifeDew()), new CreateOrderedMap<>(28, addMeFirst()),
                new CreateOrderedMap<>(32, addTakeDown()), new CreateOrderedMap<>(36, addSimpleBeam()),
                new CreateOrderedMap<>(40, addHyperVoice()), new CreateOrderedMap<>(44, addHealPulse()),
                new CreateOrderedMap<>(48, addDoubleEdge()), new CreateOrderedMap<>(52, addEntrainment()),
                new CreateOrderedMap<>(56, addMistyTerrain()), new CreateOrderedMap<>(60, addLastResort()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(86, 60, 103, 60, 86,
                50, 531, 255, 68.3,
                "Normal", "Fast", level, 390);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Audino.png", globalVariables);
        this.setPokeCry("531Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getOranBerry()),
                new CreateOrderedMap<>(50, GetItem.getSitrusBerry()), new CreateOrderedMap<>(45, GetItem.getNoItem()));
        getWildItem();
    }
}
