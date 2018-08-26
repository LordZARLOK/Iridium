package net.LORD.iridium;

import net.LORD.iridium.events.RegisteringEvent;
import net.LORD.iridium.proxy.CommonProxy;
import net.LORD.iridium.utils.References;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = References.MODID, name = References.NAME, version = References.VERSION )

public class iridiumMAIN
{
    @Mod.Instance(References.MODID)
    public static iridiumMAIN instance;


    @SidedProxy(clientSide = References.CP , serverSide = References.SP)
    public static CommonProxy proxy;


    public iridiumMAIN()
    {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvent());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {
        proxy.preInit();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {
        proxy.preInit();
    }
}
