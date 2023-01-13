package Pokedex.GalarianForm;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import Moveset.SelfChange.IronDefense;
import PokemonCreation.Abilities;

import PokemonCreation.AllAbilities.S.Scrappy;
import PokemonCreation.AllAbilities.S.Steadfast;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Sirfetchd extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(95, 135, 62, 68,
                82, 65 ,865, 45, 257.9,
                "Fighting", "Medium Fast", level, 177);
        this.OnEvol = new IronDefense();
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addSolarBlade(), addRest(),
                addSnore(), addProtect(), addSteelWing(), addAttract(),
                addSunnyDay(), addFacade(), addHelpingHand(), addRevenge(),
                addBrickBreak(), addAssurance(), addRound(), addRetaliate(),
                addBrutalSwing(), addSwordsDance(), addBodySlam(), addFocusEnergy(),
                addSubstitute(), addEndure(), addSleepTalk(), addSuperpower(),
                addIronDefense(), addLeafBlade(), addCloseCombat(), addPoisonJab(),
                addBraveBird(), addWorkUp(), addThroatChop());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPeck()),
                new CreateOrderedMap<>(0, addSandAttack()), new CreateOrderedMap<>(0, addLeer()),
                new CreateOrderedMap<>(0, addFuryCutter()), new CreateOrderedMap<>(0, addIronDefense()),
                new CreateOrderedMap<>(0, addFirstImpression()), new CreateOrderedMap<>(15, addRockSmash()),
                new CreateOrderedMap<>(20, addBrutalSwing()), new CreateOrderedMap<>(25, addDetect()),
                new CreateOrderedMap<>(30, addKnockOff()), new CreateOrderedMap<>(35, addDefog()),
                new CreateOrderedMap<>(40, addBrickBreak()), new CreateOrderedMap<>(45, addSwordsDance()),
                new CreateOrderedMap<>(50, addSlam()), new CreateOrderedMap<>(55, addLeafBlade()),
                new CreateOrderedMap<>(60, addFinalGambit()), new CreateOrderedMap<>(65, addBraveBird()),
                new CreateOrderedMap<>(70, addMeteorAssault()));
        this.setPokeCry("902Cry.wav");
        this.isGalarian = true;
    }
    public Sirfetchd(int level, List<Moves> oldMoves, String Nature,
                       String name, List<Integer> oldIVs, double HPmissing,
                       List<Integer> OldEVs, int Gender, Abilities ability,
                       Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Farfetch'd")){
            this.name = "Sirfetch'd";
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
        setFullDirNameEvolution(isShiny, "Sirfetchd.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Sirfetchd(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Steadfast(), new Scrappy());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Sirfetchd.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getLeek()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
