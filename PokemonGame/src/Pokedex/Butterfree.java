package Pokedex;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.HeldItem.SilverPowder;
import Items.NoItem;
import Moveset.Gust;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.TintedLenses;
import PokemonCreation.AllAbilities.CompoundEyes;

import java.util.Collections;
import java.util.List;

public class Butterfree extends Pokemon {

    public void Initialize(int level){
        Collections.addAll(GivesEVs, 2, 0, 0, 1, 0, 0);
        setBaseStats(50, 45, 60, 90, 80, 70, 12, 45, 70.5,
                "Bug","Medium Fast", level, 198);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new Gust();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addGust()), new CreateOrderedMap<>(0, addHarden()),
                new CreateOrderedMap<>(0, addTackle()), new CreateOrderedMap<>(0, addStringShot()),
                new CreateOrderedMap<>(0, addBugBite()), new CreateOrderedMap<>(4, addSupersonic()),
                new CreateOrderedMap<>(8, addConfusion()), new CreateOrderedMap<>(12, addPoisonPowder()),
                new CreateOrderedMap<>(12, addSleepPowder()), new CreateOrderedMap<>(12, addStunSpore()),
                new CreateOrderedMap<>(16, addPsybeam()), new CreateOrderedMap<>(20, addWhirlwind()),
                new CreateOrderedMap<>(24, addAirSlash()), new CreateOrderedMap<>(28, addSafegaurd()),
                new CreateOrderedMap<>(32, addBugBuzz()), new CreateOrderedMap<>(36, addTailwind()),
                new CreateOrderedMap<>(40, addRagePowder()), new CreateOrderedMap<>(44, addQuiverDance()));
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addSolarBeam(), addSafegaurd(), addRest(), addThief(),
                addSnore(), addProtect(), addGigaDrain(), addAttract(), addRainDance(), addSunnyDay(), addFacade(), addSwift(),
                addUTurn(), addVenoshock(), addRound(), addAcrobatics(), addElectroweb(), addDrainingKiss(), addAirSlash(),
                addPsychic(), addSubstitute(), addEndure(), addSleepTalk(), addBatonPass(), addShadowBall(), addSkillSwap(),
                addIronDefense(), addBugBuzz(), addEnergyBall(), addHurricane(), addPollenPuff());
        this.setPokeCry("012Cry.wav");
    }

    public Butterfree(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Metapod")){
            this.name = "Butterfree";
        }
        if (!(name.equals("Metapod"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Butterfree.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Butterfree(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Butterfree";
        this.possibleAbilities.add(new TintedLenses());
        this.possibleAbilities.add(new CompoundEyes());
        getAbilities();
        changeBaseStats();
        this.HP = this.savedHP;
        this.savedAbility = this.ability;
        setFirstEVs();
        setFullDirName("Butterfree.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new SilverPowder()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
