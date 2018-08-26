package net.LORD.iridium.items;

import net.LORD.iridium.init.ModItems;
import net.minecraft.item.Item;

public class iridiumItems extends Item
{

    public iridiumItems(String name)
    {

        setRegistryName( name ).setUnlocalizedName( name );

        ModItems.INSTANCE.getItems().add( this );
    }
}
