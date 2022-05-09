package Pokedex.F;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.D.Defiant;
import PokemonCreation.AllAbilities.I.InnerFocus;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Farfetchd extends Pokemon {
    public Farfetchd(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new Defiant(),
                new InnerFocus());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addFly(), addSolarBlade(),
                addRest(), addThief(), addSnore(), addProtect(),
                addSteelWing(), addAttract(), addFacade(), addSwift(),
                addHelpingHand(), addRevenge(), addUTurn(), addRound(),
                addAcrobatics(), addRetaliate(), addFalseSwipe(), addAirSlash(),
                addBrutalSwing(), addSwordsDance(), addAgility(), addFocusEnergy(),
                addSubstitute(), addEndure(), addSleepTalk(), addBatonPass(),
                addIronTail(), addUproar(), addHeatWave(), addLeafBlade(),
                addCloseCombat(), addPoisonJab(), addBraveBird(), addWorkUp(),
                addThroatChop(), addWorkUp(), addSunnyDay(), addDoubleTeam(),
                addAerialAce(), addRoost(), addPsychUp(), addSwagger(),
                addPluck(), addCut(), addDefog());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(5, addLeer()),
                new CreateOrderedMap<>(10, addFuryCutter()), new CreateOrderedMap<>(15, addCut()),
                new CreateOrderedMap<>(20, addAerialAce()), new CreateOrderedMap<>(25, addAirCutter()),
                new CreateOrderedMap<>(30, addKnockOff()), new CreateOrderedMap<>(35, addFalseSwipe()),
                new CreateOrderedMap<>(40, addSlash()), new CreateOrderedMap<>(45, addSwordsDance()),
                new CreateOrderedMap<>(50, addAirSlash()), new CreateOrderedMap<>(55, addLeafBlade()),
                new CreateOrderedMap<>(60, addAgility()), new CreateOrderedMap<>(65, addBraveBird()));
        addFirstMoves();
        this.pokedexType = "Farfetch'd";
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(55, 90, 52, 58, 62,
                60, 83, 45, 33.1,
                "Normal", "Medium Fast", level, 132);
        this.type2 = "Flying";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Farfetchd.png", globalVariables);
        this.setPokeCry("083Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(50, GetItem.getLeek()),
                new CreateOrderedMap<>(50, GetItem.getNoItem()));
        getWildItem();
    }
}
