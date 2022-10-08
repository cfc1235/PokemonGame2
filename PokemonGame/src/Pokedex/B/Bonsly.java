package Pokedex.B;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.R.RockHead;
import PokemonCreation.AllAbilities.S.Sturdy;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Bonsly extends Pokemon {
    public Bonsly(int level, GlobalVariables globalVariables){
        this.setFirstEVs();
        this.setGivesEVs(1, 0, 0, 0, 0, 0);
        this.setBaseStats(95, 80, 50, 10,
                45, 10, 438, 255, 33.1,
                "Rock","Medium Fast", level, 68);
        this.pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Rattled(),
                new Sturdy(), new RockHead());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addFakeTears()),
                new CreateOrderedMap<>(0, addCopycat()), new CreateOrderedMap<>(4, addFlail()),
                new CreateOrderedMap<>(8, addRockThrow()), new CreateOrderedMap<>(16, addMimic()),
                new CreateOrderedMap<>(20, addRockTomb()), new CreateOrderedMap<>(24, addTearfulLook()),
                new CreateOrderedMap<>(28, addSuckerPunch()), new CreateOrderedMap<>(32, addRockSlide()),
                new CreateOrderedMap<>(36, addLowKick()), new CreateOrderedMap<>(40, addCounter()),
                new CreateOrderedMap<>(44, addDoubleEdge()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addDig(), addSelfDestruct(), addRest(),
                addRockSlide(), addThief(), addSnore(), addProtect(), addAttract(),
                addSandstorm(), addSunnyDay(), addFacade(), addHelpingHand(),
                addBrickBreak(), addFakeTears(), addRockTomb(), addSandTomb(),
                addRound(), addStompingTantrum(), addLowKick(), addSubstitute(),
                addEndure(), addSleepTalk(), addUproar(), addCalmMind(), addEarthPower(),
                addStealthRock(), addFoulPlay(), addCalmMind(), addDoubleTeam(),
                addExplosion(), addRockPolish(), addPsychUp(), addSwagger());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setFullDirName("BasculinRed.png", globalVariables);
        this.setPokeCry("550Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(100, GetItem.getSmallExpCandy()),
                new CreateOrderedMap<>(10, GetItem.getSeedOfMastery()));
        getWildItem();
    }
}
