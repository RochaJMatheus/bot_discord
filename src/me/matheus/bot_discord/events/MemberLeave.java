package me.matheus.bot_discord.events;

import net.dv8tion.jda.api.entities.TextChannel;
import net.dv8tion.jda.api.events.guild.GuildLeaveEvent;
import net.dv8tion.jda.api.events.guild.member.GuildMemberRemoveEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MemberLeave extends ListenerAdapter {
    @Override
    public void onGuildMemberRemove(@NotNull GuildMemberRemoveEvent event) {
        TextChannel textChannel = event.getGuild().getTextChannelById(978023767278239835L);
        String userName = event.getUser().getName();
        textChannel.sendMessage(userName + " Saiu do  servidor").queue();
    }
}
