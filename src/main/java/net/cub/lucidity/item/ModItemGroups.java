package net.cub.lucidity.item;
import net.cub.lucidity.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.cub.lucidity.Lucidity;

public class ModItemGroups {
    public static final ItemGroup LUCIDIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Lucidity.MOD_ID, "lucidium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lucidium"))
                    .icon(() -> new ItemStack(ModItems.LUCIDIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LUCIDIUM);
                        entries.add(ModBlocks.LUCIDIA);

                    }).build());

    public static void registerItemGroups() {
        Lucidity.LOGGER.info("Registering Item Groups for " + Lucidity.MOD_ID);
    }
}
