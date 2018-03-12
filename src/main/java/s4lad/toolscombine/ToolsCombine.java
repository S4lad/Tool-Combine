package s4lad.toolscombine;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import s4lad.toolscombine.init.ModItems;
import s4lad.toolscombine.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class ToolsCombine {
	
	@Instance
	public static ToolsCombine instance;

	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		
		
		
	System.out.println("Pre Init of ToolsCombine");
		ModItems.init();
		ModItems.register();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("Init of ToolsCombine");
		proxy.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init of ToolsCombine");
		
		
	}
	
	
}
