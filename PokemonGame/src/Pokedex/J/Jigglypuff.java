package Pokedex.J;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GetItem;
import Interfaces.GlobalVariables;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.C.Competitve;
import PokemonCreation.AllAbilities.C.CuteCharm;
import PokemonCreation.AllAbilities.F.FriendGuard;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Jigglypuff extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 2);
        setBaseStats(20, 45, 115, 25,
                25, 20 ,39, 170, 12.1,
                "Normal", "Fast", level, 95);
        this.type2 = "Fairy";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addSolarBeam(),
                addThunderWave(), addDig(), addScreech(), addLightScreen(),
                addReflect(), addSafegaurd(), addSelfDestruct(), addRest(),
                addSnore(), addProtect(), addIcyWind(), addCharm(),
                addAttract(), addRainDance(), addSunnyDay(), addFacade(),
                addHelpingHand(), addFakeTears(), addBounce(), addFling(),
                addDrainPunch(), addRound(), addRetaliate(), addDrainingKiss(),
                addMistyTerrain(), addBodySlam(), addFlamethrower(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addPsychic(),
                addFireBlast(), addTriAttack(), addSubstitute(), addEndure(),
                addSleepTalk(), addBatonPass(), addShadowBall(), addUproar(),
                addHyperVoice(), addGyroBall(), addStealthRock(), addGrassKnot(),
                addAllySwitch(), addWorkUp(), addWildCharge(), addPlayRough(),
                addDazzlingGleam(), addFocusPunch(), addWaterPulse(), addDoubleTeam(),
                addShockWave(), addChargeBeam(), addRecycle(), addFlash(),
                addThunderWave(), addPsychUp(), addDreamEater(), addSwagger(),
                addStrength());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSing()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(0, addSweetKiss()),
                new CreateOrderedMap<>(0, addDisarmingVoice()), new CreateOrderedMap<>(0, addDisable()),
                new CreateOrderedMap<>(0, addCharm()), new CreateOrderedMap<>(4, addEchoedVoice()),
                new CreateOrderedMap<>(8, addCovet()), new CreateOrderedMap<>(12, addStockpile()),
                new CreateOrderedMap<>(12, addSwallow()), new CreateOrderedMap<>(12, addSpitUp()),
                new CreateOrderedMap<>(16, addRound()), new CreateOrderedMap<>(20, addRest()),
                new CreateOrderedMap<>(24, addBodySlam()), new CreateOrderedMap<>(28, addCopycat()),
                new CreateOrderedMap<>(32, addGyroBall()), new CreateOrderedMap<>(36, addHyperVoice()),
                new CreateOrderedMap<>(40, addPlayRough()), new CreateOrderedMap<>(44, addDoubleEdge()));
        this.itemEvolReqs.add("Moon Stone");
        this.setPokeCry("039Cry.wav");
    }
    public Jigglypuff(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Igglybuff")){
            this.name = "Jigglypuff";
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
        setFullDirNameEvolution(isShiny, "Jigglypuff.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Jigglypuff(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new CuteCharm(),
                new Competitve(), new FriendGuard());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Jigglypuff.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getMoonStone()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
