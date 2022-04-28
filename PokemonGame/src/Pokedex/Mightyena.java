package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Dark.Snarl;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.*;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Mightyena extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(70, 50, 60, 50,
                90, 65, 262, 127,
                81.6, "Dark", "Medium Fast", level,
                147);
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Snarl();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addHowl()), new CreateOrderedMap<>(0, addSandAttack()),
                new CreateOrderedMap<>(0, addSnarl()), new CreateOrderedMap<>(0, addFireFang()),
                new CreateOrderedMap<>(0, addThunderFang()), new CreateOrderedMap<>(0, addIceFang()),
                new CreateOrderedMap<>(0, addCrunch()), new CreateOrderedMap<>(0, addThief()),
                new CreateOrderedMap<>(0, addBite()), new CreateOrderedMap<>(4, addHowl()),
                new CreateOrderedMap<>(7, addSandAttack()), new CreateOrderedMap<>(10, addBite()),
                new CreateOrderedMap<>(13, addMudSlap()), new CreateOrderedMap<>(16, addRoar()),
                new CreateOrderedMap<>(20, addSwagger()), new CreateOrderedMap<>(24, addAssurance()),
                new CreateOrderedMap<>(28, addScaryFace()), new CreateOrderedMap<>(32, addHeadbutt()),
                new CreateOrderedMap<>(36, addTaunt()), new CreateOrderedMap<>(40, addCrunch()),
                new CreateOrderedMap<>(44, addYawn()), new CreateOrderedMap<>(48, addTakeDown()),
                new CreateOrderedMap<>(52, addSuckerPunch()), new CreateOrderedMap<>(56, addPlayRough()));
        Collections.addAll(this.TMmoves, addRoar(), addSunnyDay(), addTaunt(),
                addHyperBeam(), addProtect(), addRainDance(), addIronTail(), addDig(),
                addShadowBall(), addDoubleTeam(), addTorment(), addFacade(), addRest(),
                addAttract(), addThief(), addEndure(), addNastyPlot(), addPayback(),
                addGigaImpact(), addSnarl(), addDarkPulse(), addSleepTalk(), addSwagger(),
                addSubstitute(), addStrength(), addRockSmash());
        this.setPokeCry("262Cry.wav");
    }

    public Mightyena(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs,
                     double HPmissing, List<Integer> OldEVs,
                     int Gender, Abilities ability, Boolean isShiny,
                     Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Poochyena")){
            this.name = "Mightyena";
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
        setFullDirNameEvolution(isShiny, "Mightyena.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Mightyena(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new QuickFeet(), new Moxxie(),
                new Intimidate());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Mightyena.png", globalVariables);
    }
}
