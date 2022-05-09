package Pokedex.W;

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

public class Wigglytuff extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 0, 3);
        setBaseStats(45, 70, 140, 85,
                50, 45 ,40, 50, 26.5,
                "Normal", "Fast", level, 196);
        this.type2 = "Fairy";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addMegaPunch(), addMegaKick(),
                addFirePunch(), addIcePunch(), addThunderPunch(), addHyperBeam(),
                addGigaImpact(), addSolarBeam(), addThunderWave(), addDig(),
                addScreech(), addLightScreen(), addReflect(), addSafegaurd(),
                addSelfDestruct(), addRest(), addSnore(), addProtect(),
                addIcyWind(), addCharm(), addAttract(), addRainDance(),
                addSunnyDay(), addFacade(), addHelpingHand(), addBrickBreak(),
                addFakeTears(), addBounce(), addFling(), addDrainPunch(),
                addMagicRoom(), addRound(), addRetaliate(), addDrainingKiss(),
                addMistyTerrain(), addBodySlam(), addFlamethrower(), addIceBeam(),
                addBlizzard(), addThunderbolt(), addThunder(), addPsychic(),
                addFireBlast(), addTriAttack(), addSubstitute(), addEndure(),
                addSleepTalk(), addBatonPass(), addShadowBall(), addUproar(),
                addHyperVoice(), addGyroBall(), addFocusBlast(), addStealthRock(),
                addGrassKnot(), addAllySwitch(), addWorkUp(), addWildCharge(),
                addPlayRough(), addDazzlingGleam(), addFocusPunch(), addWaterPulse(),
                addDoubleTeam(), addShockWave(), addChargeBeam(), addRecycle(),
                addFlash(), addThunderWave(), addPsychUp(), addDreamEater(),
                addSwagger(), addStrength());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addSing()),
                new CreateOrderedMap<>(0, addPound()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(0, addSweetKiss()),
                new CreateOrderedMap<>(0, addDisarmingVoice()), new CreateOrderedMap<>(0, addDisable()),
                new CreateOrderedMap<>(0, addCharm()), new CreateOrderedMap<>(0, addEchoedVoice()),
                new CreateOrderedMap<>(0, addCovet()), new CreateOrderedMap<>(0, addStockpile()),
                new CreateOrderedMap<>(0, addSwallow()), new CreateOrderedMap<>(0, addSpitUp()),
                new CreateOrderedMap<>(0, addRound()), new CreateOrderedMap<>(0, addRest()),
                new CreateOrderedMap<>(0, addBodySlam()), new CreateOrderedMap<>(0, addCopycat()),
                new CreateOrderedMap<>(0, addGyroBall()), new CreateOrderedMap<>(0, addHyperVoice()),
                new CreateOrderedMap<>(0, addPlayRough()), new CreateOrderedMap<>(0, addDoubleEdge()),
                new CreateOrderedMap<>(0, addDefenseCurl()));
        this.setPokeCry("040Cry.wav");
    }
    public Wigglytuff(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                      double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Jigglypuff")){
            this.name = "Wigglytuff";
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
        setFullDirNameEvolution(isShiny, "Wigglytuff.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Wigglytuff(int level, GlobalVariables globalVariables){
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
        setFullDirName("Wigglytuff.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getMoonStone()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
