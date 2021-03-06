package me.matheus.bot_discord.main;

import me.matheus.bot_discord.events.MemberJoin;
import me.matheus.bot_discord.commands.Ping;
import me.matheus.bot_discord.events.MemberLeave;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class Bot {
    public static JDA jda;
    public static Map<Long, Character> prefixMap = new HashMap<>();


    public static void main(String[] args) throws LoginException, InterruptedException {
        jda = JDABuilder.create("OTc3NjA5NDk5NTIxMjIwNjE4.GFRCO9.R3cD6uWRvWItSEzgc2036Ete0_9qW26ojoG_D0",
                EnumSet.allOf(GatewayIntent.class)).build();
        jda.addEventListener(new Ping());
        jda.addEventListener(new MemberJoin());
        jda.addEventListener(new MemberLeave());
        jda.awaitReady();
        getGuilds();

    }

    private static void getGuilds() {
        for (Guild guild : jda.getGuilds()) {
            prefixMap.put(guild.getIdLong(), '!');
        }
    }
}
