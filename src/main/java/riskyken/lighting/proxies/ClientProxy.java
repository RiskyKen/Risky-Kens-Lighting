package riskyken.lighting.proxies;

public class ClientProxy extends CommonProxy {

    public ClientProxy() {
    }

    @Override
    public void init() {

    }

    @Override
    public void initRenderers() {
        // ClientRegistry.bindTileEntitySpecialRenderer(TileEntityStarLight.class,
        // new RenderBlockSun());;
    }

    @Override
    public void postInit() {
    }
}
