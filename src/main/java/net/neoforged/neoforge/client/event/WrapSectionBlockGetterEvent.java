package net.neoforged.neoforge.client.event;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockAndTintGetter;
import net.neoforged.bus.api.Event;

public class WrapSectionBlockGetterEvent extends Event {
    private final BlockPos sectionOrigin;
    private final BlockPos sectionMax;
    private final BlockAndTintGetter originalGetter;
    private BlockAndTintGetter getter;

    public WrapSectionBlockGetterEvent(BlockAndTintGetter originalGetter, BlockPos sectionOrigin, BlockPos sectionMax) {
        this.sectionOrigin = sectionOrigin;
        this.sectionMax = sectionMax;
        this.originalGetter = originalGetter;
        this.getter = originalGetter;
    }

    public BlockPos getSectionOrigin() {
        return sectionOrigin;
    }

    public BlockPos getSectionMax() {
        return sectionMax;
    }

    public BlockAndTintGetter getOriginalGetter() {
        return originalGetter;
    }

    public void setGetter(BlockAndTintGetter getter) {
        this.getter = getter;
    }

    public BlockAndTintGetter getGetter() {
        return this.getter;
    }
}
