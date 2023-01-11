package Moveset.Poison;

import BattleMechanics.Moves;
import BattleMechanics.TypeChart;
import PokemonCreation.Pokemon;
import Terrain.Terrain;
import Weather.Weather;
import java.util.List;


public class ShellSideArm extends Moves {

    public ShellSideArm(){
        this.name = "Shell Side Arm";
        this.type = "Poison";
        this.power = 90;
        this.acc = 100;
        this.PP = 10;
        this.dealsDamage = true;
        this.CanMiss = true;
        this.savedPP = this.PP;
        this.TMNum = 122;
        this.canPoison = true;
        this.poisonChance = 20;
    }

    public int damageDealt(Pokemon attacker, Pokemon defender,
                           Weather weather, Terrain terrain,
                           List<Pokemon> Waiting, Moves enemyMove,
                           Boolean isFirst, Boolean magicRoom,
                           Boolean wonderRoom) {
        int PhysRefinedDamage;
        int SpecRefinedDamage;
        int RefinedDamage;
        double RawDamage = 0;
        double PhysRawDamage = 0;
        double SpecRawDamage = 0;
        int savedRefinedDamage = 0;
        double fromAbility = attacker.showAbility().affectedOnDamage(this);
        attacker.showAbility().addStageDuringDamage(attacker,
                defender, this, weather, true, isFirst);
        defender.showAbility().addStageDuringDamage(attacker,
                defender, this, weather, false, isFirst);
        if (!defender.getIsProtected()) {
            double attack;
            double defense;
            attack = getSpecAttack(attacker, defender, weather);
            if (wonderRoom) {
                defense = getPhysDef(attacker, defender, weather);
            } else {
                defense = getSpecDef(attacker, defender, weather);
            }
            if (defender.getHasSpecWall()) {
                defense = defense * 2;
            }
            SpecRawDamage = attack / defense;
            if (wonderRoom) {
                defense = getSpecDef(attacker, defender, weather);
            } else {
                defense = getPhysDef(attacker, defender, weather);
            }
            if (defender.getHasPhysWall()) {
                defense = defense * 2;
            }
            PhysRawDamage = attack / defense;
            RawDamage += 2;
            int Crit = 1;
            if (isCrit(attacker) || attacker.getWillCrit()) {
                Crit = 2;
                if (attacker.showAbility().getIncreasesCritDamage()) {
                    Crit = 3;
                }
                attacker.resetWillCrit();
            }
            PhysRefinedDamage = (int) (Math.round(((PhysRawDamage + RawDamage) *
                    Crit * CalcSubtractor() * STABBonus(attacker)
                    * TypeChart.CalcTypeEffective(attacker, defender,
                    this.type, this.name)) * fromAbility));
            SpecRefinedDamage = (int) (Math.round(((SpecRawDamage + RawDamage) *
                    Crit * CalcSubtractor() * STABBonus(attacker)
                    * TypeChart.CalcTypeEffective(attacker, defender,
                    this.type, this.name)) * fromAbility));
            RefinedDamage = SpecRefinedDamage;
            this.makesContact = false;
            this.isSpecial = true;
            if (PhysRefinedDamage < SpecRefinedDamage) {
                RefinedDamage = PhysRefinedDamage;
                this.makesContact = true;
                this.isSpecial = false;
            }
            if (terrain.showIncreaseType().equals(this.type)) {
                RefinedDamage = (int) Math.round(RefinedDamage * terrain.showIncreasedBy());
            }
            if (attacker.showCharged()) {
                RefinedDamage = (int) Math.round(RefinedDamage * 1.5);
            }
            savedRefinedDamage -= (int) (RefinedDamage * defender.showAbility().getDamageReduction());
            if ((defender.showSavedHP() == defender.showHP())
                    && defender.showAbility().showName().equals("Sturdy")
                    && (savedRefinedDamage >= defender.showSavedHP())) {
                savedRefinedDamage = defender.showHP() - 1;
            }
        }
        else {
            System.out.println("Enemy " + defender.showName() + " is protected!");
        }
        return savedRefinedDamage;}
}

