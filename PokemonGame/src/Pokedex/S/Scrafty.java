package Pokedex.S;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import Items.Apricorn.Apricorn;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import Moveset.SelfChange.Harden;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.I.Intimidate;
import PokemonCreation.AllAbilities.M.Moxxie;
import PokemonCreation.AllAbilities.S.ShedSkin;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Scrafty extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(1, 0, 1, 0, 0, 0);
        setBaseStats(115, 90, 65, 45, 115,
                58 ,560, 90, 66.1, "Dark",
                "Medium Fast", level, 171);
        this.type2 = "Fighting";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addFirePunch(),
                addIcePunch(), addThunderPunch(), addHyperBeam(), addGigaImpact(),
                addDig(), addRest(), addRockSlide(), addThief(), addSnore(), addProtect(),
                addScaryFace(), addAttract(), addRainDance(), addSunnyDay(), addBeatUp(),
                addFacade(), addRevenge(), addBrickBreak(), addFakeTears(), addRockTomb(),
                addPayback(), addAssurance(), addFling(), addDrainPunch(), addLowSweep(),
                addRound(), addRetaliate(), addSnarl(), addLowKick(), addAmnesia(),
                addSubstitute(), addSludgeBomb(), addOutrage(), addEndure(), addSleepTalk(),
                addIronTail(), addCrunch(), addTaunt(), addIronDefense(), addDragonClaw(),
                addBulkUp(), addDragonDance(), addCloseCombat(), addPoisonJab(), addDarkPulse(),
                addDragonPulse(), addFocusBlast(), addZenHeadbutt(), addIronHead(), addStoneEdge(),
                addGrassKnot(), addFoulPlay(), addWorkUp(), addThroatChop());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addLowKick()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addPayback()),
                new CreateOrderedMap<>(0, addHeadbutt()), new CreateOrderedMap<>(12, addSandAttack()),
                new CreateOrderedMap<>(16, addFacade()), new CreateOrderedMap<>(20, addProtect()),
                new CreateOrderedMap<>(24, addBeatUp()), new CreateOrderedMap<>(28, addScaryFace()),
                new CreateOrderedMap<>(32, addBrickBreak()), new CreateOrderedMap<>(36, addSwagger()),
                new CreateOrderedMap<>(42, addCrunch()), new CreateOrderedMap<>(48, addHighJumpKick()),
                new CreateOrderedMap<>(54, addFocusPunch()), new CreateOrderedMap<>(60, addHeadSmash()));
        this.setPokeCry("560Cry.wav");
    }

    public Scrafty(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Scraggy")){
            this.name = "Scrafty";
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
        setFullDirNameEvolution(isShiny, "Scrafty.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Scrafty(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Intimidate(),
                new Moxxie(), new ShedSkin());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Scrafty.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getShedShell()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
