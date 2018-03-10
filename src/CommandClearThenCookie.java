import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;


public class CommandClearThenCookie implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player){
            Player player = (Player) sender;
            if(label.equalsIgnoreCase("clearthencookie")){
                player.setDisplayName(ChatColor.YELLOW + "COOKIELOVER");
                player.setPlayerListName(ChatColor.YELLOW + "COOKIELOVER");
                player.getInventory().clear();
                player.getInventory().setItem(4, new  ItemStack(Material.COOKIE));
            }
            return true;
        }
        return false;
    }
}
