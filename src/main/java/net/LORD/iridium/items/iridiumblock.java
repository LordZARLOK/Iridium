package net.LORD.iridium.items;

import net.LORD.iridium.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class iridiumblock extends Block
{


    public iridiumblock(String name, Material materialIn) {
        super( materialIn );
        setRegistryName( name ).setUnlocalizedName( name );

        ModBlocks.INSTANCE.getBlocks().add( this );
    }

    public iridiumblock(String name, Material materialIn, float hardness, float resistance)
    {
        super(materialIn);

        setHardness( hardness );
        setResistance( resistance );

        ModBlocks.INSTANCE.getBlocks().add( this );
    }


    public iridiumblock(String name, Material material, float hardness, float resistance, int harvestLevel, String harvestType)
    {
        this(name, material, hardness , resistance);

        setHarvestLevel( harvestType, harvestLevel );

    }
}
