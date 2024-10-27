package foundation.esoteric.tss.minecraft.plugins.survival.commands;

import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.executors.CommandArguments;
import foundation.esoteric.tss.minecraft.plugins.survival.TSSSurvivalPlugin;
import foundation.esoteric.tss.minecraft.plugins.survival.menus.skill.SkillsMenu;
import org.bukkit.entity.Player;

public class SkillsCommand {

  public SkillsCommand(TSSSurvivalPlugin plugin) {
	new CommandAPICommand("skills")
			.executesPlayer((Player player, CommandArguments args) -> new SkillsMenu(player, plugin))
			.register();
  }
}
