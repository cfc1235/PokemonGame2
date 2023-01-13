package Pokedex.HisuianForm;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.A.Adaptability;
import PokemonCreation.AllAbilities.M.MoldBreaker;
import PokemonCreation.AllAbilities.R.Rattled;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Basculegion extends Pokemon {

    private String dirName;

    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(65, 112, 120, 80,
                75, 78 ,902, 135, 242.5,
                "Water", "Medium Slow", level, 235);
        this.type2 = "Ghost";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addRest(), addSnore(), addProtect(),
                addScaryFace(), addIcyWind(), addAttract(), addRainDance(),
                addHail(), addWhirlpool(), addFacade(),addSwift(), addRevenge(),
                addDive(), addBounce(), addMudShot(), addBrine(), addAssurance(),
                addIceFang(), addRound(), addHydroPump(), addSurf(), addIceBeam(),
                addAgility(), addWaterfall(), addSubstitute(), addReversal(),
                addEndure(), addSleepTalk(), addCrunch(), addUproar(), addTaunt(),
                addSuperpower(), addMuddyWater(), addZenHeadbutt(), addScald(),
                addPsychicFangs(), addLiquidation(), addIceFang(), addSwift(),
                addOminousWind(), addCalmMind(), addWaterPulse(), addShadowBall(),
                addGigaImpact(), addAquaTail(), addHyperBeam(), addPsychic());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addWaterGun()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(6, addAquaJet()), new CreateOrderedMap<>(8, addFlail()),
                new CreateOrderedMap<>(11, addBite()), new CreateOrderedMap<>(11, addHex()),
                new CreateOrderedMap<>(18, addZenHeadbutt()), new CreateOrderedMap<>(20, addScaryFace()),
                new CreateOrderedMap<>(24, addHeadbutt()), new CreateOrderedMap<>(25, addCrunch()),
                new CreateOrderedMap<>(28, addSoak()), new CreateOrderedMap<>(34, addWaveCrash()),
                new CreateOrderedMap<>(36, addTakeDown()), new CreateOrderedMap<>(40, addFinalGambit()),
                new CreateOrderedMap<>(43, addDoubleEdge()), new CreateOrderedMap<>(44, addAquaTail()),
                new CreateOrderedMap<>(48, addThrash()), new CreateOrderedMap<>(56, addHeadSmash()));
        this.setPokeCry("902Cry.wav");
        if(this.Gender == 1){
            this.dirName = "BasculegionFemale.png";
        }
        else {
            this.dirName = "BasculegionMale.png";
        }
    }
    public Basculegion(int level, List<Moves> oldMoves, String Nature,
                  String name, List<Integer> oldIVs, double HPmissing,
                  List<Integer> OldEVs, int Gender, Abilities ability,
                  Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Basculin")){
            this.name = "Basculegion";
        }
        else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, this.dirName);
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Basculegion(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Adaptability(),
                new MoldBreaker(), new Rattled());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName(this.dirName, globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(100, GetItem.getMediumEXPCandy()),
                new CreateOrderedMap<>(20, GetItem.getSeedOfMastery()));
        getWildItem();
    }
}
