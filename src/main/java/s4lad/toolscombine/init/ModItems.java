package s4lad.toolscombine.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import s4lad.toolscombine.Reference;
import s4lad.toolscombine.ToolsCombine;
import s4lad.toolscombine.items.*;



public class ModItems {
	
	
	    public static Item essence;
	    
	    public static Item wpade;
	    public static Item wpaxe;
	    public static Item wsaxe;

	    public static Item spade;
	    public static Item spaxe;
	    public static Item ssaxe;

	    public static Item ipade;
	    public static Item ipaxe;
	    public static Item isaxe;
	    
	    public static Item dpade;
	    public static Item dpaxe;
	    public static Item dsaxe;
	    
	    public static Item gpade;	
	    public static Item gpaxe;
	    public static Item gsaxe;

	

	public static void init() {
		essence = new ItemEssence().setCreativeTab(CreativeTabs.MATERIALS);
		
		wpade = new ItemPade(ToolMaterial.WOOD).setUnlocalizedName("wpade").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemWpade");; // .setTextureName("toolcombine:wpade")
		wpaxe = new ItemPaxe(ToolMaterial.WOOD).setUnlocalizedName("wpaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemWpaxe");; // .setTextureName("toolcombine:wpaxe")
		wsaxe = new ItemSaxe(ToolMaterial.WOOD).setUnlocalizedName("wsaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemWsaxe");; // .setTextureName("toolcombine:wsaxe")
		
		spade = new ItemPade(ToolMaterial.STONE).setUnlocalizedName("spade").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemSpade");; // .setTextureName("toolcombine:spade")
		spaxe = new ItemPaxe(ToolMaterial.STONE).setUnlocalizedName("spaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemSpaxe");; // .setTextureName("toolcombine:spaxe")
		ssaxe = new ItemSaxe(ToolMaterial.STONE).setUnlocalizedName("ssaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemSsaxe");; // .setTextureName("toolcombine:ssaxe")
		
		ipade = new ItemPade(ToolMaterial.IRON).setUnlocalizedName("ipade").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemIpade");; // .setTextureName("toolcombine:ipade")
		ipaxe = new ItemPaxe(ToolMaterial.IRON).setUnlocalizedName("ipaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemIpaxe");; // .setTextureName("toolcombine:ipaxe")
		isaxe = new ItemSaxe(ToolMaterial.IRON).setUnlocalizedName("isaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemIsaxe");; // .setTextureName("toolcombine:isaxe")
		
		dpade = new ItemPade(ToolMaterial.DIAMOND).setUnlocalizedName("dpade").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemDpade");; // .setTextureName("toolcombine:dpade")
		dpaxe = new ItemPaxe(ToolMaterial.DIAMOND).setUnlocalizedName("dpaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemDpaxe");; // .setTextureName("toolcombine:dpaxe")
		dsaxe = new ItemSaxe(ToolMaterial.DIAMOND).setUnlocalizedName("dsaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemDsaxe");; // .setTextureName("toolcombine:dsaxe")

		gpade = new ItemPade(ToolMaterial.GOLD).setUnlocalizedName("gpade").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemGpade"); // .setTextureName("toolcombine:gpade")
		gpaxe = new ItemPaxe(ToolMaterial.GOLD).setUnlocalizedName("gpaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemGpaxe");; // .setTextureName("toolcombine:gpaxe")
		gsaxe = new ItemSaxe(ToolMaterial.GOLD).setUnlocalizedName("gsaxe").setCreativeTab(CreativeTabs.TOOLS).setRegistryName("ItemGsaxe");; // .setTextureName("toolcombine:gsaxe")
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(wsaxe), new Object[] {Items.WOODEN_SHOVEL, Items.WOODEN_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(wpaxe), new Object[] {Items.WOODEN_PICKAXE, Items.WOODEN_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(wpade), new Object[] {Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE});

		GameRegistry.addShapelessRecipe(new ItemStack(ssaxe), new Object[] {Items.STONE_SHOVEL, Items.STONE_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(spaxe), new Object[] {Items.STONE_PICKAXE, Items.STONE_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(spade), new Object[] {Items.STONE_SHOVEL, Items.STONE_PICKAXE});
	
		GameRegistry.addShapelessRecipe(new ItemStack(isaxe), new Object[] {essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(ipaxe), new Object[] {essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(ipade), new Object[] {essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		
		GameRegistry.addShapelessRecipe(new ItemStack(dsaxe), new Object[] {essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});
		GameRegistry.addShapelessRecipe(new ItemStack(dpaxe), new Object[] {essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});
		GameRegistry.addShapelessRecipe(new ItemStack(dpade), new Object[] {essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});		

		GameRegistry.addShapelessRecipe(new ItemStack(gsaxe), new Object[] {essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(gpaxe), new Object[] {essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(gpade), new Object[] {essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});

		
		GameRegistry.addSmelting(Items.WOODEN_PICKAXE, new ItemStack(essence), 1.0F);
		GameRegistry.addSmelting(Items.WOODEN_AXE, new ItemStack(essence), 1.0F);
		GameRegistry.addSmelting(Items.WOODEN_SHOVEL, new ItemStack(essence), 1.0F);
	
		GameRegistry.addSmelting(Items.STONE_PICKAXE, new ItemStack(essence), 1.0F);
		GameRegistry.addSmelting(Items.STONE_AXE, new ItemStack(essence), 1.0F);
		GameRegistry.addSmelting(Items.STONE_SHOVEL, new ItemStack(essence), 1.0F);
		
		
		
		
		
		
		
	
		
	}
	public static void register () {
		GameRegistry.register(essence);
		
		GameRegistry.register(wpade);
		GameRegistry.register(wpaxe);
		GameRegistry.register(wsaxe);	

		GameRegistry.register(spade);
		GameRegistry.register(spaxe);
		GameRegistry.register(ssaxe);

		GameRegistry.register(ipade);
		GameRegistry.register(ipaxe);
		GameRegistry.register(isaxe);

		GameRegistry.register(dpade);
		GameRegistry.register(dpaxe);
		GameRegistry.register(dsaxe);
		
		GameRegistry.register(gpade);
		GameRegistry.register(gpaxe);
		GameRegistry.register(gsaxe);
		
		
	}
	
	public static void registerRenders() {
		registerRender(essence);
		
		registerRender(wpade);
		registerRender(wpaxe);
		registerRender(wsaxe);
		
		registerRender(spade);
		registerRender(spaxe);
		registerRender(ssaxe);
		
		registerRender(ipade);
		registerRender(ipaxe);
		registerRender(isaxe);
		
		registerRender(dpade);
		registerRender(dpaxe);
		registerRender(dsaxe);
		
		registerRender(gpade);
		registerRender(gpaxe);
		registerRender(gsaxe);
		
		
	}
	
	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName() ,"inventory"));
		
		
	}
	
}
