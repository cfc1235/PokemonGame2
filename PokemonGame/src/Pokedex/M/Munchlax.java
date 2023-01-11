package Pokedex.M;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.AllAbilities.L.Leftovers;
import PokemonCreation.AllAbilities.P.Pickup;
import PokemonCreation.AllAbilities.T.ThickFat;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Munchlax extends Pokemon {
    public Munchlax(int level, GlobalVariables globalVariables){
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new Pickup(),
                new ThickFat(), new Gluttony());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addPayDay(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addSolarBeam(),
                addScreech(), addSelfDestruct(), addRest(), addRockSlide(),
                addSnore(), addProtect(), addIcyWind(), addCharm(), addAttract(),
                addSandstorm(), addRainDance(), addSunnyDay(), addWhirlpool(),
                addFacade(), addBrickBreak(), addRockTomb(), addFling(), addRound(),
                addRetaliate(), addBulldoze(), addStompingTantrum(), addBodySlam(),
                addFlamethrower(), addHydroPump(), addSurf(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addEarthquake(),
                addPsychic(), addMetronome(), addFireBlast(), addAmnesia(),
                addSubstitute(), addEndure(), addSleepTalk(), addEncore(),
                addShadowBall(), addUproar(), addSuperpower(), addHyperVoice(),
                addSeedBomb(), addZenHeadbutt(), addGunkShot(), addWorkUp(),
                addFocusPunch(), addWaterPulse(), addDoubleTeam(), addShockWave(),
                addFling(), addRecycle(), addSwagger(), addStrength(), addRockSmash(),
                addRockClimb());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addLick()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(4, addDefenseCurl()),
                new CreateOrderedMap<>(8, addRecycle()), new CreateOrderedMap<>(12, addCovet()),
                new CreateOrderedMap<>(16, addBite()), new CreateOrderedMap<>(20, addStockpile()),
                new CreateOrderedMap<>(20, addSwallow()), new CreateOrderedMap<>(24, addScreech()),
                new CreateOrderedMap<>(28, addBodySlam()), new CreateOrderedMap<>(32, addFling()),
                new CreateOrderedMap<>(36, addAmnesia()), new CreateOrderedMap<>(40, addMetronome()),
                new CreateOrderedMap<>(44, addFlail()), new CreateOrderedMap<>(48, addBellyDrum()),
                new CreateOrderedMap<>(52, addLastResort()));
        addFirstMoves();
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(40, 85, 85, 40, 5, 1);
        setBaseStats(55, 75, 45, 75,
                65, 30, 446, 50,
                231.5, "Normal", "Slow",
                level, 94);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Munchlax.png", globalVariables);
        this.EvolTiming = 40;
        this.setPokeCry("446Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(100, new Leftovers()));
        getWildItem();
    }
}
