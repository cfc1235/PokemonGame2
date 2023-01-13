package Pokedex.D;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.EvolItems.DragonScale;
import Moveset.Flying.Hurricane;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.M.MarvelScale;
import PokemonCreation.AllAbilities.S.ShedSkin;
import Items.Items;
import PokemonCreation.Pokemon;
import Items.NoItem;

import java.util.Collections;
import java.util.List;

public class Dragonite extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(95, 134, 91, 100, 100,
                80, 149, 45, 463.0, "Dragon",
                "Slow", level, 147);
        this.type2 = "Flying";
        this.OnEvol = new Hurricane();
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addHurricane()),
                new CreateOrderedMap<>(0, addWrap()), new CreateOrderedMap<>(0, addLeer()),
                new CreateOrderedMap<>(0, addTwister()), new CreateOrderedMap<>(0, addThunderWave()),
                new CreateOrderedMap<>(0, addWingAttack()), new CreateOrderedMap<>(0, addRoost()),
                new CreateOrderedMap<>(0, addFirePunch()), new CreateOrderedMap<>(0, addThunderPunch()),
                new CreateOrderedMap<>(0, addExtremeSpeed()), new CreateOrderedMap<>(15, addDragonTail()),
                new CreateOrderedMap<>(20, addAgility()), new CreateOrderedMap<>(25, addSlam()),
                new CreateOrderedMap<>(33, addAquaTail()), new CreateOrderedMap<>(39, addDragonRush()),
                new CreateOrderedMap<>(41, addOutrage()), new CreateOrderedMap<>(46, addSafegaurd()),
                new CreateOrderedMap<>(53, addRainDance()), new CreateOrderedMap<>(62, addDragonDance()),
                new CreateOrderedMap<>(80, addHyperBeam()));
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(),
                addIcePunch(), addThunderPunch(), addFly(), addHyperBeam(), addGigaImpact(),
                addFireSpin(), addThunderWave(), addLightScreen(), addSafegaurd(), addRest(),
                addRockSlide(), addSnore(), addProtect(), addIcyWind(), addSteelWing(),
                addAttract(), addSandstorm(), addRainDance(), addSunnyDay(), addHail(),
                addWhirlpool(), addFacade(), addSwift(), addBrickBreak(), addDive(),
                addRockTomb(), addFling(), addRound(), addBulldoze(), addAirSlash(),
                addBrutalSwing(), addBreakingSwing(), addBodySlam(), addFlamethrower(),
                addHydroPump(), addSurf(), addIceBeam(), addBlizzard(), addThunderbolt(),
                addThunder(), addEarthquake(), addAgility(), addFireBlast(), addWaterfall(),
                addSubstitute(), addOutrage(), addEndure(), addSleepTalk(), addIronTail(),
                addHeatWave(), addSuperpower(), addDragonClaw(), addDragonDance(), addDragonPulse(),
                addFocusBlast(),  addIronHead(), addHurricane(), addBodyPress(), addFocusPunch(),
                addWaterPulse(), addRoar(), addHail(), addIceBeam(), addLightScreen(), addDoubleTeam(),
                addShockWave(), addAerialAce(), addStoneEdge(), addSwagger(), addCut(), addStrength(),
                addRockSmash());
        this.setPokeCry("149Cry.wav");
    }
    public Dragonite(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                     double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Dragonite")){
            this.name = "Dragonair";
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
        setFullDirNameEvolution(isShiny, "Dragonair.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Dragonite(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new ShedSkin());
        this.possibleAbilities.add(new MarvelScale());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Dragonair.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new DragonScale()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
