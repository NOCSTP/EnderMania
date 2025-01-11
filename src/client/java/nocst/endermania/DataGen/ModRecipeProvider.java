package nocst.endermania.DataGen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import nocst.endermania.Items.ModItems;
import nocst.endermania.block.ModBlocks;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {


    private static List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.END_STONE_SHARD);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.END_SMELLED_SHARD, 0.7f, 200, "end_stone_shard");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.END_SMELLED_SHARD, 0.7f, 100, "end_stone_shard");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_SMELLED_SHARD, RecipeCategory.DECORATIONS, ModBlocks.End_STONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.END_STONE_SHARD, RecipeCategory.DECORATIONS, Blocks.END_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.END_STRING, 1)
                .pattern("  S")
                .pattern(" S ")
                .pattern("S  ")
                .input('S', ModItems.END_FIBER)
                .criterion(hasItem(ModItems.END_FIBER), conditionsFromItem(ModItems.END_FIBER))
                .criterion(hasItem(ModItems.END_STRING), conditionsFromItem(ModItems.END_STRING))
                    .offerTo(exporter, new Identifier(getRecipeName(ModItems.END_STRING)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSERVANT_AXE, 1)
                .pattern("FS")
                .pattern("C ")
                .input('F', ModItems.END_FIBER)
                .input('S', ModItems.END_STONE_SHARD)
                .input('C', Items.STICK)
                .criterion(hasItem(ModItems.END_FIBER), conditionsFromItem(ModItems.END_FIBER))
                .criterion(hasItem(ModItems.END_STONE_SHARD), conditionsFromItem(ModItems.END_STONE_SHARD))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSERVANT_AXE)));










//        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems., 1)
//                .pattern("  S")
//                .pattern(" S ")
//                .pattern("S  ")
//                .input('S', ModItems.END_FIBER)
//                .criterion(hasItem(ModItems.END_FIBER), conditionsFromItem(ModItems.END_FIBER))
//                .criterion(hasItem(ModItems.END_STRING), conditionsFromItem(ModItems.END_STRING))
//                .offerTo(exporter, new Identifier(getRecipeName(ModItems.END_STRING)));

    }




}
