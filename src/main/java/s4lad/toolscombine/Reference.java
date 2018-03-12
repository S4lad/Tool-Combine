package s4lad.toolscombine;

public class Reference {
	
	public static final String MOD_ID = "stc";
	public static final String NAME = "ToolsCombine";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.10.2]";
	
	public static final String CLIENT_PROXY_CLASS = "s4lad.toolscombine.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "s4lad.toolscombine.proxy.ServerProxy";
	
	public static enum Items {
		ESSENCE("essence", "ItemEssence");
		
		
		
		private String unlocalizedName;
		private String registryName;
		
		Items(String unlocalizedName, String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
			
			
		}
		public String getUnlocalizedName() {
			
			return unlocalizedName;
			
		}
		
		
		
		public String getRegistryName() {
			
			return registryName;
			
		}
		
		
	}
	

}
