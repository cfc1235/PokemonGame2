package Pokedex.M;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.Water.WaterPulse;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.Competitve;
import PokemonCreation.AllAbilities.C.CuteCharm;
import PokemonCreation.AllAbilities.M.MarvelScale;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Milotic extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 2, 0, 0, 0);
        setBaseStats(79, 60, 95, 100,
                125, 81, 350, 60,
                357.1, "Water", "Erratic", level,
                189);
        this.pokedexType = this.getClass().getSimpleName();
        this.OnEvol = new WaterPulse();
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addWaterPulse()), new CreateOrderedMap<>(0, addFlail()),
                new CreateOrderedMap<>(0, addSplash()), new CreateOrderedMap<>(0, addWrap()),
                new CreateOrderedMap<>(0, addWaterGun()), new CreateOrderedMap<>(4, addDisarmingVoice()),
                new CreateOrderedMap<>(8, addTwister()), new CreateOrderedMap<>(12, addAquaRing()),
                new CreateOrderedMap<>(16, addAttract()), new CreateOrderedMap<>(20, addLifeDew()),
                new CreateOrderedMap<>(24, addDragonTail()), new CreateOrderedMap<>(28, addRecover()),
                new CreateOrderedMap<>(32, addAquaTail()), new CreateOrderedMap<>(36, addSafegaurd()),
                new CreateOrderedMap<>(40, addSurf()), new CreateOrderedMap<>(44, addRainDance()),
                new CreateOrderedMap<>(48, addCoil()), new CreateOrderedMap<>(52, addHydroPump()));
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addLightScreen(),
                addSafegaurd(), addRest(), addSnore(), addProtect(), addIcyWind(),
                addAttract(), addRainDance(), addHail(), addWhirlpool(), addFacade(),
                addSwift(), addHelpingHand(), addImprison(), addDive(), addWeatherBall(),
                addMudShot(), addBrine(), addAvalanche(), addRound(), addBulldoze(),
                addBrutalSwing(), addBreakingSwing(), addBodySlam(), addHydroPump(),
                addSurf(), addIceBeam(), addBlizzard(), addWaterfall(), addSubstitute(),
                addEndure(), addSleepTalk(), addIronTail(), addMuddyWater(), addDragonDance(),
                addIronHead(), addScald(), addWaterPulse(), addDoubleTeam(), addDragonPulse(),
                addPsychUp(), addSwagger());
        this.setPokeCry("350Cry.wav");
    }

    public Milotic(int level, List<Moves> oldMoves, String Nature,
                     String name, List<Integer> oldIVs,
                     double HPmissing, List<Integer> OldEVs,
                     int Gender, Abilities ability, Boolean isShiny,
                     Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Feebas")){
            this.name = "Milotic";
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
        setFullDirNameEvolution(isShiny, "Milotic.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Milotic(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new MarvelScale(), new Competitve(),
                new CuteCharm());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Milotic.png", globalVariables);
    }
}
