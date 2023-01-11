package Pokedex.P;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.D.Drizzle;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RainDish;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Pelipper extends Pokemon {

    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        this.type2 = "Flying";
        this.EvolTiming = 36;
        Collections.addAll(this.TMmoves, addTakeDown(), addAgility(),
                addProtect(), addWaterPulse(), addAcrobatics(), addThief(),
                addChillingWater(), addFacade(), addAerialAce(), addSwift(),
                addIcyWind(), addAirCutter(), addFling(), addEndure(),
                addRainDance(), addSnowscape(), addUTurn(), addAirSlash(),
                addBodySlam(), addSleepTalk(), addSeedBomb(), addWaterfall(),
                addRest(), addFly(), addGunkShot(), addSubstitute(),
                addLiquidation(), addTailwind(), addSurf(), addHelpingHand(),
                addIceBeam(), addHydroPump(), addBlizzard(), addGigaImpact(),
                addHurricane(), addHyperBeam(), addBraveBird());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(0, addSupersonic()),new CreateOrderedMap<>(0, addAirSlash()),
                new CreateOrderedMap<>(0, addTailwind()), new CreateOrderedMap<>(0, addAgility()),
                new CreateOrderedMap<>(0, addProtect()), new CreateOrderedMap<>(0, addSoak()),
                new CreateOrderedMap<>(15, addWingAttack()), new CreateOrderedMap<>(20, addWaterPulse()),
                new CreateOrderedMap<>(28, addStockpile()), new CreateOrderedMap<>(28, addSpitUp()),
                new CreateOrderedMap<>(28, addSwallow()), new CreateOrderedMap<>(34, addFling()),
                new CreateOrderedMap<>(41, addMist()), new CreateOrderedMap<>(48, addRoost()),
                new CreateOrderedMap<>(55, addHurricane()), new CreateOrderedMap<>(62, addHydroPump()));
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(100, 50, 60, 95,
                75, 71, 279, 45, 61.7,
                "Water", "Medium Fast", level, 154);
        setPokeCry("279.wav");
    }

    public Pelipper(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new RainDish(),
                new Drizzle());
        getAbilities();
        this.savedAbility = this.ability;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Pelipper.png", globalVariables);
    }

    public Pelipper(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Wingull")){
            this.name = "Pelipper";
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
        setFullDirNameEvolution(isShiny, "Pelipper.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}

