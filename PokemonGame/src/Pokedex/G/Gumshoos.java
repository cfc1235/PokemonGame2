package Pokedex.G;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.PechaBerry;
import Items.NoItem;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.A.Adaptability;
import PokemonCreation.AllAbilities.S.Stakeout;
import PokemonCreation.AllAbilities.S.StrongJaw;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Gumshoos extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(60, 110, 88, 55, 60,
                45, 735, 127, 31.3,
                "Normal", "Medium Slow", level, 138);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addWorkUp(), addRoar(),
                addToxic(), addHiddenPower(), addTaunt(), addProtect(),
                addFrustration(), addEarthquake(), addReturn(),
                addDoubleTeam(), addSandstorm(), addRockTomb(),
                addTorment(), addFacade(), addRest(), addAttract(),
                addThief(), addRound(), addEchoedVoice(), addFling(),
                addPayback(), addBulldoze(), addSwagger(), addSleepTalk(),
                addUTurn(), addSubstitute(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addPursuit()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(3, addLeer()),
                new CreateOrderedMap<>(7, addPursuit()), new CreateOrderedMap<>(10, addSandAttack()),
                new CreateOrderedMap<>(13, addOdorSleuth()), new CreateOrderedMap<>(16, addBide()),
                new CreateOrderedMap<>(19, addBite()), new CreateOrderedMap<>(23, addMudSlap()),
                new CreateOrderedMap<>(27, addSuperFang()), new CreateOrderedMap<>(31, addTakeDown()),
                new CreateOrderedMap<>(35, addScaryFace()), new CreateOrderedMap<>(39, addCrunch()),
                new CreateOrderedMap<>(43, addHyperFang()), new CreateOrderedMap<>(47, addYawn()),
                new CreateOrderedMap<>(51, addThrash()), new CreateOrderedMap<>(55, addRest()));
        this.setPokeCry("735Cry.wav");
    }

    public Gumshoos(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                 double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Yungoos")){
            this.name = "Gumshoos";
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
        setFullDirNameEvolution(isShiny, "Gumshoos.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Gumshoos(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Adaptability(),
                new StrongJaw(), new Stakeout());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Gumshoos.png", globalVariables);
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(5, new PechaBerry()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
