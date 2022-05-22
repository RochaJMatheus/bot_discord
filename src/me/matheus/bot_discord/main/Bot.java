package me.matheus.bot_discord.main;

import me.matheus.bot_discord.commands.Ping;
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
    public static Map<Long, String> mapGuildName = new HashMap<>();


    public static void main(String[] args) throws LoginException, InterruptedException {
        jda = JDABuilder.create("OTc3NjA5NDk5NTIxMjIwNjE4.GFRCO9.R3cD6uWRvWItSEzgc2036Ete0_9qW26ojoG_D0",
                EnumSet.allOf(GatewayIntent.class)).build();
        jda.addEventListener(new Ping());
        jda.awaitReady();
        getGuilds();

    }

    private static void getGuilds() {
        for (Guild guild : jda.getGuilds()) {
            mapGuildName.put(guild.getIdLong(), guild.getName());
            System.out.println("Nome dos servidores que o bot está " + mapGuildName.get(guild.getIdLong()));
        }
    }
}
