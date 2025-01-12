package nocst.endermania.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import nocst.endermania.EnderMania;
import nocst.endermania.block.ModBlocks;

public class ModItemsGroups {
    public static final ItemGroup EnderManiaGroup = Registry.register(Registries.ITEM_GROUP, new Identifier(EnderMania.MOD_ID, "endermania"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endermania"))
                    .icon(() ->
                            new ItemStack(ModItems.END_STONE_SHARD)).entries(((displayContext, entries) -> {
                            entries.add(ModItems.SHARP_END_STONE_SHARD);
                            entries.add(ModBlocks.END_RUBBLE);
                            entries.add(ModItems.END_SMELLED_SHARD);
                            entries.add(ModItems.END_STRING);
                            entries.add(ModItems.END_FIBER);
                            entries.add(ModItems.END_STONE_SHARD);
                            entries.add(ModItems.ENDER_DUST);


                    })).build());


    public static final ItemGroup ENDERMANIA_TOOLS = Registry.register(Registries.ITEM_GROUP, new Identifier(EnderMania.MOD_ID, "endermaia_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.endermaia_tools"))
                    .icon(() ->
                            new ItemStack(ModItems.OBSERVANT_AXE)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.OBSERVANT_SWORD);
                        entries.add(ModItems.OBSERVANT_PICKAXE);
                        entries.add(ModItems.OBSERVANT_AXE);

                    })).build());



    public static void registerItemGroups(){
        EnderMania.LOGGER.info("Register ItemGroup for " + EnderMania.MOD_ID);
    }

}
