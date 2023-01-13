package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.E.EarlyBird;
import PokemonCreation.AllAbilities.I.IronFist;
import PokemonCreation.AllAbilities.S.Swarm;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Ledian extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 2, 0, 0, 0);
        setBaseStats(50, 35, 55, 55, 110,
                85, 166, 90, 78.5,
                "Bug", "Fast", level, 134);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addFocusPunch(), addSunnyDay(), addHyperBeam(),
                addLightScreen(), addProtect(), addGigaDrain(), addSafegaurd(), addSolarBeam(),
                addDig(), addBrickBreak(), addDoubleTeam(), addReflect(), addAerialAce(),
                addFacade(), addRest(), addAttract(), addThief(), addRoost(), addFocusBlast(),
                addFling(), addEndure(), addDrainPunch(), addBugBuzz(), addGigaImpact(), addFlash(),
                addSwordsDance(), addSleepTalk(), addSwagger(), addUTurn(), addSubstitute(),
                addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addSupersonic()), new CreateOrderedMap<>(0, addSwift()),
                new CreateOrderedMap<>(5, addSupersonic()), new CreateOrderedMap<>(8, addSwift()),
                new CreateOrderedMap<>(12, addLightScreen()), new CreateOrderedMap<>(12, addReflect()),
                new CreateOrderedMap<>(12, addSafegaurd()), new CreateOrderedMap<>(15, addMachPunch()),
                new CreateOrderedMap<>(20, addRoost()), new CreateOrderedMap<>(24, addStruggleBug()),
                new CreateOrderedMap<>(29, addBatonPass()), new CreateOrderedMap<>(33, addAgility()),
                new CreateOrderedMap<>(38, addBugBuzz()), new CreateOrderedMap<>(42, addAirSlash()),
                new CreateOrderedMap<>(47, addDoubleEdge()));
        this.setPokeCry("166Cry.wav");
    }

    public Ledian(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                  double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Ledyba")){
            this.name = "Ledian";
        }
        if (!(name.equals("Ledyba"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Ledian.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Ledian(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Swarm(), new EarlyBird(), new IronFist());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Ledian.png", globalVariables);
    }
}
