package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.PetalBlizzard;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.Chlorophyll;
import PokemonCreation.AllAbilities.Overgrowth;

import java.util.Collections;
import java.util.List;

public class Venusaur extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 2, 1, 0, 0);
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addMagicalLeaf(), addLightScreen(), addSafegaurd(),
                addRest(), addSnore(), addProtect(), addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(),
                addHelpingHand(), addWeatherBall(), addVenoshock(), addBulletSeed(), addRound(), addBulldoze(),
                addGrassyTerrain(), addFalseSwipe(), addStompingTantrum(), addSwordsDance(), addBodySlam(), addAmnesia(),
                addSubstitute(), addSludgeBomb(), addOutrage(), addEndure(), addSleepTalk(), addEnergyBall(), addEarthPower(),
                addLeafStorm(), addPowerWhip(), addGrassKnot(), addWorkUp());
        setBaseStats(83, 82, 80, 100, 100, 80, 3, 45, 220.5,
                "Grass", "Medium Slow", level, 263);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new PetalBlizzard();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPetalDance()),
                new CreateOrderedMap<>(0, addPetalBlizzard()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addVineWhip()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(9, addLeechSeed()),
                new CreateOrderedMap<>(12, addRazorLeaf()), new CreateOrderedMap<>(15, addPoisonPowder()),
                new CreateOrderedMap<>(15, addSleepPowder()), new CreateOrderedMap<>(20, addSeedBomb()),
                new CreateOrderedMap<>(25, addTakeDown()), new CreateOrderedMap<>(30, addSweetScent()),
                new CreateOrderedMap<>(38, addSynthesis()), new CreateOrderedMap<>(44, addWorrySeed()),
                new CreateOrderedMap<>(51, addDoubleEdge()), new CreateOrderedMap<>(58, addSolarBeam()));
        this.setPokeCry("003Cry.wav");
    }

    public Venusaur(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new Overgrowth());
        this.possibleAbilities.add(new Chlorophyll());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Venusaur.png", globalVariables);
    }

    public Venusaur(int level, List<Moves> oldMoves, String Nature,
                    String name, List<Integer> oldIVs, double HPmissing,
                    List<Integer> OldEVs, int Gender, Abilities ability,
                    Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Ivysaur")){
            this.name = "Venusaur";
        }
        if (!(name.equals("Ivysaur"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Venusaur.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}

