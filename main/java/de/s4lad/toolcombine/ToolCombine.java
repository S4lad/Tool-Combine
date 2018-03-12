package de.s4lad.toolcombine;

import java.util.ArrayList;
import java.util.List;

import de.s4lad.toolcombine.items.pade;
import de.s4lad.toolcombine.items.paxe;
import de.s4lad.toolcombine.items.saxe;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;


@Mod(modid = ToolCombine.MODID, version = ToolCombine.VERSION)

public class ToolCombine
{
    public static final String MODID = "ToolsCombine";
    public static final String VERSION = "0.4.8";
    
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
    
    public static List<Item> namesList = new ArrayList<Item>();

    
    @EventHandler
    public void PreInit(FMLPreInitializationEvent event){
    	
    	
    	
    	    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		wpade = new pade(Wooden).setUnlocalizedName("wpade").setCreativeTab(CreativeTabs.tabTools);
		wpaxe = new paxe(Wooden).setUnlocalizedName("wpaxe").setCreativeTab(CreativeTabs.tabTools);
		wsaxe = new saxe(Wooden).setUnlocalizedName("wsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		spade = new pade(Stone).setUnlocalizedName("spade").setCreativeTab(CreativeTabs.tabTools);
		spaxe = new paxe(Stone).setUnlocalizedName("spaxe").setCreativeTab(CreativeTabs.tabTools);
		ssaxe = new saxe(Stone).setUnlocalizedName("ssaxe").setCreativeTab(CreativeTabs.tabTools);
		
		ipade = new pade(Iron).setUnlocalizedName("ipade").setCreativeTab(CreativeTabs.tabTools);
		ipaxe = new paxe(Iron).setUnlocalizedName("ipaxe").setCreativeTab(CreativeTabs.tabTools);
		isaxe = new saxe(Iron).setUnlocalizedName("isaxe").setCreativeTab(CreativeTabs.tabTools);
		
		dpade = new pade(Diamond).setUnlocalizedName("dpade").setCreativeTab(CreativeTabs.tabTools);
		dpaxe = new paxe(Diamond).setUnlocalizedName("dpaxe").setCreativeTab(CreativeTabs.tabTools);
		dsaxe = new saxe(Diamond).setUnlocalizedName("dsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		gpade = new pade(Gold).setUnlocalizedName("gpade").setCreativeTab(CreativeTabs.tabTools);
		gpaxe = new paxe(Gold).setUnlocalizedName("gpaxe").setCreativeTab(CreativeTabs.tabTools);
		gsaxe = new saxe(Gold).setUnlocalizedName("gsaxe").setCreativeTab(CreativeTabs.tabTools);
		
		essence = new Item().setUnlocalizedName("essence").setCreativeTab(CreativeTabs.tabMaterials);
		
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
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(essence, 0, new ModelResourceLocation("ToolsCombine:essence","inventory"));
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(wpade, 0, new ModelResourceLocation("ToolsCombine:wpade","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(wpaxe, 0, new ModelResourceLocation("ToolsCombine:wpaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(wsaxe, 0, new ModelResourceLocation("ToolsCombine:wsaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(spade, 0, new ModelResourceLocation("ToolsCombine:spade","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(spaxe, 0, new ModelResourceLocation("ToolsCombine:spaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ssaxe, 0, new ModelResourceLocation("ToolsCombine:ssaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dpade, 0, new ModelResourceLocation("ToolsCombine:dpade","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dpaxe, 0, new ModelResourceLocation("ToolsCombine:dpaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(dsaxe, 0, new ModelResourceLocation("ToolsCombine:dsaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ipade, 0, new ModelResourceLocation("ToolsCombine:ipade","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ipaxe, 0, new ModelResourceLocation("ToolsCombine:ipaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(isaxe, 0, new ModelResourceLocation("ToolsCombine:isaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(gpade, 0, new ModelResourceLocation("ToolsCombine:gpade","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(gpaxe, 0, new ModelResourceLocation("ToolsCombine:gpaxe","inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(gsaxe, 0, new ModelResourceLocation("ToolsCombine:gsaxe","inventory"));
		
    }
    
    
    	
  
}
