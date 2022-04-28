package Pokedex.GalarianForm;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.Defiant;
import PokemonCreation.AllAbilities.Pressure;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class GalarianZapdos extends Pokemon {
    public GalarianZapdos(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new Defiant());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaKick(), addFly(), addHyperBeam(),
                addGigaImpact(), addScreech(), addLightScreen(), addRest(),
                addSnore(), addProtect(), addScaryFace(), addSteelWing(),
                addFacade(), addSwift(), addRevenge(), addBrickBreak(),
                addBounce(), addUTurn(), addPayback(), addAssurance(),
                addLowSweep(), addRound(), addAcrobatics(), addRetaliate(),
                addStompingTantrum(), addLowKick(), addAgility(), addFocusEnergy(),
                addSubstitute(), addReversal(), addEndure(), addSleepTalk(),
                addTaunt(), addSuperpower(), addBlazeKick(), addBulkUp(),
                addCloseCombat(), addBraveBird(), addHurricane(), addThroatChop());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addFocusEnergy()), new CreateOrderedMap<>(5, addRockSmash()),
                new CreateOrderedMap<>(10, addLightScreen()), new CreateOrderedMap<>(15, addPluck()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addAncientPower()),
                new CreateOrderedMap<>(30, addBrickBreak()), new CreateOrderedMap<>(35, addDrillPeck()),
                new CreateOrderedMap<>(40, addQuickGuard()), new CreateOrderedMap<>(45, addThunderousKick()),
                new CreateOrderedMap<>(50, addBulkUp()), new CreateOrderedMap<>(55, addCounter()),
                new CreateOrderedMap<>(60, addDetect()), new CreateOrderedMap<>(65, addCloseCombat()),
                new CreateOrderedMap<>(70, addReversal()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(90, 125, 90, 85, 90,
                100, 145, 3, 128.3,
                "Flying", "Slow", level, 261);
        this.type2 = "Fighting";
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("GalarianZapdos.png", globalVariables);
        this.setPokeCry("145Cry.wav");
    }
}
