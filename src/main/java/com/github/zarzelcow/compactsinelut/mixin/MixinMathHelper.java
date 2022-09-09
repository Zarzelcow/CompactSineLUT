package com.github.zarzelcow.compactsinelut.mixin;

import com.github.zarzelcow.compactsinelut.CompactSineLUT;
import net.minecraft.util.math.MathHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(MathHelper.class)
public class MixinMathHelper {
    /**
     * @author jellysquid3
     * @reason use an optimized implementation
     */
    @Overwrite
    public static float sin(float f) {
        return CompactSineLUT.sin(f);
    }

    /**
     * @author jellysquid3
     * @reason use an optimized implementation
     */
    @Overwrite
    public static float cos(float f) {
        return CompactSineLUT.cos(f);
    }
}
