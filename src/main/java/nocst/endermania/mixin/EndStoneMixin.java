package nocst.endermania.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nocst.endermania.Items.ModItems;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Block.class)
public abstract class EndStoneMixin {

    @Inject(method = "afterBreak", at = @At("HEAD"), cancellable = true)
    private void modifyEndStoneBehavior(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack, CallbackInfo ci) {
        // Перевіряємо, чи це End Stone
        if (state.isOf(Blocks.END_STONE)) {
            if (world instanceof ServerWorld serverWorld) {
                // Перевіряємо, чи гравець ламає блок рукою
                if (player.getMainHandStack().isEmpty()) {
                    // Якщо рукою - дропаємо мод-айтем
                    Block.dropStack(serverWorld, pos, new ItemStack(ModItems.END_STONE_SHARD));
                } else {
                    // Якщо інструментом - дропаємо блок End Stone
                    Block.dropStack(serverWorld, pos, new ItemStack(Blocks.END_STONE));
                }
                // Видаляємо блок і зупиняємо стандартну обробку
                world.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
                ci.cancel();
            }
        }
    }
}