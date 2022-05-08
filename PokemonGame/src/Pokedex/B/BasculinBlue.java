package Pokedex.B;

import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.A.Adaptability;
import PokemonCreation.AllAbilities.M.MoldBreaker;
import PokemonCreation.AllAbilities.R.Reckless;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class BasculinBlue extends Pokemon {
    public BasculinBlue(int level, GlobalVariables globalVariables){
        this.setFirstEVs();
        this.setGivesEVs(0, 0, 0, 0, 2, 0);
        this.setBaseStats(65, 92, 70, 80,
                55, 98, 550, 25, 39.7,
                "Water","Medium Fast", level, 161);
        this.pokedexType = "Basculin";
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Adaptability(),
                new MoldBreaker(), new Reckless());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addWaterGun()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(4, addTackle()),
                new CreateOrderedMap<>(8, addFlail()), new CreateOrderedMap<>(12, addAquaJet()),
                new CreateOrderedMap<>(16, addBite()), new CreateOrderedMap<>(20, addScaryFace()),
                new CreateOrderedMap<>(24, addHeadbutt()), new CreateOrderedMap<>(28, addSoak()),
                new CreateOrderedMap<>(32, addCrunch()), new CreateOrderedMap<>(36, addTakeDown()),
                new CreateOrderedMap<>(40, addFinalGambit()), new CreateOrderedMap<>(44, addAquaTail()),
                new CreateOrderedMap<>(48, addThrash()), new CreateOrderedMap<>(52, addDoubleEdge()),
                new CreateOrderedMap<>(56, addHeadSmash()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addRest(), addSnore(), addProtect(),
                addScaryFace(), addIcyWind(), addAttract(), addRainDance(),
                addHail(), addWhirlpool(), addFacade(),addSwift(), addRevenge(),
                addDive(), addBounce(), addMudShot(), addBrine(), addAssurance(),
                addIceFang(), addRound(), addHydroPump(), addSurf(), addIceBeam(),
                addAgility(), addWaterfall(), addSubstitute(), addReversal(),
                addEndure(), addSleepTalk(), addCrunch(), addUproar(), addTaunt(),
                addSuperpower(), addMuddyWater(), addZenHeadbutt(), addScald(),
                addPsychicFangs(), addLiquidation());
        setNature();
        setIVs();
        changeBaseStats();
        this.HP = this.savedHP;
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.setFullDirName("BasculinBlue.png", globalVariables);
        this.setPokeCry("550Cry.wav");
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(100, GetItem.getSmallExpCandy()),
                new CreateOrderedMap<>(10, GetItem.getSeedOfMastery()));
        getWildItem();
    }
}
