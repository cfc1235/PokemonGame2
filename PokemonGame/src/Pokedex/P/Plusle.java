package Pokedex.P;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Plusle extends Pokemon {
    public Plusle(int level, GlobalVariables globalVariables) {
        Collections.addAll(this.possibleAbilities, new Plus(), new LightningRod());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addLightScreen(), addProtect(), addRainDance(), addIronTail(),
                addThunderbolt(), addThunder(), addDoubleTeam(), addShockWave(), addFacade(), addVoltSwitch(),
                addRest(), addAttract(), addSkillSwap(), addFling(), addChargeBeam(), addEndure(),
                addNastyPlot(), addFlash(), addThunderWave(), addSleepTalk(), addGrassKnot(), addSwagger(),
                addSubstitute());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addNuzzle()),
                new CreateOrderedMap<>(0, addPlayNice()), new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addThunderWave()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(4, addHelpingHand()), new CreateOrderedMap<>(7, addSpark()),
                new CreateOrderedMap<>(10, addEncore()), new CreateOrderedMap<>(13, addSkillSwap()),
                new CreateOrderedMap<>(16, addSwift()), new CreateOrderedMap<>(19, addElectroBall()),
                new CreateOrderedMap<>(22, addCopycat()), new CreateOrderedMap<>(25, addCharm()),
                new CreateOrderedMap<>(28, addCharge()), new CreateOrderedMap<>(31, addDischarge()),
                new CreateOrderedMap<>(34, addBatonPass()), new CreateOrderedMap<>(37, addAgility()),
                new CreateOrderedMap<>(40, addLastResort()),  new CreateOrderedMap<>(43, addThunder()),
                new CreateOrderedMap<>(46, addNastyPlot()), new CreateOrderedMap<>(49, addEntrainment()));
        addFirstMoves();
        pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(40, 50, 60, 85,
                75, 95, 311, 200,
                9.3, "Electric", "Medium Fast",
                level, 142);
        setFirstEVs();
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Plusle.png", globalVariables);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setPokeCry("311Cry.wav");
    }
}
