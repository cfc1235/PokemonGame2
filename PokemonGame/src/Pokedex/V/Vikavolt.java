package Pokedex.V;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import Items.Items;
import Moveset.Electric.Thunderbolt;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.B.Battery;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Vikavolt extends Pokemon {
    public void Initialize(int level){
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addFly(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addThunderWave(), addDig(),
                addScreech(), addLightScreen(), addRest(), addSnore(),
                addProtect(), addAttract(), addRainDance(), addFacade(),
                addMudShot(), addRound(), addAcrobatics(), addVoltSwitch(),
                addElectroweb(), addEerieImpulse(), addAirSlash(), addThunderbolt(),
                addThunderbolt(), addThunder(), addAgility(), addSubstitute(),
                addEndure(), addSleepTalk(), addCrunch(), addIronDefense(),
                addPoisonJab(), addXScissor(), addBugBuzz(), addEnergyBall(),
                addFlashCannon(), addElectroBall(), addWildCharge());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addThunderbolt()),
                new CreateOrderedMap<>(0, addCharge()),new CreateOrderedMap<>(0, addXScissor()),
                new CreateOrderedMap<>(0, addCrunch()), new CreateOrderedMap<>(0, addDig()),
                new CreateOrderedMap<>(0, addIronDefense()), new CreateOrderedMap<>(0, addDischarge()),
                new CreateOrderedMap<>(0, addViseGrip()), new CreateOrderedMap<>(0, addMudSlap()),
                new CreateOrderedMap<>(0, addStringShot()), new CreateOrderedMap<>(0, addBugBite()),
                new CreateOrderedMap<>(15, addBite()), new CreateOrderedMap<>(23, addSpark()),
                new CreateOrderedMap<>(29, addStickyWeb()), new CreateOrderedMap<>(36, addBugBuzz()),
                new CreateOrderedMap<>(43, addGuillotine()), new CreateOrderedMap<>(50, addFly()),
                new CreateOrderedMap<>(57, addAgility()), new CreateOrderedMap<>(64, addZapCannon()));
        setGivesEVs(0, 0, 0, 3, 0, 0);
        setBaseStats(90, 70, 77, 145,
                75, 43, 737, 45,
                99.2, "Bug", "Medium Fast",
                level, 140);
        this.type2 = "Electric";
        this.setPokeCry("738Cry.wav");
        this.OnEvol = new Thunderbolt();
    }

    public Vikavolt(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setFirstEVs();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.levitates = true;
        this.name = this.pokedexType;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Vikavolt.png", globalVariables);
    }

    public Vikavolt(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs, double HPmissing,
                     List<Integer> OldEVs, int Gender, Abilities ability,
                     Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        IV = oldIVs;
        nature = Nature;
        if (name.equals("Charjabub")){
            this.name = "Vikavolt";
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
        setFullDirNameEvolution(isShiny, "Vikavolt.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
