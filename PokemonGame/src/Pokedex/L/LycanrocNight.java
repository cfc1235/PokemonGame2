package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import Moveset.Dark.SuckerPunch;
import Moveset.Fighting.Counter;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.N.NoGaurd;
import PokemonCreation.AllAbilities.S.SandRush;
import PokemonCreation.AllAbilities.S.Steadfast;
import PokemonCreation.AllAbilities.V.VitalSpirit;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class LycanrocNight extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(75, 115, 85, 55,
                75, 82 ,745, 90, 55.1,
                "Rock", "Medium Slow", level, 170);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(),
                addMudSlap(), addScaryFace(), addProtect(), addFireFang(),
                addThunderFang(), addTrailblaze(), addFacade(), addBulldoze(),
                addSnarl(), addRockTomb(), addLowSweep(), addFling(),
                addSunnyDay(), addSandstorm(), addDig(), addBrickBreak(),
                addShadowClaw(), addFoulPlay(), addZenHeadbutt(), addPsychicFangs(),
                addBulkUp(), addBodySlam(), addFirePunch(), addThunderPunch(),
                addSleepTalk(), addRockBlast(), addStompingTantrum(), addRest(),
                addRockSlide(), addTaunt(), addSwordsDance(), addIronHead(),
                addSubstitute(), addIronDefense(), addCrunch(), addStealthRock(),
                addHyperVoice(), addPlayRough(), addHelpingHand(), addEarthPower(),
                addReversal(), addStoneEdge(), addGigaImpact(), addOutrage(),
                addCloseCombat());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSandAttack()),
                new CreateOrderedMap<>(0, addEndure()), new CreateOrderedMap<>(0, addDoubleTeam()),
                new CreateOrderedMap<>(0, addTaunt()), new CreateOrderedMap<>(0, addReversal()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(12, addRockThrow()), new CreateOrderedMap<>(16, addHowl()),
                new CreateOrderedMap<>(20, addBite()), new CreateOrderedMap<>(24, addRockTomb()),
                new CreateOrderedMap<>(30, addRoar()), new CreateOrderedMap<>(36, addRockSlide()),
                new CreateOrderedMap<>(42, addCrunch()), new CreateOrderedMap<>(48, addScaryFace()),
                new CreateOrderedMap<>(54, addStealthRock()), new CreateOrderedMap<>(60, addStoneEdge()));
        this.setPokeCry("745Cry.wav");
        this.OnEvol = new Counter();
    }
    public LycanrocNight(int level, List<Moves> oldMoves, String Nature,
                       String name, List<Integer> oldIVs, double HPmissing,
                       List<Integer> OldEVs, int Gender, Abilities ability,
                       Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Rockruff")){
            this.name = "Lycanroc";
        }
        if (!(name.equals("Rockruff"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "LycanrocNight.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public LycanrocNight(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new VitalSpirit(),
                new KeenEyes(), new NoGaurd());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("LycanrocNight.png", globalVariables);
    }
}
