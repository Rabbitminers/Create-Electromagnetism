package com.rabbitminers.createelectromagnetism;

import com.mojang.logging.LogUtils;
import com.rabbitminers.createelectromagnetism.registry.ElectromagnetismBlocks;
import com.rabbitminers.createelectromagnetism.registry.ElectromagnetismItems;
import com.rabbitminers.createelectromagnetism.registry.ElectromagnetismTileEntities;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Electromagnetism.MODID)
public class Electromagnetism {
    public static final String MODID = "createelectromagnetism";
    private static final NonNullSupplier<CreateRegistrate> registrate = CreateRegistrate.lazy(Electromagnetism.MODID);
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final CreativeModeTab itemGroup = new CreativeModeTab(MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AllBlocks.FLYWHEEL.get());
        }
    };

    public Electromagnetism()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ElectromagnetismBlocks.register();
        ElectromagnetismItems.register(eventBus);
        ElectromagnetismTileEntities.register();
    }

    private void setup(final FMLCommonSetupEvent event) {}

    public static CreateRegistrate registrate() {
        return registrate.get();
    }
}
