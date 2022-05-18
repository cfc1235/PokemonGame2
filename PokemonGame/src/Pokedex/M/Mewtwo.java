package Pokedex.M;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.P.Pressure;
import PokemonCreation.AllAbilities.U.Unnerve;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Mewtwo extends Pokemon {
    public Mewtwo(int level, GlobalVariables globalVariables){
        this.hasGender = false;
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pressure(), new Unnerve());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addPayDay(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addThunderWave(), addLightScreen(),
                addReflect(), addSafegaurd(), addSelfDestruct(), addRest(),
                addRockSlide(), addSnore(), addProtect(), addIcyWind(),
                addSandstorm(), addRainDance(), addSunnyDay(), addHail(),
                addWillOWisp(), addFacade(), addSwift(), addBrickBreak(),
                addDive(), addRockTomb(), addFling(), addPowerSwap(),
                addGuardSwap(), addSpeedSwap(), addDrainPunch(), addAvalanche(),
                addPsychoCut(), addTrickRoom(), addWonderRoom(), addMagicRoom(),
                addLowSweep(), addRound(), addBulldoze(), addPsychicTerrain(),
                addBrutalSwing(), addBodySlam(), addFlamethrower(), addIceBeam(),
                addBlizzard(), addLowKick(), addThunderbolt(), addThunder(),
                addEarthquake(), addPsychic(), addAgility(), addMetronome(),
                addFireBlast(), addAmnesia(), addTriAttack(), addPsyshock(),
                addEndure(), addSleepTalk(), addIronTail(), addShadowBall(),
                addFutureSight(), addTaunt(), addTrick(), addSkillSwap(),
                addBulkUp(), addCalmMind(), addAuraSphere(), addPoisonJab(),
                addFocusBlast(), addEnergyBall(), addNastyPlot(), addZenHeadbutt(),
                addStoneEdge(), addGrassKnot(), addElectroBall(), addFoulPlay(),
                addStoredPower(), addAllySwitch(), addHurricane(), addFocusPunch(),
                addWaterPulse(), addDoubleTeam(), addShockWave(), addAerialAce(),
                addTorment(), addChargeBeam(), addRecycle(), addFlash(),
                addPsychUp(), addDreamEater(), addSwagger(), addSubstitute(),
                addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addLifeDew()),
                new CreateOrderedMap<>(0, addLaserFocus()), new CreateOrderedMap<>(0, addDisable()),
                new CreateOrderedMap<>(0, addConfusion()), new CreateOrderedMap<>(0, addSwift()),
                new CreateOrderedMap<>(8, addAncientPower()), new CreateOrderedMap<>(16, addPsychoCut()),
                new CreateOrderedMap<>(24, addSafegaurd()), new CreateOrderedMap<>(32, addAmnesia()),
                new CreateOrderedMap<>(40, addAuraSphere()), new CreateOrderedMap<>(48, addPsychic()),
                new CreateOrderedMap<>(56, addPowerSwap()), new CreateOrderedMap<>(56, addGuardSwap()),
                new CreateOrderedMap<>(64, addMist()), new CreateOrderedMap<>(72, addPsystrike()),
                new CreateOrderedMap<>(80, addRecover()), new CreateOrderedMap<>(88, addFutureSight()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(90, 110, 106, 154, 90,
                130, 150, 3, 269,
                "Psychic", "Slow", level, 306);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Mewtwo.png", globalVariables);
        this.setPokeCry("150Cry.wav");
    }
}
