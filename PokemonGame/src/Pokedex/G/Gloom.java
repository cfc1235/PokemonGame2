package Pokedex.G;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.HeldItem.AbsorbBulb;
import Items.NoItem;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import PokemonCreation.AllAbilities.S.Stench;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Gloom extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 2, 0, 0);
        setBaseStats(70, 65, 60, 85, 75,
                40, 44, 120, 19.0,
                "Grass", "Medium Slow", level, 138);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addSolarBeam(), addRest(), addSnore(), addProtect(),
                addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(),
                addBulletSeed(), addFling(), addDrainPunch(), addVenoshock(), addRound(),
                addGrassyTerrain(), addSwordsDance(), addSubstitute(), addEndure(), addSleepTalk(),
                addSludgeBomb(), addSeedBomb(), addEnergyBall(), addGrassKnot(), addDazzlingGleam(),
                addToxic(), addBulletSeed(), addSunnyDay(), addSolarBeam(), addDoubleTeam(),
                addEnergyBall(), addFlash(), addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addAbsorb()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(0, addAcid()),
                new CreateOrderedMap<>(0, addSweetScent()), new CreateOrderedMap<>(12, addMegaDrain()),
                new CreateOrderedMap<>(14, addPoisonPowder()), new CreateOrderedMap<>(16, addStunSpore()),
                new CreateOrderedMap<>(18, addSleepPowder()), new CreateOrderedMap<>(20, addGigaDrain()),
                new CreateOrderedMap<>(26, addToxic()), new CreateOrderedMap<>(32, addMoonblast()),
                new CreateOrderedMap<>(38, addGrassyTerrain()), new CreateOrderedMap<>(44, addMoonlight()),
                new CreateOrderedMap<>(50, addPetalDance()));
        this.setPokeCry("044Cry.wav");
        Collections.addAll(this.itemEvolReqs, "Leaf Stone", "Sun Stone");
    }

    public Gloom(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                  double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Oddish")){
            this.name = "Gloom";
        }
        else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Gloom.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Gloom(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Chlorophyll(), new Stench());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Gloom.png", globalVariables);
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(5, new AbsorbBulb()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
