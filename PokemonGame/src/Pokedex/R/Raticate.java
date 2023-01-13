package Pokedex.R;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.EnemyChange.ScaryFace;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.G.Guts;
import PokemonCreation.AllAbilities.H.Hustle;
import PokemonCreation.AllAbilities.R.RunAway;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Raticate extends Pokemon {

    private void Initialize(int level){
        this.setGivesEVs(0, 0 ,0, 0, 2, 0);
        this.OnEvol = new ScaryFace();
        this.setBaseStats(60, 81, 55, 50, 70,
                97, 20, 147, 40.8, "Normal",
                "Medium Fast", level, 145);
        Collections.addAll(this.TMmoves, addRoar(), addWorkUp(), addSunnyDay(), addTaunt(),
                addIceBeam(), addBlizzard(), addHyperBeam(), addProtect(), addRainDance(),
                addIronTail(), addThunderbolt(), addThunder(), addDig(), addShadowBall(),
                addDoubleTeam(), addShockWave(), addSludgeBomb(), addFacade(), addRest(),
                addAttract(), addThief(), addChargeBeam(), addEndure(), addGigaImpact(),
                addThunderWave(), addSwordsDance(), addGrassKnot(), addSwagger(),
                addSleepTalk(), addSubstitute(), addPluck(), addCut(), addStrength(),
                addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(0, addFocusEnergy()), new CreateOrderedMap<>(0, addScaryFace()),
                new CreateOrderedMap<>(0, addSwordsDance()), new CreateOrderedMap<>(4, addQuickAttack()),
                new CreateOrderedMap<>(7, addFocusEnergy()), new CreateOrderedMap<>(10, addBite()),
                new CreateOrderedMap<>(13, addLaserFocus()), new CreateOrderedMap<>(16, addTakeDown()),
                new CreateOrderedMap<>(19, addAssurance()), new CreateOrderedMap<>(24, addCrunch()),
                new CreateOrderedMap<>(29, addSuckerPunch()), new CreateOrderedMap<>(34, addSuperFang()),
                new CreateOrderedMap<>(39, addDoubleEdge()), new CreateOrderedMap<>(44, addEndeavor()));
        this.pokedexType = this.getClass().getSimpleName();
        this.setPokeCry("20Cry_1.wav");
    }

    public Raticate(int level, List<Moves> oldMoves, String Nature,
                    String name, List<Integer> oldIVs, double HPmissing,
                    List<Integer> OldEVs, int Gender, Abilities ability,
                    Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        changeBaseStats();
        if (name.equals("Rattata")){
            this.name = "Raticate";
        }
       else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.ability = ability;
        this.EVs = OldEVs;
        this.HP = (int) Math.round(savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Raticate.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Raticate(int level, GlobalVariables globalVariables){
        Initialize(level);
        setFirstEVs();
        addFirstMoves();
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Raticate";
        Collections.addAll(this.possibleAbilities, new RunAway(), new Guts(), new Hustle());
        getAbilities();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        setFullDirName("Raticate.png", globalVariables);
    }
}
