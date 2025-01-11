package nocst.endermania.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import nocst.endermania.EnderMania;
import net.minecraft.registry.Registry;
import nocst.endermania.Items.Foods.ModFoodItems;

public class ModItems {

    public static final Item END_STONE_SHARD = registrItem("end_stone_shard", new Item(new FabricItemSettings()));
    public static final Item END_FIBER = registrItem("end_fiber", new Item(new FabricItemSettings()));
    public static final Item END_STRING = registrItem("end_string", new Item(new FabricItemSettings()));
    public static final Item END_SMELLED_SHARD = registrItem("end_smelled_stone_shard", new Item( new FabricItemSettings()));
    public static final Item SHARP_END_STONE_SHARD = registrItem("sharp_end_stone_shard", new Item(new FabricItemSettings()));
    public static final Item ENDER_DUST =  registrItem("ender_dust", new Item(new FabricItemSettings()));
    public static final Item  OBSERVANT_SWORD =  registerSword("observant_sword", new SwordItem(EnderShardMaterial.OBSERVANT_MATERIAL, 3, 3, new FabricItemSettings()));
    public static final Item  OBSERVANT_PICKAXE =  registerPickaxe("observant_pickaxe", new PickaxeItem(EnderShardMaterial.OBSERVANT_MATERIAL, 3, 3, new FabricItemSettings()));
    public static final Item  OBSERVANT_AXE =  registerPickaxe("observant_axe", new PickaxeItem(EnderShardMaterial.OBSERVANT_MATERIAL, 3, 3, new FabricItemSettings()));
    //custom shit


    private static Item registrItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), item);
    }



    private static Item registerSword(String name, SwordItem swordItem) {
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), swordItem);
    }
    private static Item registerAxe(String name, AxeItem axeItem) {
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), axeItem);
    }

    private static Item registerPickaxe(String name, PickaxeItem pickAxe) {
        return Registry.register(Registries.ITEM, new Identifier(EnderMania.MOD_ID, name), pickAxe);
    }


    public static void registerModItem(){
        EnderMania.LOGGER.info("Register mod items for "+ EnderMania.MOD_ID);

    }



}
