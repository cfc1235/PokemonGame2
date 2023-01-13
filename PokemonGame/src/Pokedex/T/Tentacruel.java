package Pokedex.T;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.ClearBody;
import PokemonCreation.AllAbilities.L.LiquidOoze;
import PokemonCreation.AllAbilities.R.RainDish;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Tentacruel extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 2, 0, 0, 0);
        setBaseStats(65, 70, 80, 80,
                120, 100 ,73, 60, 121.3,
                "Water", "Slow", level, 218);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(),
                addScreech(), addSafegaurd(), addRest(), addThief(),
                addSnore(), addProtect(), addIcyWind(), addGigaDrain(),
                addAttract(), addRainDance(), addHail(), addWhirlpool(),
                addFacade(), addDive(), addBrine(), addPayback(),
                addCrossPoison(), addVenoshock(), addRound(), addHex(),
                addBrutalSwing(), addSwordsDance(), addHydroPump(), addSurf(),
                addIceBeam(), addBlizzard(), addWaterfall(), addSubstitute(),
                addSludgeBomb(), addEndure(), addSleepTalk(), addMuddyWater(),
                addToxicSpikes(), addPoisonJab(), addSludgeWave(), addScald(),
                addVenomDrench(), addDazzlingGleam(), addWaterPulse(),
                addDoubleTeam(), addSwordsDance(), addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPoisonSting()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(0, addAcid()),
                new CreateOrderedMap<>(0, addWrap()), new CreateOrderedMap<>(0, addReflectType()),
                new CreateOrderedMap<>(12, addSupersonic()), new CreateOrderedMap<>(16, addWaterPulse()),
                new CreateOrderedMap<>(20, addScreech()), new CreateOrderedMap<>(24, addBubbleBeam()),
                new CreateOrderedMap<>(28, addHex()), new CreateOrderedMap<>(34, addAcidArmor()),
                new CreateOrderedMap<>(40, addPoisonJab()), new CreateOrderedMap<>(46, addSurf()),
                new CreateOrderedMap<>(52, addSludgeWave()), new CreateOrderedMap<>(58, addHydroPump()));
        this.setPokeCry("73Cry.wav");
    }
    public Tentacruel(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Tentacool")){
            this.name = "Tentacruel";
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
        setFullDirNameEvolution(isShiny, "Tentacruel.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Tentacruel(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new ClearBody(), new RainDish(),
                new LiquidOoze());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Tentacruel.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getPoisonBarb()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
