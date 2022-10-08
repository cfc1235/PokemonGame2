package Pokedex.P;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.OranBerry;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SmallEXPCandy;
import Items.Consumable.SpoiledApricorn;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.L.LightningRod;
import PokemonCreation.AllAbilities.S.Static;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pikachu extends Pokemon {

    private String dirName;

    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addPayDay(),
                addThunderPunch(), addThunderWave(), addDig(), addLightScreen(),
                addReflect(), addRest(), addThief(), addSnore(), addProtect(),
                addCharm(), addAttract(), addRainDance(), addFacade(), addSwift(),
                addHelpingHand(), addBrickBreak(), addFling(), addRound(), addVoltSwitch(),
                addElectroweb(), addDrainingKiss(), addElectricTerrain(), addBodySlam(),
                addSurf(), addThunderbolt(), addThunder(), addAgility(), addSubstitute(),
                addReversal(), addEndure(), addSleepTalk(), addEncore(), addIronTail(),
                addUproar(),addNastyPlot(), addGrassKnot(), addElectroBall(), addWildCharge(),
                addPlayRough(), addFocusPunch(), addDoubleTeam(), addShockWave(), addChargeBeam(),
                addFlash(), addSwagger(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addThunderShock()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addPlayNice()),
                new CreateOrderedMap<>(0, addSweetKiss()), new CreateOrderedMap<>(0, addNuzzle()),
                new CreateOrderedMap<>(0, addNastyPlot()), new CreateOrderedMap<>(0, addCharm()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(4, addThunderWave()), new CreateOrderedMap<>(8, addDoubleTeam()),
                new CreateOrderedMap<>(12, addElectroBall()), new CreateOrderedMap<>(16, addFeint()),
                new CreateOrderedMap<>(20, addSpark()), new CreateOrderedMap<>(24, addAgility()),
                new CreateOrderedMap<>(28, addSlam()), new CreateOrderedMap<>(32, addDischarge()),
                new CreateOrderedMap<>(36, addThunderbolt()), new CreateOrderedMap<>(40, addLightScreen()),
                new CreateOrderedMap<>(44, addThunder()));
        setGivesEVs(0, 0, 0, 0, 2, 0);
        setBaseStats(40, 55, 35, 50,
                50, 90, 25, 190,
                13.2, "Pikachu", "Medium Fast",
                level, 112);
        this.setPokeCry("025Cry.wav");
        Collections.addAll(this.itemEvolReqs, "Thunderstone");
        if(this.Gender == 1){
            this.dirName = "PikachuFemale.png";
        }
        else {
            this.dirName = "PikachuMale.png";
        }
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(35, new OranBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()),
                new CreateOrderedMap<>(100, new SmallEXPCandy()),
                new CreateOrderedMap<>(10, new SeedOfMastery()));
        getWildItem();
    }

    public Pikachu(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        Collections.addAll(this.possibleAbilities, new Static(), new LightningRod());
        getAbilities();
        this.savedAbility = this.ability;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName(this.dirName, globalVariables);
        Random random = new Random();
        if(random.nextDouble() > .75){
            this.isAlolan = true;
        }
    }

    public Pikachu(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items, Boolean isAlolan){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
        if (name.equals("Pichu")){
            this.name = "Pikachu";
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
        setFullDirNameEvolution(isShiny, this.dirName);
        this.savedItem = items;
        this.item = this.savedItem;
        this.isAlolan = isAlolan;
    }
}
