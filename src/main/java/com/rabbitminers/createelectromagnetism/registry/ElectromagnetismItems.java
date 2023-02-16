package com.rabbitminers.createelectromagnetism.registry;

import com.rabbitminers.createelectromagnetism.Electromagnetism;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.minecraftforge.eventbus.api.IEventBus;

public class ElectromagnetismItems {
    private static final CreateRegistrate REGISTRATE = Electromagnetism.registrate()
            .creativeModeTab(() -> Electromagnetism.itemGroup);

    // See create git for how to register items
    // - https://github.com/Creators-of-Create/Create/blob/mc1.18/dev/src/main/java/com/simibubi/create/AllItems.java
    public static void register(IEventBus eventBus) {

    }
}
