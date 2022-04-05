package BattleMechanics;

import Interfaces.CreateOrderedMap;
import PokemonCreation.Pokemon;

public interface TypeChart {


    static double CalcTypeEffective(Pokemon attacker,
                                    Pokemon defender,
                                    Moves moves){
        String type = moves.showType();
        double TypeEffect = 1;
        if(type.equals("Normal")){
            if (defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Ghost") ||
                defender.showType1().equals("Ghost")){
                    if (!moves.showName().equals("Struggle")) {
                        TypeEffect = 0;
                    }
            }
        }
        if(type.equals("Fighting")) {
            if (defender.showType1().equals("Normal") ||
                defender.showType2().equals("Normal")){
                TypeEffect = TypeEffect * 2;
            }
            if(defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect * 2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")) {
                TypeEffect = TypeEffect * 2;
            }
            if(defender.showType1().equals("Ice") ||
                defender.showType2().equals("Ice")){
                TypeEffect = TypeEffect * 2;
            }
            if(defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                    TypeEffect = TypeEffect * 2;
            }
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect / 2;
            }
            if(defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect / 2;
            }
            if(defender.showType1().equals("Bug") ||
                defender.showType2().equals("Bug")){
                TypeEffect = TypeEffect / 2;
            }
            if(defender.showType1().equals("Psychic") ||
                defender.showType2().equals("Psychic")){
                TypeEffect = TypeEffect / 2;
            }
            if(defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = TypeEffect / 2;
            }
            if (defender.showType1().equals("Ghost") ||
                defender.showType1().equals("Ghost")){
                    TypeEffect = 0;
            }
        }
        if(type.equals("Flying")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Bug") ||
                defender.showType2().equals("Bug")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Electric") ||
                defender.showType2().equals("Electric")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Poison")){
            if (defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Ground") ||
                defender.showType2().equals("Ground")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Ghost") ||
                defender.showType2().equals("Ghost")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType2().equals("Steel") ||
                defender.showType1().equals("Steel")){
                    TypeEffect = 0;
            }
            if (defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Ground")){
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying") ||
                defender.getLevitates() ||
                defender.getFakeLevitates()){
                    TypeEffect = 0;
            }
            if (defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Electric") ||
                defender.showType2().equals("Electric")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Rock")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Ground") ||
                defender.showType2().equals("Ground")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Bug") ||
                defender.showType2().equals("Bug")) {
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Ice") ||
                defender.showType2().equals("Ice")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Bug")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Ghost") ||
                defender.showType2().equals("Ghost")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Psychic") ||
                defender.showType2().equals("Psychic")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Ghost")){
            if (defender.showType1().equals("Normal") ||
                defender.showType2().equals("Normal")){
                    TypeEffect = 0;
            }
            if (defender.showType1().equals("Ghost") ||
                defender.showType2().equals("Ghost")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Psychic") ||
                defender.showType2().equals("Psychic")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Steel")){
            if (defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Ice") ||
                defender.showType2().equals("Ice")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Water") ||
                defender.showType2().equals("Water")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Electric") ||
                defender.showType2().equals("Electric")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Fire")){
            if (defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Bug") ||
                defender.showType2().equals("Bug")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType1().equals("Steel")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType1().equals("Grass")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Ice") ||
                defender.showType1().equals("Ice")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Water")){
            if (defender.showType1().equals("Ground") ||
                defender.showType2().equals("Ground")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Water") ||
                defender.showType2().equals("Water")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType1().equals("Dragon")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Grass")){
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType2().equals("Bug") ||
                defender.showType1().equals("Bug")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Ground") ||
                defender.showType2().equals("Ground")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Water") ||
                defender.showType2().equals("Water")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Electric")){
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Water") ||
                defender.showType2().equals("Water")){
                TypeEffect = TypeEffect*2;
            }
            if(attacker.getHasElectricCharge()){
                TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Rock") ||
                defender.showType2().equals("Rock")){
                    TypeEffect = 0;
            }
            if (defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Electric") ||
                defender.showType2().equals("Electric")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Psychic")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType2().equals("Psychic") ||
                defender.showType1().equals("Psychic")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                    TypeEffect = 0;
            }
        }
        if(type.equals("Ice")){
            if (defender.showType1().equals("Flying") ||
                defender.showType2().equals("Flying")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Ground") ||
                defender.showType2().equals("Ground")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Water") ||
                defender.showType2().equals("Water")){
                if(moves.showName().equals("Freeze-Dry")){
                    TypeEffect = TypeEffect*2;
                }
                else {
                    TypeEffect = TypeEffect / 2;
                }
            }
            if(defender.showType1().equals("Grass") ||
                defender.showType2().equals("Grass")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Ice") ||
                defender.showType2().equals("Ice")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(type.equals("Dragon")){
            if (defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = 0;
            }
        }
        if(type.equals("Dark")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fairy") ||
                defender.showType2().equals("Fairy")){
                    TypeEffect = TypeEffect/2;
            }
            if (defender.showType1().equals("Ghost") ||
                defender.showType2().equals("Ghost")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Psychic") ||
                defender.showType2().equals("Psychic")){
                    TypeEffect = TypeEffect*2;
            }
        }
        if(type.equals("Fairy")){
            if (defender.showType1().equals("Fighting") ||
                defender.showType2().equals("Fighting")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Dragon") ||
                defender.showType2().equals("Dragon")){
                TypeEffect = TypeEffect*2;
            }
            if(defender.showType1().equals("Dark") ||
                defender.showType2().equals("Dark")){
                    TypeEffect = TypeEffect*2;
            }
            if (defender.showType1().equals("Poison") ||
                defender.showType2().equals("Poison")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Steel") ||
                defender.showType2().equals("Steel")){
                TypeEffect = TypeEffect/2;
            }
            if(defender.showType1().equals("Fire") ||
                defender.showType2().equals("Fire")){
                    TypeEffect = TypeEffect/2;
            }
        }
        if(TypeEffect > 1){System.out.println("It's Super effective!");}
        if(TypeEffect < 1) {
            if (!attacker.showAbility().showChangesNotEffective()) {
                System.out.println("It's not very effective...");
            }
            if (attacker.showAbility().showChangesNotEffective()) {
                System.out.println("It's not very effective, but due to the " + attacker.showName() + " 's " + attacker.showAbility().showName() + " the effectivness is multiplied by " + attacker.showAbility().showChangeNotEffectiveAm() + "!");
                TypeEffect = TypeEffect * 2;
            }
        }
        if(attacker.showAbility().getAffectsSelfType()){
            if(!attacker.showAbility().getHasReqsinDamage() || (attacker.showAbility().getHasReqsinDamage() && ((attacker.showAbility().getHPReq() * attacker.showSavedHP()) >= attacker.showHP()))){
                for(CreateOrderedMap<String, Double> pair : attacker.showAbility().getTypesAffected()){
                    if(pair.getKey().equals(type)) {
                        System.out.println(attacker.showAbility().showName() + " increases the damage!");
                        TypeEffect = TypeEffect * pair.getValue();
                    }
                }
            }
        }
        if(defender.showAbility().getAffectsType()){
            for(CreateOrderedMap<String, Double> pair : defender.showAbility().getTypesAffected()){
                if(pair.getKey().equals(type)){
                    TypeEffect = TypeEffect * pair.getValue();
                    System.out.println(defender.showAbility().showName() + " decreases the damage!");
                }
            }
        }
        if(attacker.showItem().getAffectsSelfType()){
            for(CreateOrderedMap<String, Double> pair : attacker.showItem().getTypesAffected()){
                if(pair.getKey().equals(type)) {
                    System.out.println(attacker.showItem().showName() + " increases the damage!");
                    TypeEffect = TypeEffect * pair.getValue();
                }
            }
        }
        if(defender.showItem().getAffectsType()){
            for(CreateOrderedMap<String, Double> pair : defender.showItem().getTypesAffected()){
                if(pair.getKey().equals(type)){
                    TypeEffect = TypeEffect * pair.getValue();
                    System.out.println(defender.showItem().showName() + " decreases the damage!");
                }
            }
        }
        return TypeEffect;}
}