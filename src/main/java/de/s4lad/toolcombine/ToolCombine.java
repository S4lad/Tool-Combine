package de.s4lad.toolcombine;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.s4lad.toolcombine.items.pade;
import de.s4lad.toolcombine.items.paxe;
import de.s4lad.toolcombine.items.saxe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;


@Mod(modid = ToolCombine.MODID, version = ToolCombine.VERSION)

public class ToolCombine
{
    public static final String MODID = "ToolsCombine";
    public static final String VERSION = "0.4.7";
    
    public static ToolMaterial Wooden = EnumHelper.addToolMaterial("Wooden", 0, 59, 2.0F,-2.0F , 15);
    public static ToolMaterial Stone = EnumHelper.addToolMaterial("Stone", 1, 131, 4.0F,-2.0F , 5);
    public static ToolMaterial Iron = EnumHelper.addToolMaterial("Iron", 2, 250, 6.0F,-2.0F , 14);
    public static ToolMaterial Diamond = EnumHelper.addToolMaterial("Diamond", 3, 1561, 8.0F,-2.0F , 10);
    public static ToolMaterial Gold = EnumHelper.addToolMaterial("Gold", 0, 32, 12.0F,-2.0F , 22);
    
    public static Item wpade;
    int wpadeID = 500;
    public static Item wpaxe;
    int wpaxeID = 501;
    public static Item wsaxe;
    int wsaxeID = 502;
    
    public static Item spade;
    int spadeID = 503;
    public static Item spaxe;
    int spaxeID = 504;
    public static Item ssaxe;
    int ssaxeID = 505;
    
    public static Item ipade;
    int ipadeID = 506;
    public static Item ipaxe;
    int ipaxeID = 507;
    public static Item isaxe;
    int isaxeID = 508;
    
    public static Item dpade;
    int dpadeID = 509;
    public static Item dpaxe;
    int dpaxeID = 510;
    public static Item dsaxe;
    int dsaxeID = 511;
    
    public static Item gpade;
    int gpadeID = 512;
    public static Item gpaxe;
    int gpaxeID = 513;
    public static Item gsaxe;
    int gsaxeID = 514;
    
    public static Item essence;
    int essenceID = 515;
    
    
    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
    	
    	    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		wpade = new pade(Wooden).setUnlocalizedName("wpade").setTextureName("toolcombine:wpade").setCreativeTab(CreativeTabs.tabTools);
		wpaxe = new paxe(Wooden).setUnlocalizedName("wpaxe").setTextureName("toolcombine:wpaxe").setCreativeTab(CreativeTabs.tabTools);
		wsaxe = new saxe(Wooden).setUnlocalizedName("wsaxe").setTextureName("toolcombine:wsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		spade = new pade(Stone).setUnlocalizedName("spade").setTextureName("toolcombine:spade").setCreativeTab(CreativeTabs.tabTools);
		spaxe = new paxe(Stone).setUnlocalizedName("spaxe").setTextureName("toolcombine:spaxe").setCreativeTab(CreativeTabs.tabTools);
		ssaxe = new saxe(Stone).setUnlocalizedName("ssaxe").setTextureName("toolcombine:ssaxe").setCreativeTab(CreativeTabs.tabTools);
		
		ipade = new pade(Iron).setUnlocalizedName("ipade").setTextureName("toolcombine:ipade").setCreativeTab(CreativeTabs.tabTools);
		ipaxe = new paxe(Iron).setUnlocalizedName("ipaxe").setTextureName("toolcombine:ipaxe").setCreativeTab(CreativeTabs.tabTools);
		isaxe = new saxe(Iron).setUnlocalizedName("isaxe").setTextureName("toolcombine:isaxe").setCreativeTab(CreativeTabs.tabTools);
		
		dpade = new pade(Diamond).setUnlocalizedName("dpade").setTextureName("toolcombine:dpade").setCreativeTab(CreativeTabs.tabTools);
		dpaxe = new paxe(Diamond).setUnlocalizedName("dpaxe").setTextureName("toolcombine:dpaxe").setCreativeTab(CreativeTabs.tabTools);
		dsaxe = new saxe(Diamond).setUnlocalizedName("dsaxe").setTextureName("toolcombine:dsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		gpade = new pade(Gold).setUnlocalizedName("gpade").setTextureName("toolcombine:gpade").setCreativeTab(CreativeTabs.tabTools);
		gpaxe = new paxe(Gold).setUnlocalizedName("gpaxe").setTextureName("toolcombine:gpaxe").setCreativeTab(CreativeTabs.tabTools);
		gsaxe = new saxe(Gold).setUnlocalizedName("gsaxe").setTextureName("toolcombine:gsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		essence = new Item().setUnlocalizedName("essence").setTextureName("toolcombine:essence").setCreativeTab(CreativeTabs.tabMaterials);
		
		GameRegistry.registerItem(wpade, "wpade");
		GameRegistry.registerItem(wpaxe, "wpaxe");
		GameRegistry.registerItem(wsaxe, "wsaxe");
		
		GameRegistry.registerItem(spade, "spade");
		GameRegistry.registerItem(spaxe, "spaxe");
		GameRegistry.registerItem(ssaxe, "ssaxe");
		
		GameRegistry.registerItem(ipade, "ipade");
		GameRegistry.registerItem(ipaxe, "ipaxe");
		GameRegistry.registerItem(isaxe, "isaxe");
		
		GameRegistry.registerItem(dpade, "dpade");
		GameRegistry.registerItem(dpaxe, "dpaxe");
		GameRegistry.registerItem(dsaxe, "dsaxe");
		
		GameRegistry.registerItem(gpade, "gpade");
		GameRegistry.registerItem(gpaxe, "gpaxe");
		GameRegistry.registerItem(gsaxe, "gsaxe");
		
		GameRegistry.registerItem(essence, "essence");
		
		GameRegistry.addShapelessRecipe(new ItemStack(wsaxe), new Object[] {Items.wooden_shovel, Items.wooden_axe});
		GameRegistry.addShapelessRecipe(new ItemStack(wpaxe), new Object[] {Items.wooden_pickaxe, Items.wooden_axe});
		GameRegistry.addShapelessRecipe(new ItemStack(wpade), new Object[] {Items.wooden_shovel, Items.wooden_pickaxe});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ssaxe), new Object[] {Items.stone_shovel, Items.stone_axe});
		GameRegistry.addShapelessRecipe(new ItemStack(spaxe), new Object[] {Items.stone_pickaxe, Items.stone_axe});
		GameRegistry.addShapelessRecipe(new ItemStack(spade), new Object[] {Items.stone_shovel, Items.stone_pickaxe});
		
		GameRegistry.addShapelessRecipe(new ItemStack(isaxe), new Object[] {ToolCombine.essence, Items.iron_ingot,Items.iron_ingot,Items.iron_ingot,Items.iron_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(ipaxe), new Object[] {ToolCombine.essence, Items.iron_ingot,Items.iron_ingot,Items.iron_ingot,Items.iron_ingot,Items.iron_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(ipade), new Object[] {ToolCombine.essence, Items.iron_ingot,Items.iron_ingot,Items.iron_ingot});
		
		GameRegistry.addShapelessRecipe(new ItemStack(dsaxe), new Object[] {ToolCombine.essence, Items.diamond,Items.diamond,Items.diamond,Items.diamond});
		GameRegistry.addShapelessRecipe(new ItemStack(dpaxe), new Object[] {ToolCombine.essence, Items.diamond,Items.diamond,Items.diamond,Items.diamond,Items.diamond});
		GameRegistry.addShapelessRecipe(new ItemStack(dpade), new Object[] {ToolCombine.essence, Items.diamond,Items.diamond,Items.diamond});
		
		GameRegistry.addShapelessRecipe(new ItemStack(gsaxe), new Object[] {ToolCombine.essence, Items.gold_ingot,Items.gold_ingot,Items.gold_ingot,Items.gold_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(gpaxe), new Object[] {ToolCombine.essence, Items.gold_ingot,Items.gold_ingot,Items.gold_ingot,Items.gold_ingot,Items.gold_ingot});
		GameRegistry.addShapelessRecipe(new ItemStack(gpade), new Object[] {ToolCombine.essence, Items.gold_ingot,Items.gold_ingot,Items.gold_ingot});
		
		GameRegistry.addSmelting(Items.wooden_pickaxe, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.wooden_axe, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.wooden_shovel, new ItemStack(ToolCombine.essence), 1.0F);
		
		GameRegistry.addSmelting(Items.stone_pickaxe, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.stone_axe, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.stone_shovel, new ItemStack(ToolCombine.essence), 1.0F);
    }
}
