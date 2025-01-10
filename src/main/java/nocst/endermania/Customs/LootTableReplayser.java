package nocst.endermania.Customs;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;
import nocst.endermania.Items.ModItems;

public class LootTableReplayser {

    // Идентификатор таблицы лута для End Stone
    private static final Identifier END_STONE_LOOTTABLE = new Identifier("minecraft", "blocks/end_stone");

    private LootTableReplayser() {
        throw new AssertionError();
    }

    public static void register() {
        // Замена таблицы лута
        LootTableEvents.REPLACE.register((resourceManager, lootManager, id, original, source) -> {
            if (END_STONE_LOOTTABLE.equals(id)) {
                // Создаём новый пул лута
                LootPool lootPool = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1)) // Один бросок
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) // 100% шанс выпадения
                        .with(ItemEntry.builder(ModItems.END_STONE_SHARD)) // Предмет лута
                        .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1)).build()) // Количество
                        .build();

                // Создаём новую таблицу лута
                return LootTable.builder()
                        .pool(lootPool)
                        .build();
            }

            // Если идентификатор не совпадает, возвращаем оригинальную таблицу
            return original;
        });
    }
}