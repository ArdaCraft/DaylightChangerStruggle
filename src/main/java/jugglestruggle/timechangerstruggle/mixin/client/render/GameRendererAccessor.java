package jugglestruggle.timechangerstruggle.mixin.client.render;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.LightmapTextureManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

/**
 * @author JuggleStruggle
 * @implNote Introduced in v0.0.4
 */
@Mixin(GameRenderer.class)
public interface GameRendererAccessor {
    @Accessor("lightmapTextureManager")
    LightmapTextureManager getLightmapTextureManager();
}
