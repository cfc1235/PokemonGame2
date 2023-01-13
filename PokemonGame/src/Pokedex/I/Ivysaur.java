package Pokedex.I;
import Items.Items;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import PokemonCreation.AllAbilities.O.Overgrowth;
import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.*;

import java.util.Collections;
import java.util.List;

public class Ivysaur extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 1, 1, 0, 0);
        setBaseStats(63, 62, 60, 80,
                80, 60, 2, 45, 28.7,
                "Grass", "Medium Slow", level, 142);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(TMmoves, addMagicalLeaf(), addLightScreen(), addSafegaurd(), addRest(), addSnore(),
                addProtect(), addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(), addHelpingHand(),
                addWeatherBall(), addVenoshock(), addBulletSeed(), addRound(), addGrassyTerrain(), addFalseSwipe(),
                addSwordsDance(), addBodySlam(), addAmnesia(), addSubstitute(), addSludgeBomb(), addEndure(),
                addSleepTalk(), addEnergyBall(), addLeafStorm(), addPowerWhip(), addGrassKnot(), addWorkUp());
        Collections.addAll(learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addVineWhip()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(9, addLeechSeed()),
                new CreateOrderedMap<>(12, addRazorLeaf()), new CreateOrderedMap<>(15, addPoisonPowder()),
                new CreateOrderedMap<>(15, addSleepPowder()), new CreateOrderedMap<>(20, addSeedBomb()),
                new CreateOrderedMap<>(25, addTakeDown()), new CreateOrderedMap<>(30, addSweetScent()),
                new CreateOrderedMap<>(35, addSynthesis()), new CreateOrderedMap<>(40, addWorrySeed()),
                new CreateOrderedMap<>(45, addDoubleEdge()), new CreateOrderedMap<>(50, addSolarBeam()));
        this.EvolTiming = 32;
        this.setPokeCry("002Cry.wav");
    }
    public Ivysaur(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                   double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Bulbasaur")){
            this.name = "Ivysaur";
        }
        if (!(name.equals("Bulbasaur"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Ivysaur.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Ivysaur(int level, GlobalVariables globalVariables) {
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
        changeBaseStats();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        setFullDirName("Ivysaur.png", globalVariables);
    }
}
