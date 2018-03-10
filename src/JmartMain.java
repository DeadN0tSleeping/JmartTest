import org.bukkit.plugin.java.JavaPlugin;


public class JmartMain extends JavaPlugin{
    @Override
    public void onEnable() {
        getServer().broadcastMessage("Loaded!");
        this.getCommand("respond").setExecutor(new CommandRespond());
        this.getCommand("clearthencookie").setExecutor(new CommandClearThenCookie());
        this.getCommand("cleartitle").setExecutor(new CommandClearTitle());

    }

    @Override
    public void onDisable() {

    }



}
