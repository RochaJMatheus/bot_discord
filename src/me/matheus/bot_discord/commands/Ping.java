package me.matheus.bot_discord.commands;

import me.matheus.bot_discord.main.Bot;
import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Ping extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {

        String[] args = event.getMessage().getContentRaw().split(" ");
        TextChannel textChannel = (TextChannel) event.getChannel();

        if (args[0].equalsIgnoreCase("!" + "ping")) {
            textChannel.sendMessage(Bot.jda.getGatewayPing() + "ms").queue();
        }
    }
}
