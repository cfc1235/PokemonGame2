package Pokedex.AlolanForm;

import BattleMechanics.Moves;
import Interfaces.CreateOrderedMap;
import Interfaces.GlobalVariables;
import Interfaces.GetItem;
import Moveset.EnemyChange.ScaryFace;
import PokemonCreation.Abilities;
import PokemonCreation.AllAbilities.G.Gluttony;
import PokemonCreation.AllAbilities.H.Hustle;
import PokemonCreation.AllAbilities.T.ThickFat;
import Items.Items;
import PokemonCreation.Pokemon;

import java.util.Collections;
import java.util.List;

public class AlolanRaticate extends Pokemon {

    private void Initialize(int level) {
        this.setGivesEVs(0, 0, 0, 0, 2, 0);
        this.OnEvol = new ScaryFace();
        this.setBaseStats(60, 81, 55, 50, 70,
                97, 20, 127, 40.8, "Normal",
                "Medium Fast", level, 145);
        Collections.addAll(this.learnedMoves, new CreateOrderedMap<>(0, addTackle()),
                new CreateOrderedMap<>(0, addScaryFace()), new CreateOrderedMap<>(0, addSwordsDance()),
                new CreateOrderedMap<>(0, addTailWhip()), new CreateOrderedMap<>(0, addQuickAttack()),
                new CreateOrderedMap<>(0, addFocusEnergy()),new CreateOrderedMap<>(4, addQuickAttack()),
                new CreateOrderedMap<>(7, addFocusEnergy()), new CreateOrderedMap<>(10, addBite()),
                new CreateOrderedMap<>(13, addPursuit()), new CreateOrderedMap<>(16, addHyperFang()),
                new CreateOrderedMap<>(19, addAssurance()), new CreateOrderedMap<>(24, addCrunch()),
                new CreateOrderedMap<>(29, addSuckerPunch()), new CreateOrderedMap<>(34, addSuperFang()),
                new CreateOrderedMap<>(39, addDoubleEdge()), new CreateOrderedMap<>(44, addEndeavor()));
        addFirstMoves();
        Collections.addAll(this.TMmoves, addWorkUp(), addRoar(), addToxic(), addBulkUp(),
                addVenoshock(), addHiddenPower(), addSunnyDay(), addTaunt(), addIceBeam(),
                addBlizzard(), addHyperBeam(), addProtect(), addRainDance(), addFrustration(),
                addThunderbolt(), addThunder(), addReturn(), addShadowBall(), addDoubleTeam(),
                addSludgeWave(), addSludgeBomb(), addTorment(), addFacade(), addRest(),
                addAttract(), addThief(), addRound(), addChargeBeam(), addQuash(), addEmbargo(),
                addShadowClaw(), addGigaImpact(), addThunderWave(), addSwordsDance(), addGrassKnot(),
                addSwagger(), addSleepTalk(), addUTurn(), addSubstitute(), addWildCharge(), addSnarl(),
                addDarkPulse(), addConfide());
        this.pokedexType = "Raticate";
        this.setPokeCry("020Cry_1.wav");
        this.type2 = "Dark";
        this.isAlolan = true;
    }

    public AlolanRaticate(int level, List<Moves> oldMoves, String Nature, String name,
                          List<Integer> oldIVs, double HPmissing, List<Integer> OldEVs,
                          int Gender, Abilities ability, Boolean isShiny, Items items) {
        Initialize(level);
        this.item = items;
        this.savedItem = this.item;
        this.Gender = Gender;
        this.IV = oldIVs;
        this.nature = Nature;
        changeBaseStats();
        if (name.equals("Rattata")) {
            this.name = "Raticate";
        } else {
            this.name = name;
        }
        this.moves = oldMoves;
        this.ability = ability;
        this.EVs = OldEVs;
        this.HP = (int) Math.round(savedHP * HPmissing);
        this.savedAbility = ability;
        setFullDirNameEvolution(isShiny, "Raticate.png");
    }

    public AlolanRaticate(int level, GlobalVariables globalVariables) {
        Initialize(level);
        setFirstEVs();
        addFirstMoves();
        setNature();
        setIVs();
        changeBaseStats();
        setTotalEXP();
        setNextLevelEXP();
        setEXPNeeded();
        this.name = "Raticate";
        Collections.addAll(this.possibleAbilities, new Gluttony(),
                new ThickFat(), new Hustle());
        getAbilities();
        this.savedAbility = this.ability;
        this.HP = this.savedHP;
        setFullDirName("Raticate.png", globalVariables);
        Collections.addAll(this.possibleWildItems, new CreateOrderedMap<>(5, GetItem.getPechaBerry()),
                new CreateOrderedMap<>(95, GetItem.getNoItem()));
        getWildItem();
    }
}
