package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.Insomnia;
import PokemonCreation.AllAbilities.KeenEyes;
import PokemonCreation.AllAbilities.TintedLenses;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Noctowl extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(50, 50, 100, 86, 96,
                70, 164, 90, 89.9,
                "Normal", "Medium Fast", level, 162);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(), addGigaImpact(),
                addScreech(), addReflect(), addRest(), addThief(), addSnore(),
                addProtect(), addSteelWing(), addAttract(), addRainDance(),
                addSunnyDay(), addFacade(), addSwift(), addImprison(), addRound(),
                addAirSlash(), addPsychic(), addAgility(), addAmnesia(), addSubstitute(),
                addEndure(), addSleepTalk(), addShadowBall(), addFutureSight(),
                addUproar(), addHeatWave(), addHyperVoice(), addCalmMind(),
                addNastyPlot(), addZenHeadbutt(), addStoredPower(), addWorkUp(),
                addHurricane(), addDoubleTeam(), addReflect(), addAerialAce(),
                addRoost(), addRecycle(), addPsychUp(), addDreamEater(), addSwagger(),
                addDefog());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addEchoedVoice()), new CreateOrderedMap<>(0, addSkyAttack()),
                new CreateOrderedMap<>(9, addConfusion()), new CreateOrderedMap<>(12, addReflect()),
                new CreateOrderedMap<>(15, addPsychoShift()), new CreateOrderedMap<>(18, addAirSlash()),
                new CreateOrderedMap<>(23, addExtrasensory()), new CreateOrderedMap<>(28, addTakeDown()),
                new CreateOrderedMap<>(33, addUproar()), new CreateOrderedMap<>(38, addRoost()),
                new CreateOrderedMap<>(43, addMoonblast()), new CreateOrderedMap<>(48, addHypnosis()),
                new CreateOrderedMap<>(53, addDreamEater()));
        this.setPokeCry("164Cry.wav");
    }

    public Noctowl(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                   double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Hoothoot")){
            this.name = "Noctowl";
        }
        if (!(name.equals("Hoothoot"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Noctowl.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Noctowl(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Insomnia(), new KeenEyes(), new TintedLenses());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Noctowl.png", globalVariables);
    }
}
