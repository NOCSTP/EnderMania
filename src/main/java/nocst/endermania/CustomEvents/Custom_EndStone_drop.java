package nocst.endermania.CustomEvents;

import net.fabricmc.fabric.api.event.player.AttackBlockCallback;

public class Custom_EndStone_drop {
    AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) -> {
        // Check if the block being broken is end stone
        if (world.getBlockState(pos).getBlock() == Blocks.END_STONE) {
            // Drop a custom item instead of the default drop
            ItemStack diamondStack = new ItemStack(Items.DIAMOND);
            ItemEntity diamondEntity = new ItemEntity(world, pos.getX(), pos.getY(), pos.getZ(), diamondStack);
            world.spawnEntity(diamondEntity);

            // Optionally, you can set the block to air to simulate breaking it
            world.setBlockState(pos, Blocks.AIR.getDefaultState());

            // Return SUCCESS to indicate that the event was handled
            return ActionResult.SUCCESS;
        }

        // If it's not end stone, continue with the default behavior
        return ActionResult.PASS;
    });
}
