package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.OranBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.CuteCharm;
import PokemonCreation.AllAbilities.K.Klutz;
import PokemonCreation.AllAbilities.L.Limber;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Lopunny extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(84, 76, 65, 54,
                96, 105 ,428, 60, 73.4,
                "Normal", "Medium Fast", level, 168);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addFirePunch(), addIcePunch(), addThunderPunch(),
                addHyperBeam(), addGigaImpact(), addSolarBeam(),
                addThunderWave(), addDig(), addRest(), addSnore(),
                addProtect(), addCharm(), addAttract(), addRainDance(),
                addSunnyDay(), addFacade(), addSwift(), addHelpingHand(),
                addFakeTears(),addBounce(), addUTurn(), addPayback(),
                addAssurance(), addFling(), addDrainPunch(), addLowSweep(),
                addRound(), addAcrobatics(), addRetaliate(), addBrutalSwing(),
                addIceBeam(), addBlizzard(), addLowKick(), addThunderbolt(),
                addAgility(), addSubstitute(), addReversal(), addEndure(),
                addSleepTalk(), addBatonPass(), addEncore(), addIronTail(),
                addShadowBall(), addUproar(), addHyperVoice(), addCosmicPower(),
                addCloseCombat(), addAuraSphere(), addFocusBlast(), addGrassKnot(),
                addWorkUp(), addPlayRough(), addFocusPunch(), addWaterPulse(),
                addWorkUp(), addDoubleTeam(), addShockWave(), addChargeBeam(),
                addSwagger(), addCut(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(0, addSplash()), new CreateOrderedMap<>(0, addDefenseCurl()),
                new CreateOrderedMap<>(0, addBabyDollEyes()), new CreateOrderedMap<>(0, addMagicCoat()),
                new CreateOrderedMap<>(0, addMirrorCoat()), new CreateOrderedMap<>(16, addQuickAttack()),
                new CreateOrderedMap<>(20, addDoubleKick()), new CreateOrderedMap<>(24, addCharm()),
                new CreateOrderedMap<>(28, addBatonPass()), new CreateOrderedMap<>(32, addHeadbutt()),
                new CreateOrderedMap<>(36, addAgility()), new CreateOrderedMap<>(40, addEntrainment()),
                new CreateOrderedMap<>(44, addFlatter()), new CreateOrderedMap<>(48, addBounce()),
                new CreateOrderedMap<>(52, addHealingWish()), new CreateOrderedMap<>(56, addHighJumpKick()));
        this.setPokeCry("428Cry.wav");
    }
    public Lopunny(int level, List<Moves> oldMoves, String Nature,
                 String name, List<Integer> oldIVs, double HPmissing,
                 List<Integer> OldEVs, int Gender, Abilities ability,
                 Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Buneary")){
            this.name = "Lopunny";
        }
        else{
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Lopunny.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Lopunny(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new CuteCharm(), new Klutz(),
                new Limber());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Lopunny.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(35, new OranBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()), new CreateOrderedMap<>(10, new SeedOfMastery()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()));
        getWildItem();
    }
}
