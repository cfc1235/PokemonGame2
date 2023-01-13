package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import Moveset.Normal.CrushClaw;
import PokemonCreation.AllAbilities.T.ToughClaws;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class LycanrocDusk extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(65, 117, 75, 55,
                65, 110 ,745, 90, 55.1,
                "Rock", "Medium Fast", level, 170);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(),
                addScaryFace(), addProtect(), addFireFang(), addThunderFang(),
                addTrailblaze(), addFacade(), addBulldoze(), addSnarl(),
                addEndure(), addRockTomb(), addSandstorm(), addDig(),
                addZenHeadbutt(), addBrickBreak(), addPsychicFangs(),
                addBulkUp(), addSleepTalk(), addRockBlast(), addStompingTantrum(),
                addRest(), addRockSlide(), addTaunt(), addSwordsDance(), addIronHead(),
                addSubstitute(), addIronDefense(), addDrillRun(), addCrunch(),
                addStealthRock(), addHyperVoice(), addPlayRough(), addHelpingHand(),
                addEarthPower(), addReversal(), addStoneEdge(), addGigaImpact(),
                addOutrage(), addCloseCombat());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addAccelerock()),
                new CreateOrderedMap<>(0, addSuckerPunch()), new CreateOrderedMap<>(0, addTaunt()),
                new CreateOrderedMap<>(0, addEndure()), new CreateOrderedMap<>(0, addQuickGuard()),
                new CreateOrderedMap<>(0, addReversal()), new CreateOrderedMap<>(0, addDoubleTeam()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(0, addCounter()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addQuickAttack()), new CreateOrderedMap<>(12, addRockThrow()),
                new CreateOrderedMap<>(16, addHowl()), new CreateOrderedMap<>(20, addBite()),
                new CreateOrderedMap<>(24, addRockTomb()), new CreateOrderedMap<>(30, addRoar()),
                new CreateOrderedMap<>(36, addRockSlide()), new CreateOrderedMap<>(42, addCrunch()),
                new CreateOrderedMap<>(48, addScaryFace()), new CreateOrderedMap<>(54, addStealthRock()),
                new CreateOrderedMap<>(60, addStoneEdge()));
        this.setPokeCry("745Cry.wav");
        this.OnEvol = new CrushClaw();
        this.ability = new ToughClaws();
        this.savedAbility = this.ability;
    }
    public LycanrocDusk(int level, List<Moves> oldMoves, String Nature,
                         String name, List<Integer> oldIVs, double HPmissing,
                         List<Integer> OldEVs, int Gender, Boolean isShiny,
                        Items items){
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
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        setFullDirNameEvolution(isShiny, "LycanrocDusk.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public LycanrocDusk(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("LycanrocDusk.png", globalVariables);
    }
}
