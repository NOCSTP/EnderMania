//package nocst.endermania.Customs;
//
//import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
//import net.minecraft.block.Blocks;
//import net.minecraft.loot.LootManager;
//import net.minecraft.loot.LootPool;
//import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
//import net.minecraft.util.Identifier;
//
//public class LootTableOverrides {
//
//    private static final Identifier END_STONE_LOOT_TABLE = Blocks.END_STONE.getLootTableId();
//
//    public static void register() {
//        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
//            // Check if the loot table being modified is for End Stone
//            if (END_STONE_LOOT_TABLE.equals(id)) {
//                // Clear all loot pools to prevent drops
//                tableBuilder.pool(LootPool.builder()
//                        .rolls(ConstantLootNumberProvider.create(0)) // No drops
//                        .build());
//            }
//        });
//    }
//}
