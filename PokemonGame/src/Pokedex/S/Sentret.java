package Pokedex.S;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.F.Frisk;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Pokemon;


import java.util.Collections;

public class Sentret extends Pokemon {

    public Sentret(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new RunAway(), new KeenEyes(), new Frisk());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFocusPunch(), addWaterPulse(), addWorkUp(),
                addSunnyDay(), addIceBeam(), addBlizzard(), addProtect(), addRainDance(),
                addSolarBeam(), addIronTail(), addThunderbolt(), addDig(), addShadowBall(),
                addBrickBreak(), addDoubleTeam(), addShockWave(), addFlamethrower(),
                addFacade(), addRest(), addAttract(), addThief(), addFling(), addChargeBeam(),
                addEndure(), addShadowClaw(), addSleepTalk(), addGrassKnot(), addSwagger(),
                addUTurn(), addSubstitute(), addCut(), addSurf());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addScratch()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(4, addDefenseCurl()),
                new CreateOrderedMap<>(7, addQuickAttack()), new CreateOrderedMap<>(13, addFurySwipes()),
                new CreateOrderedMap<>(16, addHelpingHand()), new CreateOrderedMap<>(19, addFollowMe()),
                new CreateOrderedMap<>(25, addSlam()), new CreateOrderedMap<>(28, addRest()),
                new CreateOrderedMap<>(31, addSuckerPunch()), new CreateOrderedMap<>(36, addAmnesia()),
                new CreateOrderedMap<>(39, addBatonPass()), new CreateOrderedMap<>(42, addReversal()),
                new CreateOrderedMap<>(47, addHyperVoice()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(34, 46, 35, 35, 45, 20, 161, 255, 13.2,
                "Normal", "Medium Fast", level, 43);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Sentret.png", globalVariables);
        this.EvolTiming = 15;
        this.setPokeCry("161Cry.wav");
    }
}
