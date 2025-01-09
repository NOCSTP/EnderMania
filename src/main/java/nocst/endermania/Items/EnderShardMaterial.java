package nocst.endermania.Items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;



public class EnderShardMaterial implements ToolMaterial {


    public static final EnderShardMaterial OBSERVANT_MATERIAL = new EnderShardMaterial();
    @Override
    public int getDurability() {
        return 455;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5.0F;
    }

    @Override
    public float getAttackDamage() {
        return 1.5F;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 22;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }


}

