package de.s4lad.toolcombine;

import de.s4lad.toolcombine.items.pade;
import de.s4lad.toolcombine.items.paxe;
import de.s4lad.toolcombine.items.saxe;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;


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
		wpade = new pade(Wooden).setUnlocalizedName("wpade").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:wpade")
		wpaxe = new paxe(Wooden).setUnlocalizedName("wpaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:wpaxe")
		wsaxe = new saxe(Wooden).setUnlocalizedName("wsaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:wsaxe")
		
		spade = new pade(Stone).setUnlocalizedName("spade").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:spade")
		spaxe = new paxe(Stone).setUnlocalizedName("spaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:spaxe")
		ssaxe = new saxe(Stone).setUnlocalizedName("ssaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:ssaxe")
		
		ipade = new pade(Iron).setUnlocalizedName("ipade").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:ipade")
		ipaxe = new paxe(Iron).setUnlocalizedName("ipaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:ipaxe")
		isaxe = new saxe(Iron).setUnlocalizedName("isaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:isaxe")
		
		dpade = new pade(Diamond).setUnlocalizedName("dpade").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:dpade")
		dpaxe = new paxe(Diamond).setUnlocalizedName("dpaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:dpaxe")
		dsaxe = new saxe(Diamond).setUnlocalizedName("dsaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:dsaxe")
		
		gpade = new pade(Gold).setUnlocalizedName("gpade").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:gpade")
		gpaxe = new paxe(Gold).setUnlocalizedName("gpaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:gpaxe")
		gsaxe = new saxe(Gold).setUnlocalizedName("gsaxe").setCreativeTab(CreativeTabs.TOOLS); // .setTextureName("toolcombine:gsaxe")
		
		essence = new Item().setUnlocalizedName("essence").setCreativeTab(CreativeTabs.MATERIALS); // .setTextureName("toolcombine:essence")
		
		GameRegistry.register(wpade, new ResourceLocation("wpade"));
		GameRegistry.register(wpaxe, new ResourceLocation("wpaxe"));
		GameRegistry.register(wsaxe, new ResourceLocation("wsaxe"));
		
		GameRegistry.register(spade, new ResourceLocation("spade"));
		GameRegistry.register(spaxe, new ResourceLocation("spaxe"));
		GameRegistry.register(ssaxe, new ResourceLocation("ssaxe"));
		
		GameRegistry.register(ipade, new ResourceLocation("ipade"));
		GameRegistry.register(ipaxe, new ResourceLocation("ipaxe"));
		GameRegistry.register(isaxe, new ResourceLocation("isaxe"));
		
		GameRegistry.register(dpade, new ResourceLocation("dpade"));
		GameRegistry.register(dpaxe, new ResourceLocation("dpaxe"));
		GameRegistry.register(dsaxe, new ResourceLocation("dsaxe"));
		
		GameRegistry.register(gpade, new ResourceLocation("gpade"));
		GameRegistry.register(gpaxe, new ResourceLocation("gpaxe"));
		GameRegistry.register(gsaxe, new ResourceLocation("gsaxe"));
		
		GameRegistry.register(essence, new ResourceLocation("essence"));
		
		GameRegistry.addShapelessRecipe(new ItemStack(wsaxe), new Object[] {Items.WOODEN_SHOVEL, Items.WOODEN_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(wpaxe), new Object[] {Items.WOODEN_PICKAXE, Items.WOODEN_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(wpade), new Object[] {Items.WOODEN_SHOVEL, Items.WOODEN_PICKAXE});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ssaxe), new Object[] {Items.STONE_SHOVEL, Items.STONE_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(spaxe), new Object[] {Items.STONE_PICKAXE, Items.STONE_AXE});
		GameRegistry.addShapelessRecipe(new ItemStack(spade), new Object[] {Items.STONE_SHOVEL, Items.STONE_PICKAXE});
		
		GameRegistry.addShapelessRecipe(new ItemStack(isaxe), new Object[] {ToolCombine.essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(ipaxe), new Object[] {ToolCombine.essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(ipade), new Object[] {ToolCombine.essence, Items.IRON_INGOT,Items.IRON_INGOT,Items.IRON_INGOT});
		
		GameRegistry.addShapelessRecipe(new ItemStack(dsaxe), new Object[] {ToolCombine.essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});
		GameRegistry.addShapelessRecipe(new ItemStack(dpaxe), new Object[] {ToolCombine.essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});
		GameRegistry.addShapelessRecipe(new ItemStack(dpade), new Object[] {ToolCombine.essence, Items.DIAMOND,Items.DIAMOND,Items.DIAMOND});
		
		GameRegistry.addShapelessRecipe(new ItemStack(gsaxe), new Object[] {ToolCombine.essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(gpaxe), new Object[] {ToolCombine.essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});
		GameRegistry.addShapelessRecipe(new ItemStack(gpade), new Object[] {ToolCombine.essence, Items.GOLD_INGOT,Items.GOLD_INGOT,Items.GOLD_INGOT});
		
		GameRegistry.addSmelting(Items.WOODEN_PICKAXE, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.WOODEN_AXE, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.WOODEN_SHOVEL, new ItemStack(ToolCombine.essence), 1.0F);
		
		GameRegistry.addSmelting(Items.STONE_PICKAXE, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.STONE_AXE, new ItemStack(ToolCombine.essence), 1.0F);
		GameRegistry.addSmelting(Items.STONE_SHOVEL, new ItemStack(ToolCombine.essence), 1.0F);
    }
}
