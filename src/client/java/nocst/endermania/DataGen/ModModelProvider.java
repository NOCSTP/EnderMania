package nocst.endermania.DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import nocst.endermania.Items.ModItems;
import nocst.endermania.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.End_STONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_RUBBLE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.END_STONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARP_END_STONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_SMELLED_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_STRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_FIBER, Models.GENERATED);
    }
}
