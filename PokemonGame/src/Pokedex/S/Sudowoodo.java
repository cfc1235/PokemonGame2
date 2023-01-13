package Pokedex.S;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Normal.Slam;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.R.Rattled;
import PokemonCreation.AllAbilities.R.RockHead;
import PokemonCreation.AllAbilities.S.Sturdy;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Sudowoodo extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(115, 100, 70, 30,
                65, 30 ,185, 65, 83.8,
                "Rock", "Medium Fast", level, 144);
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Slam();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(),
                addIcePunch(), addThunderPunch(), addDig(), addSelfDestruct(), addRest(),
                addRockSlide(), addThief(), addSnore(), addProtect(), addAttract(),
                addSandstorm(), addSunnyDay(), addFacade(), addHelpingHand(),
                addBrickBreak(), addFakeTears(), addRockTomb(), addSandTomb(),
                addRockBlast(), addFling(), addRound(), addBulldoze(),
                addStompingTantrum(), addBodySlam(), addLowKick(), addEarthquake(),
                addSubstitute(), addEndure(), addSleepTalk(), addUproar(),
                addTaunt(), addIronDefense(), addCalmMind(), addEarthPower(),
                addStoneEdge(), addStealthRock(), addFoulPlay(), addBodyPress(),
                addFocusPunch(), addCalmMind(), addDoubleTeam(), addTorment(),
                addExplosion(), addRockPolish(), addPsychUp(), addRockSlide(),
                addSwagger(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSlam()),
                new CreateOrderedMap<>(0, addStoneEdge()), new CreateOrderedMap<>(0, addFlail()),
                new CreateOrderedMap<>(0, addRockThrow()), new CreateOrderedMap<>(0, addFakeTears()),
                new CreateOrderedMap<>(0, addCopycat()), new CreateOrderedMap<>(0, addHammerArm()),
                new CreateOrderedMap<>(0, addWoodHammer()), new CreateOrderedMap<>(12, addBlock()),
                new CreateOrderedMap<>(16, addMimic()), new CreateOrderedMap<>(20, addRockTomb()),
                new CreateOrderedMap<>(24, addTearfulLook()), new CreateOrderedMap<>(28, addSuckerPunch()),
                new CreateOrderedMap<>(32, addRockSlide()), new CreateOrderedMap<>(36, addLowKick()),
                new CreateOrderedMap<>(40, addCounter()), new CreateOrderedMap<>(44, addDoubleEdge()),
                new CreateOrderedMap<>(48, addHeadSmash()));
        this.setPokeCry("185Cry.wav");
    }
    public Sudowoodo(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Bonsly")){
            this.name = "Sudowoodo";
        }
        if (!(name.equals("Bonsly"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Sudowoodo.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Sudowoodo(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Rattled(),
                new Sturdy(), new RockHead());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Sudowoodo.png", globalVariables);
    }
}
