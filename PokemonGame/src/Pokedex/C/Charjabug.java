package Pokedex.C;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import Moveset.SelfChange.Charge;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.B.Battery;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Charjabug extends Pokemon {

    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addThunderWave(), addDig(),
                addScreech(), addLightScreen(), addRest(), addSnore(),
                addProtect(), addAttract(), addRainDance(), addFacade(),
                addMudShot(), addRound(), addAcrobatics(), addVoltSwitch(),
                addElectroweb(), addEerieImpulse(), addThunderbolt(),
                addSubstitute(), addEndure(), addSleepTalk(), addCrunch(),
                addIronDefense(), addPoisonJab(), addXScissor(), addElectroBall(),
                addWildCharge());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addCharge()),
                new CreateOrderedMap<>(0, addViseGrip()), new CreateOrderedMap<>(0, addMudSlap()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(0, addBugBite()),
                new CreateOrderedMap<>(15, addBite()), new CreateOrderedMap<>(23, addSpark()),
                new CreateOrderedMap<>(29, addStickyWeb()), new CreateOrderedMap<>(36, addXScissor()),
                new CreateOrderedMap<>(43, addCrunch()), new CreateOrderedMap<>(50, addDig()),
                new CreateOrderedMap<>(57, addIronDefense()), new CreateOrderedMap<>(64, addDischarge()));
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(95, 82, 57, 55,
                75, 36, 737, 120,
                23.1, "Bug", "Medium Fast",
                level, 140);
        this.type2 = "Electric";
        this.setPokeCry("737Cry.wav");
        this.OnEvol = new Charge();
        Collections.addAll(this.itemEvolReqs, "Thunderstone");
    }

    public Charjabug(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.ability = new Battery();
        this.savedAbility = this.ability;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Charjabug.png", globalVariables);
        Collections.addAll(this.possibleWildItems,
                new CreateOrderedMap<>(95, GetItem.getNoItem()),
                new CreateOrderedMap<>(5, GetItem.getCellBattery()));
        getWildItem();
    }

    public Charjabug(int level, List<Moves> oldMoves, String Nature,
                   String name, List<Integer> oldIVs, double HPmissing,
                   List<Integer> OldEVs, int Gender, Abilities ability,
                   Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
        if (name.equals("Grubbin")){
            this.name = "Charjabug";
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
        setFullDirNameEvolution(isShiny, "Charjabug.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
