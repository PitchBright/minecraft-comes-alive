package mca.items;

import mca.core.MCA;
import mca.enums.EnumCut;
import net.minecraft.item.ItemStack;
import radixcore.item.ItemColorable;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemColoredDiamond extends ItemColorable
{
	private EnumCut cut;
	
	public ItemColoredDiamond(EnumCut cut)
	{
		String name = "ColoredDiamond" + cut.toString();
		
		this.cut = cut;
		this.setHasSubtypes(true);
		this.setMaxDamage(0);
		this.setUnlocalizedName(name);
		this.setTextureName("mca:" + name);
		this.setCreativeTab(MCA.getCreativeTabGemCutting());

		GameRegistry.registerItem(this, name);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		if (cut != EnumCut.NONE)
		{
			return "item.Diamond" + cut.toString();			
		}

		else
		{
			return "item.diamond";
		}
	}
}
