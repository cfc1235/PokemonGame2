package Pokedex.B;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.CheriBerry;
import Items.Berries.OranBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.AllAbilities.K.Klutz;
import PokemonCreation.AllAbilities.L.Limber;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Buneary extends Pokemon {
    public Buneary(int level, GlobalVariables globalVariables){
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(44, 66, 55, 44, 56,
                85, 427, 190, 12.1,
                "Normal", "Medium Fast", level, 84);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = "Buneary";
        Collections.addAll(this.possibleAbilities, new RunAway(), new Klutz(),
                new Limber());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(0, addSplash()), new CreateOrderedMap<>(4, addDefenseCurl()),
                new CreateOrderedMap<>(8, addBabyDollEyes()), new CreateOrderedMap<>(16, addQuickAttack()),
                new CreateOrderedMap<>(20, addDoubleKick()), new CreateOrderedMap<>(24, addCharm()),
                new CreateOrderedMap<>(28, addBatonPass()), new CreateOrderedMap<>(32, addHeadbutt()),
                new CreateOrderedMap<>(36, addAgility()), new CreateOrderedMap<>(40, addEntrainment()),
                new CreateOrderedMap<>(44, addFlatter()), new CreateOrderedMap<>(48, addBounce()),
                new CreateOrderedMap<>(52, addHealingWish()));
        addFirstMoves();
        setFirstEVs();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addFirePunch(), addIcePunch(), addThunderPunch(),
                addSolarBeam(), addThunderWave(), addDig(), addRest(),
                addSnore(), addProtect(), addCharm(), addAttract(),
                addRainDance(), addSunnyDay(), addFacade(), addSwift(),
                addHelpingHand(), addFakeTears(),addBounce(), addPayback(),
                addAssurance(), addFling(), addDrainPunch(), addLowSweep(),
                addRound(), addRetaliate(), addIceBeam(), addLowKick(),
                addThunderbolt(), addAgility(), addSubstitute(),addEndure(),
                addSleepTalk(), addBatonPass(), addEncore(), addIronTail(),
                addShadowBall(), addUproar(), addHyperVoice(), addCosmicPower(),
                addGrassKnot(), addWorkUp(), addPlayRough(), addFocusPunch(),
                addWaterPulse(), addWorkUp(), addDoubleTeam(), addShockWave(),
                addChargeBeam(), addSwagger(), addCut(), addRockSmash());
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.EvolTiming = 27;
        this.HP = this.savedHP;
        setFullDirName("Buneary.png", globalVariables);
        this.setPokeCry("427Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(35, new OranBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()));
        getWildItem();
    }
}
