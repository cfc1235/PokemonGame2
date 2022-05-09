package Pokedex.P;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.P.Pickup;
import PokemonCreation.AllAbilities.S.SkillLink;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Pikipek extends Pokemon {
    public Pikipek(int level, GlobalVariables globalVariables){
        Collections.addAll(this.possibleAbilities, new KeenEyes(),
                new Pickup(), new SkillLink());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(),
                addHiddenPower(), addSunnyDay(), addProtect(), addRoost(),
                addFrustration(), addReturn(), addBrickBreak(), addDoubleTeam(),
                addAerialAce(), addFlameCharge(), addRest(), addAttract(),
                addThief(), addRound(), addEchoedVoice(), addSteelWing(),
                addSwordsDance(), addFly(), addSwagger(), addSleepTalk(),
                addUTurn(), addSubstitute(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(3, addGrowl()), new CreateOrderedMap<>(7, addEchoedVoice()),
                new CreateOrderedMap<>(9, addRockSmash()), new CreateOrderedMap<>(13, addSupersonic()),
                new CreateOrderedMap<>(15, addPluck()), new CreateOrderedMap<>(19, addRoost()),
                new CreateOrderedMap<>(21, addFuryAttack()), new CreateOrderedMap<>(25, addScreech()),
                new CreateOrderedMap<>(27, addDrillPeck()), new CreateOrderedMap<>(31, addBulletSeed()),
                new CreateOrderedMap<>(33, addFeatherDance()), new CreateOrderedMap<>(37, addHyperVoice()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        this.EvolTiming = 14;
        this.type2 = "Flying";
        setBaseStats(30, 75, 35, 30,
                30, 65, 731, 255, 2.6,
                "Normal", "Medium Fast", level, 53);
        setFirstEVs();
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pikipek.png", globalVariables);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setPokeCry("731Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getOranBerry()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
