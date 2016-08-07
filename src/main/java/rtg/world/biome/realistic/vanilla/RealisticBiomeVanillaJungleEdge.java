package rtg.world.biome.realistic.vanilla;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

import rtg.api.biome.BiomeConfig;
import rtg.api.biome.vanilla.config.BiomeConfigVanillaJungleEdge;
import rtg.world.biome.deco.DecoBaseBiomeDecorations;
import rtg.world.biome.deco.DecoFallenTree;
import rtg.world.gen.surface.vanilla.SurfaceVanillaJungleEdge;
import rtg.world.gen.terrain.vanilla.TerrainVanillaJungleEdge;

public class RealisticBiomeVanillaJungleEdge extends RealisticBiomeVanillaBase {

    public static IBlockState topBlock = BiomeGenBase.jungleEdge.topBlock;
    public static IBlockState fillerBlock = BiomeGenBase.jungleEdge.fillerBlock;

    public RealisticBiomeVanillaJungleEdge(BiomeConfig config) {

        super(config,
            BiomeGenBase.jungleEdge,
            BiomeGenBase.river,
            new TerrainVanillaJungleEdge(),
            new SurfaceVanillaJungleEdge(config, topBlock, fillerBlock)
        );

        DecoBaseBiomeDecorations decoBaseBiomeDecorations = new DecoBaseBiomeDecorations();
        this.addDeco(decoBaseBiomeDecorations);

        DecoFallenTree decoFallenTree = new DecoFallenTree();
        decoFallenTree.loops = 1;
        decoFallenTree.distribution.noiseDivisor = 100f;
        decoFallenTree.distribution.noiseFactor = 6f;
        decoFallenTree.distribution.noiseAddend = 0.8f;
        decoFallenTree.logCondition = DecoFallenTree.LogCondition.NOISE_GREATER_AND_RANDOM_CHANCE;
        decoFallenTree.logConditionNoise = 0f;
        decoFallenTree.logConditionChance = 6;
        decoFallenTree.logBlock = Blocks.log.getStateFromMeta(3);
        decoFallenTree.leavesBlock = Blocks.leaves.getStateFromMeta(3);
        decoFallenTree.minSize = 3;
        decoFallenTree.maxSize = 6;
        this.addDeco(decoFallenTree, this.config._boolean(BiomeConfigVanillaJungleEdge.decorationLogsId));
    }
}
