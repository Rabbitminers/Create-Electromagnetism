package com.rabbitminers.createelectromagnetism.registry;

import com.rabbitminers.createelectromagnetism.Electromagnetism;
import com.rabbitminers.createelectromagnetism.content.magnetism.blocks.bearing.MagneticBearingTileEntity;
import com.simibubi.create.content.contraptions.components.structureMovement.bearing.BearingInstance;
import com.simibubi.create.content.contraptions.components.structureMovement.bearing.BearingRenderer;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;

public class ElectromagnetismTileEntities {
    private static final CreateRegistrate REGISTRATE = Electromagnetism.registrate();

    public static final BlockEntityEntry<MagneticBearingTileEntity> MAGNETIC_BEARING = REGISTRATE
            .tileEntity("magnetic_bearing", MagneticBearingTileEntity::new)
            .instance(() -> BearingInstance::new)
            .validBlocks(ElectromagnetismBlocks.MAGNETIC_BEARING)
            .renderer(() -> BearingRenderer::new)
            .register();

    public static void register() {}
}
