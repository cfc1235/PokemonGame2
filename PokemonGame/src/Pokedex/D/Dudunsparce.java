package Pokedex.D;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.AllAbilities.S.SereneGrace;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Dudunsparce extends Pokemon {

    //2 = false, 3 = true
    private Boolean segments;
    private String dirName;

    public void Initialize(int level, Boolean segments){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(80, 100, 125, 85, 75,
                55, 982, 45, 0.0, "Normal",
                "Medium Fast", level, 182);
        if(!segments){
            this.dirName = "Dudunsparce2";
            this.Weight = 86.4;

        }
        else {
            this.dirName = "Dudunsparce3";
            this.Weight = 104.5;
        }
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addFlail()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(4, addMudSlap()),
                new CreateOrderedMap<>(8, addRollout()), new CreateOrderedMap<>(12, addGlare()),
                new CreateOrderedMap<>(16, addScreech()), new CreateOrderedMap<>(20, addAncientPower()),
                new CreateOrderedMap<>(24, addDrillRun()), new CreateOrderedMap<>(28, addYawn()),
                new CreateOrderedMap<>(32, addHyperDrill()), new CreateOrderedMap<>(36, addRoost()),
                new CreateOrderedMap<>(40, addDragonRush()), new CreateOrderedMap<>(44, addCoil()),
                new CreateOrderedMap<>(48, addDoubleEdge()), new CreateOrderedMap<>(52, addEndeavor()),
                new CreateOrderedMap<>(56, addHurricane()), new CreateOrderedMap<>(62, addBoomburst()));
        Collections.addAll(this.TMmoves, addTakeDown(), addAgility(),
                addMudSlap(), addScaryFace(), addProtect(), addThief(),
                addPounce(), addChillingWater(), addFacade(), addPoisonTail(),
                addBulldoze(), addHex(), addMudShot(), addRockTomb(), addStoredPower(),
                addDragonTail(), addEndure(), addSunnyDay(), addRainDance(),
                addSandstorm(), addSmartStrike(), addDig(), addZenHeadbutt(),
                addAirSlash(), addBodySlam(), addSleepTalk(), addPoisonJab(),
                addStompingTantrum(), addRest(), addRockSlide(), addBodyPress(),
                addSubstitute(), addDrillRun(), addTailwind(), addShadowBall(),
                addStealthRock(), addHyperVoice(), addHeavySlam(), addIceSpinner(),
                addFlamethrower(), addThunderbolt(), addAmnesia(), addCalmMind(),
                addHelpingHand(), addBatonPass(), addEarthPower(), addIceBeam(),
                addFireBlast(), addBlizzard(), addWildCharge(), addEarthquake(),
                addStoneEdge(), addGigaImpact(), addOutrage(), addHurricane(),
                addHyperBeam(), addThunder(), addSolarBeam());
        this.setPokeCry("982Cry.wav");
    }
    public Dudunsparce(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                     double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny,
                     Items items, Boolean segments) {
        Initialize(level, segments);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Dunsparce")){
            this.name = "Dudunsparce";
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

    public Dudunsparce(int level, GlobalVariables globalVariables, Boolean segments) {
        Initialize(level, segments);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new SereneGrace(),
                new RunAway(), new Rattled());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName(this.dirName, globalVariables);
    }
}
