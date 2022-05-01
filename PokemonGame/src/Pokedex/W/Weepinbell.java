package Pokedex.W;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.Chlorophyll;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Weepinbell extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 2, 0, 0);
        setBaseStats(50, 90, 65, 85, 45,
                55, 70, 120, 14.1, "Grass",
                "Medium Slow", level, 137);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addBulletSeed(), addSunnyDay(), addProtect(),
                addGigaDrain(), addSolarBeam(), addDoubleTeam(), addReflect(),
                addSludgeBomb(), addFacade(), addRest(), addAttract(), addThief(),
                addEnergyBall(), addEndure(), addFlash(), addSwordsDance(),
                addSleepTalk(), addPoisonJab(), addGrassKnot(), addSwagger(),
                addSubstitute(), addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addVineWhip()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(0, addWrap()),
                new CreateOrderedMap<>(7, addGrowth()), new CreateOrderedMap<>(11, addWrap()),
                new CreateOrderedMap<>(13, addSleepPowder()), new CreateOrderedMap<>(15, addPoisonPowder()),
                new CreateOrderedMap<>(17, addStunSpore()), new CreateOrderedMap<>(24, addAcid()),
                new CreateOrderedMap<>(29, addKnockOff()), new CreateOrderedMap<>(32, addSweetScent()),
                new CreateOrderedMap<>(39, addGastroAcid()), new CreateOrderedMap<>(44, addRazorLeaf()),
                new CreateOrderedMap<>(47, addPoisonJab()), new CreateOrderedMap<>(54, addSlam()));
        this.setPokeCry("070Cry.wav");
        this.itemEvolReqs.add("Leaf Stone");
    }

    public Weepinbell(int level, GlobalVariables globalVariables){
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
        setFullDirName("Weepinbell.png", globalVariables);
    }

    public Weepinbell(int level, List<Moves> oldMoves, String Nature,
                    String name, List<Integer> oldIVs, double HPmissing,
                    List<Integer> OldEVs, int Gender, Abilities ability,
                    Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Bellsprout")){
            this.name = "Weepingbell";
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
        setFullDirNameEvolution(isShiny, "Weepingbell.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
