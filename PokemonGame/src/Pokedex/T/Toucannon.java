package Pokedex.T;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.S.SheerForce;
import PokemonCreation.AllAbilities.S.SkillLink;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Toucannon extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(75, 120, 80, 75,
                75, 60 ,733, 45, 57.3,
                "Normal", "Medium Fast", level, 218);
        this.type2 = "Flying";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(),
                addHiddenPower(), addSunnyDay(), addProtect(), addRoost(),
                addFrustration(), addSmackDown(), addReturn(), addBrickBreak(),
                addDoubleTeam(), addAerialAce(), addFlameCharge(), addRest(),
                addAttract(), addThief(), addRound(), addEchoedVoice(),
                addOverheat(), addSteelWing(), addSwordsDance(), addFly(),
                addSwagger(), addSleepTalk(), addUTurn(), addSubstitute(),
                addFlashCannon(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addRockBlast()),
                new CreateOrderedMap<>(0, addPeck()), new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addEchoedVoice()), new CreateOrderedMap<>(0, addRockSmash()),
                new CreateOrderedMap<>(3, addGrowl()), new CreateOrderedMap<>(7, addEchoedVoice()),
                new CreateOrderedMap<>(9, addRockSmash()), new CreateOrderedMap<>(13, addSupersonic()),
                new CreateOrderedMap<>(16, addPluck()), new CreateOrderedMap<>(21, addRoost()),
                new CreateOrderedMap<>(24, addFuryAttack()), new CreateOrderedMap<>(30, addScreech()),
                new CreateOrderedMap<>(34, addDrillPeck()), new CreateOrderedMap<>(40, addBulletSeed()),
                new CreateOrderedMap<>(44, addFeatherDance()), new CreateOrderedMap<>(50, addHyperVoice()));
        this.setPokeCry("733Cry.wav");
    }
    public Toucannon(int level, List<Moves> oldMoves, String Nature,
                    String name, List<Integer> oldIVs, double HPmissing,
                    List<Integer> OldEVs, int Gender, Abilities ability,
                    Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Trumbeak")){
            this.name = "Toucannon";
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
        setFullDirNameEvolution(isShiny, "Toucannon.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Toucannon(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new KeenEyes(),
                new SheerForce(), new SkillLink());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Toucannon.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(95, GetItem.getNoItem()),
                new CreateOrderedMap<>(5, GetItem.getRawstBerry()));
        getWildItem();
    }
}
