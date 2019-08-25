package rtg.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import rtg.RTGConfig;
import rtg.api.RTGAPI;
import rtg.api.util.UtilityClass;
import rtg.api.world.biome.RealisticBiomeBase;
import rtg.util.ModCompat.Mods;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACCoraliumInfestedSwamp;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACDarklands;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACDarklandsForest;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACDarklandsHighland;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACDarklandsMountains;
import rtg.world.biome.realistic.abyssalcraft.RealisticBiomeACDarklandsPlains;
import rtg.world.biome.realistic.auxiliarybiomes.RealisticBiomeAUXForestedIsland;
import rtg.world.biome.realistic.auxiliarybiomes.RealisticBiomeAUXIceWasteland;
import rtg.world.biome.realistic.auxiliarybiomes.RealisticBiomeAUXMarsh;
import rtg.world.biome.realistic.auxiliarybiomes.RealisticBiomeAUXWasteland;
import rtg.world.biome.realistic.auxiliarybiomes.RealisticBiomeAUXWhiteForest;
import rtg.world.biome.realistic.betteragriculture.RealisticBiomeBAFarmlandBiome;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPAlps;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPAlpsFoothills;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPBambooForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPBayou;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPBog;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPBorealForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPBrushland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPChaparral;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPCherryBlossomGrove;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPColdDesert;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPConiferousForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPCoralReef;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPCrag;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPDeadForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPDeadSwamp;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPEucalyptusForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPFen;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPFlowerField;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPFlowerIsland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPGlacier;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPGrassland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPGravelBeach;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPGrove;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPHighland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPKelpForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPLandOfLakes;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPLavenderFields;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPLushDesert;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPLushSwamp;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMangrove;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMapleWoods;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMarsh;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMeadow;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMoor;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMountainFoothills;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMountainPeaks;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPMysticGrove;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOasis;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOminousWoods;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOrchard;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOriginBeach;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOriginIsland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOutback;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPOvergrownCliffs;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPPasture;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPPrairie;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPQuagmire;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPRainforest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPRedwoodForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPSacredSprings;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPSeasonalForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPShield;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPShrubland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPSnowyConiferousForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPSnowyForest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPSteppe;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPTemperateRainforest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPTropicalIsland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPTropicalRainforest;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPTundra;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPVolcanicIsland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPWasteland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPWetland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPWhiteBeach;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPWoodland;
import rtg.world.biome.realistic.biomesoplenty.RealisticBiomeBOPXericShrubland;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGAbyssalBog;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGAlliumFields;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGAlps;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGAncientForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGAstralIsle;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBambooForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBaobabSavanna;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBayou;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBlueTaiga;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBog;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGBorealForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGCanyons;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGChaparralLowlands;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGCherryGrove;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGCikaForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGConiferousForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGCosmicOcean;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGDeadSea;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGDeciduousForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGDunes;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGEbonyWoods;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGEnchantedForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGEucalyptusTropics;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGEvergreenTaiga;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGFrostyForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGFungalJungle;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGGlaciers;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGGlowshroomBayou;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGGrasslandPlateau;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGGreatLakes;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGGreatOakLowlands;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGJacarandaForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGLushDesert;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGMangroveMarshes;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGMapleForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGMeadow;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGOrchard;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGOutback;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGPaperBirchForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGPineMountains;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGPraire;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGQuagmire;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGRedDesert;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGRedOakForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGRedwoodTropics;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSavannaCanopy;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSeasonalBirchForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSeasonalDeciduous;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSeasonalForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSeasonalTaiga;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGShatteredDesert;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGShrublands;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSkyrisHighlands;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSnowyConiferousForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSnowyEvergeenTaiga;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSnowyPineMountains;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGSonoranDesert;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGStellataPasture;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGTropicalMountains;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGTropicalRainforest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGTundra;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGWeepingWitchForest;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGWhisperingWoods;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGWoodlands;
import rtg.world.biome.realistic.biomesyougo.RealisticBiomeBYGZelkovaForest;
import rtg.world.biome.realistic.bionisation.RealisticBiomeBIOInfectedForest;
import rtg.world.biome.realistic.buildcraft.RealisticBiomeBCDesertOilField;
import rtg.world.biome.realistic.buildcraft.RealisticBiomeBCOceanOilField;
import rtg.world.biome.realistic.candyworld.RealisticBiomeCWChocolateForest;
import rtg.world.biome.realistic.candyworld.RealisticBiomeCWCottonCandyPlains;
import rtg.world.biome.realistic.candyworld.RealisticBiomeCWGummySwamp;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLDesertDefiled;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLForestTenebra;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLForestVilespine;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLHillsDefiled;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLIcePlainsDefiled;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLPlainsDefiled;
import rtg.world.biome.realistic.defiledlands.RealisticBiomeDLSwampDefiled;
import rtg.world.biome.realistic.douglasforest.RealisticBiomeDFDouglasForest;
import rtg.world.biome.realistic.douglasforest.RealisticBiomeDFMapleForest;
import rtg.world.biome.realistic.floricraft.RealisticBiomeFLORIRoseLand;
import rtg.world.biome.realistic.floricraft.RealisticBiomeFLORITulipLand;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYRECrimsonGrove;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYREMegaMountains;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYREMushroomGrove;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYRERedDesert;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYRERedDesertHills;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYRERockyWasteland;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYRETropicalLakes;
import rtg.world.biome.realistic.fyrecraft.RealisticBiomeFYREVolcanicWasteland;
import rtg.world.biome.realistic.gravityfalls.RealisticBiomeGFGravityFalls;
import rtg.world.biome.realistic.gravityfalls.RealisticBiomeGFNightmareRealm;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBColdMistTaiga;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistDesert;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistForest;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistMushroomIsland;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistPlains;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistSwamp;
import rtg.world.biome.realistic.mistbiomes.RealisticBiomeMBMistTaiga;
import rtg.world.biome.realistic.odioita.RealisticBiomeODIOOrangeBlancoaForest;
import rtg.world.biome.realistic.odioita.RealisticBiomeODIOPinkBlancoaForest;
import rtg.world.biome.realistic.odioita.RealisticBiomeODIORedBlancoaForest;
import rtg.world.biome.realistic.odioita.RealisticBiomeODIOWhiteBlancoaForest;
import rtg.world.biome.realistic.plants.RealisticBiomePLANTSCrystalForest;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJAspenGrove;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJBaobabFields;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJBlossomingFields;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJBorealForest;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJOvergrownSpires;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJPraire;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJRedwoodPeaks;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJRedwoods;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJSnowyBorealForest;
import rtg.world.biome.realistic.projectvibrantjourneys.RealisticBiomePVJWillowSwamp;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWBambooMarsh;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWBirchAutumnForest;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWBlueOakForest;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWBombonaBeach;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWBurOakForest;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWEmperorRidge;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWFlatlandThicket;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWSilverBirchHills;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWSpinyForest;
import rtg.world.biome.realistic.realworld.RealisticBiomeRWSpruceMountains;
import rtg.world.biome.realistic.redwoods.RealisticBiomeREDAlpine;
import rtg.world.biome.realistic.redwoods.RealisticBiomeREDLushRedwoodForest;
import rtg.world.biome.realistic.redwoods.RealisticBiomeREDRedwoodForest;
import rtg.world.biome.realistic.redwoods.RealisticBiomeREDSnowyRainforest;
import rtg.world.biome.realistic.redwoods.RealisticBiomeREDTemperateRainforest;
import rtg.world.biome.realistic.rockhounding.RealisticBiomeRHWhiteSands;
import rtg.world.biome.realistic.spookybiomes.RealisticBiomeSBGhostlyForest;
import rtg.world.biome.realistic.spookybiomes.RealisticBiomeSBWitchwoodForest;
import rtg.world.biome.realistic.sugiforest.RealisticBiomeSFSugiForest;
import rtg.world.biome.realistic.terscraft.RealisticBiomeTERSBiomeDemonite;
import rtg.world.biome.realistic.thaumcraft.RealisticBiomeTCEerie;
import rtg.world.biome.realistic.thaumcraft.RealisticBiomeTCMagicalForest;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVAridHighland;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVAutumnalWoodedHills;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVAutumnalWoods;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVBadlands;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVBirchForestedHills;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVCliffs;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVDesertShrubland;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVForestedHills;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVGlacier;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVGlacierSpikes;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVGreenSwamp;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVLushHills;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVMeadow;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVMiniJungle;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVMountainousDesert;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVRedDesert;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVRockyPlains;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVRockyPlateau;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVSnowyConiferousForest;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVTemperateRainforest;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVThicket;
import rtg.world.biome.realistic.traverse.RealisticBiomeTRAVWoodlands;
import rtg.world.biome.realistic.vampirism.RealisticBiomeVAMPVampireForest;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaBeach;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaBirchForest;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaBirchForestHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaBirchForestHillsM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaBirchForestM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaColdBeach;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaColdTaiga;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaColdTaigaHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaColdTaigaM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaDeepOcean;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaDesert;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaDesertHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaDesertM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaExtremeHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaExtremeHillsEdge;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaExtremeHillsM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaExtremeHillsPlus;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaExtremeHillsPlusM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaFlowerForest;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaForest;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaForestHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaFrozenOcean;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaFrozenRiver;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaIceMountains;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaIcePlains;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaIcePlainsSpikes;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaJungle;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaJungleEdge;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaJungleEdgeM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaJungleHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaJungleM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMegaSpruceTaiga;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMegaTaiga;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMegaTaigaHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesa;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesaBryce;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesaPlateau;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesaPlateauF;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesaPlateauFM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMesaPlateauM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMushroomIsland;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaMushroomIslandShore;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaOcean;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaPlains;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaRedwoodTaigaHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaRiver;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaRoofedForest;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaRoofedForestM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSavanna;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSavannaM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSavannaPlateau;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSavannaPlateauM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaStoneBeach;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSunflowerPlains;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSwampland;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaSwamplandM;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaTaiga;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaTaigaHills;
import rtg.world.biome.realistic.vanilla.RealisticBiomeVanillaTaigaM;


@UtilityClass
public final class BiomeInit {

    private BiomeInit() {

    }

    public static void init() {

        init_minecraft();

        if (Mods.abyssalcraft.isLoaded()) {
            init_abyssalcraft();
        }

        if (Mods.auxbiomes.isLoaded()) {
            init_auxiliarybiomes();
        }

        if (Mods.betteragriculture.isLoaded()) {
            init_betteragriculture();
        }

        if (Mods.biomesoplenty.isLoaded()) {
            init_biomesoplenty();
        }

        if (Mods.byg.isLoaded()) {
            init_biomesyougo();
        }

        if (Mods.bionisation3.isLoaded()) {
            init_bionisation();
        }

        if (Mods.buildcraftenergy.isLoaded()) {
            init_buildcraft();
        }

        if (Mods.candymod.isLoaded()) {
            init_candymod();
        }

        if (Mods.defiledlands.isLoaded()) {
            init_defiledlands();
        }

        if (Mods.douglas_forest.isLoaded()) {
            init_douglasforest();
        }

        if (Mods.floricraft.isLoaded()) {
            init_floricraft();
        }

        if (Mods.fyrecraft.isLoaded()) {
            init_fyrecraft();
        }

        if (Mods.gravityfalls.isLoaded()) {
            init_gravityfalls();
        }

        if (Mods.mistbiomes.isLoaded()) {
            init_mistbiomes();
        }

        if (Mods.odioitamod.isLoaded()) {
            init_odioitamod();
        }

        if (Mods.plants2.isLoaded()) {
            init_plants();
        }

        if (Mods.pvj.isLoaded()) {
            init_pvj();
        }

        if (Mods.realworld.isLoaded()) {
            init_realworld();
        }

        if (Mods.redwoods.isLoaded()) {
            init_redwoods();
        }

        if (Mods.rockhounding_surface.isLoaded()) {
            init_rockhounding();
        }

        if (Mods.spookybiomes.isLoaded()) {
            init_spookybiomes();
        }

        if (Mods.sugiforest.isLoaded()) {
            init_sugiforest();
        }

        if (Mods.terscraft.isLoaded()) {
            init_terscraft();
        }

        if (Mods.thaumcraft.isLoaded()) {
            init_thaumcraft();
        }

        if (Mods.traverse.isLoaded()) {
            init_traverse();
        }

        if (Mods.vampirism.isLoaded()) {
            init_vampirism();
        }

        // This must be done after all biomes have been initialised so that they are all available.
        RTGAPI.initPatchBiome(RTGConfig.patchBiome());
    }

    public static void preInit() {
        RTGAPI.RTG_BIOMES.addBiomes(
                RealisticBiomeBase.RiverType.NORMAL.setRTGBiome(new RealisticBiomeVanillaRiver()),
                RealisticBiomeBase.RiverType.FROZEN.setRTGBiome(new RealisticBiomeVanillaFrozenRiver()),
                RealisticBiomeBase.BeachType.NORMAL.setRTGBiome(new RealisticBiomeVanillaBeach()),
                RealisticBiomeBase.BeachType.STONE.setRTGBiome(new RealisticBiomeVanillaStoneBeach()),
                RealisticBiomeBase.BeachType.COLD.setRTGBiome(new RealisticBiomeVanillaColdBeach())
        );
    }

    private static void init_minecraft() {
        // vanilla rivers and beaches are initialised to enum fields during #preInit
        RTGAPI.RTG_BIOMES.addBiomes(
                new RealisticBiomeVanillaBirchForest(),
                new RealisticBiomeVanillaBirchForestHills(),
                new RealisticBiomeVanillaBirchForestHillsM(),
                new RealisticBiomeVanillaBirchForestM(),
                new RealisticBiomeVanillaColdTaiga(),
                new RealisticBiomeVanillaColdTaigaHills(),
                new RealisticBiomeVanillaColdTaigaM(),
                new RealisticBiomeVanillaDeepOcean(),
                new RealisticBiomeVanillaDesert(),
                new RealisticBiomeVanillaDesertHills(),
                new RealisticBiomeVanillaDesertM(),
                new RealisticBiomeVanillaExtremeHills(),
                new RealisticBiomeVanillaExtremeHillsEdge(),
                new RealisticBiomeVanillaExtremeHillsM(),
                new RealisticBiomeVanillaExtremeHillsPlus(),
                new RealisticBiomeVanillaExtremeHillsPlusM(),
                new RealisticBiomeVanillaFlowerForest(),
                new RealisticBiomeVanillaForest(),
                new RealisticBiomeVanillaForestHills(),
                new RealisticBiomeVanillaFrozenOcean(),
                new RealisticBiomeVanillaIceMountains(),
                new RealisticBiomeVanillaIcePlains(),
                new RealisticBiomeVanillaIcePlainsSpikes(),
                new RealisticBiomeVanillaJungle(),
                new RealisticBiomeVanillaJungleEdge(),
                new RealisticBiomeVanillaJungleEdgeM(),
                new RealisticBiomeVanillaJungleHills(),
                new RealisticBiomeVanillaJungleM(),
                new RealisticBiomeVanillaMegaSpruceTaiga(),
                new RealisticBiomeVanillaMegaTaiga(),
                new RealisticBiomeVanillaMegaTaigaHills(),
                new RealisticBiomeVanillaMesa(),
                new RealisticBiomeVanillaMesaBryce(),
                new RealisticBiomeVanillaMesaPlateau(),
                new RealisticBiomeVanillaMesaPlateauF(),
                new RealisticBiomeVanillaMesaPlateauFM(),
                new RealisticBiomeVanillaMesaPlateauM(),
                new RealisticBiomeVanillaMushroomIsland(),
                new RealisticBiomeVanillaMushroomIslandShore(),
                new RealisticBiomeVanillaOcean(),
                new RealisticBiomeVanillaPlains(),
                new RealisticBiomeVanillaRedwoodTaigaHills(),
                new RealisticBiomeVanillaRoofedForest(),
                new RealisticBiomeVanillaRoofedForestM(),
                new RealisticBiomeVanillaSavanna(),
                new RealisticBiomeVanillaSavannaM(),
                new RealisticBiomeVanillaSavannaPlateau(),
                new RealisticBiomeVanillaSavannaPlateauM(),
                new RealisticBiomeVanillaSunflowerPlains(),
                new RealisticBiomeVanillaSwampland(),
                new RealisticBiomeVanillaSwamplandM(),
                new RealisticBiomeVanillaTaiga(),
                new RealisticBiomeVanillaTaigaHills(),
                new RealisticBiomeVanillaTaigaM()
        );
    }

    private static void init_abyssalcraft() {

        String modid = Mods.abyssalcraft.name();

        if (isBiomePresent(modid, "coralium_infested_swamp")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACCoraliumInfestedSwamp());
        }
        if (isBiomePresent(modid, "darklands")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACDarklands());
        }
        if (isBiomePresent(modid, "darklands_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACDarklandsForest());
        }
        if (isBiomePresent(modid, "darklands_hills")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACDarklandsHighland());
        }
        if (isBiomePresent(modid, "darklands_mountains")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACDarklandsMountains());
        }
        if (isBiomePresent(modid, "darklands_plains")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeACDarklandsPlains());
        }
    }

    private static void init_auxiliarybiomes() {

        String modid = Mods.auxbiomes.name();
        Biome biome;
        ResourceLocation marsh = new ResourceLocation(modid, "marsh");
        ResourceLocation wasteland = new ResourceLocation(modid, "wasteland");
        ResourceLocation ice_wasteland = new ResourceLocation(modid, "ice_wasteland");
        ResourceLocation forested_island = new ResourceLocation(modid, "forested_island");
        ResourceLocation white_forest = new ResourceLocation(modid, "white_forest");

        if ((biome = Biome.REGISTRY.getObject(marsh)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeAUXMarsh(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(wasteland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeAUXWasteland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(ice_wasteland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeAUXIceWasteland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(forested_island)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeAUXForestedIsland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(white_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeAUXWhiteForest(biome));
        }
    }

    private static void init_betteragriculture() {

        String modid = Mods.betteragriculture.name();
        Biome biome;
        ResourceLocation farmlandbiome = new ResourceLocation(modid, "farmlandbiome");

        if ((biome = Biome.REGISTRY.getObject(farmlandbiome)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBAFarmlandBiome(biome));
        }
    }

    private static void init_biomesoplenty() {

        String modid = Mods.biomesoplenty.name();

        if (isBiomePresent(modid, "alps")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPAlps());
        }
        if (isBiomePresent(modid, "alps_foothills")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPAlpsFoothills());
        }
        if (isBiomePresent(modid, "bamboo_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPBambooForest());
        }
        if (isBiomePresent(modid, "bayou")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPBayou());
        }
        if (isBiomePresent(modid, "bog")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPBog());
        }
        if (isBiomePresent(modid, "boreal_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPBorealForest());
        }
        if (isBiomePresent(modid, "brushland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPBrushland());
        }
        if (isBiomePresent(modid, "chaparral")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPChaparral());
        }
        if (isBiomePresent(modid, "cherry_blossom_grove")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPCherryBlossomGrove());
        }
        if (isBiomePresent(modid, "cold_desert")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPColdDesert());
        }
        if (isBiomePresent(modid, "coniferous_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPConiferousForest());
        }
        if (isBiomePresent(modid, "coral_reef")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPCoralReef());
        }
        if (isBiomePresent(modid, "crag")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPCrag());
        }
        if (isBiomePresent(modid, "dead_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPDeadForest());
        }
        if (isBiomePresent(modid, "dead_swamp")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPDeadSwamp());
        }
        if (isBiomePresent(modid, "eucalyptus_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPEucalyptusForest());
        }
        if (isBiomePresent(modid, "fen")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPFen());
        }
        if (isBiomePresent(modid, "flower_field")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPFlowerField());
        }
        if (isBiomePresent(modid, "flower_island")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPFlowerIsland());
        }
        if (isBiomePresent(modid, "glacier")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPGlacier());
        }
        if (isBiomePresent(modid, "grassland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPGrassland());
        }
        if (isBiomePresent(modid, "gravel_beach")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPGravelBeach());
        }
        if (isBiomePresent(modid, "grove")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPGrove());
        }
        if (isBiomePresent(modid, "highland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPHighland());
        }
        if (isBiomePresent(modid, "kelp_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPKelpForest());
        }
        if (isBiomePresent(modid, "land_of_lakes")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPLandOfLakes());
        }
        if (isBiomePresent(modid, "lavender_fields")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPLavenderFields());
        }
        if (isBiomePresent(modid, "lush_desert")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPLushDesert());
        }
        if (isBiomePresent(modid, "lush_swamp")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPLushSwamp());
        }
        if (isBiomePresent(modid, "mangrove")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMangrove());
        }
        if (isBiomePresent(modid, "maple_woods")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMapleWoods());
        }
        if (isBiomePresent(modid, "marsh")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMarsh());
        }
        if (isBiomePresent(modid, "meadow")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMeadow());
        }
        if (isBiomePresent(modid, "moor")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMoor());
        }
        if (isBiomePresent(modid, "mountain")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMountainPeaks());
        }
        if (isBiomePresent(modid, "mountain_foothills")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMountainFoothills());
        }
        if (isBiomePresent(modid, "mystic_grove")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPMysticGrove());
        }
        if (isBiomePresent(modid, "oasis")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOasis());
        }
        if (isBiomePresent(modid, "ominous_woods")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOminousWoods());
        }
        if (isBiomePresent(modid, "orchard")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOrchard());
        }
        if (isBiomePresent(modid, "origin_beach")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOriginBeach());
        }
        if (isBiomePresent(modid, "origin_island")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOriginIsland());
        }
        if (isBiomePresent(modid, "outback")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOutback());
        }
        if (isBiomePresent(modid, "overgrown_cliffs")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPOvergrownCliffs());
        }
        if (isBiomePresent(modid, "pasture")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPPasture());
        }
        if (isBiomePresent(modid, "prairie")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPPrairie());
        }
        if (isBiomePresent(modid, "quagmire")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPQuagmire());
        }
        if (isBiomePresent(modid, "rainforest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPRainforest());
        }
        if (isBiomePresent(modid, "redwood_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPRedwoodForest());
        }
        if (isBiomePresent(modid, "sacred_springs")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPSacredSprings());
        }
        if (isBiomePresent(modid, "seasonal_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPSeasonalForest());
        }
        if (isBiomePresent(modid, "shield")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPShield());
        }
        if (isBiomePresent(modid, "shrubland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPShrubland());
        }
        if (isBiomePresent(modid, "snowy_coniferous_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPSnowyConiferousForest());
        }
        if (isBiomePresent(modid, "snowy_forest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPSnowyForest());
        }
        if (isBiomePresent(modid, "steppe")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPSteppe());
        }
        if (isBiomePresent(modid, "temperate_rainforest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPTemperateRainforest());
        }
        if (isBiomePresent(modid, "tropical_island")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPTropicalIsland());
        }
        if (isBiomePresent(modid, "tropical_rainforest")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPTropicalRainforest());
        }
        if (isBiomePresent(modid, "tundra")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPTundra());
        }
        if (isBiomePresent(modid, "volcanic_island")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPVolcanicIsland());
        }
        if (isBiomePresent(modid, "wasteland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPWasteland());
        }
        if (isBiomePresent(modid, "wetland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPWetland());
        }
        if (isBiomePresent(modid, "white_beach")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPWhiteBeach());
        }
        if (isBiomePresent(modid, "woodland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPWoodland());
        }
        if (isBiomePresent(modid, "xeric_shrubland")) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBOPXericShrubland());
        }
    }

    private static void init_biomesyougo() {

        String modid = Mods.byg.name();
        Biome biome;
        //ResourceLocation babyssalbog = new ResourceLocation(modid, "babyssalbog");
        ResourceLocation balliumfields = new ResourceLocation(modid, "balliumfields");
        ResourceLocation balps = new ResourceLocation(modid, "balps");
        ResourceLocation bancientforest = new ResourceLocation(modid, "bancientforest");
        //ResourceLocation bastralisle = new ResourceLocation(modid, "bastralisle");
        ResourceLocation bbambooforest = new ResourceLocation(modid, "bbambooforest");
        ResourceLocation bbaobabsavanna = new ResourceLocation(modid, "bbaobabsavanna");
        ResourceLocation bbayou = new ResourceLocation(modid, "bbayou");
        ResourceLocation bbluetaiga = new ResourceLocation(modid, "bbluetaiga");
        ResourceLocation bbog = new ResourceLocation(modid, "bbog");
        ResourceLocation bborealforest = new ResourceLocation(modid, "bborealforest");
        ResourceLocation bcanyons = new ResourceLocation(modid, "bcanyons");
        ResourceLocation bchaparrallowlands = new ResourceLocation(modid, "bchaparrallowlands");
        ResourceLocation bcherrygrove = new ResourceLocation(modid, "bcherrygrove");
        ResourceLocation bcikaforest = new ResourceLocation(modid, "bcikaforest");
        ResourceLocation bconiferousforest = new ResourceLocation(modid, "bconiferousforest");
        //ResourceLocation bcosmicocean = new ResourceLocation(modid, "bcosmicocean");
        ResourceLocation bdeadsea = new ResourceLocation(modid, "bdeadsea");
        ResourceLocation bdeciduousforest = new ResourceLocation(modid, "bdeciduousforest");
        ResourceLocation bdunes = new ResourceLocation(modid, "bdunes");
        ResourceLocation bebonywoods = new ResourceLocation(modid, "bebonywoods");
        ResourceLocation benchantedforest = new ResourceLocation(modid, "benchantedforest");
        ResourceLocation beucalyptustropics = new ResourceLocation(modid, "beucalyptustropics");
        ResourceLocation bevergreentaiga = new ResourceLocation(modid, "bevergreentaiga");
        ResourceLocation bfrostyforest = new ResourceLocation(modid, "bfrostyforest");
        ResourceLocation bfungaljungle = new ResourceLocation(modid, "bfungaljungle");
        ResourceLocation bglaciers = new ResourceLocation(modid, "bglaciers");
        ResourceLocation bglowshroombayou = new ResourceLocation(modid, "bglowshroombayou");
        ResourceLocation bgrasslandplateau = new ResourceLocation(modid, "bgrasslandplateau");
        ResourceLocation bgreatlakes = new ResourceLocation(modid, "bgreatlakes");
        ResourceLocation bgreatoaklowlands = new ResourceLocation(modid, "bgreatoaklowlands");
        ResourceLocation bjacarandaforest = new ResourceLocation(modid, "bjacarandaforest");
        ResourceLocation blushdesert = new ResourceLocation(modid, "blushdesert");
        ResourceLocation bmangrovemarshes = new ResourceLocation(modid, "bmangrovemarshes");
        ResourceLocation bmapleforest = new ResourceLocation(modid, "bmapleforest");
        ResourceLocation bmeadow = new ResourceLocation(modid, "bmeadow");
        ResourceLocation borchard = new ResourceLocation(modid, "borchard");
        ResourceLocation boutback = new ResourceLocation(modid, "boutback");
        ResourceLocation bpaperbirchforest = new ResourceLocation(modid, "bpaperbirchforest");
        ResourceLocation bpinemountains = new ResourceLocation(modid, "bpinemountains");
        ResourceLocation bpraire = new ResourceLocation(modid, "bpraire");
        ResourceLocation bquagmire = new ResourceLocation(modid, "bquagmire");
        ResourceLocation breddesert = new ResourceLocation(modid, "breddesert");
        ResourceLocation bredoakforest = new ResourceLocation(modid, "bredoakforest");
        ResourceLocation bredwoodtropics = new ResourceLocation(modid, "bredwoodtropics");
        ResourceLocation bsavannacanopy = new ResourceLocation(modid, "bsavannacanopy");
        ResourceLocation bseasonalbirchforest = new ResourceLocation(modid, "bseasonalbirchforest");
        ResourceLocation bseasonaldeciduous = new ResourceLocation(modid, "bseasonaldeciduous");
        ResourceLocation bseasonalforest = new ResourceLocation(modid, "bseasonalforest");
        ResourceLocation bseasonaltaiga = new ResourceLocation(modid, "bseasonaltaiga");
        //ResourceLocation bshattereddesert = new ResourceLocation(modid, "bshattereddesert");
        ResourceLocation bshrublands = new ResourceLocation(modid, "bshrublands");
        ResourceLocation bskyrishighlands = new ResourceLocation(modid, "bskyrishighlands");
        ResourceLocation bsnowyconiferousforest = new ResourceLocation(modid, "bsnowyconiferousforest");
        ResourceLocation bsnowyevergeentaiga = new ResourceLocation(modid, "bsnowyevergeentaiga");
        ResourceLocation bsnowypinemountains = new ResourceLocation(modid, "bsnowypinemountains");
        ResourceLocation bsonorandesert = new ResourceLocation(modid, "bsonorandesert");
        ResourceLocation bstellatapasture = new ResourceLocation(modid, "bstellatapasture");
        ResourceLocation btropicalmountains = new ResourceLocation(modid, "btropicalmountains");
        ResourceLocation btropicalrainforest = new ResourceLocation(modid, "btropicalrainforest");
        ResourceLocation btundra = new ResourceLocation(modid, "btundra");
        ResourceLocation bweepingwitchforest = new ResourceLocation(modid, "bweepingwitchforest");
        ResourceLocation bwhisperingwoods = new ResourceLocation(modid, "bwhisperingwoods");
        ResourceLocation bwoodlands = new ResourceLocation(modid, "bwoodlands");
        ResourceLocation bzelkovaforest = new ResourceLocation(modid, "bzelkovaforest");

//        if ((biome = Biome.REGISTRY.getObject(babyssalbog)) != null) {
//            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGAbyssalBog(biome));
//        }
        if ((biome = Biome.REGISTRY.getObject(balliumfields)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGAlliumFields(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(balps)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGAlps(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bancientforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGAncientForest(biome));
        }
//        if ((biome = Biome.REGISTRY.getObject(bastralisle)) != null) {
//            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGAstralIsle(biome));
//        }
        if ((biome = Biome.REGISTRY.getObject(bbambooforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBambooForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bbaobabsavanna)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBaobabSavanna(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bbayou)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBayou(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bbluetaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBlueTaiga(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bbog)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBog(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bborealforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGBorealForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bcanyons)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGCanyons(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bchaparrallowlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGChaparralLowlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bcherrygrove)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGCherryGrove(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bcikaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGCikaForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bconiferousforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGConiferousForest(biome));
        }
//        if ((biome = Biome.REGISTRY.getObject(bcosmicocean)) != null) {
//            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGCosmicOcean(biome));
//        }
        if ((biome = Biome.REGISTRY.getObject(bdeadsea)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGDeadSea(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bdeciduousforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGDeciduousForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bdunes)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGDunes(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bebonywoods)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGEbonyWoods(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(benchantedforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGEnchantedForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(beucalyptustropics)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGEucalyptusTropics(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bevergreentaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGEvergreenTaiga(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bfrostyforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGFrostyForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bfungaljungle)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGFungalJungle(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bglaciers)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGGlaciers(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bglowshroombayou)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGGlowshroomBayou(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bgrasslandplateau)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGGrasslandPlateau(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bgreatlakes)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGGreatLakes(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bgreatoaklowlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGGreatOakLowlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bjacarandaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGJacarandaForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(blushdesert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGLushDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bmangrovemarshes)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGMangroveMarshes(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bmapleforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGMapleForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bmeadow)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGMeadow(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(borchard)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGOrchard(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(boutback)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGOutback(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bpaperbirchforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGPaperBirchForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bpinemountains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGPineMountains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bpraire)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGPraire(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bquagmire)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGQuagmire(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(breddesert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGRedDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bredoakforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGRedOakForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bredwoodtropics)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGRedwoodTropics(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bsavannacanopy)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSavannaCanopy(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bseasonalbirchforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSeasonalBirchForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bseasonaldeciduous)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSeasonalDeciduous(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bseasonalforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSeasonalForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bseasonaltaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSeasonalTaiga(biome));
        }
//        if ((biome = Biome.REGISTRY.getObject(bshattereddesert)) != null) {
//            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGShatteredDesert(biome));
//        }
        if ((biome = Biome.REGISTRY.getObject(bshrublands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGShrublands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bskyrishighlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSkyrisHighlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bsnowyconiferousforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSnowyConiferousForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bsnowyevergeentaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSnowyEvergeenTaiga(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bsnowypinemountains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSnowyPineMountains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bsonorandesert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGSonoranDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bstellatapasture)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGStellataPasture(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(btropicalmountains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGTropicalMountains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(btropicalrainforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGTropicalRainforest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(btundra)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGTundra(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bweepingwitchforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGWeepingWitchForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bwhisperingwoods)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGWhisperingWoods(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bwoodlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGWoodlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bzelkovaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBYGZelkovaForest(biome));
        }
    }

    private static void init_bionisation() {

        String modid = Mods.bionisation3.name();
        Biome biome;
        ResourceLocation infected_forest = new ResourceLocation(modid, "infected_forest");

        if ((biome = Biome.REGISTRY.getObject(infected_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBIOInfectedForest(biome));
        }
    }

    private static void init_buildcraft() {

        String modid = Mods.buildcraftenergy.name();
        Biome biome;
        ResourceLocation bc_oil_desert = new ResourceLocation(modid, "oil_desert");
        ResourceLocation bc_oil_ocean = new ResourceLocation(modid, "oil_ocean");

        if ((biome = Biome.REGISTRY.getObject(bc_oil_desert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBCDesertOilField(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(bc_oil_ocean)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeBCOceanOilField(biome));
        }
    }

    private static void init_candymod() {

        String modid = Mods.candymod.name();
        Biome biome;
        ResourceLocation biome_cotton_candy = new ResourceLocation(modid, "biome_cotton_candy");
        ResourceLocation biome_chocolate_forest = new ResourceLocation(modid, "biome_chocolate_forest");
        ResourceLocation biome_gummy_swamp = new ResourceLocation(modid, "biome_gummy_swamp");

        if ((biome = Biome.REGISTRY.getObject(biome_cotton_candy)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeCWCottonCandyPlains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(biome_chocolate_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeCWChocolateForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(biome_gummy_swamp)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeCWGummySwamp(biome));
        }
    }

    private static void init_defiledlands() {

        String modid = Mods.defiledlands.name();
        Biome biome;
        ResourceLocation desert_defiled = new ResourceLocation(modid, "desert_defiled");
        ResourceLocation plains_defiled = new ResourceLocation(modid, "plains_defiled");
        ResourceLocation forest_tenebra = new ResourceLocation(modid, "forest_tenebra");
        ResourceLocation forest_vilespine = new ResourceLocation(modid, "forest_vilespine");
        ResourceLocation hills_defiled = new ResourceLocation(modid, "hills_defiled");
        ResourceLocation swamp_defiled = new ResourceLocation(modid, "swamp_defiled");
        ResourceLocation ice_plains_defiled = new ResourceLocation(modid, "ice_plains_defiled");

        if ((biome = Biome.REGISTRY.getObject(desert_defiled)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLDesertDefiled(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(plains_defiled)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLPlainsDefiled(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(forest_tenebra)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLForestTenebra(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(forest_vilespine)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLForestVilespine(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(hills_defiled)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLHillsDefiled(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(swamp_defiled)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLSwampDefiled(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(ice_plains_defiled)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDLIcePlainsDefiled(biome));
        }
    }

    private static void init_douglasforest() {

        String modid = Mods.douglas_forest.name();
        Biome biome;
        ResourceLocation douglas_forest = new ResourceLocation(modid, "douglas_forest");
        ResourceLocation maple_forest = new ResourceLocation(modid, "maple_forest");

        if ((biome = Biome.REGISTRY.getObject(douglas_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDFDouglasForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(maple_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeDFMapleForest(biome));
        }
    }

    private static void init_floricraft() {

        String modid = Mods.floricraft.name();
        Biome biome;
        ResourceLocation tulip_land = new ResourceLocation(modid, "tulip land");
        ResourceLocation rose_land = new ResourceLocation(modid, "rose land");

        if ((biome = Biome.REGISTRY.getObject(tulip_land)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFLORITulipLand(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rose_land)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFLORIRoseLand(biome));
        }
    }

    private static void init_fyrecraft() {

        String modid = Mods.fyrecraft.name();
        Biome biome;
        ResourceLocation rocky_wasteland = new ResourceLocation(modid, "rocky wasteland");
        ResourceLocation mushroom_grove = new ResourceLocation(modid, "mushroom grove");
        ResourceLocation tropical_lakes = new ResourceLocation(modid, "tropical lakes");
        ResourceLocation mega_mountains = new ResourceLocation(modid, "mega mountains");
        ResourceLocation red_desert = new ResourceLocation(modid, "red desert");
        ResourceLocation red_desert_hills = new ResourceLocation(modid, "red desert hills");
        ResourceLocation volcanic_wasteland = new ResourceLocation(modid, "volcanic wasteland");
        ResourceLocation crimson_grove = new ResourceLocation(modid, "crimson grove");

        if ((biome = Biome.REGISTRY.getObject(rocky_wasteland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYRERockyWasteland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mushroom_grove)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYREMushroomGrove(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(tropical_lakes)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYRETropicalLakes(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mega_mountains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYREMegaMountains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(red_desert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYRERedDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(red_desert_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYRERedDesertHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(volcanic_wasteland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYREVolcanicWasteland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(crimson_grove)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeFYRECrimsonGrove(biome));
        }
    }

    private static void init_gravityfalls() {

        String modid = Mods.gravityfalls.name();
        Biome biome;
        ResourceLocation gravityfalls = new ResourceLocation(modid, "gravityfalls");
        ResourceLocation nightmarerealm = new ResourceLocation(modid, "nightmarerealm");

        if ((biome = Biome.REGISTRY.getObject(gravityfalls)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeGFGravityFalls(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(nightmarerealm)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeGFNightmareRealm(biome));
        }
    }

    private static void init_mistbiomes() {

        String modid = Mods.mistbiomes.name();
        Biome biome;
        ResourceLocation mistforest = new ResourceLocation(modid, "mistforest");
        ResourceLocation mistplains = new ResourceLocation(modid, "mistplains");
        ResourceLocation misttaiga = new ResourceLocation(modid, "misttaiga");
        ResourceLocation mistdesert = new ResourceLocation(modid, "mistdesert");
        ResourceLocation coldmisttaiga = new ResourceLocation(modid, "coldmisttaiga");
        ResourceLocation mistswamp = new ResourceLocation(modid, "mistswamp");
        ResourceLocation mistymushroomisland = new ResourceLocation(modid, "mistymushroomisland");

        if ((biome = Biome.REGISTRY.getObject(mistforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mistplains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistPlains(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(misttaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistTaiga(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mistdesert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(coldmisttaiga)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBColdMistTaiga(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mistswamp)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistSwamp(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mistymushroomisland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeMBMistMushroomIsland(biome));
        }
    }

    private static void init_odioitamod() {

        String modid = Mods.odioitamod.name();
        Biome biome;
        ResourceLocation whiteblancoaforest = new ResourceLocation(modid, "whiteblancoaforest");
        ResourceLocation orangeblancoaforest = new ResourceLocation(modid, "orangeblancoaforest");
        ResourceLocation pinkblancoaforest = new ResourceLocation(modid, "pinkblancoaforest");
        ResourceLocation redblancoaforest = new ResourceLocation(modid, "redblancoaforest");

        if ((biome = Biome.REGISTRY.getObject(whiteblancoaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeODIOWhiteBlancoaForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(orangeblancoaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeODIOOrangeBlancoaForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(pinkblancoaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeODIOPinkBlancoaForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(redblancoaforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeODIORedBlancoaForest(biome));
        }
    }

    private static void init_plants() {

        String modid = Mods.plants2.name();
        Biome biome;
        ResourceLocation crystal_forest = new ResourceLocation(modid, "crystal_forest");

        if ((biome = Biome.REGISTRY.getObject(crystal_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePLANTSCrystalForest(biome));
        }
    }

    private static void init_pvj() {

        String modid = Mods.pvj.name();
        Biome biome;
        ResourceLocation prairie = new ResourceLocation(modid, "prairie");
        ResourceLocation redwoods = new ResourceLocation(modid, "redwoods");
        ResourceLocation redwood_peaks = new ResourceLocation(modid, "redwood_peaks");
        ResourceLocation willow_swamp = new ResourceLocation(modid, "willow_swamp");
        ResourceLocation boreal_forest = new ResourceLocation(modid, "boreal_forest");
        ResourceLocation snowy_boreal_forest = new ResourceLocation(modid, "snowy_boreal_forest");
        ResourceLocation aspen_grove = new ResourceLocation(modid, "aspen_grove");
        ResourceLocation overgrown_spires = new ResourceLocation(modid, "overgrown_spires");
        ResourceLocation blossoming_fields = new ResourceLocation(modid, "blossoming_fields");
        ResourceLocation baobab_fields = new ResourceLocation(modid, "baobab_fields");

        if ((biome = Biome.REGISTRY.getObject(prairie)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJPraire(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(redwoods)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJRedwoods(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(redwood_peaks)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJRedwoodPeaks(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(willow_swamp)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJWillowSwamp(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(boreal_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJBorealForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(snowy_boreal_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJSnowyBorealForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(aspen_grove)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJAspenGrove(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(overgrown_spires)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJOvergrownSpires(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(blossoming_fields)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJBlossomingFields(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(baobab_fields)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomePVJBaobabFields(biome));
        }
    }

    private static void init_realworld() {

        String modid = Mods.realworld.name();
        Biome biome;
        ResourceLocation rw_bamboo_marsh = new ResourceLocation(modid, "rw_bamboo_marsh");
        ResourceLocation rw_birch_autumn_forest = new ResourceLocation(modid, "rw_birch_autumn_forest");
        ResourceLocation rw_blue_oak_forest = new ResourceLocation(modid, "rw_blue_oak_forest");
        ResourceLocation rw_bombona_beach = new ResourceLocation(modid, "rw_bombona_beach");
        ResourceLocation rw_bur_oak_forest = new ResourceLocation(modid, "rw_bur_oak_forest");
        ResourceLocation rw_flatland_thicket = new ResourceLocation(modid, "rw_flatland_thicket");
        ResourceLocation rw_emperor_ridge = new ResourceLocation(modid, "rw_emperor_ridge");
        ResourceLocation rw_silver_birch_hills = new ResourceLocation(modid, "rw_silver_birch_hills");
        ResourceLocation rw_spiny_forest = new ResourceLocation(modid, "rw_spiny_forest");
        ResourceLocation rw_spruce_mountains = new ResourceLocation(modid, "rw_spruce_mountains");

        if ((biome = Biome.REGISTRY.getObject(rw_bamboo_marsh)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWBambooMarsh(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_birch_autumn_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWBirchAutumnForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_blue_oak_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWBlueOakForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_bombona_beach)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWBombonaBeach(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_bur_oak_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWBurOakForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_flatland_thicket)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWFlatlandThicket(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_emperor_ridge)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWEmperorRidge(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_silver_birch_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWSilverBirchHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_spiny_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWSpinyForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rw_spruce_mountains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRWSpruceMountains(biome));
        }
    }

    private static void init_redwoods() {

        String modid = Mods.redwoods.name();
        Biome biome;
        ResourceLocation redwood_forest = new ResourceLocation(modid, "redwood_forest");
        ResourceLocation lush_redwood_forest = new ResourceLocation(modid, "lush_redwood_forest");
        ResourceLocation temperate_rainforest = new ResourceLocation(modid, "temperate_rainforest");
        ResourceLocation snowy_rainforest = new ResourceLocation(modid, "snowy_rainforest");
        ResourceLocation alpine = new ResourceLocation(modid, "alpine"); // Doesn't actually generate in-game.

        if ((biome = Biome.REGISTRY.getObject(redwood_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeREDRedwoodForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(lush_redwood_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeREDLushRedwoodForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(temperate_rainforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeREDTemperateRainforest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(snowy_rainforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeREDSnowyRainforest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(alpine)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeREDAlpine(biome));
        }
    }

    private static void init_rockhounding() {

        String modid = Mods.rockhounding_surface.name();
        Biome biome;
        ResourceLocation white_sands = new ResourceLocation(modid, "white_sands");

        if ((biome = Biome.REGISTRY.getObject(white_sands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeRHWhiteSands(biome));
        }
    }

    private static void init_spookybiomes() {

        String modid = Mods.spookybiomes.name();
        Biome biome;
        ResourceLocation witchwood_forest = new ResourceLocation(modid, "witchwood_forest");
        ResourceLocation ghostly_forest = new ResourceLocation(modid, "ghostly_forest");

        if ((biome = Biome.REGISTRY.getObject(witchwood_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeSBWitchwoodForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(ghostly_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeSBGhostlyForest(biome));
        }
    }

    private static void init_sugiforest() {

        String modid = Mods.sugiforest.name();
        Biome biome;
        ResourceLocation sugi_forest = new ResourceLocation(modid, "sugi_forest");

        if ((biome = Biome.REGISTRY.getObject(sugi_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeSFSugiForest(biome));
        }
    }

    private static void init_terscraft() {

        String modid = Mods.terscraft.name();
        Biome biome;
        ResourceLocation biomedemonite = new ResourceLocation(modid, "biomedemonite");

        if ((biome = Biome.REGISTRY.getObject(biomedemonite)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTERSBiomeDemonite(biome));
        }
    }

    private static void init_thaumcraft() {

        final ResourceLocation magicalForest = new ResourceLocation(Mods.thaumcraft.name(), "magical_forest");
        final ResourceLocation eerie = new ResourceLocation(Mods.thaumcraft.name(), "eerie");
        Biome biome;

        if ((biome = Biome.REGISTRY.getObject(magicalForest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTCMagicalForest(biome));
        }

        if ((biome = Biome.REGISTRY.getObject(eerie)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTCEerie(biome));
        }
    }

    private static void init_traverse() {

        String modid = Mods.traverse.name();
        Biome biome;
        ResourceLocation autumnal_woods = new ResourceLocation(modid, "autumnal_woods");
        ResourceLocation woodlands = new ResourceLocation(modid, "woodlands");
        ResourceLocation mini_jungle = new ResourceLocation(modid, "mini_jungle");
        ResourceLocation meadow = new ResourceLocation(modid, "meadow");
        ResourceLocation green_swamp = new ResourceLocation(modid, "green_swamp");
        ResourceLocation red_desert = new ResourceLocation(modid, "red_desert");
        ResourceLocation temperate_rainforest = new ResourceLocation(modid, "temperate_rainforest");
        ResourceLocation badlands = new ResourceLocation(modid, "badlands");
        ResourceLocation mountainous_desert = new ResourceLocation(modid, "mountainous_desert");
        ResourceLocation rocky_plateau = new ResourceLocation(modid, "rocky_plateau");
        ResourceLocation forested_hills = new ResourceLocation(modid, "forested_hills");
        ResourceLocation birch_forested_hills = new ResourceLocation(modid, "birch_forested_hills");
        ResourceLocation autumnal_wooded_hills = new ResourceLocation(modid, "autumnal_wooded_hills");
        ResourceLocation cliffs = new ResourceLocation(modid, "cliffs");
        ResourceLocation glacier = new ResourceLocation(modid, "glacier");
        ResourceLocation glacier_spikes = new ResourceLocation(modid, "glacier_spikes");
        ResourceLocation snowy_coniferous_forest = new ResourceLocation(modid, "snowy_coniferous_forest");
        ResourceLocation lush_hills = new ResourceLocation(modid, "lush_hills");
        ResourceLocation desert_shrubland = new ResourceLocation(modid, "desert_shrubland");
        ResourceLocation thicket = new ResourceLocation(modid, "thicket");
        ResourceLocation arid_highland = new ResourceLocation(modid, "arid_highland");
        ResourceLocation rocky_plains = new ResourceLocation(modid, "rocky_plains");

        if ((biome = Biome.REGISTRY.getObject(autumnal_woods)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVAutumnalWoods(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(woodlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVWoodlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mini_jungle)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVMiniJungle(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(meadow)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVMeadow(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(green_swamp)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVGreenSwamp(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(red_desert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVRedDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(temperate_rainforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVTemperateRainforest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(badlands)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVBadlands(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(mountainous_desert)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVMountainousDesert(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rocky_plateau)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVRockyPlateau(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(forested_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVForestedHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(birch_forested_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVBirchForestedHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(autumnal_wooded_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVAutumnalWoodedHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(cliffs)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVCliffs(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(glacier)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVGlacier(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(glacier_spikes)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVGlacierSpikes(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(snowy_coniferous_forest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVSnowyConiferousForest(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(lush_hills)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVLushHills(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(desert_shrubland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVDesertShrubland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(thicket)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVThicket(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(arid_highland)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVAridHighland(biome));
        }
        if ((biome = Biome.REGISTRY.getObject(rocky_plains)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeTRAVRockyPlains(biome));
        }
    }

    private static void init_vampirism() {

        String modid = Mods.vampirism.name();
        Biome biome;
        ResourceLocation vampireforest = new ResourceLocation(modid, "vampireforest");

        if ((biome = Biome.REGISTRY.getObject(vampireforest)) != null) {
            RTGAPI.RTG_BIOMES.addBiomes(new RealisticBiomeVAMPVampireForest(biome));
        }
    }

    private static boolean isBiomePresent(ResourceLocation rl) {
        return Biome.REGISTRY.containsKey(rl);
    }

    private static boolean isBiomePresent(String modid, String biomeName) {
        ResourceLocation rl = new ResourceLocation(modid, biomeName);
        return Biome.REGISTRY.containsKey(rl);
    }
}
