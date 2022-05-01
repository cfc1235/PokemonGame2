package Pokedex.R;

import PokemonCreation.AllAbilities.G.Guts;
import PokemonCreation.AllAbilities.H.Hustle;
import PokemonCreation.AllAbilities.R.RunAway;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Rattata extends Pokemon {

    public Rattata(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new RunAway(), new Guts(), new Hustle());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addWorkUp(), addSunnyDay(), addTaunt(), addIceBeam(),
                addBlizzard(), addProtect(), addRainDance(), addIronTail(), addThunderbolt(),
                addThunder(), addDig(), addShadowBall(), addDoubleTeam(), addShockWave(),
                addSludgeBomb(), addFacade(), addRest(), addAttract(), addThief(), addChargeBeam(),
                addEndure(), addThunderWave(), addGrassKnot(), addSwagger(), addSleepTalk(),
                addSubstitute(), addPluck(), addCut(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(4, addQuickAttack()),
                new CreateOrderedMap<>(7, addFocusEnergy()), new CreateOrderedMap<>(10, addBite()),
                new CreateOrderedMap<>(13, addLaserFocus()), new CreateOrderedMap<>(16, addTakeDown()),
                new CreateOrderedMap<>(19, addAssurance()), new CreateOrderedMap<>(22, addCrunch()),
                new CreateOrderedMap<>(25, addSuckerPunch()), new CreateOrderedMap<>(28, addSuperFang()),
                new CreateOrderedMap<>(31, addDoubleEdge()), new CreateOrderedMap<>(34, addEndeavor()));
        addFirstMoves();
        pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 0, 0, 0, 1, 0);
        setBaseStats(35, 56, 30, 25, 35, 72, 19, 255, 7.7,
                "Normal", "Medium Fast", level, 51);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Rattata.png", globalVariables);
        this.EvolTiming = 20;
        this.setPokeCry("019_1Cry.wav");
    }
}
