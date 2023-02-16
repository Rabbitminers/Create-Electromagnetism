package com.rabbitminers.createelectromagnetism.registry;

import com.rabbitminers.createelectromagnetism.Electromagnetism;
import com.rabbitminers.createelectromagnetism.content.magnetism.blocks.bearing.MagneticBearingBlock;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllTags;
import com.simibubi.create.content.contraptions.components.structureMovement.bearing.WindmillBearingBlock;
import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.TagGen;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.world.level.material.MaterialColor;

public class ElectromagnetismBlocks {
    private static final CreateRegistrate REGISTRATE = Electromagnetism.registrate().creativeModeTab(
            () -> Electromagnetism.itemGroup
    );

    public static final BlockEntry<MagneticBearingBlock> MAGNETIC_BEARING =
            REGISTRATE.block("magnetic_bearing", MagneticBearingBlock::new)
                    .transform(TagGen.axeOrPickaxe())
                    .properties(p -> p.color(MaterialColor.RAW_IRON))
                    .transform(BuilderTransformers.bearing("magnetic", "gearbox", true))
                    .transform(BlockStressDefaults.setCapacity(512.0))
                    .transform(BlockStressDefaults.setGeneratorSpeed(WindmillBearingBlock::getSpeedRange))
                    .tag(AllTags.AllBlockTags.SAFE_NBT.tag)
                    .register();

    public static void register() {}
}
