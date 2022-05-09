package Pokedex.T;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.P.Pickup;
import PokemonCreation.AllAbilities.S.SkillLink;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Trumbeak extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(50, 85, 55, 40,
                50, 75 ,732, 120, 32.6,
                "Normal", "Medium Fast", level, 50);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(),
                addHiddenPower(), addSunnyDay(), addProtect(), addRoost(),
                addFrustration(), addSmackDown(), addReturn(), addBrickBreak(),
                addDoubleTeam(), addAerialAce(), addFlameCharge(), addRest(),
                addAttract(), addThief(), addRound(), addEchoedVoice(),
                addSteelWing(), addSwordsDance(), addFly(), addSwagger(),
                addSleepTalk(), addUTurn(), addSubstitute(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addRockBlast()),
                new CreateOrderedMap<>(0, addPeck()), new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addEchoedVoice()), new CreateOrderedMap<>(0, addRockSmash()),
                new CreateOrderedMap<>(3, addGrowl()), new CreateOrderedMap<>(7, addEchoedVoice()),
                new CreateOrderedMap<>(9, addRockSmash()), new CreateOrderedMap<>(13, addSupersonic()),
                new CreateOrderedMap<>(16, addPluck()), new CreateOrderedMap<>(21, addRoost()),
                new CreateOrderedMap<>(24, addFuryAttack()), new CreateOrderedMap<>(29, addScreech()),
                new CreateOrderedMap<>(32, addDrillPeck()), new CreateOrderedMap<>(37, addBulletSeed()),
                new CreateOrderedMap<>(40, addFeatherDance()), new CreateOrderedMap<>(45, addHyperVoice()));
        this.EvolTiming = 28;
        this.setPokeCry("732Cry.wav");
    }
    public Trumbeak(int level, List<Moves> oldMoves, String Nature,
                 String name, List<Integer> oldIVs, double HPmissing,
                 List<Integer> OldEVs, int Gender, Abilities ability,
                 Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Pikipek")){
            this.name = "Trumbeak";
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
        setFullDirNameEvolution(isShiny, "Trumbeak.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Trumbeak(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new KeenEyes(),
                new Pickup(), new SkillLink());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Trumbeak.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(95, GetItem.getNoItem()),
                new CreateOrderedMap<>(5, GetItem.getSitrusBerry()));
        getWildItem();
    }
}
