package Interfaces;

import BattleMechanics.Moves;
import Moveset.Bug.*;
import Moveset.Dark.*;
import Moveset.Dragon.*;
import Moveset.Electric.*;
import Moveset.EnemyChange.*;
import Moveset.Fairy.*;
import Moveset.Fighting.*;
import Moveset.Fire.*;
import Moveset.Flying.*;
import Moveset.Ghost.*;
import Moveset.Grass.*;
import Moveset.Ground.*;
import Moveset.Heal.*;
import Moveset.Ice.*;
import Moveset.Normal.*;
import Moveset.Poison.*;
import Moveset.Psychic.*;
import Moveset.Rock.*;
import Moveset.SelfChange.*;
import Moveset.Steel.*;
import Moveset.SwapPower.*;
import Moveset.SwitchPoke.*;
import Moveset.Water.*;

public interface AddMoveset {

    default Moves addTwister(){return new Twister();}
    default Moves addPound(){ return new Pound(); }
    default Moves addTackle() { return new Tackle(); }
    default Moves addGrowl(){ return new Growl(); }
    default Moves addVineWhip(){ return new VineWhip(); }
    default Moves addGrowth(){ return new Growth(); }
    default Moves addLeechSeed(){ return new LeechSeed(); }
    default Moves addScratch(){ return new Scratch(); }
    default Moves addEmber(){ return new Ember(); }
    default Moves addTailWhip(){ return new TailWhip();}
    default Moves addWaterGun(){ return new WaterGun(); }
    default Moves addWithdraw(){ return new Withdraw(); }
    default Moves addRazorLeaf(){ return new RazorLeaf(); }
    default Moves addPoisonPowder(){ return new PoisonPowder(); }
    default Moves addSleepPowder(){return new SleepPowder();}
    default Moves addSeedBomb(){ return new SeedBomb(); }
    default Moves addTakeDown(){ return new TakeDown(); }
    default Moves addSweetScent(){ return new SweetScent(); }
    default Moves addSynthesis(){ return new Synthesis(); }
    default Moves addWorrySeed() { return  new WorrySeed();}
    default Moves addDoubleEdge(){return new DoubleEdge();}
    default Moves addSolarBeam(){return new SolarBeam();}
    default Moves addMagicalLeaf(){return new MagicalLeaf();}
    default Moves addLightScreen(){return new LightScreen();}
    default Moves addSafegaurd(){return new Safegaurd();}
    default Moves addRest(){return new Rest();}
    default Moves addSnore(){return new Snore();}
    default Moves addProtect(){return new Protect();}
    default Moves addGigaDrain(){return new GigaDrain();}
    default Moves addCharm(){return new Charm();}
    default Moves addAttract(){return new Attract();}
    default Moves addSunnyDay(){return new SunnyDay();}
    default Moves addFacade(){return new Facade();}
    default Moves addHelpingHand(){return new HelpingHand();}
    default Moves addWeatherBall(){return new WeatherBall();}
    default Moves addVenoshock(){return new Venoshock();}
    default Moves addBulletSeed(){return new BulletSeed();}
    default Moves addRound(){return new Round();}
    default Moves addGrassyTerrain(){return new GrassyTerrain();}
    default Moves addFalseSwipe(){return new FalseSwipe();}
    default Moves addSwordsDance(){return new SwordsDance();}
    default Moves addBodySlam(){return new BodySlam();}
    default Moves addAmnesia(){return new Amnesia();}
    default Moves addSubstitute(){return new Substitute();}
    default Moves addSludgeBomb(){return new SludgeBomb();}
    default Moves addSleepTalk(){return new SleepTalk();}
    default Moves addEndure(){return new Endure();}
    default Moves addEnergyBall(){return new EnergyBall();}
    default Moves addLeafStorm(){return new LeafStorm();}
    default Moves addPowerWhip(){return new PowerWhip();}
    default Moves addGrassKnot(){return new GrassKnot();}
    default Moves addWorkUp(){return new WorkUp();}
    default Moves addHyperBeam(){return new HyperBeam();}
    default Moves addPetalBlizzard(){return new PetalBlizzard();}
    default Moves addPetalDance(){return new PetalDance();}
    default Moves addGigaImpact(){return new GigaImpact();}
    default Moves addBulldoze(){return new Bulldoze();}
    default Moves addOutrage(){return new Outrage();}
    default Moves addEarthPower(){return new EarthPower();}
    default Moves addSmokescreen(){return new Smokescreen();}
    default Moves addDragonBreath(){return new DragonBreath();}
    default Moves addFireFang(){return new FireFang();}
    default Moves addSlash(){return new Slash();}
    default Moves addFlamethrower(){return new Flamethrower();}
    default Moves addScaryFace(){return new ScaryFace();}
    default Moves addFireSpin(){return new FireSpin();}
    default Moves addInferno(){return new Inferno();}
    default Moves addFlareBlitz(){return new FlareBlitz();}
    default Moves addMegaPunch(){return new MegaPunch();}
    default Moves addMegaKick(){return new MegaKick();}
    default Moves addFirePunch(){return new FirePunch();}
    default Moves addThunderPunch(){return new ThunderPunch();}
    default Moves addDig(){return new Dig();}
    default Moves addRockSlide(){return new RockSlide();}
    default Moves addBeatUp(){return new BeatUp();}
    default Moves addWillOWisp(){return new WillOWisp();}
    default Moves addSwift(){return new Swift();}
    default Moves addBrickBreak(){return new BrickBreak();}
    default Moves addRockTomb(){return new RockTomb();}
    default Moves addFling(){return new Fling();}
    default Moves addShadowClaw(){return new ShadowClaw();}
    default Moves addAcrobatics(){return new Acrobatics();}
    default Moves addFireBlast(){return new FireBlast();}
    default Moves addIronTail(){return new IronTail();}
    default Moves addCrunch(){return new Crunch();}
    default Moves addHeatWave(){return new HeatWave();}
    default Moves addOverheat(){return new Overheat();}
    default Moves addDragonClaw(){return new DragonClaw();}
    default Moves addDragonDance(){return new DragonDance();}
    default Moves addDragonPulse(){return new DragonPulse();}
    default Moves addAirSlash(){return new AirSlash();}
    default Moves addFly(){return new Fly();}
    default Moves addSteelWing(){return new SteelWing();}
    default Moves addMysticFire(){return new MysticFire();}
    default Moves addBrutalSwing(){return new BrutalSwing();}
    default Moves addBreakingSwing(){return new BreakingSwing();}
    default Moves addEarthquake(){return new Earthquake();}
    default Moves addBlazeKick(){return new BlazeKick();}
    default Moves addFocusBlast(){return new FocusBlast();}
    default Moves addHeatCrash(){return new HeatCrash();}
    default Moves addHurricane(){return new Hurricane();}
    default Moves addRapidSpin(){return new RapidSpin();}
    default Moves addBite(){return new Bite();}
    default Moves addWaterPulse(){return new WaterPulse();}
    default Moves addRainDance(){return new RainDance();}
    default Moves addAquaTail(){return new AquaTail();}
    default Moves addShellSmash(){return new ShellSmash();}
    default Moves addIronDefense(){return new IronDefense();}
    default Moves addHydroPump(){return new HydroPump();}
    default Moves addSkullBash(){return new SkullBash();}
    default Moves addIcePunch(){return new IcePunch();}
    default Moves addIcyWind(){return new IcyWind();}
    default Moves addHail(){return new Hail();}
    default Moves addWhirlpool(){return new Whirlpool();}
    default Moves addDive(){return new Dive();}
    default Moves addBrine(){return new Brine();}
    default Moves addSurf(){return new Surf();}
    default Moves addIceBeam(){return new IceBeam();}
    default Moves addStompingTantrum(){return new StompingTantrum();}
    default Moves addBlizzard(){return new Blizzard();}
    default Moves addWaterfall(){return new Waterfall();}
    default Moves addMuddyWater(){return new MuddyWater();}
    default Moves addGyroBall(){return new GyroBall();}
    default Moves addAuraSphere(){return new AuraSphere();}
    default Moves addZenHeadbutt(){return new ZenHeadbutt();}
    default Moves addScald(){return new Scald();}
    default Moves addFlashCannon(){return new FlashCannon();}
    default Moves addLiquidation(){return new Liquidation();}
    default Moves addBodyPress(){return new BodyPress();}
    default Moves addStringShot(){return new StringShot();}
    default Moves addBugBite(){return new BugBite();}
    default Moves addElectroweb(){return new Electroweb();}
    default Moves addHarden(){return new Harden();}
    default Moves addGust(){return new Gust();}
    default Moves addSupersonic(){return new Supersonic();}
    default Moves addConfusion(){return new Confusion();}
    default Moves addStunSpore(){return new StunSpore();}
    default Moves addPsybeam(){return new Psybeam();}
    default Moves addWhirlwind(){return new Whirlwind();}
    default Moves addBugBuzz(){return new BugBuzz();}
    default Moves addTailwind(){return new Tailwind();}
    default Moves addRagePowder(){return new RagePowder();}
    default Moves addQuiverDance(){return new QuiverDance();}
    default Moves addThief(){return new Thief();}
    default Moves addUTurn(){return new UTurn();}
    default Moves addDrainingKiss(){return new DrainingKiss();}
    default Moves addPsychic(){return new Psychic();}
    default Moves addBatonPass(){return new BatonPass();}
    default Moves addShadowBall(){return new ShadowBall();}
    default Moves addSkillSwap(){return new SkillSwap();}
    default Moves addPollenPuff(){return new PollenPuff();}
    default Moves addToxic(){return new Toxic();}
    default Moves addHiddenPower(){return new HiddenPower();}
    default Moves addRoost(){return new Roost();}
    default Moves addFrustration(){return new Frustration();}
    default Moves addReturn(){return new Return();}
    default Moves addDoubleTeam(){return new DoubleTeam();}
    default Moves addAerialAce(){return new AerialAce();}
    default Moves addSwagger(){return new Swagger();}
    default Moves addSecretPower(){return new SecretPower();}
    default Moves addConfide(){return new Confide();}
    default Moves addSandAttack(){return new SandAttack();}
    default Moves addQuickAttack(){return new QuickAttack();}
    default Moves addFeatherDance(){return new FeatherDance();}
    default Moves addAgility(){return new Agility();}
    default Moves addWingAttack(){return new WingAttack();}
    default Moves addMirrorMoves(){return new MirrorMove();}
    default Moves addFocusEnergy(){return new FocusEnergy();}
    default Moves addPursuit(){return new Pursuit();}
    default Moves addAssurance(){return new Assurance();}
    default Moves addLaserFocus(){return new LaserFocus();}
    default Moves addSuckerPunch(){return new SuckerPunch();}
    default Moves addSuperFang(){return new SuperFang();}
    default Moves addEndeavor(){return new Endeavor();}
    default Moves addHyperFang(){return new HyperFang();}
    default Moves addTaunt(){return new Taunt();}
    default Moves addThunderbolt(){return new Thunderbolt();}
    default Moves addThunder(){return new Thunder();}
    default Moves addTorment(){return new Torment();}
    default Moves addChargeBeam(){return new ChargeBeam();}
    default Moves addQuash(){return new Quash();}
    default Moves addEmbargo(){return new Embargo();}
    default Moves addThunderWave(){return new ThunderWave();}
    default Moves addWildCharge(){return new WildCharge();}
    default Moves addSnarl(){return new Snarl();}
    default Moves addDarkPulse(){return new DarkPulse();}
    default Moves addPluck(){return new Pluck();}
    default Moves addCut(){return new Cut();}
    default Moves addRockSmash(){return new RockSmash();}
    default Moves addShockWave(){return new ShockWave();}
    default Moves addRoar(){return new Roar();}
    default Moves addStrength(){return new Strength();}
    default Moves addBulkUp(){return new BulkUp();}
    default Moves addSludgeWave(){return new SludgeWave();}
    default Moves addDefenseCurl(){return new DefenseCurl();}
    default Moves addFurySwipes(){return new FurySwipes();}
    default Moves addFollowMe(){return new FollowMe();}
    default Moves addSlam(){return new Slam();}
    default Moves addReversal(){return new Reversal();}
    default Moves addHyperVoice(){return new HyperVoice();}
    default Moves addFocusPunch(){return new FocusPunch();}
    default Moves addCoil(){return new Coil();}
    default Moves addMeFirst(){return new MeFirst();}
    default Moves addPeck(){return new Peck();}
    default Moves addEchoedVoice(){return new EchoedVoice();}
    default Moves addReflect(){return new Reflect();}
    default Moves addPsychoShift(){return new PsychoShift();}
    default Moves addExtrasensory(){return new Extrasensory();}
    default Moves addUproar(){return new Uproar();}
    default Moves addMoonblast(){return new Moonblast();}
    default Moves addHypnosis(){return new Hypnosis();}
    default Moves addDreamEater(){return new DreamEater();}
    default Moves addScreech(){return new Screech();}
    default Moves addImprison(){return new Imprison();}
    default Moves addCalmMind(){return new CalmMind();}
    default Moves addNastyPlot(){return new NastyPlot();}
    default Moves addRecycle(){return new Recycle();}
    default Moves addPsychUp(){return new PsychUp();}
    default Moves addDefog(){return new Defog();}
    default Moves addSkyAttack(){return new SkyAttack();}
    default Moves addFutureSight(){return new FutureSight();}
    default Moves addStoredPower(){return new StoredPower();}
    default Moves addMachPunch(){return new MachPunch();}
    default Moves addStruggleBug(){return new StruggleBug();}
    default Moves addDrainPunch(){return new DrainPunch();}
    default Moves addFlash(){return new Flash();}
    default Moves addPoisonSting(){return new PoisonSting();}
    default Moves addAbsorb(){return new Absorb();}
    default Moves addInfestation(){return new Infestation();}
    default Moves addNightShade(){return new NightShade();}
    default Moves addShadowSneak(){return new ShadowSneak();}
    default Moves addLeechLife(){return new LeechLife();}
    default Moves addPinMissle(){return new PinMissle();}
    default Moves addPoisonJab(){return new PoisonJab();}
    default Moves addCrossPoison(){return new CrossPoison();}
    default Moves addStickyWeb(){return new StickyWeb();}
    default Moves addToxicThread(){return new ToxicThread();}
    default Moves addXScissor(){return new XScissor();}
    default Moves addVenomDrench(){return new VenomDrench();}
    default Moves addFellStinger(){return new FellStinger();}
    default Moves addSandstorm(){return new Sandstorm();}
    default Moves addExplosion(){return new Explosion();}
    default Moves addPayback(){return new Payback();}
    default Moves addSelfDestruct(){return new SelfDestruct();}
    default Moves addAutotomize(){return new Autotomize();}
    default Moves addRollout(){return new Rollout();}
    default Moves addSpikes(){return new Spikes();}
    default Moves addToxicSpikes(){return new ToxicSpikes();}
    default Moves addMagnetRise(){return new MagnetRise();}
    default Moves addZapCannon(){return new ZapCannon();}
    default Moves addHeavySlam(){return new HeavySlam();}
    default Moves addVoltSwitch(){return new VoltSwitch();}
    default Moves addRockPolish(){return new RockPolish();}
    default Moves addMorningSun(){return new MorningSun();}
    default Moves addAirCutter(){return new AirCutter();}
    default Moves addMegaDrain(){return new MegaDrain();}
    default Moves addMoonlight(){return new Moonlight();}
    default Moves addHowl(){return new Howl();}
    default Moves addMudSlap(){return new MudSlap();}
    default Moves addHeadbutt(){return new Headbutt();}
    default Moves addYawn(){return new Yawn();}
    default Moves addPlayRough(){return new PlayRough();}
    default Moves addThunderFang(){return new ThunderFang();}
    default Moves addIceFang(){return new IceFang();}
    default Moves addNuzzle(){return new Nuzzle();}
    default Moves addPlayNice(){return new PlayNice();}
    default Moves addSpark(){return new Spark();}
    default Moves addEncore(){return new Encore();}
    default Moves addElectroBall(){return new ElectroBall();}
    default Moves addCopycat(){return new Copycat();}
    default Moves addCharge(){return new Charge();}
    default Moves addDischarge(){return new Discharge();}
    default Moves addLastResort(){return new LastResort();}
    default Moves addEntrainment(){return new Entrainment();}
    default Moves addFakeTears(){return new FakeTears();}
    default Moves addEerieImpulse(){return new EerieImpulse();}
    default Moves addPsychicFangs(){return new PsychicFangs();}
    default Moves addLeer(){return new Leer();}
    default Moves addThunderShock(){return new ThunderShock();}
    default Moves addElectricTerrain(){return new ElectricTerrrain();}
    default Moves addSuperpower(){return new Superpower();}
    default Moves addThroatChop(){return new ThroatChop();}
    default Moves addAcid(){return new Acid();}
    default Moves addDazzlingGleam(){return new DazzlingGleam();}
    default Moves addAromatherapy(){return new Aromatherapy();}
    default Moves addLeafBlade(){return new LeafBlade();}
    default Moves addWrap(){return new Wrap();}
    default Moves addKnockOff(){return new KnockOff();}
    default Moves addGastroAcid(){return new GastroAcid();}
    default Moves addLeafTornado(){return new LeafTornado();}
    default Moves addStockpile(){return new Stockpile();}
    default Moves addSpitUp(){return new SpitUp();}
    default Moves addSwallow(){return new Swallow();}
    default Moves addMist(){return new Mist();}
    default Moves addPowderSnow(){return new PowderSnow();}
    default Moves addIceShard(){return new IceShard();}
    default Moves addAncientPower(){return new AncientPower();}
    default Moves addFreezeDry(){return new FreezeDry();}
    default Moves addMindReader(){return new MindReader();}
    default Moves addSheerCold(){return new SheerCold();}
    default Moves addIcicleSpear(){return new IcicleSpear();}
    default Moves addAvalanche(){return new Avalanche();}
    default Moves addBraveBird(){return new BraveBird();}
    default Moves addPsychoCut(){return new PsychoCut();}
    default Moves addRecover(){return new Recover();}
    default Moves addFreezingGlare(){return new FreezingGlare();}
    default Moves addTrickRoom(){return new TrickRoom();}
    default Moves addPowerSwap(){return new PowerSwap();}
    default Moves addGuardSwap(){return new GuardSwap();}
    default Moves addPsyshock(){return new Psyshock();}
    default Moves addAllySwitch(){return new AllySwitch();}
    default Moves addDrillPeck(){return new DrillPeck();}
    default Moves addDetect(){return new Detect();}
    default Moves addMagneticFlux(){return new MagneticFlux();}
    default Moves addQuickGuard(){return new QuickGuard();}
    default Moves addThunderousKick(){return new ThunderousKick();}
    default Moves addCounter(){return new Counter();}
    default Moves addCloseCombat(){return new CloseCombat();}
    default Moves addRevenge(){return new Revenge();}
    default Moves addBounce(){return new Bounce();}
    default Moves addLowSweep(){return new LowSweep();}
    default Moves addRetaliate(){return new Retaliate();}
    default Moves addLowKick(){return new LowKick();}
    default Moves addIncinerate(){return new Incinerate();}
    default Moves addBurnUp(){return new BurnUp();}
    default Moves addFieryWrath(){return new FieryWrath();}
    default Moves addMemento(){return new Memento();}
    default Moves addHex(){return new Hex();}
    default Moves addFoulPlay(){return new FoulPlay();}
    default Moves addDragonTail(){return new DragonTail();}
    default Moves addDragonRush(){return new DragonRush();}
    default Moves addExtremeSpeed(){return new ExtremeSpeed();}
    default Moves addIronHead(){return new IronHead();}
    default Moves addStoneEdge(){return new StoneEdge();}
    default Moves addBide(){return new Bide();}
    default Moves addMeanLook(){return new MeanLook();}
    default Moves addConfuseRay(){return new ConfuseRay();}
    default Moves addRototiller(){return new Rototiller();}
    default Moves addBabyDollEyes(){return new BabyDollEyes();}
    default Moves addDisarmingVoice(){return new DisarmingVoice();}
    default Moves addLifeDew(){return new LifeDew();}
    default Moves addSimpleBeam(){return new SimpleBeam();}
    default Moves addHealPulse(){return new HealPulse();}
    default Moves addMistyTerrain(){return new MistyTerrain();}
    default Moves addHighJumpKick(){return new HighJumpKick();}
    default Moves addHeadSmash(){return new HeadSmash();}
    default Moves addFlail(){return new Flail();}
    default Moves addAquaJet(){return new AquaJet();}
    default Moves addSoak(){return new Soak();}
    default Moves addFinalGambit(){return new FinalGambit();}
    default Moves addThrash(){return new Thrash();}
    default Moves addMudShot(){return new MudShot();}
    default Moves addWaveCrash(){return new WaveCrash();}
    default Moves addOminousWind(){return new OminousWind();}
    default Moves addSplash(){return new Splash();}
    default Moves addAquaRing(){return new AquaRing();}
    default Moves addFuryCutter(){return new FuryCutter();}
    default Moves addSolarBlade(){return new SolarBlade();}
    default Moves addFirstImpression(){return new FirstImpression();}
    default Moves addMeteorAssault(){return new MeteorAssault();}
    default Moves addSing(){return new Sing();}
    default Moves addSweetKiss(){return new SweetKiss();}
    default Moves addDisable(){return new Disable();}
    default Moves addCovet(){return new Covet();}
    default Moves addTriAttack(){return new TriAttack();}
    default Moves addStealthRock(){return new StealthRock();}
    default Moves addMagicRoom(){return new MagicRoom();}
    default Moves addGlare(){return new Glare();}
    default Moves addDrillRun(){return new DrillRun();}
    default Moves addFuryAttack(){return new FuryAttack();}
    default Moves addFlameCharge(){return new FlameCharge();}
    default Moves addRockBlast(){return new RockBlast();}
    default Moves addSmackDown(){return new SmackDown();}
}
