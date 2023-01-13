package Pokedex.D;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.AllAbilities.S.SereneGrace;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Dunsparce extends Pokemon {
    public Dunsparce(int level, GlobalVariables globalVariables){
        this.setFirstEVs();
        this.setGivesEVs(0, 0, 0, 0, 0, 1);
        this.setBaseStats(70, 70, 100, 65,
                65, 45, 206, 190, 30.9,
                "Normal","Medium Fast", level, 145);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Rattled(),
                new RunAway(), new SereneGrace());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addFlail()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(4, addMudSlap()),
                new CreateOrderedMap<>(8, addRollout()), new CreateOrderedMap<>(12, addGlare()),
                new CreateOrderedMap<>(16, addScreech()), new CreateOrderedMap<>(20, addAncientPower()),
                new CreateOrderedMap<>(24, addDrillRun()), new CreateOrderedMap<>(28, addYawn()),
                new CreateOrderedMap<>(32, addHyperDrill()), new CreateOrderedMap<>(36, addRoost()),
                new CreateOrderedMap<>(40, addDragonRush()), new CreateOrderedMap<>(44, addCoil()),
                new CreateOrderedMap<>(48, addDoubleEdge()), new CreateOrderedMap<>(52, addEndeavor()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addSolarBeam(), addThunderWave(),
                addDig(), addScreech(), addRest(), addRockSlide(), addThief(),
                addSnore(), addProtect(), addAttract(), addRainDance(),
                addSunnyDay(), addFacade(), addHelpingHand(), addRockTomb(),
                addRound(), addHex(), addRetaliate(), addBulldoze(), addAirSlash(),
                addStompingTantrum(), addBodySlam(), addFlamethrower(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addEarthquake(),
                addAgility(), addFireBlast(), addAmnesia(), addSubstitute(),
                addEndure(), addSleepTalk(), addBatonPass(), addIronTail(),
                addShadowBall(), addCalmMind(), addGyroBall(), addPoisonJab(),
                addZenHeadbutt(), addStealthRock(), addStoredPower(), addWildCharge(),
                addDrillRun(), addWaterPulse(), addDoubleTeam(), addShockWave(),
                addPsychUp(), addDreamEater(), addSwagger(), addStrength(),
                addRockSmash());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setFullDirName("Dunsparce.png", globalVariables);
        this.setPokeCry("206Cry.wav");
    }

    @Override
    protected Boolean getSpecialEvolReq(){
        for (Moves moves : this.moves){
            if (moves.showName().equals("Hyper Drill")){
                return true;
            }
        }
        return false;
    }
}
