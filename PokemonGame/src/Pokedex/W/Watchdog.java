package Pokedex.W;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.EnemyChange.ConfuseRay;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.A.Analytic;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Watchdog extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(69, 85, 60, 60, 69,
                77, 505, 255, 59.5, "Normal",
                "Medium Fast", level, 147);
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new ConfuseRay();
        Collections.addAll(this.TMmoves, addWorkUp(), addToxic(), addHiddenPower(),
                addSunnyDay(), addHyperBeam(), addLightScreen(), addProtect(),
                addRainDance(), addFrustration(), addThunderbolt(), addThunder(),
                addReturn(), addShadowBall(), addDoubleTeam(), addFlamethrower(),
                addFacade(), addRest(), addAttract(), addRound(), addFocusBlast(),
                addFling(), addGigaDrain(), addThunderWave(), addSwordsDance(),
                addPsychUp(), addDreamEater(), addGrassKnot(), addSwagger(),
                addSleepTalk(), addSubstitute(), addConfide());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addLowKick()), new CreateOrderedMap<>(0, addRototiller()),
                new CreateOrderedMap<>(0, addLeer()), new CreateOrderedMap<>(0, addBite()),
                new CreateOrderedMap<>(3, addLeer()), new CreateOrderedMap<>(6, addBite()),
                new CreateOrderedMap<>(8, addBide()), new CreateOrderedMap<>(11, addDetect()),
                new CreateOrderedMap<>(13, addSandAttack()), new CreateOrderedMap<>(16, addCrunch()),
                new CreateOrderedMap<>(18, addHypnosis()), new CreateOrderedMap<>(22, addSuperFang()),
                new CreateOrderedMap<>(25, addMeFirst()), new CreateOrderedMap<>(29, addFocusEnergy()),
                new CreateOrderedMap<>(32, addPsychUp()), new CreateOrderedMap<>(36, addHyperFang()),
                new CreateOrderedMap<>(39, addNastyPlot()), new CreateOrderedMap<>(43, addMeanLook()),
                new CreateOrderedMap<>(46, addBatonPass()), new CreateOrderedMap<>(50, addSlam()));
        this.setPokeCry("505Cry.wav");
    }

    public Watchdog(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new KeenEyes(),
                new RunAway(), new Analytic());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Watchdog.png", globalVariables);
    }

    public Watchdog(int level, List<Moves> oldMoves, String Nature,
                      String name, List<Integer> oldIVs, double HPmissing,
                      List<Integer> OldEVs, int Gender, Abilities ability,
                      Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Patrat")){
            this.name = "Watchdog";
        }
        if (!(name.equals("Watchdog"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Watchdog.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }
}
