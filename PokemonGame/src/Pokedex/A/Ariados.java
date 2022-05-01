package Pokedex.A;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.SelfChange.SwordsDance;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.I.Insomnia;
import PokemonCreation.AllAbilities.S.Sniper;
import PokemonCreation.AllAbilities.S.Swarm;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Ariados extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 2, 0,0, 0, 0);
        this.OnEvol = new SwordsDance();
        setBaseStats(70, 90, 70, 60, 70,
                40, 168, 90, 73.9, "Bug",
                "Fast", level, 140);
        this.type2 = "Poison";
        Collections.addAll(this.TMmoves, addSunnyDay(), addHyperBeam(), addProtect(),
                addGigaDrain(), addSolarBeam(), addDig(), addPsychic(), addDoubleTeam(),
                addSludgeBomb(), addFacade(), addRest(), addAttract(), addThief(), addEndure(),
                addBugBuzz(), addGigaImpact(), addFlash(), addXScissor(), addSleepTalk(),
                addPoisonJab(), addSwagger(), addSubstitute());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(0, addAbsorb()),
                new CreateOrderedMap<>(0, addSwordsDance()), new CreateOrderedMap<>(0, addFocusEnergy()),
                new CreateOrderedMap<>(0, addVenomDrench()), new CreateOrderedMap<>(0, addFellStinger()),
                new CreateOrderedMap<>(0, addBugBite()), new CreateOrderedMap<>(5, addAbsorb()),
                new CreateOrderedMap<>(8, addInfestation()), new CreateOrderedMap<>(12, addScaryFace()),
                new CreateOrderedMap<>(15, addNightShade()), new CreateOrderedMap<>(19, addShadowSneak()),
                new CreateOrderedMap<>(23, addFurySwipes()), new CreateOrderedMap<>(28, addSuckerPunch()),
                new CreateOrderedMap<>(32, addLeechLife()), new CreateOrderedMap<>(37, addAgility()),
                new CreateOrderedMap<>(41, addPinMissle()), new CreateOrderedMap<>(46, addPsychic()),
                new CreateOrderedMap<>(50, addPoisonJab()), new CreateOrderedMap<>(55, addCrossPoison()),
                new CreateOrderedMap<>(58, addStickyWeb()), new CreateOrderedMap<>(63, addToxicThread()));
        this.pokedexType = this.getClass().getSimpleName();
        this.setPokeBallType("168Cry.wav");
    }

    public Ariados(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Spinarak")){
            this.name = "Ariados";
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
        setFullDirNameEvolution(isShiny, "Ariados.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Ariados(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Ariados";
        Collections.addAll(this.possibleAbilities,
                new Sniper(), new Insomnia(), new Swarm());
        getAbilities();
        changeBaseStats();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        Collections.addAll(this.EVs, 0, 0, 0, 0, 0, 0);
        setFullDirName("Ariados.png", globalVariables);
    }
}
