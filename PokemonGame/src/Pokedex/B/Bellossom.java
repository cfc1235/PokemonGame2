package Pokedex.B;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.HeldItem.AbsorbBulb;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.Chlorophyll;
import PokemonCreation.AllAbilities.Healer;
import PokemonCreation.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class Bellossom extends Pokemon {
    public void Initialize(int level){
        setGivesEVs(0, 0, 3, 0, 0, 0);
        setBaseStats(95, 80, 75, 90, 100,
                50, 182, 45, 12.8,
                "Grass", "Medium Slow", level, 221);
        this.type2 = "Poison";
        this.pokedexType = this.getClass().getSimpleName();
        Collections.addAll(this.TMmoves, addHyperBeam(), addGigaImpact(), addMagicalLeaf(),
                addSolarBeam(), addSafegaurd(), addRest(), addSnore(), addProtect(),
                addGigaDrain(), addCharm(), addAttract(), addSunnyDay(), addFacade(),
                addHelpingHand(), addBulletSeed(), addFling(), addDrainPunch(), addVenoshock(),
                addRound(), addGrassyTerrain(), addSwordsDance(), addSubstitute(), addEndure(),
                addSleepTalk(), addBatonPass(), addLeafBlade(), addSeedBomb(), addEnergyBall(),
                addLeafStorm(), addGrassKnot(), addPlayRough(), addDazzlingGleam(), addPollenPuff(),
                addToxic(), addSolarBeam(), addDoubleTeam(), addSludgeBomb(), addFlash(),
                addSwagger(), addCut());
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addPetalBlizzard()),
                new CreateOrderedMap<>(0, addQuiverDance()), new CreateOrderedMap<>(0, addMegaDrain()),
                new CreateOrderedMap<>(0, addPoisonPowder()), new CreateOrderedMap<>(0, addStunSpore()),
                new CreateOrderedMap<>(0, addSleepPowder()), new CreateOrderedMap<>(0, addGigaDrain()),
                new CreateOrderedMap<>(0, addToxic()), new CreateOrderedMap<>(0, addMoonblast()),
                new CreateOrderedMap<>(0, addGrassyTerrain()), new CreateOrderedMap<>(0, addMoonlight()),
                new CreateOrderedMap<>(0, addPetalDance()), new CreateOrderedMap<>(0, addAbsorb()),
                new CreateOrderedMap<>(0, addGrowth()), new CreateOrderedMap<>(0, addAcid()),
                new CreateOrderedMap<>(0, addSweetScent()));
        this.setPokeCry("182Cry.wav");
        this.OnEvol = addPetalBlizzard();
    }

    public Bellossom(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                     double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Gloom")){
            this.name = "Bellossom";
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
        setFullDirNameEvolution(isShiny, "Bellossom.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Bellossom(int level, GlobalVariables globalVariables) {
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        Collections.addAll(this.possibleAbilities, new Chlorophyll(), new Healer());
        getAbilities();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Bellossom.png", globalVariables);
        this.possibleWildItems.add(new CreateOrderedMap<>(5, new AbsorbBulb()));
        getWildItem();
    }
}
