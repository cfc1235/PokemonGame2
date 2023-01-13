package Pokedex.W;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.R.RainDish;
import PokemonCreation.AllAbilities.T.Torrent;

import java.util.Collections;
import java.util.List;

public class Wartortle extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(1, 0, 0, 1, 0, 0);
        setBaseStats(80, 63, 59, 65, 80,
                58, 8, 45, 49.6, "Water",
                "Medium Slow", level, 142);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addIcePunch(), addDig(), addRest(), addSnore(), addProtect(),
                addIcyWind(), addAttract(), addRainDance(), addHail(), addWhirlpool(), addFacade(), addHelpingHand(),
                addBrickBreak(), addDive(), addWeatherBall(), addRockTomb(), addBrine(), addFling(), addRound(),
                addFalseSwipe(), addBodySlam(), addHydroPump(), addSurf(), addIceBeam(), addBlizzard(), addWaterfall(),
                addSubstitute(), addEndure(), addSleepTalk(), addIronTail(), addMuddyWater(), addIronDefense(), addGyroBall(),
                addAuraSphere(), addDragonPulse(), addZenHeadbutt(), addScald(), addWorkUp());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addWaterGun()),
                new CreateOrderedMap<>(0, addWithdraw()), new CreateOrderedMap<>(9, addRapidSpin()),
                new CreateOrderedMap<>(12, addBite()), new CreateOrderedMap<>(15, addWaterPulse()),
                new CreateOrderedMap<>(20, addProtect()), new CreateOrderedMap<>(25, addRainDance()),
                new CreateOrderedMap<>(30, addAquaTail()), new CreateOrderedMap<>(35, addShellSmash()),
                new CreateOrderedMap<>(40, addIronDefense()), new CreateOrderedMap<>(45, addHydroPump()),
                new CreateOrderedMap<>(50, addSkullBash()));
        this.EvolTiming = 36;
        this.setPokeCry("008Cry.wav");
    }

    public Wartortle(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.getClass().getSimpleName();
        this.possibleAbilities.add(new Torrent());
        this.possibleAbilities.add(new RainDish());
        getAbilities();
        changeBaseStats();
        this.HP = this.savedHP;
        this.savedAbility = this.ability;
        setFullDirName("Wartortle.png", globalVariables);
    }
    public Wartortle(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Squirtle")){
            this.name = "Wartortle";
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
        setFullDirNameEvolution(isShiny, "Wartortle.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
