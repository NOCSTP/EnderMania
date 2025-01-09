package nocst.endermania.Items.custom;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TieredItem extends Item {
    public TieredItem(Settings settings, int tier) {
        super(settings);
        this.Tier = tier;
    }

    private int Tier;

    public int getTier() {
        return Tier;
    }



    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Tier: " +  getTier()));

        super.appendTooltip(stack, world, tooltip, context);
    }
}
