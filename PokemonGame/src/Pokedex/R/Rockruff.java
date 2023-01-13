package Pokedex.R;

import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.O.OwnTempo;
import PokemonCreation.AllAbilities.S.Steadfast;
import PokemonCreation.AllAbilities.V.VitalSpirit;
import PokemonCreation.Pokemon;

import java.util.Collections;

public class Rockruff extends Pokemon {

    public Rockruff(int level, GlobalVariables globalVariables) {
        setFirstEVs();
        setNature();
        setIVs();
        Collections.addAll(this.possibleAbilities, new KeenEyes(), new OwnTempo(),
                new Steadfast(), new VitalSpirit());
        getAbilities();
        this.savedAbility = this.ability;
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(), addMudSlap(),
                addScaryFace(), addProtect(), addFireFang(), addThunderFang(),
                addThunderbolt(), addTrailblaze(), addFacade(), addBulldoze(),
                addSnarl(), addRockTomb(), addEndure(), addSandstorm(), addDig(),
                addZenHeadbutt(), addPsychicFangs(), addBodySlam(), addSleepTalk(),
                addStompingTantrum(), addRest(), addRockSlide(), addTaunt(),
                addSwordsDance(), addIronHead(), addSubstitute(), addIronDefense(),
                addCrunch(), addStealthRock(), addHyperVoice(), addPlayRough(),
                addHelpingHand(), addEarthPower(), addStoneEdge());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(4, addSandAttack()),
                new CreateOrderedMap<>(8, addDoubleTeam()), new CreateOrderedMap<>(12, addRockThrow()),
                new CreateOrderedMap<>(16, addHowl()), new CreateOrderedMap<>(20, addBite()),
                new CreateOrderedMap<>(24, addRockTomb()), new CreateOrderedMap<>(28, addRoar()),
                new CreateOrderedMap<>(32, addRockSlide()), new CreateOrderedMap<>(36, addCrunch()),
                new CreateOrderedMap<>(40, addScaryFace()), new CreateOrderedMap<>(44, addStealthRock()),
                new CreateOrderedMap<>(48, addStoneEdge()));
        addFirstMoves();
        pokedexType = this.getClass().getSimpleName();
        this.name = this.pokedexType;
        setGivesEVs(0, 1, 0, 0, 0, 0);
        setBaseStats(40, 65, 45, 30,
                40, 60, 744, 190, 20.3,
                "Rock", "Medium Fast", level, 51);
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Rockruff.png", globalVariables);
        this.EvolTiming = 25;
        this.setPokeCry("744Cry.wav");
    }
}
