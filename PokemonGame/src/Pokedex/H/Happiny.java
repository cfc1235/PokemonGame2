package Pokedex.H;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.N.NaturalCure;
import PokemonCreation.AllAbilities.S.SereneGrace;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Happiny extends Pokemon {
    public Happiny(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new SereneGrace(), new NaturalCure());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addSolarBeam(), addThunderWave(),
                addLightScreen(), addSafegaurd(), addRest(), addSnore(), addProtect(),
                addIcyWind(), addCharm(), addAttract(), addRainDance(), addSunnyDay(),
                addHail(), addFacade(), addHelpingHand(), addFling(), addDrainPunch(),
                addRound(), addFlamethrower(), addPsychic(), addMetronome(), addFireBlast(),
                addSubstitute(), addEndure(), addSleepTalk(), addShadowBall(), addUproar(),
                addHyperVoice(), addZenHeadbutt(), addGrassKnot(), addStoredPower(),
                addWorkUp(), addWaterPulse(), addHail(), addDoubleTeam(), addShockWave(),
                addRecycle(), addFlash(), addThunderWave(), addPsychUp(), addSleepTalk(),
                addDreamEater(), addSwagger());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addMinimize()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(4, addDefenseCurl()), new CreateOrderedMap<>(8, addSweetKiss()),
                new CreateOrderedMap<>(12, addDisarmingVoice()), new CreateOrderedMap<>(16, addCovet()),
                new CreateOrderedMap<>(20, addCharm()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 0, 1);
        setBaseStats(5, 5, 100, 15,
                65, 30, 440, 130,
                53.8, "Normal", "Fast", level,
                110);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Happiny.png", globalVariables);
        this.setPokeCry("440Cry.wav");
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(50, GetItem.getOvalStone()),
                new CreateOrderedMap<>(30, GetItem.getRazzBerry()),
                new CreateOrderedMap<>(100, GetItem.getSmallExpCandy()),
                new CreateOrderedMap<>(10,  GetItem.getSeedOfMastery()));
        getWildItem();
        Collections.addAll(this.itemEvolReqs, "Oval Stone");
    }
}
