package me.matheus.bot_discord;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;

import javax.security.auth.login.LoginException;
import java.util.EnumSet;

public class Bot {
    public static void main(String[] args) throws LoginException {
        JDA jda =  JDABuilder.create("OTc3NjA5NDk5NTIxMjIwNjE4.GFRCO9.R3cD6uWRvWItSEzgc2036Ete0_9qW26ojoG_D0",
                EnumSet.allOf(GatewayIntent.class)).build();
    }
}
