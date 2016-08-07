package rtg.world.biome.realistic.highlands;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import rtg.api.biome.BiomeConfig;
import rtg.api.biome.highlands.config.BiomeConfigHLTropicalIslands;
import rtg.world.biome.deco.*;
import rtg.world.biome.deco.helper.DecoHelperThisOrThat;
import rtg.world.gen.feature.tree.rtg.TreeRTG;
import rtg.world.gen.feature.tree.rtg.TreeRTGCocosNucifera;
import rtg.world.gen.surface.highlands.SurfaceHLTropicalIslands;
import rtg.world.gen.terrain.highlands.TerrainHLTropicalIslands;

public class RealisticBiomeHLTropicalIslands extends RealisticBiomeHLBase {

    public RealisticBiomeHLTropicalIslands(BiomeGenBase biome, BiomeConfig config) {

        super(config, biome, BiomeGenBase.river,
            new TerrainHLTropicalIslands(90f, 180f, 13f, 100f, 1f, 260f, 59f),
            new SurfaceHLTropicalIslands(config, biome.topBlock, biome.fillerBlock)
        );

        this.waterSurfaceLakeChance = 4;


        DecoBaseBiomeDecorations decoBaseBiomeDecorations = new DecoBaseBiomeDecorations();
        this.addDeco(decoBaseBiomeDecorations);

//        DecoTree highlandsPalmTrees = new DecoTree(new HLPalmTreeRTG(8, 7, false));
//        highlandsPalmTrees.treeType = TreeType.WORLDGEN;
//        highlandsPalmTrees.treeCondition = DecoTree.TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
//        highlandsPalmTrees.distribution = new DecoTree.Distribution(100f, 6f, 0.8f);
//        highlandsPalmTrees.treeConditionNoise = -0.4f;
//        highlandsPalmTrees.treeConditionChance = 1;
//        highlandsPalmTrees.maxY = 160;
//        this.addDeco(highlandsPalmTrees);

        TreeRTG nuciferaTree = new TreeRTGCocosNucifera();
        nuciferaTree.logBlock = Blocks.log.getStateFromMeta(3);
        nuciferaTree.leavesBlock = Blocks.leaves.getStateFromMeta(3);
        nuciferaTree.minTrunkSize = 7;
        nuciferaTree.maxTrunkSize = 8;
        nuciferaTree.minCrownSize = 8;
        nuciferaTree.maxCrownSize = 12;
        nuciferaTree.noLeaves = false;
        this.addTree(nuciferaTree);

        DecoTree vanillaPalmTrees = new DecoTree(nuciferaTree);
        vanillaPalmTrees.treeType = DecoTree.TreeType.RTG_TREE;
        vanillaPalmTrees.treeCondition = DecoTree.TreeCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        vanillaPalmTrees.distribution = new DecoTree.Distribution(80f, 60f, -15f);
        vanillaPalmTrees.treeConditionNoise = 0f;
        vanillaPalmTrees.treeConditionChance = 4;
        this.addDeco(vanillaPalmTrees);

        DecoShrub decoShrubVanilla = new DecoShrub();
        decoShrubVanilla.logBlock = Blocks.log.getStateFromMeta(3);
        decoShrubVanilla.leavesBlock = Blocks.leaves.getStateFromMeta(3);
        decoShrubVanilla.maxY = 100;
        decoShrubVanilla.strengthFactor = 4f;
        decoShrubVanilla.chance = 3;

        DecoShrub decoShrubHL = new DecoShrub();
        decoShrubHL.logBlock = Blocks.log.getStateFromMeta(3);
        decoShrubHL.leavesBlock = Blocks.leaves.getStateFromMeta(3);
        decoShrubHL.maxY = 100;
        decoShrubHL.strengthFactor = 4f;
        decoShrubHL.chance = 3;

        this.addDeco(new DecoHelperThisOrThat(4, DecoHelperThisOrThat.ChanceType.NOT_EQUALS_ZERO, decoShrubVanilla, decoShrubHL));

        // Jungle logs.
        DecoFallenTree decoFallenTree = new DecoFallenTree();
        decoFallenTree.loops = 1;
        decoFallenTree.distribution.noiseDivisor = 100f;
        decoFallenTree.distribution.noiseFactor = 6f;
        decoFallenTree.distribution.noiseAddend = 0.8f;
        decoFallenTree.logCondition = DecoFallenTree.LogCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        decoFallenTree.logConditionNoise = 0f;
        decoFallenTree.logConditionChance = 24;
        decoFallenTree.maxY = 120;
        decoFallenTree.logBlock = Blocks.log.getStateFromMeta(3);
        decoFallenTree.leavesBlock = Blocks.leaves.getStateFromMeta(3);
        decoFallenTree.minSize = 4;
        decoFallenTree.maxSize = 8;
        this.addDeco(decoFallenTree, this.config._boolean(BiomeConfigHLTropicalIslands.decorationLogsId));

        // A combo-deal of lilypads and vines. (This could probably be pulled out into individual decos.)
        DecoJungleLilypadVines decoJungleLilypadVines = new DecoJungleLilypadVines();
        this.addDeco(decoJungleLilypadVines);

        // Flowers.
        DecoFlowersRTG decoFlowersRTG = new DecoFlowersRTG();
        decoFlowersRTG.flowers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}; // Only orange tulips fit in with the colour scheme.
        decoFlowersRTG.chance = 3;
        decoFlowersRTG.maxY = 120;
        decoFlowersRTG.strengthFactor = 4f;
        this.addDeco(decoFlowersRTG);

        // Mossy boulders for the green.
        DecoBoulder decoBoulder = new DecoBoulder();
        decoBoulder.boulderBlock = Blocks.mossy_cobblestone.getDefaultState();
        decoBoulder.chance = 36;
        decoBoulder.maxY = 95;
        decoBoulder.strengthFactor = 1f;
        this.addDeco(decoBoulder);

        DecoGrass decoFern = new DecoGrass(2);
        decoFern.maxY = 128;
        decoFern.strengthFactor = 10f;
        this.addDeco(decoFern);

        DecoGrass decoGrass = new DecoGrass();
        decoGrass.maxY = 128;
        decoGrass.strengthFactor = 4f;
        this.addDeco(decoGrass);
        noLakes = true;
        noWaterFeatures = true;
    }
}
