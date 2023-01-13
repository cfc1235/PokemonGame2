package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import Moveset.Dark.SuckerPunch;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.S.SandRush;
import PokemonCreation.AllAbilities.S.Steadfast;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class LycanrocDay extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(75, 115, 75, 55,
                65, 112 ,745, 90, 55.1,
                "Rock", "Medium Slow", level, 170);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(),
                addAgility(), addMudSlap(), addScaryFace(), addProtect(),
                addFireFang(), addThunderFang(), addTrailblaze(), addFacade(),
                addBulldoze(), addSnarl(), addSwift(), addRockTomb(),
                addSunnyDay(), addSandstorm(), addDig(), addBrickBreak(),
                addZenHeadbutt(), addPsychicFangs(), addBulkUp(), addBodySlam(),
                addSleepTalk(), addRockBlast(), addStompingTantrum(), addRest(),
                addRockSlide(), addTaunt(), addSwordsDance(), addIronHead(),
                addSubstitute(), addIronDefense(), addDrillRun(), addCrunch(),
                addStealthRock(), addHyperVoice(), addPlayRough(), addHelpingHand(),
                addEarthPower(), addStoneEdge(), addGigaImpact(), addCloseCombat());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addAccelerock()),
                new CreateOrderedMap<>(0, addQuickGuard()), new CreateOrderedMap<>(0, addDoubleTeam()),
                new CreateOrderedMap<>(0, addQuickAttack()), new CreateOrderedMap<>(0, addSandAttack()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(12, addRockThrow()), new CreateOrderedMap<>(16, addHowl()),
                new CreateOrderedMap<>(20, addBite()), new CreateOrderedMap<>(24, addRockTomb()),
                new CreateOrderedMap<>(30, addRoar()), new CreateOrderedMap<>(36, addRockSlide()),
                new CreateOrderedMap<>(42, addCrunch()), new CreateOrderedMap<>(48, addScaryFace()),
                new CreateOrderedMap<>(54, addStealthRock()), new CreateOrderedMap<>(60, addStoneEdge()));
        this.setPokeCry("745Cry.wav");
        this.OnEvol = new SuckerPunch();
    }
    public LycanrocDay(int level, List<Moves> oldMoves, String Nature,
                  String name, List<Integer> oldIVs, double HPmissing,
                  List<Integer> OldEVs, int Gender, Abilities ability,
                  Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Rockruff")){
            this.name = "Lycanroc";
        }
        if (!(name.equals("Rockruff"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "LycanrocDay.png");
        this.savedItem = items;
    }

    public LycanrocDay(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new SandRush(),
                new KeenEyes(), new Steadfast());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("LycanrocDay.png", globalVariables);
    }
}
