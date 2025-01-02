package nocst.endermania.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import nocst.endermania.EnderMania;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item END_STONE_SHARD = registrItem("end_stone_shard", new Item(new FabricItemSettings()));
    public static final Item END_FIBER = registrItem("end_fiber", new Item(new FabricItemSettings()));
    public static final Item END_STRING = registrItem("end_string", new Item(new FabricItemSettings()));
    public static final Item END_SMELLED_SHARD = registrItem("end_smelled_stone_shard", new Item( new FabricItemSettings()));
    public static final Item SHARP_END_STONE_SHARD = registrItem("sharp_end_stone_shard", new Item(new FabricItemSettings()));



    private static Item registrItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), item);
    }


    public static void registerModItem(){
        EnderMania.LOGGER.info("Register mod items for "+ EnderMania.MOD_ID);

    }

}
