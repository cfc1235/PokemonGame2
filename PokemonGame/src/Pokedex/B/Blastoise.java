package Pokedex.B;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Steel.FlashCannon;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.RainDish;
import PokemonCreation.AllAbilities.Torrent;

import java.util.Collections;
import java.util.List;

public class Blastoise extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 0,3, 0, 0);
        this.OnEvol = new FlashCannon();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addIcePunch(), addDig(), addRest(), addSnore(),
                addProtect(), addIcyWind(), addAttract(), addRainDance(), addHail(), addWhirlpool(), addFacade(),
                addHelpingHand(), addBrickBreak(), addDive(), addWeatherBall(), addRockTomb(), addBrine(), addFling(),
                addRound(), addFalseSwipe(), addBodySlam(), addHydroPump(), addSurf(), addIceBeam(), addBlizzard(),
                addWaterfall(), addSubstitute(), addEndure(), addSleepTalk(), addIronTail(), addMuddyWater(),
                addIronDefense(), addGyroBall(), addAuraSphere(), addDragonPulse(), addZenHeadbutt(),
                addFlashCannon(), addScald(), addWorkUp(), addLiquidation(), addBodyPress());
        setBaseStats(100, 83, 79, 85, 105, 78, 9, 45,
                188.5, "Water", "Medium Slow", level, 142);
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addFlashCannon()), new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addWaterGun()),
                new CreateOrderedMap<>(0, addWithdraw()), new CreateOrderedMap<>(9, addRapidSpin()),
                new CreateOrderedMap<>(12, addBite()), new CreateOrderedMap<>(15, addWaterPulse()),
                new CreateOrderedMap<>(20, addProtect()), new CreateOrderedMap<>(25, addRainDance()),
                new CreateOrderedMap<>(30, addAquaTail()), new CreateOrderedMap<>(35, addShellSmash()),
                new CreateOrderedMap<>(42, addIronDefense()), new CreateOrderedMap<>(49, addHydroPump()),
                new CreateOrderedMap<>(56, addShellSmash()));
        this.pokedexType = this.getClass().getSimpleName();
        this.setPokeBallType("009Cry_1.wav");
        this.EvolTiming = 36;
    }

    public Blastoise(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Wartortle")){
            this.name = "Blastoise";
        }
        if (!(name.equals("Wartortle"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Blastoise.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Blastoise(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Blastoise";
        this.possibleAbilities.add(new Torrent());
        this.possibleAbilities.add(new RainDish());
        getAbilities();
        changeBaseStats();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        Collections.addAll(this.EVs, 0, 0, 0, 0, 0, 0);
        setFullDirName("Blastoise.png", globalVariables);
    }
}
