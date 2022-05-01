package Pokedex.S;

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

public class Stoutland extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(90, 110, 85, 45,
                90, 80 ,508, 45, 134.5,
                "Normal", "Medium Slow", level, 225);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(),
                addThunderWave(), addDig(), addRest(), addSnore(), addProtect(),
                addCharm(), addAttract(), addRainDance(), addSunnyDay(),
                addFacade(), addHelpingHand(), addRockTomb(), addPayback(),
                addThunderFang(), addIceFang(), addFireFang(), addRound(),
                addRetaliate(), addRound(), addRetaliate(), addSnarl(),
                addStompingTantrum(), addSurf(), addThunderbolt(),  addThunder(),
                addSubstitute(), addReversal(), addEndure(), addSleepTalk(),
                addCrunch(), addShadowBall(), addUproar(), addSuperpower(),
                addHyperVoice(), addIronHead(), addWorkUp(), addWildCharge(),
                addPlayRough(), addPsychicFangs());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addWorkUp()),
                new CreateOrderedMap<>(0, addBite()), new CreateOrderedMap<>(0, addIceFang()),
                new CreateOrderedMap<>(0, addFireFang()), new CreateOrderedMap<>(0, addThunderFang()),
                new CreateOrderedMap<>(12, addRetaliate()), new CreateOrderedMap<>(19, addBabyDollEyes()),
                new CreateOrderedMap<>(24, addPlayRough()), new CreateOrderedMap<>(30, addCrunch()),
                new CreateOrderedMap<>(38, addTakeDown()), new CreateOrderedMap<>(46, addHelpingHand()),
                new CreateOrderedMap<>(54, addReversal()), new CreateOrderedMap<>(62, addRoar()),
                new CreateOrderedMap<>(70, addLastResort()), new CreateOrderedMap<>(78, addGigaImpact()));
        this.setPokeCry("508Cry.wav");
    }
    public Stoutland(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Herdier")){
            this.name = "Stoutland";
        }
        if (!(name.equals("Herdier"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Stoutland.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Stoutland(int level, GlobalVariables globalVariables){
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
        setFullDirName("Stoutland.png", globalVariables);
    }
}
