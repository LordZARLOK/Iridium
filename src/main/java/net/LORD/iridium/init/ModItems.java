package net.LORD.iridium.init;

import com.google.common.collect.Lists;
import net.LORD.iridium.items.iridiumItems;
import net.LORD.iridium.utils.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;


public class ModItems
{

    public static final ModItems INSTANCE = new ModItems();

    public static Item iridium_ingot;

    private List<Item>items;

    public void init()
    {

        items = Lists.newArrayList();

        iridium_ingot = new iridiumItems("iridium_ingot");



    }

    @SubscribeEvent
    public void registermodels(ModelRegistryEvent e)
    {

        for(Item item : items)
        {
            registerModel( item );
        }

    }


    private void registerModel(Item item)
    {

        ModelLoader.setCustomModelResourceLocation(item, 0 , new ModelResourceLocation( new ResourceLocation( References.MODID, item.getUnlocalizedName().substring( 5 ) ), "inventory"));
    }

    public List<Item> getItems() {
        return items;
    }
}
