package nocst.endermania.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import nocst.endermania.EnderMania;

public class ModBlocks {

    public static final Block END_RUBBLE = registerBlock("end_rubbble",
            new Block(FabricBlockSettings.create().mapColor(MapColor.PALE_YELLOW).instrument(Instrument.BASEDRUM).strength(2.0F, 9.0F).requiresTool()));
    public static final Block End_STONE_BLOCK = registerBlock("end_stone_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BASALT)));




    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(EnderMania.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), new BlockItem(
                block, new FabricItemSettings()
        ));
    }

    public static void registerModBlock(){
        EnderMania.LOGGER.info("Modblock registered for mod" + EnderMania.MOD_ID );
    }


}
