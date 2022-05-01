package Pokedex.F;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Moveset.SelfChange.Agility;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.F.Frisk;
import PokemonCreation.AllAbilities.K.KeenEyes;
import PokemonCreation.AllAbilities.R.RunAway;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Furret extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(0, 0, 0, 0, 2, 0);
        setBaseStats(64, 76, 85, 45, 55,
                60, 162, 90, 71.6,
                "Normal", "Medium Fast", level, 116);
        this.OnEvol = new Agility();
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addFocusPunch(), addWaterPulse(), addWorkUp(),
                addSunnyDay(), addIceBeam(), addBlizzard(), addHyperBeam(), addProtect(),
                addRainDance(), addSolarBeam(), addIronTail(), addThunderbolt(), addThunder(),
                addDig(), addShadowBall(), addBrickBreak(), addDoubleTeam(), addShockWave(),
                addFlamethrower(), addFacade(), addRest(), addAttract(), addThief(), addFocusBlast(),
                addFling(), addChargeBeam(), addEndure(), addShadowClaw(), addGigaImpact(),
                addSleepTalk(), addGrassKnot(), addSwagger(), addUTurn(), addSubstitute(), addCut(),
                addSurf(), addStrength(), addRockSmash());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addScratch()),
                new CreateOrderedMap<>(0, addGrowl()), new CreateOrderedMap<>(0, addAgility()),
                new CreateOrderedMap<>(0, addDefenseCurl()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(0, addCoil()), new CreateOrderedMap<>(4, addDefenseCurl()),
                new CreateOrderedMap<>(7, addQuickAttack()), new CreateOrderedMap<>(13, addFurySwipes()),
                new CreateOrderedMap<>(17, addHelpingHand()), new CreateOrderedMap<>(21, addFollowMe()),
                new CreateOrderedMap<>(28, addSlam()), new CreateOrderedMap<>(32, addRest()),
                new CreateOrderedMap<>(36, addSuckerPunch()), new CreateOrderedMap<>(42, addAmnesia()),
                new CreateOrderedMap<>(46, addBatonPass()), new CreateOrderedMap<>(50, addReversal()),
                new CreateOrderedMap<>(56, addHyperVoice()));
        this.setPokeCry("162Cry.wav");
    }

    public Furret(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                  double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
            Initialize(level);
            this.Gender = Gender;
            this.IV = oldIVs;
            this.nature = Nature;
            if (name.equals("Sentret")){
                this.name = "Furret";
            }
            if (!(name.equals("Sentret"))){
                this.name = name;
            }
            this.moves = oldMoves;
            this.EVs = OldEVs;
            this.ability = ability;
            changeBaseStats();
            this.HP = (int) Math.round(savedHP * HPmissing);
            this.savedAbility = ability;
            setFullDirNameEvolution(isShiny, "Furret.png");
            this.savedItem = items;
            this.item = this.savedItem;
        }

    public Furret(int level, GlobalVariables globalVariables) {
            Initialize(level);
            addFirstMoves();
            setNature();
            setIVs();
            setTotalEXP();
            setNextLevelEXP();
            setEXPNeeded();
            this.name = this.pokedexType;
            Collections.addAll(this.possibleAbilities,
                    new RunAway(), new KeenEyes(), new Frisk());
            getAbilities();
            this.savedAbility = this.ability;
            changeBaseStats();
            this.HP = this.savedHP;
            setFullDirName("Furret.png", globalVariables);
        }
}
