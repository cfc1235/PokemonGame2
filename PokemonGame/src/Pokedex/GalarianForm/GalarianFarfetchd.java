package Pokedex.GalarianForm;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.S.Scrappy;
import PokemonCreation.AllAbilities.S.Steadfast;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class GalarianFarfetchd extends Pokemon {
    public GalarianFarfetchd(int level, GlobalVariables globalVariables){
        this.isGalarian = true;
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Steadfast(), new Scrappy());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSolarBlade(), addRest(),
                addSnore(), addProtect(), addSteelWing(), addAttract(),
                addFacade(), addHelpingHand(), addRevenge(), addBrickBreak(),
                addAssurance(), addRound(), addRetaliate(), addBrutalSwing(),
                addSwordsDance(), addFocusEnergy(), addSubstitute(), addEndure(),
                addSleepTalk(), addSuperpower(), addLeafBlade(), addCloseCombat(),
                addPoisonJab(), addBraveBird(), addWorkUp(), addThroatChop());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(5, addLeer()),
                new CreateOrderedMap<>(10, addFuryCutter()), new CreateOrderedMap<>(15, addRockSmash()),
                new CreateOrderedMap<>(20, addBrutalSwing()), new CreateOrderedMap<>(25, addDetect()),
                new CreateOrderedMap<>(30, addKnockOff()), new CreateOrderedMap<>(35, addDefog()),
                new CreateOrderedMap<>(40, addBrickBreak()), new CreateOrderedMap<>(45, addSwordsDance()),
                new CreateOrderedMap<>(50, addSlam()), new CreateOrderedMap<>(55, addLeafBlade()),
                new CreateOrderedMap<>(60, addFinalGambit()), new CreateOrderedMap<>(65, addBraveBird()));
        addFirstMoves();
        this.pokedexType = "Farfetch'd";
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(55, 95, 52, 58, 62,
                55, 83, 45, 92.6,
                "Fighting", "Medium Fast", level, 132);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("GalarianFarfetchd.png", globalVariables);
        this.setPokeCry("083Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getLeek()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }

    public Boolean getSpecialEvolReq(){
        return this.critTotal >= 3;
    }
}
