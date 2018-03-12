package s4lad.toolscombine.proxy;

import s4lad.toolscombine.init.ModItems;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
		
	}

}
