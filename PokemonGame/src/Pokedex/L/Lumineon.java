package Pokedex.L;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.S.StormDrain;
import PokemonCreation.AllAbilities.S.SwiftSwim;
import PokemonCreation.AllAbilities.W.WaterVeil;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Lumineon extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 3, 0, 0, 0, 0);
        setBaseStats(76, 69, 69, 69,
                86, 91 ,457, 75, 52.9,
                "Water", "Erratic", level, 161);
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addTakeDown(), addCharm(),
                addAgility(), addProtect(), addWaterPulse(), addAcrobatics(),
                addPsybeam(), addConfuseRay(), addThief(), addChillingWater(),
                addFacade(), addSwift(), addIcyWind(), addAirCutter(), addEndure(),
                addRainDance(), addUTurn(), addAirSlash(), addSleepTalk(),
                addWaterfall(), addDazzlingGleam(), addRest(), addSubstitute(),
                addTailwind(), addEncore(), addSurf(), addHelpingHand(), addIceBeam(),
                addHydroPump(), addBlizzard(), addGigaImpact(), addHyperBeam());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPound()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(0, addSoak()),
                new CreateOrderedMap<>(0, addGust()), new CreateOrderedMap<>(13, addRainDance()),
                new CreateOrderedMap<>(22, addWaterPulse()), new CreateOrderedMap<>(26, addAttract()),
                new CreateOrderedMap<>(29, addSafegaurd()), new CreateOrderedMap<>(35, addAquaRing()),
                new CreateOrderedMap<>(42, addWhirlpool()), new CreateOrderedMap<>(48, addUTurn()),
                new CreateOrderedMap<>(53, addBounce()), new CreateOrderedMap<>(59, addTailwind()));
        this.setPokeCry("457Cry.wav");
    }
    public Lumineon(int level, List<Moves> oldMoves, String Nature,
                  String name, List<Integer> oldIVs, double HPmissing,
                  List<Integer> OldEVs, int Gender, Abilities ability,
                  Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Finneon")){
            this.name = "Lumineon";
        }
        if (!(name.equals("Finneon"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Lumineon.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Lumineon(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new StormDrain(),
                new SwiftSwim(), new WaterVeil());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Lumineon.png", globalVariables);
    }
}
