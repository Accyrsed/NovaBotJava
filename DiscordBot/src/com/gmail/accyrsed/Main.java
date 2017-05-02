package com.gmail.accyrsed;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.exceptions.RateLimitedException;

public class Main {
	
	private static JDA jda;
	public static final String BOT_TOKEN = "MzA4NzIwODE3NjcwNDU1Mjk3.C-ly-Q.h7YxZkN5Udv10T6GU9vlUkULSyg";
	
	public static void main(String[] args) {
		try {
			jda = new JDABuilder(AccountType.BOT).addEventListener(new NovaBot()).setToken(BOT_TOKEN).buildBlocking();
		} catch (LoginException | IllegalArgumentException | InterruptedException | RateLimitedException e) {
			e.printStackTrace();
		}
	}
}
