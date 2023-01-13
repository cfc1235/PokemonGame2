package Pokedex.M;


import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Items.Items;
import Moveset.SelfChange.Harden;
import PokemonCreation.*;
import PokemonCreation.AllAbilities.S.ShedSkin;

import java.util.List;

public class Metapod extends Pokemon {

    public void Initialize(int level){
        setGivesEVs(2, 0, 0, 0, 0, 0);
        setBaseStats(55, 20, 50, 25,
                25, 30 ,11, 120, 21.8,
                "Bug", "Medium Fast", level, 72);
        this.pokedexType = this.getClass().getSimpleName();
        this.TMmoves.add(addElectroweb());
        this.OnEvol = new Harden();
        this.learnedMoves.add(new CreateOrderedMap<>(0, addHarden()));
        this.EvolTiming = 10;
        this.setPokeCry("011Cry.wav");
    }
    public Metapod(int level, List<Moves> oldMoves, String Nature, String name, List<Integer> oldIVs,
                   double HPmissing, List<Integer> OldEVs, int Gender, Abilities ability, Boolean isShiny, Items items){
        Initialize(level);
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        if (name.equals("Caterpie")){
            this.name = "Metapod";
        }
        if (!(name.equals("Caterpie"))){
            this.name = name;
        }
        this.moves = oldMoves;
        this.EVs = OldEVs;
        this.ability = ability;
        changeBaseStats();
        this.HP = (int) Math.round(this.savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Metapod.png");
        this.savedItem = items;
        this.item = this.savedItem;
    }

    public Metapod(int level, GlobalVariables globalVariables){
        Initialize(level);
        addFirstMoves();
        setNature();
        setIVs();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = this.pokedexType;
        this.ability = new ShedSkin();
        this.savedAbility = this.ability;
        changeBaseStats();
        this.HP = this.savedHP;
        setFullDirName("Metapod.png", globalVariables);
    }
}
