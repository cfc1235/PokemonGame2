package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.SolarPower;
import PokemonCreation.AllAbilities.Blaze;

import java.util.Collections;
import java.util.List;

public class Charmeleon extends Pokemon {

    public void Initialize(int level){
        Collections.addAll(GivesEVs, 0, 0, 1, 0, 1, 0);
        setBaseStats(58, 64, 58, 80, 65, 80, 5, 45, 41.5,
                "Fire", "Medium Slow", level, 142);
        Collections.addAll(TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(), addThunderPunch(), addFireSpin(),
                addDig(), addRest(), addRockSlide(), addSnore(), addProtect(), addScaryFace(), addAttract(),
                addBeatUp(), addWillOWisp(), addFacade(), addSwift(), addHelpingHand(), addBrickBreak(),
                addRockTomb(), addFling(), addShadowClaw(), addFireFang(), addRound(), addAcrobatics(), addFalseSwipe(),
                addSwordsDance(), addBodySlam(), addFlamethrower(), addFireBlast(), addSubstitute(), addOutrage(),
                addEndure(), addSleepTalk(), addIronTail(), addCrunch(), addHeatWave(), addOverheat(), addDragonClaw(),
                addDragonDance(), addFlareBlitz(), addDragonPulse(), addWorkUp());
        Collections.addAll(learnedMoves, new CreateOrderedMap<>(0, addScratch()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addEmber()),
                new CreateOrderedMap<>(0, addSmokescreen()), new CreateOrderedMap<>(12, addDragonBreath()),
                new CreateOrderedMap<>(19, addFireFang()), new CreateOrderedMap<>(24, addSlash()),
                new CreateOrderedMap<>(30, addFlamethrower()), new CreateOrderedMap<>(37, addScaryFace()),
                new CreateOrderedMap<>(42, addFireSpin()), new CreateOrderedMap<>(48, addInferno()),
                new CreateOrderedMap<>(54, addFlareBlitz()));
        this.pokedexType = this.getClass().getSimpleName();
        EvolTiming = 36;
        this.setPokeCry("005Cry.wav");
    }

    public Charmeleon(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Charmander")){
            this.name = "Charmeleon";
        }
        if (!(name.equals("Charmander"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = this.ability;
        this.setFullDirNameEvolution(isShiny, "Charmeleon.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Charmeleon(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        possibleAbilities.add(new Blaze());
        possibleAbilities.add(new SolarPower());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        this.setFullDirName("Charmeleon.png", globalVariables);
    }
}
