package Pokedex.D;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.EvolItems.DragonScale;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.M.MarvelScale;
import PokemonCreation.AllAbilities.S.ShedSkin;
import Items.Items;
import PokemonCreation.Pokemon;
import Items.NoItem;

import java.util.Collections;
import java.util.List;

public class Dragonair extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 2, 0, 0, 0, 0);
        setBaseStats(65, 84, 61, 70, 70,
                70, 148, 45, 36.4, "Dragon",
                "Slow", level, 147);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addWrap()), new CreateOrderedMap<>(0, addLeer()),
                new CreateOrderedMap<>(0, addTwister()), new CreateOrderedMap<>(0, addThunderWave()),
                new CreateOrderedMap<>(15, addDragonTail()), new CreateOrderedMap<>(20, addAgility()),
                new CreateOrderedMap<>(25, addSlam()), new CreateOrderedMap<>(35, addAquaTail()),
                new CreateOrderedMap<>(39, addDragonRush()), new CreateOrderedMap<>(46, addSafegaurd()),
                new CreateOrderedMap<>(53, addRainDance()), new CreateOrderedMap<>(60, addDragonDance()),
                new CreateOrderedMap<>(67, addOutrage()), new CreateOrderedMap<>(74, addHyperBeam()));
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addFireSpin(),
                addThunderWave(), addLightScreen(), addSafegaurd(), addRest(), addSnore(),
                addProtect(), addIcyWind(), addAttract(), addRainDance(), addSunnyDay(),
                addHail(), addWhirlpool(), addFacade(), addSwift(), addRound(), addBrutalSwing(),
                addBreakingSwing(), addBodySlam(), addFlamethrower(), addHydroPump(),
                addSurf(), addIceBeam(), addBlizzard(), addThunderbolt(), addThunder(),
                addAgility(), addFireBlast(), addWaterfall(), addSubstitute(), addOutrage(),
                addEndure(), addSleepTalk(), addIronTail(), addDragonDance(), addDragonPulse(),
                addWaterPulse(), addHail(), addLightScreen(), addDoubleTeam(), addShockWave(),
                addSwagger());
        this.EvolTiming = 55;
        this.setPokeCry("148Cry.wav");
    }
    public Dragonair(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Dragonite")){
            this.name = "Dragonair";
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
        setFullDirNameEvolution(isShiny, "Dragonair.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Dragonair(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.possibleAbilities.add(new ShedSkin());
        this.possibleAbilities.add(new MarvelScale());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Dragonair.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, new DragonScale()),
                new CreateOrderedMap<>(95, new NoItem()));
        getWildItem();
    }
}
