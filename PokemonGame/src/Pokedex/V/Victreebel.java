package Pokedex.V;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import PokemonCreation.AllAbilities.G.Gluttony;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Victreebel extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(65, 105, 80, 100, 70,
                70, 71, 45, 34.2, "Grass",
                "Medium Slow", level, 221);
        this.type2 = "Poison";
        this.OnEvol = addLeafTornado();
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addBulletSeed(), addSunnyDay(), addHyperBeam(),
                addProtect(), addGigaDrain(), addSolarBeam(), addDoubleTeam(), addReflect(),
                addSludgeBomb(), addFacade(), addRest(), addAttract(), addThief(),
                addEnergyBall(), addEndure(), addGigaImpact(), addFlash(), addSwordsDance(),
                addSleepTalk(), addPoisonJab(), addGrassKnot(), addSwagger(), addSubstitute(),
                addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addVineWhip()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(0, addWrap()),
                new CreateOrderedMap<>(0, addLeafTornado()), new CreateOrderedMap<>(0, addStockpile()),
                new CreateOrderedMap<>(0, addSpitUp()), new CreateOrderedMap<>(0, addSwallow()),
                new CreateOrderedMap<>(0, addSleepPowder()), new CreateOrderedMap<>(0, addPoisonPowder()),
                new CreateOrderedMap<>(0, addStunSpore()), new CreateOrderedMap<>(0, addAcid()),
                new CreateOrderedMap<>(0, addKnockOff()), new CreateOrderedMap<>(0, addSweetScent()),
                new CreateOrderedMap<>(0, addGastroAcid()), new CreateOrderedMap<>(0, addRazorLeaf()),
                new CreateOrderedMap<>(0, addPoisonJab()), new CreateOrderedMap<>(0, addSlam()),
                new CreateOrderedMap<>(32, addLeafStorm()), new CreateOrderedMap<>(44, addLeafBlade()));
        this.setPokeCry("071Cry.wav");
        this.itemEvolReqs.add("Leaf Stone");
    }

    public Victreebel(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Chlorophyll(),
                new Gluttony());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Victreebell.png", globalVariables);
    }

    public Victreebel(int level, List<Moves> oldMoves, String Nature,
                      String name, List<Integer> oldIVs, double HPmissing,
                      List<Integer> OldEVs, int Gender, Abilities ability,
                      Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Weepingbell")){
            this.name = "Victreebel";
        }
        if (!(name.equals("Weepingbell"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Victreebell.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
