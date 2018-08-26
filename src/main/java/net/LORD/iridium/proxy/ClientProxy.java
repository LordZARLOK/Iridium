package net.LORD.iridium.proxy;

import net.LORD.iridium.init.ModBlocks;
import net.LORD.iridium.init.ModItems;
import net.minecraftforge.common.MinecraftForge;

public class ClientProxy extends CommonProxy
{

    @Override
    public void preInit()
    {
        super.preInit();

        MinecraftForge.EVENT_BUS.register( ModItems.INSTANCE );
        MinecraftForge.EVENT_BUS.register( ModBlocks.INSTANCE );
    }


    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
