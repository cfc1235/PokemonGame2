package PlayerMechanics;

import BattleMechanics.Moves;
import Interfaces.GlobalVariables;
import PokemonCreation.Pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TMInventory {
    private List<String> TMInventory = new ArrayList<>();

    public TMInventory() {}

    public void accessTMs(GlobalVariables globalVariables){
        PlayerParty playerParty = globalVariables.getParty();
        System.out.println("You have this.TMs: ");
        Scanner scan = new Scanner(System.in);
        int ticker = 0;
        for(String TM : this.TMInventory){
            System.out.println("this.TM" + ticker + ": " + TM);
        }
        List<String> pokemon = new ArrayList<>();
        List<String> Ticker = new ArrayList<>();
        int ticker2 = 0;
        String choice = "";
        while(!choice.equals("n")) {
            System.out.println("Which pokemon do you want to use a this.TM on? (n for done)");
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
                Selected.addmovefromTM(this.TMInventory);
            }
        }
    }

    public void getARandomTM() {
        Random random = new Random();
        int Selection = Math.round(random.nextInt(600));
        int currentSize = this.TMInventory.size();
        if(Selection == 0 && !this.TMInventory.contains("Mega Punch")) { this.TMInventory.add("Mega Punch"); }
        if(Selection == 1 && !this.TMInventory.contains("Mega Kick")) { this.TMInventory.add("Mega Kick"); }
        if(Selection == 2 && !this.TMInventory.contains("Pay Day")) {}
        if(Selection == 3 && !this.TMInventory.contains("Fire Punch")) { this.TMInventory.add("Fire Punch"); }
        if(Selection == 4 && !this.TMInventory.contains("Ice Punch")) { this.TMInventory.add("Ice Punch"); }
        if(Selection == 5 && !this.TMInventory.contains("Thunder Punch")) { this.TMInventory.add("Thunder Punch"); }
        if(Selection == 6 && !this.TMInventory.contains("Fly")) { this.TMInventory.add("Fly"); }
        if(Selection == 7 && !this.TMInventory.contains("Pin Missile")) {this.TMInventory.add("Pin Missle");}
        if(Selection == 8 && !this.TMInventory.contains("Hyper Beam")) { this.TMInventory.add("Hyper Beam"); }
        if(Selection == 9 && !this.TMInventory.contains("Giga Impact")) { this.TMInventory.add("Giga Impact"); }
        if(Selection == 10 && !this.TMInventory.contains("Magical Leaf")) { this.TMInventory.add("Magical Leaf"); }
        if(Selection == 11 && !this.TMInventory.contains("Solar Beam")) { this.TMInventory.add("Solar Beam"); }
        if(Selection == 12 && !this.TMInventory.contains("Solar Blade")) {}
        if(Selection == 13 && !this.TMInventory.contains("Fire Spin")) { this.TMInventory.add("Fire Spin"); }
        if(Selection == 14 && !this.TMInventory.contains("Thunder Wave")) { this.TMInventory.add("Thunder Wave");}
        if(Selection == 15 && !this.TMInventory.contains("Dig")) { this.TMInventory.add("Dig"); }
        if(Selection == 16 && !this.TMInventory.contains("Screech")) {this.TMInventory.add("Screech"); }
        if(Selection == 17 && !this.TMInventory.contains("Light Screen")) { this.TMInventory.add("Light Screen"); }
        if(Selection == 18 && !this.TMInventory.contains("Reflect")) {this.TMInventory.add("Reflect");}
        if(Selection == 19 && !this.TMInventory.contains("Safegaurd")) { this.TMInventory.add("Safegaurd");}
        if(Selection == 20 && !this.TMInventory.contains("Self Destruct")) {this.TMInventory.add("Self Destruct"); }
        if(Selection == 21 && !this.TMInventory.contains("Rest")) { this.TMInventory.add("Rest"); }
        if(Selection == 22 && !this.TMInventory.contains("Rock Slide")){ this.TMInventory.add("Rock Slide"); }
        if(Selection == 23 && !this.TMInventory.contains("Thief")){this.TMInventory.add("Thief");}
        if(Selection == 24 && !this.TMInventory.contains("Snore")){ this.TMInventory.add("Snore");}
        if(Selection == 25 && !this.TMInventory.contains("Protect")){this.TMInventory.add("Protect");}
        if(Selection == 26 && !this.TMInventory.contains("Scary Face")){this.TMInventory.add("Scary Face");}
        if(Selection == 27 && !this.TMInventory.contains("Icy Wind")){this.TMInventory.add("Icy Wind");}
        if(Selection == 28 && !this.TMInventory.contains("Giga Drain")){this.TMInventory.add("Giga Drain");}
        if(Selection == 29 && !this.TMInventory.contains("Charm")) {this.TMInventory.add("Charm");}
        if(Selection == 30 && !this.TMInventory.contains("Steel Wing")){this.TMInventory.add("Steel Wing");}
        if(Selection == 31 && !this.TMInventory.contains("Attract")){this.TMInventory.add("Attract");}
        if(Selection == 32 && !this.TMInventory.contains("Sandstorm")){this.TMInventory.add("Sandstorm");}
        if(Selection == 33 && !this.TMInventory.contains("Rain Dance")){this.TMInventory.add("Rain Dance");}
        if(Selection == 34 && !this.TMInventory.contains("Sunny Day")){this.TMInventory.add("Sunny Day");}
        if(Selection == 35 && !this.TMInventory.contains("Hail")){this.TMInventory.add("Hail");}
        if(Selection == 36 && !this.TMInventory.contains("Whirlpool")){this.TMInventory.add("Whirlpool");}
        if(Selection == 37 && !this.TMInventory.contains("Beat Up")){this.TMInventory.add("Beat Up");}
        if(Selection == 38 && !this.TMInventory.contains("Will-O-Wisp")){this.TMInventory.add("Will-O-Wisp");}
        if(Selection == 39 && !this.TMInventory.contains("Facade")){this.TMInventory.add("Facade");}
        if(Selection == 40 && !this.TMInventory.contains("Swift")) {this.TMInventory.add("Swift");}
        if(Selection == 41 && !this.TMInventory.contains("Helping Hand")){this.TMInventory.add("Helping Hand");}
        if(Selection == 42 && !this.TMInventory.contains("Revenge")){this.TMInventory.add("Helping Hand");}
        if(Selection == 43 && !this.TMInventory.contains("Brick Break")){this.TMInventory.add("Brick Break");}
        if(Selection == 44 && !this.TMInventory.contains("Imprison")){this.TMInventory.add("Imprison");}
        if(Selection == 45 && !this.TMInventory.contains("Dive")){this.TMInventory.add("Dive");}
        if(Selection == 46 && !this.TMInventory.contains("Weather Ball")){this.TMInventory.add("Weather Ball");}
        if(Selection == 47 && !this.TMInventory.contains("Fake Tears")){this.TMInventory.add("Fake Tears");}
        if(Selection == 48 && !this.TMInventory.contains("Rock Tomb")){this.TMInventory.add("Rock Tomb");}
        if(Selection == 49 && !this.TMInventory.contains("Sand Tomb")){}
        if(Selection == 50 && !this.TMInventory.contains("Bullet Seed")){this.TMInventory.add("Bullet Seed");}
        if(Selection == 51 && !this.TMInventory.contains("Icicle Spear")){this.TMInventory.add("Icicle Spear");}
        if(Selection == 52 && !this.TMInventory.contains("Bounce")){this.TMInventory.add("Bounce");}
        if(Selection == 53 && !this.TMInventory.contains("Mud Shot")){}
        if(Selection == 54 && !this.TMInventory.contains("Rock Blast")){}
        if(Selection == 55 && !this.TMInventory.contains("Brine")){this.TMInventory.add("Brine");}
        if(Selection == 56 && !this.TMInventory.contains("U-Turn")){this.TMInventory.add("U-Turn");}
        if(Selection == 57 && !this.TMInventory.contains("Payback")){this.TMInventory.add("Payback");}
        if(Selection == 58 && !this.TMInventory.contains("Assurance")){this.TMInventory.add("Assurance");}
        if(Selection == 59 && !this.TMInventory.contains("Fling")){this.TMInventory.add("Fling");}
        if(Selection == 60 && !this.TMInventory.contains("Power Swap")){this.TMInventory.add("Power Swap");}
        if(Selection == 61 && !this.TMInventory.contains("Guard Swap")){this.TMInventory.add("Guard Swap");}
        if(Selection == 62 && !this.TMInventory.contains("Speed Swap")){}
        if(Selection == 63 && !this.TMInventory.contains("Drain Punch")){this.TMInventory.add("Drain Punch");}
        if(Selection == 64 && !this.TMInventory.contains("Avalanche")){this.TMInventory.add("Avalanche");}
        if(Selection == 65 && !this.TMInventory.contains("Shadow Claw")){this.TMInventory.add("Shadow Claw");}
        if(Selection == 66 && !this.TMInventory.contains("Thunder Fang")){this.TMInventory.add("Thunder Fang");}
        if(Selection == 67 && !this.TMInventory.contains("Ice Fang")){this.TMInventory.add("Ice Fang");}
        if(Selection == 68 && !this.TMInventory.contains("Fire Fang")){this.TMInventory.add("Fire Fang");}
        if(Selection == 69 && !this.TMInventory.contains("Psycho Cut")){this.TMInventory.add("Psycho Cut");}
        if(Selection == 70 && !this.TMInventory.contains("Trick Room")){this.TMInventory.add("Trick Room");}
        if(Selection == 71 && !this.TMInventory.contains("Wonder Room")){}
        if(Selection == 72 && !this.TMInventory.contains("Magic Room")){}
        if(Selection == 73 && !this.TMInventory.contains("Cross Poison")){this.TMInventory.add("Cross Poison");}
        if(Selection == 74 && !this.TMInventory.contains("Venoshock")){this.TMInventory.add("Venoshock");}
        if(Selection == 75 && !this.TMInventory.contains("Low Sweep")){this.TMInventory.add("Low Sweep");}
        if(Selection == 76 && !this.TMInventory.contains("Round")){this.TMInventory.add("Round");}
        if(Selection == 77 && !this.TMInventory.contains("Hex")){this.TMInventory.add("Hex");}
        if(Selection == 78 && !this.TMInventory.contains("Acrobatics")){this.TMInventory.add("Acrobatics");}
        if(Selection == 79 && !this.TMInventory.contains("Retaliate")){this.TMInventory.add("Retaliate");}
        if(Selection == 80 && !this.TMInventory.contains("Volt Switch")){this.TMInventory.add("Volt Switch");}
        if(Selection == 81 && !this.TMInventory.contains("Bulldoze")){this.TMInventory.add("Bulldoze");}
        if(Selection == 82 && !this.TMInventory.contains("Electroweb")){this.TMInventory.add("Electroweb");}
        if(Selection == 83 && !this.TMInventory.contains("Razor Shell")){}
        if(Selection == 84 && !this.TMInventory.contains("Tail Swap")){}
        if(Selection == 85 && !this.TMInventory.contains("Snarl")){this.TMInventory.add("Snarl");}
        if(Selection == 86 && !this.TMInventory.contains("Phantom Force")){}
        if(Selection == 87 && !this.TMInventory.contains("Draining Kiss")){this.TMInventory.add("Draining Kiss");}
        if(Selection == 88 && !this.TMInventory.contains("Grassy Terrain")){this.TMInventory.add("Grassy Terrain");}
        if(Selection == 89 && !this.TMInventory.contains("Misty Terrain")){}
        if(Selection == 90 && !this.TMInventory.contains("Electric Terrain")){this.TMInventory.add("Electric Terrain");}
        if(Selection == 91 && !this.TMInventory.contains("Pyschic Terrain")){}
        if(Selection == 92 && !this.TMInventory.contains("Mystic Fire")){this.TMInventory.add("Mystic Fire");}
        if(Selection == 93 && !this.TMInventory.contains("Eerie Impulse")){this.TMInventory.add("Eerie Impulse");}
        if(Selection == 94 && !this.TMInventory.contains("False Swipe")){this.TMInventory.add("False Swipe");}
        if(Selection == 95 && !this.TMInventory.contains("Air Slash")){this.TMInventory.add("Air Slash");}
        if(Selection == 96 && !this.TMInventory.contains("Smart Strike")){}
        if(Selection == 97 && !this.TMInventory.contains("Brutal Swing")){this.TMInventory.add("Brutal Swing");}
        if(Selection == 98 && !this.TMInventory.contains("Stomping Tantrum")){this.TMInventory.add("Stomping Tantrum");}
        if(Selection == 99 && !this.TMInventory.contains("Breaking Swing")){this.TMInventory.add("Breaking Swing");}
        if(Selection == 100 && !this.TMInventory.contains("Swords Dance")){this.TMInventory.add("Swords Dance");}
        if(Selection == 101 && !this.TMInventory.contains("Body Slam")){this.TMInventory.add("Body Slam");}
        if(Selection == 102 && !this.TMInventory.contains("Flamethrower")){this.TMInventory.add("Flamethrower");}
        if(Selection == 103 && !this.TMInventory.contains("Hydro Pump")){this.TMInventory.add("Hydro Pump");}
        if(Selection == 104 && !this.TMInventory.contains("Surf")){this.TMInventory.add("Surf");}
        if(Selection == 105 && !this.TMInventory.contains("Ice Beam")){this.TMInventory.add("Ice Beam");}
        if(Selection == 106 && !this.TMInventory.contains("Blizzard")){this.TMInventory.add("Blizzard");}
        if(Selection == 107 && !this.TMInventory.contains("Low Kick")){this.TMInventory.add("Low Kick");}
        if(Selection == 108 && !this.TMInventory.contains("Thunderbolt")){this.TMInventory.add("Thunderbolt");}
        if(Selection == 109 && !this.TMInventory.contains("Thunder")){this.TMInventory.add("Thunder");}
        if(Selection == 110 && !this.TMInventory.contains("Earthquake")){this.TMInventory.add("Earthquake");}
        if(Selection == 111 && !this.TMInventory.contains("Psychic")){this.TMInventory.add("Psychic");}
        if(Selection == 112 && !this.TMInventory.contains("Agility")){this.TMInventory.add("Agility");}
        if(Selection == 113 && !this.TMInventory.contains("Focus Energy")){this.TMInventory.add("Focus Energy");}
        if(Selection == 114 && !this.TMInventory.contains("Metronome")){}
        if(Selection == 115 && !this.TMInventory.contains("Fire Blast")){this.TMInventory.add("Fire Blast");}
        if(Selection == 116 && !this.TMInventory.contains("Waterfall")){this.TMInventory.add("Waterfall");}
        if(Selection == 117 && !this.TMInventory.contains("Amnesia")){this.TMInventory.add("Amnesia");}
        if(Selection == 118 && !this.TMInventory.contains("Leech Life")){this.TMInventory.add("Leech Life");}
        if(Selection == 119 && !this.TMInventory.contains("Tri Attack")){}
        if(Selection == 120 && !this.TMInventory.contains("Substitute")){this.TMInventory.add("Substitute");}
        if(Selection == 121 && !this.TMInventory.contains("Reversal")){this.TMInventory.add("Reversal");}
        if(Selection == 122 && !this.TMInventory.contains("Sludge Bomb")){this.TMInventory.add("Sludge Bomb");}
        if(Selection == 123 && !this.TMInventory.contains("Spikes")){this.TMInventory.add("Spikes");}
        if(Selection == 124 && !this.TMInventory.contains("Outrage")){this.TMInventory.add("Outrage");}
        if(Selection == 125 && !this.TMInventory.contains("Psyshock")){this.TMInventory.add("Psyshock");}
        if(Selection == 126 && !this.TMInventory.contains("Endure")){this.TMInventory.add("Endure");}
        if(Selection == 127 && !this.TMInventory.contains("Sleep Talk")){this.TMInventory.add("Sleep Talk");}
        if(Selection == 128 && !this.TMInventory.contains("Megahorn")){}
        if(Selection == 129 && !this.TMInventory.contains("Baton Pass")){this.TMInventory.add("Baton Pass");}
        if(Selection == 130 && !this.TMInventory.contains("Encore")){this.TMInventory.add("Encore");}
        if(Selection == 131 && !this.TMInventory.contains("Iron Tail")){this.TMInventory.add("Iron Tail");}
        if(Selection == 132 && !this.TMInventory.contains("Crunch")){this.TMInventory.add("Crunch");}
        if(Selection == 133 && !this.TMInventory.contains("Shadow Ball")){this.TMInventory.add("Shadow Ball");}
        if(Selection == 134 && !this.TMInventory.contains("Future Sight")){this.TMInventory.add("Future Sight");}
        if(Selection == 135 && !this.TMInventory.contains("Uproar")){this.TMInventory.add("Uproar");}
        if(Selection == 136 && !this.TMInventory.contains("Heat Wave")){this.TMInventory.add("Heat Wave");}
        if(Selection == 137 && !this.TMInventory.contains("Taunt")){this.TMInventory.add("Taunt");}
        if(Selection == 138 && !this.TMInventory.contains("Trick")){}
        if(Selection == 139 && !this.TMInventory.contains("Superpower")){this.TMInventory.add("Superpower");}
        if(Selection == 140 && !this.TMInventory.contains("Skill Swap")){}
        if(Selection == 141 && !this.TMInventory.contains("Blaze Kick")){this.TMInventory.add("Blaze Kick");}
        if(Selection == 142 && !this.TMInventory.contains("Hyper Voice")){this.TMInventory.add("Hyper Voice");}
        if(Selection == 143 && !this.TMInventory.contains("Overheat")){this.TMInventory.add("Overheat");}
        if(Selection == 144 && !this.TMInventory.contains("Cosmic Power")){}
        if(Selection == 145 && !this.TMInventory.contains("Muddy Water")){this.TMInventory.add("Muddy Water");}
        if(Selection == 146 && !this.TMInventory.contains("Iron Defense")){this.TMInventory.add("Iron Defense");}
        if(Selection == 147 && !this.TMInventory.contains("Dragon Claw")){this.TMInventory.add("Dragon Claw");}
        if(Selection == 148 && !this.TMInventory.contains("Bulk Up")){this.TMInventory.add("Bulk Swap");}
        if(Selection == 149 && !this.TMInventory.contains("Calm Mind")){this.TMInventory.add("Calm Mind");}
        if(Selection == 150 && !this.TMInventory.contains("Leaf Blade")){this.TMInventory.add("Leaf Blade");}
        if(Selection == 151 && !this.TMInventory.contains("Dragon Dance")){this.TMInventory.add("Dragon Dance");}
        if(Selection == 152 && !this.TMInventory.contains("Gyro Ball")){this.TMInventory.add("Gyro Ball");}
        if(Selection == 153 && !this.TMInventory.contains("Close Combat")){this.TMInventory.add("Close Combat");}
        if(Selection == 154 && !this.TMInventory.contains("Toxic Spikes")){this.TMInventory.add("Toxic Spikes");}
        if(Selection == 155 && !this.TMInventory.contains("Flare Blitz")){this.TMInventory.add("Flare Blitz");}
        if(Selection == 156 && !this.TMInventory.contains("Aura Sphere")){this.TMInventory.add("Aura Sphere");}
        if(Selection == 157 && !this.TMInventory.contains("Poison Jab")){this.TMInventory.add("Poison Jab");}
        if(Selection == 158 && !this.TMInventory.contains("Dark Pulse")){this.TMInventory.add("Dark Pulse");}
        if(Selection == 159 && !this.TMInventory.contains("Seed Bomb")){this.TMInventory.add("Seed Bomb");}
        if(Selection == 160 && !this.TMInventory.contains("X-Scissor")){this.TMInventory.add("X-Scissor");}
        if(Selection == 161 && !this.TMInventory.contains("Bug Buzz")){this.TMInventory.add("Bug Buzz");}
        if(Selection == 162 && !this.TMInventory.contains("Dragon Pulse")){this.TMInventory.add("Dragon Pulse");}
        if(Selection == 163 && !this.TMInventory.contains("Power Gem")){}
        if(Selection == 164 && !this.TMInventory.contains("Focus Blast")){this.TMInventory.add("Focus Blast");}
        if(Selection == 165 && !this.TMInventory.contains("Energy Ball")){this.TMInventory.add("Energy Ball");}
        if(Selection == 166 && !this.TMInventory.contains("Brave Bird")){this.TMInventory.add("Brave Bird");}
        if(Selection == 167 && !this.TMInventory.contains("Earth Power")){this.TMInventory.add("Earth Power");}
        if(Selection == 168 && !this.TMInventory.contains("Nasty Plot")){this.TMInventory.add("Nasty Plot");}
        if(Selection == 169 && !this.TMInventory.contains("Zen Headbutt")){this.TMInventory.add("Zen Headbutt");}
        if(Selection == 170 && !this.TMInventory.contains("Flash Cannon")){this.TMInventory.add("Flash Cannon");}
        if(Selection == 171 && !this.TMInventory.contains("Leaf Storm")){this.TMInventory.add("Leaf Storm");}
        if(Selection == 172 && !this.TMInventory.contains("Power Whip")){this.TMInventory.add("Power Whip");}
        if(Selection == 173 && !this.TMInventory.contains("Gunk Shot")){}
        if(Selection == 174 && !this.TMInventory.contains("Iron Head")){this.TMInventory.add("Iron Head");}
        if(Selection == 175 && !this.TMInventory.contains("Stone Edge")){this.TMInventory.add("Stone Edge");}
        if(Selection == 176 && !this.TMInventory.contains("Stealth Rock")){}
        if(Selection == 177 && !this.TMInventory.contains("Grass Knot")){this.TMInventory.add("Grass Knot");}
        if(Selection == 178 && !this.TMInventory.contains("Sludge Wave")){this.TMInventory.add("Sludge Wave");}
        if(Selection == 179 && !this.TMInventory.contains("Heavy Slam")){this.TMInventory.add("Heavy Slam");}
        if(Selection == 180 && !this.TMInventory.contains("Electro Ball")){this.TMInventory.add("Electro Ball");}
        if(Selection == 181 && !this.TMInventory.contains("Foul Play")){this.TMInventory.add("Foul Play");}
        if(Selection == 182 && !this.TMInventory.contains("Stored Power")){this.TMInventory.add("Stored Power");}
        if(Selection == 183 && !this.TMInventory.contains("Ally Switch")){this.TMInventory.add("Ally Switch");}
        if(Selection == 184 && !this.TMInventory.contains("Scald")){this.TMInventory.add("Scald");}
        if(Selection == 185 && !this.TMInventory.contains("Work Up")){this.TMInventory.add("Work Up");}
        if(Selection == 186 && !this.TMInventory.contains("Wild Charge")){this.TMInventory.add("Wild Charge");}
        if(Selection == 187 && !this.TMInventory.contains("Drill Run")){}
        if(Selection == 188 && !this.TMInventory.contains("Heat Crash")){this.TMInventory.add("Heat Crash");}
        if(Selection == 189 && !this.TMInventory.contains("Hurricane")){this.TMInventory.add("Hurricane");}
        if(Selection == 190 && !this.TMInventory.contains("Play Rough")){this.TMInventory.add("Play Rough");}
        if(Selection == 191 && !this.TMInventory.contains("Venom Drench")){this.TMInventory.add("Venom Drench");}
        if(Selection == 192 && !this.TMInventory.contains("Dazzling  Gleam")){this.TMInventory.add("Dazzling Gleam");}
        if(Selection == 193 && !this.TMInventory.contains("Darkest Lariat")){}
        if(Selection == 194 && !this.TMInventory.contains("High Horsepower")){}
        if(Selection == 195 && !this.TMInventory.contains("Throat Chop")){this.TMInventory.add("Throat Chop");}
        if(Selection == 196 && !this.TMInventory.contains("Pollen Puff")){this.TMInventory.add("Pollen Puff");}
        if(Selection == 197 && !this.TMInventory.contains("Psychic Fangs")){this.TMInventory.add("Psychic Fangs");}
        if(Selection == 198 && !this.TMInventory.contains("Liquidation")){this.TMInventory.add("Liquidation");}
        if(Selection == 199 && !this.TMInventory.contains("Body Press")){this.TMInventory.add("Body Press");}
        if(Selection == 201 && !this.TMInventory.contains("Focus Punch")){this.TMInventory.add("Focus Punch");}
        if(Selection == 203 && !this.TMInventory.contains("Water Pulse")){this.TMInventory.add("Water Pulse");}
        if(Selection == 205 && !this.TMInventory.contains("Roar")){this.TMInventory.add("Roar");}
        if(Selection == 206 && !this.TMInventory.contains("Toxic")){this.TMInventory.add("Toxic");}
        if(Selection == 222 && !this.TMInventory.contains("Solar Beam")){this.TMInventory.add("Solar Beam");}
        if(Selection == 232 && !this.TMInventory.contains("Double Team")){this.TMInventory.add("Double Team");}
        if(Selection == 234 && !this.TMInventory.contains("Shock Wave")){this.TMInventory.add("Shock Wave");}
        if(Selection == 240 && !this.TMInventory.contains("Aerial Ace")){this.TMInventory.add("Aerial Ace");}
        if(Selection == 241 && !this.TMInventory.contains("Torment")){this.TMInventory.add("Torment");}
        if(Selection == 251 && !this.TMInventory.contains("Roost")){this.TMInventory.add("Roost");}
        if(Selection == 257 && !this.TMInventory.contains("Charge Beam")){this.TMInventory.add("Charge Beam");}
        if(Selection == 264 && !this.TMInventory.contains("Explosion")){this.TMInventory.add("Explosion");}
        if(Selection == 267 && !this.TMInventory.contains("Recycle")){this.TMInventory.add("Recycle");}
        if(Selection == 269 && !this.TMInventory.contains("Rock Polish")){this.TMInventory.add("Rock Polish");}
        if(Selection == 270 && !this.TMInventory.contains("Flash")){this.TMInventory.add("Flash");}
        if(Selection == 277 && !this.TMInventory.contains("Psych Up")){this.TMInventory.add("Psych Up");}
        if(Selection == 285 && !this.TMInventory.contains("Dream Eater")){this.TMInventory.add("Dream Eater");}
        if(Selection == 287 && !this.TMInventory.contains("Swagger")){this.TMInventory.add("Swagger");}
        if(Selection == 288 && !this.TMInventory.contains("Pluck")){this.TMInventory.add("Pluck");}
        if(Selection == 293 && !this.TMInventory.contains("Cut")){this.TMInventory.add("Cut");}
        if(Selection == 296 && !this.TMInventory.contains("Strength")){this.TMInventory.add("Strength");}
        if(Selection == 297 && !this.TMInventory.contains("Defog")){this.TMInventory.add("Defog");}
        if(Selection == 298 && !this.TMInventory.contains("Rock Smash")){this.TMInventory.add("Rock Smash");}
        if(Selection == 300 && !this.TMInventory.contains("Rock Climb")){}
        if(this.TMInventory.size() > currentSize){System.out.println("You got TM" + Selection);}
    }
}
