package Pokedex.C;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Flying.AirSlash;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.Blaze;
import PokemonCreation.AllAbilities.SolarPower;

import java.util.Collections;
import java.util.List;

public class Charizard extends Pokemon {

    private void Initialize(int level){
        OnEvol = new AirSlash();
        this.setGivesEVs(0, 0 ,3, 0, 0, 0);
        this.setBaseStats(78, 84, 78, 109, 85, 100, 6, 45, 199.5,
                "Fire", "Medium Slow", level, 267);
        this.type2 = "Flying";
        Collections.addAll(TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(), addThunderPunch(), addFly(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addFireSpin(), addDig(), addRest(), addRockSlide(), addSnore(), addProtect(),
                addScaryFace(), addSteelWing(), addAttract(), addSunnyDay(), addBeatUp(), addWillOWisp(), addFacade(), addSwift(),
                addHelpingHand(), addBrickBreak(), addRockTomb(), addFling(), addShadowClaw(), addFireFang(), addRound(),
                addAcrobatics(), addBulldoze(), addMysticFire(), addFalseSwipe(), addAirSlash(), addBrutalSwing(), addBreakingSwing(),
                addSwordsDance(), addBodySlam(), addFlamethrower(), addEarthquake(), addFireBlast(), addSubstitute(), addOutrage(),
                addEndure(), addSleepTalk(), addIronTail(), addCrunch(), addHeatWave(), addBlazeKick(), addOverheat(), addDragonClaw(),
                addDragonDance(), addFlareBlitz(), addDragonPulse(), addFocusBlast(), addWorkUp(), addHeatCrash(), addHurricane());
        Collections.addAll(learnedMoves, new CreateOrderedMap<>(0, addAirSlash()),
                new CreateOrderedMap<>(0, addDragonClaw()), new CreateOrderedMap<>(0, addScratch()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addEmber()),
                new CreateOrderedMap<>(0, addSmokescreen()), new CreateOrderedMap<>(12, addDragonBreath()),
                new CreateOrderedMap<>(19, addFireFang()), new CreateOrderedMap<>(24, addSlash()),
                new CreateOrderedMap<>(30, addFlamethrower()), new CreateOrderedMap<>(39, addScaryFace()),
                new CreateOrderedMap<>(46, addFireSpin()), new CreateOrderedMap<>(54, addInferno()),
                new CreateOrderedMap<>(62, addFlareBlitz()));
        this.pokedexType = this.getClass().getSimpleName();
        this.setPokeCry("006Cry_1.wav");
    }

    public Charizard(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        changeBaseStats();
        if (name.equals("Charmeleon")){
            this.name = "Charizard";
        }
        if (!(name.equals("Charmeleon"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.ability = ability;
        this.EVs = OldEVs;
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Charizard.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Charizard(int level, GlobalVariables globalVariables){
        Initialize(level);
        setFirstEVs();
        addFirstMoves();
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Charizard";
        this.possibleAbilities.add(new Blaze());
        this.possibleAbilities.add(new SolarPower());
        getAbilities();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        setFullDirName("Charizard.png", globalVariables);
    }
}
