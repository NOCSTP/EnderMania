package nocst.endermania.DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootTable;
import nocst.endermania.block.ModBlocks;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput){
        super(dataOutput);
    }
    @Override
    public void generate(){
        addDrop(ModBlocks.END_RUBBLE);
        addDrop(ModBlocks.End_STONE_BLOCK);
    }

}
