import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandRespond implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(label.equalsIgnoreCase("respond")){
                String response = "";
                for(int i = 0; i < args.length; i++){
                    if(i>0)
                        response = response + " ";
                    response = response + args[i];
                }
                player.sendMessage(ChatColor.GOLD + response);
            }
            return true;
        }
        return false;
    }

}