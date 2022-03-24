package PlayerMechanics;

import BattleMechanics.Moves;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TMInventory {
    private List<String> TMInventory = new ArrayList<>();

    public TMInventory() {}

    public void addSpecificTMtoInventory(Moves TMadded) {
        TMInventory.add(TMadded.showName());
    }

    public void accessTMs(GlobalVariables globalVariables){
        PlayerParty playerParty = globalVariables.getParty();
        System.out.println("You have TMs: ");
        Scanner scan = new Scanner(System.in);
        int ticker = 0;
        for(String TM : TMInventory){
            System.out.println("TM" + ticker + ": " + TM);
        }
        List<String> pokemon = new ArrayList<>();
        List<String> Ticker = new ArrayList<>();
        int ticker2 = 0;
        String choice = "";
        while(!choice.equals("n")) {
            System.out.println("Which pokemon do you want to use a TM on? (n for done)");
            for (Pokemon partyPoke : playerParty.getCurrentParty()) {
                pokemon.add(partyPoke.showName());
                Ticker.add(Integer.toString(ticker2));
                System.out.println(partyPoke.showName() + " [" + ticker2 + "]");
                ticker2 += 1;
            }
            choice = scan.nextLine();
            if(pokemon.contains(choice) || Ticker.contains(choice)){
                int index = 0;
                if(pokemon.contains(choice)){
                    index = pokemon.indexOf(choice);
                }
                if(Ticker.contains(choice)){
                    index = Ticker.indexOf(choice);
                }
                Pokemon Selected = playerParty.getCurrentParty().get(index);
                Selected.addmovefromTM(TMInventory);
            }
        }
    }

    public void getARandomTM() {
        int Selection = (int) Math.round((Math.random() * 250));
        int currentSize = TMInventory.size();
        Boolean exists = true;
        if(Selection == 0 && !TMInventory.contains("Mega Punch")) { TMInventory.add("Mega Punch"); }
        if(Selection == 1 && !TMInventory.contains("Mega Kick")) { TMInventory.add("Mega Kick"); }
        if(Selection == 2 && !TMInventory.contains("")) { exists = false;}
        if(Selection == 3 && !TMInventory.contains("Fire Punch")) { TMInventory.add("Fire Punch"); }
        if(Selection == 4 && !TMInventory.contains("Ice Punch")) { TMInventory.add("Ice Punch"); }
        if(Selection == 5 && !TMInventory.contains("Thunder Punch")) { TMInventory.add("Thunder Punch"); }
        if(Selection == 6 && !TMInventory.contains("Fly")) { TMInventory.add("Fly"); }
        if(Selection == 7 && !TMInventory.contains("")) { exists = false;}
        if(Selection == 8 && !TMInventory.contains("Hyper Beam")) { TMInventory.add("Hyper Beam"); }
        if(Selection == 9 && !TMInventory.contains("Giga Impact")) { TMInventory.add("Giga Impact"); }
        if(Selection == 10 && !TMInventory.contains("Magical Leaf")) { TMInventory.add("Magical Leaf"); }
        if(Selection == 11 && !TMInventory.contains("Solar Beam")) { TMInventory.add("Solar Beam"); }
        if(Selection == 12 && !TMInventory.contains("")) { exists = false;}
        if(Selection == 13 && !TMInventory.contains("Fire Spin")) { TMInventory.add("Fire Spin"); }
        if(Selection == 14 && !TMInventory.contains("")) { exists = false;}
        if(Selection == 15 && !TMInventory.contains("Dig")) { TMInventory.add("Dig"); }
        if(Selection == 16 && !TMInventory.contains("")) {exists = false; }
        if(Selection == 17 && !TMInventory.contains("Light Screen")) { TMInventory.add("Light Screen"); }
        if(Selection == 18 && !TMInventory.contains("")) { exists = false;}
        if(Selection == 19 && !TMInventory.contains("Safegaurd")) { TMInventory.add("Safegaurd");}
        if(Selection == 20 && !TMInventory.contains("")) {exists = false; }
        if(Selection == 21 && !TMInventory.contains("Rest")) { TMInventory.add("Rest"); }
        if(Selection == 22 && !TMInventory.contains("Rock Slide")){ TMInventory.add("Rock Slide"); }
        if(Selection == 23 && !TMInventory.contains("")){exists = false;}
        if(Selection == 24 && !TMInventory.contains("Snore")){ TMInventory.add("Snore");}
        if(Selection == 25 && !TMInventory.contains("Protect")){TMInventory.add("Protect");}
        if(Selection == 26 && !TMInventory.contains("Scary Face")){TMInventory.add("Scary Face");}
        if(Selection == 27 && !TMInventory.contains("Icy Wind")){TMInventory.add("Icy Wind");}
        if(Selection == 28 && !TMInventory.contains("Giga Drain")){TMInventory.add("Giga Drain");}
        if(Selection == 29 && !TMInventory.contains("Charm")) {TMInventory.add("Charm");}
        if(Selection == 30 && !TMInventory.contains("Steel Wind")){TMInventory.add("Steel Wing");}
        if(Selection == 31 && !TMInventory.contains("Attract")){TMInventory.add("Attract");}
        if(Selection == 32 && !TMInventory.contains("")){exists = false;}
        if(Selection == 33 && !TMInventory.contains("Rain Dance")){TMInventory.add("Rain Dance");}
        if(Selection == 34 && !TMInventory.contains("Sunny Day")){TMInventory.add("Sunny Day");}
        if(Selection == 35 && !TMInventory.contains("Hail")){TMInventory.add("Hail");}
        if(Selection == 36 && !TMInventory.contains("Whirlpool")){TMInventory.add("Whirlpool");}
        if(Selection == 37 && !TMInventory.contains("Beat Up")){TMInventory.add("Beat Up");}
        if(Selection == 38 && !TMInventory.contains("Will-O-Wisp")){TMInventory.add("Will-O-Wisp");}
        if(Selection == 39 && !TMInventory.contains("Facade")){TMInventory.add("Facade");}
        if(Selection == 40 && !TMInventory.contains("Swift")) {TMInventory.add("Swift");}
        if(Selection == 41 && !TMInventory.contains("Helping Hand")){TMInventory.add("Helping Hand");}
        if(Selection == 42 && !TMInventory.contains("")){exists = false;}
        if(Selection == 43 && !TMInventory.contains("Brick Break")){TMInventory.add("Brick Break");}
        if(Selection == 44 && !TMInventory.contains("")){TMInventory.add("");}
        if(Selection == 45 && !TMInventory.contains("Dive")){TMInventory.add("Dive");}
        if(Selection == 46 && !TMInventory.contains("Weather Ball")){TMInventory.add("Weather Ball");}
        if(Selection == 47 && !TMInventory.contains("")){exists = false;}
        if(Selection == 48 && !TMInventory.contains("Rock Tomb")){TMInventory.add("Rock Tomb");}
        if(Selection == 49 && !TMInventory.contains("")){exists = false;}
        if(Selection == 50 && !TMInventory.contains("Bullet Seed")){TMInventory.add("Bullet Seed");}
        if(Selection == 51 && !TMInventory.contains("")){exists = false;}
        if(Selection == 52 && !TMInventory.contains("")){exists = false;}
        if(Selection == 53 && !TMInventory.contains("")){exists = false;}
        if(Selection == 54 && !TMInventory.contains("")){exists = false;}
        if(Selection == 55 && !TMInventory.contains("Brine")){TMInventory.add("Brine");}
        if(Selection == 56 && !TMInventory.contains("")){exists = false;}
        if(Selection == 57 && !TMInventory.contains("")){exists = false;}
        if(Selection == 58 && !TMInventory.contains("")){exists = false;}
        if(Selection == 59 && !TMInventory.contains("Fling")){TMInventory.add("Fling");}
        if(Selection == 60 && !TMInventory.contains("")){exists = false;}
        if(Selection == 61 && !TMInventory.contains("")){exists = false;}
        if(Selection == 62 && !TMInventory.contains("")){exists = false;}
        if(Selection == 63 && !TMInventory.contains("")){exists = false;}
        if(Selection == 64 && !TMInventory.contains("")){exists = false;}
        if(Selection == 65 && !TMInventory.contains("Shadow Claw")){TMInventory.add("Shadow Claw");}
        if(Selection == 66 && !TMInventory.contains("")){exists = false;}
        if(Selection == 67 && !TMInventory.contains("")){exists = false;}
        if(Selection == 68 && !TMInventory.contains("Fire Fang")){TMInventory.add("Fire Fang");}
        if(Selection == 69 && !TMInventory.contains("")){exists = false;}
        if(Selection == 70 && !TMInventory.contains("")){exists = false;}
        if(Selection == 71 && !TMInventory.contains("")){exists = false;}
        if(Selection == 72 && !TMInventory.contains("")){exists = false;}
        if(Selection == 73 && !TMInventory.contains("")){exists = false;}
        if(Selection == 74 && !TMInventory.contains("Venoshock")){TMInventory.add("Venoshock");}
        if(Selection == 75 && !TMInventory.contains("")){exists = false;}
        if(Selection == 76 && !TMInventory.contains("Round")){TMInventory.add("Round");}
        if(Selection == 77 && !TMInventory.contains("")){exists = false;}
        if(Selection == 78 && !TMInventory.contains("Acrobatics")){TMInventory.add("Acrobatics");}
        if(Selection == 79 && !TMInventory.contains("")){exists = false;}
        if(Selection == 80 && !TMInventory.contains("")){exists = false;}
        if(Selection == 81 && !TMInventory.contains("Bulldoze")){TMInventory.add("Bulldoze");}
        if(Selection == 82 && !TMInventory.contains("")){exists = false;}
        if(Selection == 83 && !TMInventory.contains("")){exists = false;}
        if(Selection == 84 && !TMInventory.contains("")){exists = false;}
        if(Selection == 85 && !TMInventory.contains("")){exists = false;}
        if(Selection == 86 && !TMInventory.contains("")){exists = false;}
        if(Selection == 87 && !TMInventory.contains("")){exists = false;}
        if(Selection == 88 && !TMInventory.contains("Grassy Terrain")){TMInventory.add("Grassy Terrain");}
        if(Selection == 89 && !TMInventory.contains("")){exists = false;}
        if(Selection == 90 && !TMInventory.contains("")){exists = false;}
        if(Selection == 91 && !TMInventory.contains("")){exists = false;}
        if(Selection == 92 && !TMInventory.contains("Mystical Fire")){TMInventory.add("Mystical Fire");}
        if(Selection == 93 && !TMInventory.contains("")){exists = false;}
        if(Selection == 94 && !TMInventory.contains("False Swipe")){TMInventory.add("False Swipe");}
        if(Selection == 95 && !TMInventory.contains("Air Slash")){TMInventory.add("Air Slash");}
        if(Selection == 96 && !TMInventory.contains("")){exists = false;}
        if(Selection == 97 && !TMInventory.contains("Brutal Swing")){TMInventory.add("Brutal Swing");}
        if(Selection == 98 && !TMInventory.contains("Stomping Tantrum")){TMInventory.add("Stomping Tantrum");}
        if(Selection == 99 && !TMInventory.contains("")){exists = false;}
        if(Selection == 100 && !TMInventory.contains("Swords Dance")){TMInventory.add("Swords Dance");}
        if(Selection == 101 && !TMInventory.contains("Body Slam")){TMInventory.add("Body Slam");}
        if(Selection == 102 && !TMInventory.contains("Flamethrower")){TMInventory.add("Flamethrower");}
        if(Selection == 103 && !TMInventory.contains("Hydro Pump")){TMInventory.add("Hydro Pump");}
        if(Selection == 104 && !TMInventory.contains("Surf")){TMInventory.add("Surf");}
        if(Selection == 105 && !TMInventory.contains("Ice Beam")){TMInventory.add("Ice Beam");}
        if(Selection == 106 && !TMInventory.contains("")){exists = false;}
        if(Selection == 107 && !TMInventory.contains("")){exists = false;}
        if(Selection == 108 && !TMInventory.contains("")){exists = false;}
        if(Selection == 109 && !TMInventory.contains("")){exists = false;}
        if(Selection == 110 && !TMInventory.contains("Earthquake")){TMInventory.add("Earthquake");}
        if(Selection == 111 && !TMInventory.contains("")){exists = false;}
        if(Selection == 112 && !TMInventory.contains("")){exists = false;}
        if(Selection == 113 && !TMInventory.contains("")){exists = false;}
        if(Selection == 114 && !TMInventory.contains("")){exists = false;}
        if(Selection == 115 && !TMInventory.contains("Fire Blast")){TMInventory.add("Fire Blast");}
        if(Selection == 116 && !TMInventory.contains("")){exists = false;}
        if(Selection == 117 && !TMInventory.contains("Amnesia")){TMInventory.add("Amnesia");}
        if(Selection == 118 && !TMInventory.contains("")){exists = false;}
        if(Selection == 119 && !TMInventory.contains("")){exists = false;}
        if(Selection == 120 && !TMInventory.contains("Substitute")){TMInventory.add("Substitute");}
        if(Selection == 121 && !TMInventory.contains("")){exists = false;}
        if(Selection == 122 && !TMInventory.contains("Sludge Bomb")){TMInventory.add("Sludge Bomb");}
        if(Selection == 123 && !TMInventory.contains("")){exists = false;}
        if(Selection == 124 && !TMInventory.contains("Outrage")){TMInventory.add("Outrage");}
        if(Selection == 125 && !TMInventory.contains("")){exists = false;}
        if(Selection == 126 && !TMInventory.contains("Endure")){TMInventory.add("Endure");}
        if(Selection == 127 && !TMInventory.contains("Sleep Talk")){TMInventory.add("Sleep Talk");}
        if(Selection == 128 && !TMInventory.contains("")){exists = false;}
        if(Selection == 129 && !TMInventory.contains("")){exists = false;}
        if(Selection == 130 && !TMInventory.contains("")){exists = false;}
        if(Selection == 131 && !TMInventory.contains("Iron Tail")){TMInventory.add("Iron Tail");}
        if(Selection == 132 && !TMInventory.contains("Crunch")){TMInventory.add("Crunch");}
        if(Selection == 133 && !TMInventory.contains("")){exists = false;}
        if(Selection == 134 && !TMInventory.contains("")){exists = false;}
        if(Selection == 135 && !TMInventory.contains("")){exists = false;}
        if(Selection == 136 && !TMInventory.contains("Heat Wave")){TMInventory.add("Heat Wave");}
        if(Selection == 137 && !TMInventory.contains("")){exists = false;}
        if(Selection == 138 && !TMInventory.contains("")){exists = false;}
        if(Selection == 139 && !TMInventory.contains("")){exists = false;}
        if(Selection == 140 && !TMInventory.contains("")){exists = false;}
        if(Selection == 141 && !TMInventory.contains("Blaze Kick")){TMInventory.add("Blaze Kick");}
        if(Selection == 142 && !TMInventory.contains("")){exists = false;}
        if(Selection == 143 && !TMInventory.contains("Overheat")){TMInventory.add("Overheat");}
        if(Selection == 144 && !TMInventory.contains("")){exists = false;}
        if(Selection == 145 && !TMInventory.contains("")){exists = false;}
        if(Selection == 146 && !TMInventory.contains("Iron Defense")){TMInventory.add("Iron Defense");}
        if(Selection == 147 && !TMInventory.contains("Dragon Claw")){TMInventory.add("Dragon Claw");}
        if(Selection == 148 && !TMInventory.contains("")){exists = false;}
        if(Selection == 149 && !TMInventory.contains("")){exists = false;}
        if(Selection == 150 && !TMInventory.contains("")){exists = false;}
        if(Selection == 151 && !TMInventory.contains("Dragon Dance")){TMInventory.add("Dragon Dance");}
        if(Selection == 152 && !TMInventory.contains("")){exists = false;}
        if(Selection == 153 && !TMInventory.contains("")){exists = false;}
        if(Selection == 154 && !TMInventory.contains("")){exists = false;}
        if(Selection == 155 && !TMInventory.contains("Flare Blitz")){TMInventory.add("Flare Blitz");}
        if(Selection == 156 && !TMInventory.contains("")){exists = false;}
        if(Selection == 157 && !TMInventory.contains("")){exists = false;}
        if(Selection == 158 && !TMInventory.contains("")){exists = false;}
        if(Selection == 159 && !TMInventory.contains("Seed Bomb")){TMInventory.add("Seed Bomb");}
        if(Selection == 160 && !TMInventory.contains("")){exists = false;}
        if(Selection == 161 && !TMInventory.contains("")){exists = false;}
        if(Selection == 162 && !TMInventory.contains("Dragon Pulse")){TMInventory.add("Dragon Pulse");}
        if(Selection == 163 && !TMInventory.contains("")){exists = false;}
        if(Selection == 164 && !TMInventory.contains("Focus Blast")){TMInventory.add("Focus Blast");}
        if(Selection == 165 && !TMInventory.contains("Energy Ball")){TMInventory.add("Energy Ball");}
        if(Selection == 166 && !TMInventory.contains("")){exists = false;}
        if(Selection == 167 && !TMInventory.contains("Earth Power")){TMInventory.add("Earth Power");}
        if(Selection == 168 && !TMInventory.contains("")){exists = false;}
        if(Selection == 169 && !TMInventory.contains("")){exists = false;}
        if(Selection == 170 && !TMInventory.contains("")){exists = false;}
        if(Selection == 171 && !TMInventory.contains("Leaf Storm")){TMInventory.add("Leaf Storm");}
        if(Selection == 172 && !TMInventory.contains("Power Whip")){TMInventory.add("Power Whip");}
        if(Selection == 173 && !TMInventory.contains("")){exists = false;}
        if(Selection == 174 && !TMInventory.contains("")){exists = false;}
        if(Selection == 175 && !TMInventory.contains("")){exists = false;}
        if(Selection == 176 && !TMInventory.contains("")){exists = false;}
        if(Selection == 177 && !TMInventory.contains("Grass Knot")){TMInventory.add("Grass Knot");}
        if(Selection == 178 && !TMInventory.contains("Sludge Bomb")){TMInventory.add("Sludge Bomb");}
        if(Selection == 179 && !TMInventory.contains("")){exists = false;}
        if(Selection == 180 && !TMInventory.contains("")){exists = false;}
        if(Selection == 181 && !TMInventory.contains("")){exists = false;}
        if(Selection == 182 && !TMInventory.contains("")){exists = false;}
        if(Selection == 183 && !TMInventory.contains("")){exists = false;}
        if(Selection == 184 && !TMInventory.contains("")){exists = false;}
        if(Selection == 185 && !TMInventory.contains("Work Up")){TMInventory.add("Work Up");}
        if(Selection == 186 && !TMInventory.contains("")){exists = false;}
        if(Selection == 187 && !TMInventory.contains("")){exists = false;}
        if(Selection == 188 && !TMInventory.contains("Heat Crash")){TMInventory.add("Heat Crash");}
        if(Selection == 189 && !TMInventory.contains("Hurricane")){TMInventory.add("Hurricane");}
        if(Selection == 190 && !TMInventory.contains("")){exists = false;}
        if(Selection == 191 && !TMInventory.contains("")){exists = false;}
        if(Selection == 192 && !TMInventory.contains("")){exists = false;}
        if(Selection == 193 && !TMInventory.contains("")){exists = false;}
        if(Selection == 194 && !TMInventory.contains("")){exists = false;}
        if(Selection == 195 && !TMInventory.contains("")){exists = false;}
        if(Selection == 196 && !TMInventory.contains("")){exists = false;}
        if(Selection == 197 && !TMInventory.contains("")){exists = false;}
        if(Selection == 198 && !TMInventory.contains("")){exists = false;}
        if(Selection == 199 && !TMInventory.contains("")){exists = false;}
        int newSize = TMInventory.size();
        if(Selection < 200 && exists && newSize > currentSize){System.out.println("You got TM" + Selection);}
    }
}
