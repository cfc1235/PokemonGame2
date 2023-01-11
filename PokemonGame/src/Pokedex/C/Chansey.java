package Pokedex.C;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.N.NaturalCure;
import PokemonCreation.AllAbilities.S.SereneGrace;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Chansey extends Pokemon {
    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(),
                addIcePunch(), addThunderPunch(), addHyperBeam(), addGigaImpact(),
                addSolarBeam(), addThunderWave(), addLightScreen(), addSafegaurd(),
                addRest(), addRockSlide(), addSnore(), addProtect(), addIcyWind(),
                addCharm(), addAttract(), addSandstorm(), addRainDance(), addSunnyDay(),
                addHail(), addFacade(), addHelpingHand(), addBrickBreak(), addRockTomb(),
                addFling(), addDrainPunch(), addRound(), addRetaliate(), addBulldoze(),
                addStompingTantrum(), addBodySlam(), addFlamethrower(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addEarthquake(),
                addPsychic(), addMetronome(), addFireBlast(), addTriAttack(),
                addSubstitute(), addEndure(), addSleepTalk(), addIronTail(),
                addShadowBall(), addUproar(), addSkillSwap(), addHyperVoice(),
                addCalmMind(), addZenHeadbutt(), addStealthRock(), addGrassKnot(),
                addStoredPower(), addAllySwitch(), addWorkUp(), addWildCharge(),
                addDazzlingGleam(), addFocusPunch(), addWaterPulse(), addHail(),
                addDoubleTeam(), addShockWave(), addChargeBeam(), addRecycle(),
                addFlash(), addThunderWave(), addPsychUp(), addSleepTalk(),
                addDreamEater(), addSwagger(), addStrength(), addRockSmash(),
                addRockClimb());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSweetKiss()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(0, addDefenseCurl()),
                new CreateOrderedMap<>(0, addDisarmingVoice()), new CreateOrderedMap<>(0, addCovet()),
                new CreateOrderedMap<>(0, addMinimize()), new CreateOrderedMap<>(4, addTailWhip()),
                new CreateOrderedMap<>(8, addEchoedVoice()), new CreateOrderedMap<>(12, addLifeDew()),
                new CreateOrderedMap<>(16, addSing()), new CreateOrderedMap<>(20, addFling()),
                new CreateOrderedMap<>(24, addTakeDown()), new CreateOrderedMap<>(28, addHealPulse()),
                new CreateOrderedMap<>(32, addHelpingHand()), new CreateOrderedMap<>(36, addLightScreen()),
                new CreateOrderedMap<>(40, addDoubleEdge()), new CreateOrderedMap<>(44, addSoftBoiled()),
                new CreateOrderedMap<>(48, addLastResort()), new CreateOrderedMap<>(52, addHealingWish()));
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(5, 5, 250, 35,
                105, 50, 113, 30,
                73.6, "Normal", "Fast",
                level, 395);
        this.setPokeCry("113Cry.wav");
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(30, GetItem.getRazzBerry()),
                new CreateOrderedMap<>(10, GetItem.getOvalStone()),
                new CreateOrderedMap<>(100, GetItem.getMediumEXPCandy()),
                new CreateOrderedMap<>(10,  GetItem.getSeedOfMastery()));
        getWildItem();
    }

    public Chansey(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        Collections.addAll(this.possibleAbilities, new NaturalCure(),
                new SereneGrace());
        getAbilities();
        this.savedAbility = this.ability;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Chansey.png", globalVariables);
    }

    public Chansey(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
        if (name.equals("Happiny")){
            this.name = "Chansey";
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
        setFullDirNameEvolution(isShiny, "Chansey.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
