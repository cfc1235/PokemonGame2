package Pokedex.H;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.I.Intimidate;
import PokemonCreation.AllAbilities.S.SandRush;
import PokemonCreation.AllAbilities.S.Scrappy;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Herdier extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(65, 80, 65, 35,
                65, 60 ,507, 120, 32.4,
                "Normal", "Medium Slow", level, 130);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addGigaImpact(), addThunderWave(),
                addDig(), addRest(), addSnore(), addProtect(), addCharm(),
                addAttract(), addRainDance(), addSunnyDay(), addFacade(),
                addHelpingHand(), addRockTomb(), addPayback(), addThunderFang(),
                addIceFang(), addFireFang(), addRound(), addRetaliate(),
                addRound(), addRetaliate(), addSnarl(), addSurf(),
                addThunderbolt(), addSubstitute(), addReversal(), addEndure(),
                addSleepTalk(), addCrunch(), addShadowBall(), addUproar(),
                addHyperVoice(), addWorkUp(), addWildCharge(), addPlayRough(),
                addPsychicFangs());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addWorkUp()),
                new CreateOrderedMap<>(0, addBite()), new CreateOrderedMap<>(12, addRetaliate()),
                new CreateOrderedMap<>(19, addBabyDollEyes()), new CreateOrderedMap<>(24, addPlayRough()),
                new CreateOrderedMap<>(30, addCrunch()), new CreateOrderedMap<>(36, addTakeDown()),
                new CreateOrderedMap<>(42, addHelpingHand()), new CreateOrderedMap<>(48, addReversal()),
                new CreateOrderedMap<>(54, addRoar()), new CreateOrderedMap<>(60, addLastResort()),
                new CreateOrderedMap<>(66, addGigaImpact()));
        this.EvolTiming = 32;
        this.setPokeCry("507Cry.wav");
    }
    public Herdier(int level, List<Moves> oldMoves, String Nature,
                 String name, List<Integer> oldIVs, double HPmissing,
                 List<Integer> OldEVs, int Gender, Abilities ability,
                 Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Lillipup")){
            this.name = "Herdier";
        }
        if (!(name.equals("Lillipup"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Herdier.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Herdier(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Intimidate(),
                new Scrappy(), new SandRush());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Herdier.png", globalVariables);
    }
}
