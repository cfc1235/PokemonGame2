package BattleMechanics;

import PokemonCreation.Pokemon;
import Weather.Weather;

public class AffectsGround {

    private Boolean stickyWebAgainstAI = false;
    private Boolean StickyWebAgainstPlayer = false;
    private int spikeAgainstAILayers = 0;
    private int spikeAgainstPlayerLayers = 0;
    private Boolean toxicSpikeAgainstAILayer = false;
    private Boolean toxicSpikeAgainstPlayerLayer = false;
    private Boolean stealthRockAgainstPlayer = false;
    private Boolean stealthRockAgainstAI = false;

    public AffectsGround() {
    }

    public void setStealthRockAgainstPlayer(){
        this.stealthRockAgainstPlayer = true;
    }
    public void setStealthRockAgainstAI(){
        this.stealthRockAgainstAI = true;
    }
    public Boolean getStealthRockAgainstPlayer(){
        return this.stealthRockAgainstPlayer;
    }
    public Boolean getStickyWebAgainstAI(){
        return this.stealthRockAgainstAI;
    }
    public void addToPlayerSpikeLayers() {
        if (this.spikeAgainstPlayerLayers < 3) {
            this.spikeAgainstPlayerLayers += 1;
        }
    }

    public void setToxicSpikeAgainstAILayer() {
        this.toxicSpikeAgainstAILayer = true;
    }

    public void setGetToxicSpikeAgainstPlayerLayer() {
        this.toxicSpikeAgainstPlayerLayer = true;
    }

    public void setStickyWebAgainstPlayer() {
        this.StickyWebAgainstPlayer = true;
    }

    public void addToAISpikeLayers() {
        if (this.spikeAgainstAILayers < 3) {
            this.spikeAgainstAILayers += 1;
        }
    }

    public void setStickyWebAgainstAI() {
        this.stickyWebAgainstAI = true;
    }

    public void playerPokeGroundOnSwitch(Pokemon playerPoke, Pokemon AIPoke,
                                          Weather weather) {
        if (!playerPoke.showType1().equals("Flying") ||
                !playerPoke.showType2().equals("Flying")) {
            if (this.StickyWebAgainstPlayer) {
                playerPoke.changeSpeedMult(-1);
            }
            if (this.spikeAgainstPlayerLayers > 0) {
                double damageAmount = 1;
                if (this.spikeAgainstPlayerLayers == 1) {
                    damageAmount = 1.0 / 8;
                }
                if (this.spikeAgainstPlayerLayers == 2) {
                    damageAmount = 1.0 / 6;
                }
                if (this.spikeAgainstPlayerLayers == 3) {
                    damageAmount = 1.0 / 4;
                }
                playerPoke.changeHP((int) (playerPoke.showSavedHP() * damageAmount));
            }
            if(this.stealthRockAgainstPlayer){
                double type = TypeChart.CalcTypeEffective(AIPoke, playerPoke,
                        "Rock", "");
                double damageAmount = 1;
                if(type == .25){
                    damageAmount = 1.0/32;
                }
                if(type == .5){
                    damageAmount = 1.0/16;
                }
                if(type == 1){
                    damageAmount = 1.0/8;
                }
                if(type == 2){
                    damageAmount = 1.0/4;
                }
                if(type == 4){
                    damageAmount = 1.0/2;
                }
                playerPoke.changeHP((int) (playerPoke.showSavedHP() * damageAmount));
            }
            if (this.toxicSpikeAgainstPlayerLayer) {
                if (playerPoke.showType1().equals("Poison") ||
                playerPoke.showType2().equals("Poison")){
                    this.toxicSpikeAgainstPlayerLayer = false;
                }
                else {
                    if(!playerPoke.showType2().equals("Steel") ||
                    !playerPoke.showType1().equals("Steel")){
                        playerPoke.Poison(weather);
                    }
                }
            }
        }
    }

    public void AIPokeGroundOnSwitch(Pokemon AIPoke, Pokemon playerPoke,
                                     Weather weather) {
        if (!AIPoke.showType1().equals("Flying") ||
                !AIPoke.showType2().equals("Flying")) {
            if (this.stickyWebAgainstAI) {
                AIPoke.changeSpeedMult(-1);
            }
            if (this.spikeAgainstAILayers > 0) {
                double damageAmount = 1;
                if (this.spikeAgainstAILayers == 1) {
                    damageAmount = 1.0 / 8;
                }
                if (this.spikeAgainstAILayers == 2) {
                    damageAmount = 1.0 / 6;
                }
                if (this.spikeAgainstAILayers == 3) {
                    damageAmount = 1.0 / 4;
                }
                AIPoke.changeHP((int) (AIPoke.showHP() * damageAmount));
            }
            if (this.toxicSpikeAgainstAILayer) {
                if (AIPoke.showType1().equals("Poison") ||
                        AIPoke.showType2().equals("Poison")) {
                    this.toxicSpikeAgainstAILayer = false;
                } else {
                    if (!AIPoke.showType2().equals("Steel") ||
                            !AIPoke.showType1().equals("Steel")) {
                        AIPoke.Poison(weather);
                    }
                }
            }
            if(this.stealthRockAgainstPlayer){
                double type = TypeChart.CalcTypeEffective(playerPoke, AIPoke,
                        "Rock", "");
                double damageAmount = 1;
                if(type == .25){
                    damageAmount = 1.0/32;
                }
                if(type == .5){
                    damageAmount = 1.0/16;
                }
                if(type == 1){
                    damageAmount = 1.0/8;
                }
                if(type == 2){
                    damageAmount = 1.0/4;
                }
                if(type == 4){
                    damageAmount = 1.0/2;
                }
                AIPoke.changeHP((int) (AIPoke.showSavedHP() * damageAmount));
            }
        }
    }
}
