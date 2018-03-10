import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandExample implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if(label.equalsIgnoreCase("Example")){

            }
            return true;
        }
        return false;
    }

}