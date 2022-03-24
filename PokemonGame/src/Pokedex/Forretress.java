package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Autotomize;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.Overcoat;
import PokemonCreation.AllAbilities.Sturdy;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Forretress extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(140, 90, 75, 60, 60,
                40, 205, 75, 277.3, "Bug",
                "Medium Slow", level, 142);
        this.type2 = "Steel";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addSunnyDay(), addHyperBeam(),
                addLightScreen(), addProtect(), addGigaDrain(), addSolarBeam(),
                addEarthquake(), addDig(), addDoubleTeam(), addReflect(),
                addSandstorm(), addRockTomb(), addFacade(), addVoltSwitch(),
                addRest(), addAttract(), addEndure(), addBugBuzz(), addExplosion(),
                addPayback(), addGigaImpact(), addRockPolish(), addGyroBall(),
                addRockSlide(), addSleepTalk(), addBulldoze(), addSwagger(),
                addSubstitute(), addFlashCannon(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addAutotomize()),
                new CreateOrderedMap<>(0, addHeavySlam()), new CreateOrderedMap<>(0, addZapCannon()),
                new CreateOrderedMap<>(0, addMagnetRise()), new CreateOrderedMap<>(0, addToxicSpikes()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addProtect()),
                new CreateOrderedMap<>(0, addSelfDestruct()), new CreateOrderedMap<>(0, addBugBite()),
                new CreateOrderedMap<>(6, addSelfDestruct()), new CreateOrderedMap<>(9, addBugBite()),
                new CreateOrderedMap<>(12, addTakeDown()), new CreateOrderedMap<>(17, addRapidSpin()),
                new CreateOrderedMap<>(20, addReflect()), new CreateOrderedMap<>(23, addRollout()),
                new CreateOrderedMap<>(28, addSpikes()), new CreateOrderedMap<>(32, addPayback()),
                new CreateOrderedMap<>(36, addExplosion()), new CreateOrderedMap<>(42, addIronDefense()),
                new CreateOrderedMap<>(46, addGyroBall()), new CreateOrderedMap<>(50, addDoubleEdge()),
                new CreateOrderedMap<>(56, addMagnetRise()), new CreateOrderedMap<>(60, addZapCannon()),
                new CreateOrderedMap<>(64, addHeavySlam()));
        this.OnEvol = new Autotomize();
        this.setPokeCry("205Cry.wav");
    }
    public Forretress(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Pineco")){
            this.name = "Forretress";
        }
        else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Forretress.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Forretress(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new Sturdy());
        this.possibleAbilities.add(new Overcoat());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Forretress.png", globalVariables);
    }
}


