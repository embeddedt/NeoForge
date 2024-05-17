package net.neoforged.neoforge.common.world;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ChunkPos;
import net.minecraft.world.level.ClipBlockStateContext;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.lighting.LevelLightEngine;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.neoforged.neoforge.client.model.data.ModelData;
import org.jetbrains.annotations.ApiStatus;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class BlockAndTintGetterWrapper implements BlockAndTintGetter {
    protected BlockAndTintGetter delegate;

    public BlockAndTintGetterWrapper(BlockAndTintGetter delegate) {
        this.delegate = delegate;
    }

    @Override
    public float getShade(Direction p_45522_, boolean p_45523_) {
        return delegate.getShade(p_45522_, p_45523_);
    }

    @Override
    public LevelLightEngine getLightEngine() {
        return delegate.getLightEngine();
    }

    @Override
    public int getBlockTint(BlockPos p_45520_, ColorResolver p_45521_) {
        return delegate.getBlockTint(p_45520_, p_45521_);
    }

    @Override
    public int getBrightness(LightLayer p_45518_, BlockPos p_45519_) {
        return delegate.getBrightness(p_45518_, p_45519_);
    }

    @Override
    public int getRawBrightness(BlockPos p_45525_, int p_45526_) {
        return delegate.getRawBrightness(p_45525_, p_45526_);
    }

    @Override
    public boolean canSeeSky(BlockPos p_45528_) {
        return delegate.canSeeSky(p_45528_);
    }

    @Override
    @Nullable
    public BlockEntity getBlockEntity(BlockPos p_45570_) {
        return delegate.getBlockEntity(p_45570_);
    }

    @Override
    public <T extends BlockEntity> Optional<T> getBlockEntity(BlockPos p_151367_, BlockEntityType<T> p_151368_) {
        return delegate.getBlockEntity(p_151367_, p_151368_);
    }

    @Override
    public BlockState getBlockState(BlockPos p_45571_) {
        return delegate.getBlockState(p_45571_);
    }

    @Override
    public FluidState getFluidState(BlockPos p_45569_) {
        return delegate.getFluidState(p_45569_);
    }

    @Override
    public int getLightEmission(BlockPos p_45572_) {
        return delegate.getLightEmission(p_45572_);
    }

    @Override
    public int getMaxLightLevel() {
        return delegate.getMaxLightLevel();
    }

    @Override
    public Stream<BlockState> getBlockStates(AABB p_45557_) {
        return delegate.getBlockStates(p_45557_);
    }

    @Override
    public BlockHitResult isBlockInLine(ClipBlockStateContext p_151354_) {
        return delegate.isBlockInLine(p_151354_);
    }

    @Override
    public BlockHitResult clip(ClipContext p_45548_) {
        return delegate.clip(p_45548_);
    }

    @Override
    @Nullable
    public BlockHitResult clipWithInteractionOverride(Vec3 p_45559_, Vec3 p_45560_, BlockPos p_45561_, VoxelShape p_45562_, BlockState p_45563_) {
        return delegate.clipWithInteractionOverride(p_45559_, p_45560_, p_45561_, p_45562_, p_45563_);
    }

    @Override
    public double getBlockFloorHeight(VoxelShape p_45565_, Supplier<VoxelShape> p_45566_) {
        return delegate.getBlockFloorHeight(p_45565_, p_45566_);
    }

    @Override
    public double getBlockFloorHeight(BlockPos p_45574_) {
        return delegate.getBlockFloorHeight(p_45574_);
    }

    public static <T, C> T traverseBlocks(Vec3 p_151362_, Vec3 p_151363_, C p_151364_, BiFunction<C, BlockPos, T> p_151365_, Function<C, T> p_151366_) {
        return BlockGetter.traverseBlocks(p_151362_, p_151363_, p_151364_, p_151365_, p_151366_);
    }

    @Override
    public int getHeight() {
        return delegate.getHeight();
    }

    @Override
    public int getMinBuildHeight() {
        return delegate.getMinBuildHeight();
    }

    @Override
    public int getMaxBuildHeight() {
        return delegate.getMaxBuildHeight();
    }

    @Override
    public int getSectionsCount() {
        return delegate.getSectionsCount();
    }

    @Override
    public int getMinSection() {
        return delegate.getMinSection();
    }

    @Override
    public int getMaxSection() {
        return delegate.getMaxSection();
    }

    @Override
    public boolean isOutsideBuildHeight(BlockPos p_151571_) {
        return delegate.isOutsideBuildHeight(p_151571_);
    }

    @Override
    public boolean isOutsideBuildHeight(int p_151563_) {
        return delegate.isOutsideBuildHeight(p_151563_);
    }

    @Override
    public int getSectionIndex(int p_151565_) {
        return delegate.getSectionIndex(p_151565_);
    }

    @Override
    public int getSectionIndexFromSectionY(int p_151567_) {
        return delegate.getSectionIndexFromSectionY(p_151567_);
    }

    @Override
    public int getSectionYFromSectionIndex(int p_151569_) {
        return delegate.getSectionYFromSectionIndex(p_151569_);
    }

    public static LevelHeightAccessor create(int p_186488_, int p_186489_) {
        return LevelHeightAccessor.create(p_186488_, p_186489_);
    }

    @Override
    @ApiStatus.NonExtendable
    @org.jetbrains.annotations.Nullable
    public AuxiliaryLightManager getAuxLightManager(BlockPos pos) {
        return delegate.getAuxLightManager(pos);
    }

    @Override
    @org.jetbrains.annotations.Nullable
    public AuxiliaryLightManager getAuxLightManager(ChunkPos pos) {
        return delegate.getAuxLightManager(pos);
    }

    @Override
    public ModelData getModelData(BlockPos pos) {
        return delegate.getModelData(pos);
    }

    @Override
    public float getShade(float normalX, float normalY, float normalZ, boolean shade) {
        return delegate.getShade(normalX, normalY, normalZ, shade);
    }
}
