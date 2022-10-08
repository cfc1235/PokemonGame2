package Pokedex.AlolanForm;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Berries.SitrusBerry;
import Items.Consumable.LargeEXPCandy;
import Items.Consumable.SeedOfMastery;
import Items.Consumable.SpoiledApricorn;
import Moveset.Psychic.PsychicMove;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.L.LightningRod;
import PokemonCreation.AllAbilities.S.Static;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class AlolanRaichu extends Pokemon {
    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new PsychicMove();
        this.type2 = "Psychic";
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(), addPayDay(),
                addThunderPunch(), addHyperBeam(), addGigaImpact(), addThunderWave(),
                addDig(), addLightScreen(), addReflect(), addSafegaurd(), addRest(),
                addThief(), addSnore(), addProtect(), addCharm(), addAttract(),
                addRainDance(), addFacade(), addSwift(), addHelpingHand(), addBrickBreak(),
                addFling(), addSpeedSwap(), addMagicRoom(), addRound(), addVoltSwitch(),
                addElectroweb(), addDrainingKiss(), addElectricTerrain(), addEerieImpulse(),
                addBrutalSwing(), addBodySlam(), addSurf(), addThunderbolt(), addThunder(),
                addAgility(), addSubstitute(), addReversal(), addEndure(), addSleepTalk(),
                addEncore(), addIronTail(), addUproar(), addFocusBlast(), addNastyPlot(),
                addGrassKnot(), addElectroBall(), addWildCharge(), addPlayRough(),
                addFocusPunch(), addDoubleTeam(), addShockWave(), addChargeBeam(),
                addFlash(), addSwagger(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPsychic()),
                new CreateOrderedMap<>(0, addPlayNice()), new CreateOrderedMap<>(0, addSweetKiss()),
                new CreateOrderedMap<>(0, addNuzzle()), new CreateOrderedMap<>(0, addNastyPlot()),
                new CreateOrderedMap<>(0, addCharm()), new CreateOrderedMap<>(0, addThunderWave()),
                new CreateOrderedMap<>(0, addDoubleTeam()), new CreateOrderedMap<>(0, addElectroBall()),
                new CreateOrderedMap<>(0, addFeint()), new CreateOrderedMap<>(0, addSpark()),
                new CreateOrderedMap<>(0, addAgility()), new CreateOrderedMap<>(0, addSlam()),
                new CreateOrderedMap<>(0, addDischarge()), new CreateOrderedMap<>(0, addThunderbolt()),
                new CreateOrderedMap<>(0, addLightScreen()), new CreateOrderedMap<>(0, addThunder()),
                new CreateOrderedMap<>(0, addThunderShock()), new CreateOrderedMap<>(0, addTailWhip()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addQuickAttack()));
        setGivesEVs(0, 0, 0, 0, 3, 0);
        setBaseStats(55, 90, 60, 90,
                80, 110, 26, 75,
                66.1, "Electric", "Medium Fast",
                level, 122);
        this.setPokeCry("026Cry.wav");
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(25, new SitrusBerry()),
                new CreateOrderedMap<>(15, new SpoiledApricorn()),
                new CreateOrderedMap<>(100, new LargeEXPCandy()),
                new CreateOrderedMap<>(40, new SeedOfMastery()));
        getWildItem();
    }

    public AlolanRaichu(int level, GlobalVariables globalVariables){
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
        this.name = "Raichu";
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("AlolanRaichu.png", globalVariables);
    }

    public AlolanRaichu(int level, List<Moves> oldMoves, String Nature,
                  String name, List<Integer> oldIVs, double HPmissing,
                  List<Integer> OldEVs, int Gender, Abilities ability,
                  Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
        if (name.equals("Pikachu")){
            this.name = "Raichu";
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
        setFullDirNameEvolution(isShiny, "AlolanRaichu.png");
        this.savedItem = items;
        this.item = this.savedItem;
        this.isAlolan = true;
    }
}
