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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.STEPANA_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.END_STONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARP_END_STONE_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_SMELLED_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_STRING, Models.GENERATED);
        itemModelGenerator.register(ModItems.END_FIBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.ENDER_KEBABS, Models.GENERATED);
        itemModelGenerator.register(ModItems.NEVEBUMBA, Models.GENERATED);


        //Model of sword
        itemModelGenerator.register(ModItems.OBSERVANT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSERVANT_PICKAXE, Models.HANDHELD);
    }

}
