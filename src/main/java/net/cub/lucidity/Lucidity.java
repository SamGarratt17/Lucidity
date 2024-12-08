package net.cub.lucidity;

import net.cub.lucidity.block.ModBlocks;
import net.cub.lucidity.item.ModItems;
import net.cub.lucidity.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lucidity implements ModInitializer {

    public static final String MOD_ID = "lucidity";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
