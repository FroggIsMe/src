package GoTMC.Blocks;

import net.minecraft.item.Item;
import net.minecraft.potion.PotionHelper;

public class CraftingMaterialHand extends Item{
	public CraftingMaterialHand() {
		
		this.setFull3D();
		//held like a sword
		
		this.setNoRepair();
		//cannot combine em
		
		//this.setContainerItem(
		//gives back () item after being crafted with
		
		this.setMaxStackSize(64);
		//yea
		
//		this.setMaxDamage(100);
		//eh
		
		//this.setPotionEffect(PotionHelper.ghastTearEffect);
		//can make regen pots
		
		
		
		
		
	}
}
