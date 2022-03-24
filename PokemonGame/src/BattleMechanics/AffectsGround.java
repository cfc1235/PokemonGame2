package BattleMechanics;

import PokemonCreation.Pokemon;

public class AffectsGround {

    private Boolean stickyWebAgainstAI = false;
    private Boolean StickyWebAgainstPlayer = false;
    private int spikeAgainstAILayers = 0;
    private int spikeAgainstPlayerLayers = 0;
    private Boolean toxicSpikeAgainstAILayer = false;
    private Boolean toxicSpikeAgainstPlayerLayer = false;

    public AffectsGround() {
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

    public void playerPokeGroundOnSwitch(Pokemon playerPoke) {
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
                playerPoke.changeHP((int) (playerPoke.showHP() * damageAmount));
            }
            if (this.toxicSpikeAgainstPlayerLayer) {
                if (playerPoke.showType1().equals("Poison") ||
                playerPoke.showType2().equals("Poison")){
                    this.toxicSpikeAgainstPlayerLayer = false;
                }
                else {
                    if(!playerPoke.showType2().equals("Steel") ||
                    !playerPoke.showType1().equals("Steel")){
                        playerPoke.Poison();
                    }
                }
            }
        }
    }

    public void AIPokeGroundOnSwitch(Pokemon AIPoke) {
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
                        AIPoke.Poison();
                    }
                }
            }
        }
    }
}
