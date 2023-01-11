package Pokedex.S;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.AllAbilities.I.Immunity;
import PokemonCreation.AllAbilities.T.ThickFat;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Snorlax extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(65, 110, 160, 65, 110,
                30,143, 25, 1014.1, "Normal",
                "Slow", level, 143);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addPayDay(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addScreech(), addSelfDestruct(),
                addRest(), addRockSlide(), addSnore(), addProtect(), addIcyWind(),
                addCharm(), addAttract(), addSandstorm(), addRainDance(), addSunnyDay(),
                addWhirlpool(), addFacade(), addBrickBreak(), addRockTomb(), addFling(),
                addRound(), addRetaliate(), addBulldoze(), addStompingTantrum(),
                addBodySlam(), addFlamethrower(), addHydroPump(), addSurf(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addEarthquake(), addPsychic(),
                addMetronome(), addFireBlast(), addAmnesia(), addSubstitute(), addOutrage(),
                addEndure(), addSleepTalk(), addEncore(), addCrunch(), addShadowBall(),
                addUproar(), addSuperpower(), addHyperVoice(), addSeedBomb(), addFocusBlast(),
                addZenHeadbutt(), addGunkShot(), addIronHead(), addHeavySlam(), addWorkUp(),
                addWildCharge(), addHeatCrash(), addDarkestLariat(), addHighHorsepower(),
                addBodyPress(), addFocusPunch(), addWaterPulse(), addDoubleTeam(),
                addShockWave(), addFling(), addRecycle(), addSwagger(), addStrength(),
                addRockSmash(), addRockClimb());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addLick()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addDefenseCurl()),
                new CreateOrderedMap<>(0, addRecycle()), new CreateOrderedMap<>(0, addCovet()),
                new CreateOrderedMap<>(0, addFling()), new CreateOrderedMap<>(0, addScreech()),
                new CreateOrderedMap<>(0, addStockpile()), new CreateOrderedMap<>(0, addSwallow()),
                new CreateOrderedMap<>(0, addMetronome()),new CreateOrderedMap<>(0, addFlail()),
                new CreateOrderedMap<>(0, addLastResort()), new CreateOrderedMap<>(12, addYawn()),
                new CreateOrderedMap<>(16, addBite()), new CreateOrderedMap<>(20, addRest()),
                new CreateOrderedMap<>(20, addSnore()), new CreateOrderedMap<>(20, addSleepTalk()),
                new CreateOrderedMap<>(24, addCrunch()), new CreateOrderedMap<>(28, addBodySlam()),
                new CreateOrderedMap<>(32, addHeavySlam()), new CreateOrderedMap<>(36, addAmnesia()),
                new CreateOrderedMap<>(40, addHighHorsepower()), new CreateOrderedMap<>(44, addHammerArm()),
                new CreateOrderedMap<>(48, addBellyDrum()), new CreateOrderedMap<>(52, addBelch()),
                new CreateOrderedMap<>(56, addGigaImpact()));
        this.setPokeCry("143Cry.wav");
    }

    public Snorlax(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Munchlax")){
            this.name = "Snorlax";
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
        setFullDirNameEvolution(isShiny, "Snorlax.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Snorlax(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new ThickFat(),
                new Gluttony(), new Immunity());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Snorlax.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(100, GetItem.getLeftovers()));
        getWildItem();
    }
}
