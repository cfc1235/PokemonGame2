package Pokedex.AlolanForm;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.O.Oblivious;
import PokemonCreation.AllAbilities.O.OwnTempo;
import PokemonCreation.AllAbilities.R.Regenerator;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class AlolanSlowking extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 2, 0, 0, 0);
        setBaseStats(110, 75, 95, 100, 80,
                30 ,199, 70, 175.3, "Poison",
                "Medium Fast", level, 164);
        this.type2 = "Psychic";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addPayDay(), addIcePunch(), addHyperBeam(), addGigaImpact(),
                addThunderWave(), addDig(), addLightScreen(), addSafegaurd(),
                addRest(), addSnore(), addProtect(), addIcyWind(), addAttract(),
                addRainDance(), addSunnyDay(), addHail(), addWhirlpool(),
                addFacade(), addSwift(), addBrickBreak(), addImprison(), addDive(),
                addWeatherBall(), addMudShot(), addBrine(), addFling(),
                addDrainPunch(), addAvalanche(), addTrickRoom(), addWonderRoom(),
                addVenoshock(), addRound(), addBulldoze(), addRazorShell(),
                addPsychicTerrain(), addBrutalSwing(), addBodySlam(),
                addFlamethrower(), addHydroPump(), addSurf(), addIceBeam(),
                addBlizzard(), addEarthquake(), addPsychic(), addFireBlast(),
                addAmnesia(), addTriAttack(), addSubstitute(), addSludgeBomb(),
                addPsyshock(), addEndure(), addSleepTalk(), addIronTail(),
                addShadowBall(), addFutureSight(), addTrick(), addSkillSwap(),
                addMuddyWater(), addIronDefense(), addCalmMind(), addPoisonJab(),
                addFocusBlast(), addNastyPlot(), addZenHeadbutt(), addGrassKnot(),
                addFoulPlay(), addStoredPower(), addScald(), addLiquidation(),
                addBodyPress(), addFocusPunch(), addWaterPulse(), addDoubleTeam(),
                addAerialAce(), addRecycle(), addFlash(), addPsychUp(),
                addDreamEater(), addSwagger(), addHex());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addCurse()), new CreateOrderedMap<>(0, addGrowl()),
                new CreateOrderedMap<>(0, addAcid()), new CreateOrderedMap<>(0, addPowerGem()),
                new CreateOrderedMap<>(0, addNastyPlot()), new CreateOrderedMap<>(0, addSwagger()),
                new CreateOrderedMap<>(0, addEerieSpell()), new CreateOrderedMap<>(9, addYawn()),
                new CreateOrderedMap<>(12, addConfusion()), new CreateOrderedMap<>(15, addDisable()),
                new CreateOrderedMap<>(18, addWaterPulse()), new CreateOrderedMap<>(21, addHeadbutt()),
                new CreateOrderedMap<>(27, addAmnesia()), new CreateOrderedMap<>(30, addSurf()),
                new CreateOrderedMap<>(33, addSlackOff()), new CreateOrderedMap<>(36, addPsychic()),
                new CreateOrderedMap<>(39, addPsychUp()), new CreateOrderedMap<>(42, addRainDance()),
                new CreateOrderedMap<>(45, addHealPulse()));
        this.setPokeCry("199Cry.wav");
        this.isAlolan = true;
    }

    public AlolanSlowking(int level, List<Moves> oldMoves, String Nature,
                    String name, List<Integer> oldIVs, double HPmissing,
                    List<Integer> OldEVs, int Gender, Abilities ability,
                    Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Slowpoke")){
            this.name = "Slowking";
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
        setFullDirNameEvolution(isShiny, "AlolanSlowking.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public AlolanSlowking(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Oblivious(),
                new OwnTempo(), new Regenerator());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("AlolanSlowking.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getKingsRock()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
