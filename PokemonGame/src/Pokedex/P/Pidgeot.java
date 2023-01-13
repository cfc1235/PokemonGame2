package Pokedex.P;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import Items.Items;
import PokemonCreation.Pokemon;
import PokemonCreation.AllAbilities.B.BigPecks;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.T.TangledFeet;

import java.util.Collections;
import java.util.List;

public class Pidgeot extends Pokemon {

    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        this.type2 = "Flying";
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(), addSunnyDay(), addHyperBeam(), addProtect(),
                addRainDance(), addRoost(), addFrustration(), addReturn(), addDoubleTeam(), addAerialAce(), addFacade(), addRest(),
                addAttract(), addThief(), addRound(), addSteelWing(), addGigaImpact(), addSwagger(), addSleepTalk(), addUTurn(),
                addSubstitute(), addSecretPower(), addConfide(), addFly());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addHurricane()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addSandAttack()),
                new CreateOrderedMap<>(0, addGust()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(5, addSandAttack()), new CreateOrderedMap<>(9, addGust()),
                new CreateOrderedMap<>(13, addQuickAttack()), new CreateOrderedMap<>(17, addWhirlwind()),
                new CreateOrderedMap<>(22, addTwister()), new CreateOrderedMap<>(27, addFeatherDance()),
                new CreateOrderedMap<>(32, addAgility()), new CreateOrderedMap<>(38, addWingAttack()),
                new CreateOrderedMap<>(44, addRoost()), new CreateOrderedMap<>(50, addTailwind()),
                new CreateOrderedMap<>(56, addMirrorMoves()), new CreateOrderedMap<>(62, addAirSlash()),
                new CreateOrderedMap<>(68, addHurricane()));
        setGivesEVs(0, 0, 0, 0, 3, 0);
        setBaseStats(75, 80, 83, 70,
                70, 101, 18, 45,
                111.3, "Normal", "Medium Slow",
                level, 172);
        this.setPokeCry("017Cry.wav");
    }

    public Pidgeot(int level, GlobalVariables globalVariables){
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
        setFullDirName("Pidgeot.png", globalVariables);
    }

    public Pidgeot(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
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
        setFullDirNameEvolution(isShiny, "Pidgeot.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
