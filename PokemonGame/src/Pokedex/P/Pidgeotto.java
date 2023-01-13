package Pokedex.P;

import PokemonCreation.AllAbilities.B.BigPecks;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.T.TangledFeet;
import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Pidgeotto extends Pokemon {

    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        this.type2 = "Flying";
        this.EvolTiming = 36;
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(), addSunnyDay(), addProtect(), addRainDance(),
                addRoost(), addFrustration(), addReturn(), addDoubleTeam(), addAerialAce(), addFacade(), addRest(),
                addAttract(), addThief(), addRound(), addSteelWing(), addSwagger(), addSleepTalk(), addUTurn(), addSubstitute(),
                addSecretPower(), addConfide(), addFly());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(0, addGust()),
                new CreateOrderedMap<>(5, addSandAttack()), new CreateOrderedMap<>(9, addGust()),
                new CreateOrderedMap<>(13, addQuickAttack()), new CreateOrderedMap<>(17, addWhirlwind()),
                new CreateOrderedMap<>(22, addTwister()), new CreateOrderedMap<>(27, addFeatherDance()),
                new CreateOrderedMap<>(32, addAgility()), new CreateOrderedMap<>(37, addWingAttack()),
                new CreateOrderedMap<>(42, addRoost()), new CreateOrderedMap<>(47, addTailwind()),
                new CreateOrderedMap<>(52, addMirrorMoves()), new CreateOrderedMap<>(57, addAirSlash()),
                new CreateOrderedMap<>(62, addHurricane()));
        setGivesEVs(0, 0, 0, 0, 2, 0);
        setBaseStats(55, 60, 63, 50,
                50, 71, 17, 120, 66.1,
                "Normal", "Medium Slow", level, 113);
        setPokeCry("018.wav");
    }

    public Pidgeotto(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new TangledFeet(), new BigPecks());
        getAbilities();
        this.savedAbility = this.ability;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pidgeotto.png", globalVariables);
    }

    public Pidgeotto(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Pidgey")){
            this.name = "Pidgeotto";
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
        setFullDirNameEvolution(isShiny, "Pidgeotto.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
