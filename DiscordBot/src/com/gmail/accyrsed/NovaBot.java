package com.gmail.accyrsed;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.events.message.MessageUpdateEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class NovaBot extends ListenerAdapter {
	
	Map<String, Map<String, ArrayList<String>>> message_log;
	
	public NovaBot() {
		message_log = new HashMap<String, Map<String, ArrayList<String>>>();
	}
	
	@Override
	public void onMessageReceived(MessageReceivedEvent e) {
		if(message_log.containsKey(e.getGuild().getName())){
			if(message_log.get(e.getGuild().getName()).containsKey(e.getChannel().getName())){
				Map<String, ArrayList<String>> channel_messages = message_log.get(e.getGuild().getName());
				channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
			}else{
				Map<String, ArrayList<String>> channel_messages = message_log.get(e.getGuild().getName());
				ArrayList<String> msgs = new ArrayList<String>();
				
				channel_messages.put(e.getChannel().getName(), msgs);
				channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
			}
		}else{
			Map<String, ArrayList<String>> channel_messages = new HashMap<String, ArrayList<String>>();
			ArrayList<String> msgs = new ArrayList<String>();
			message_log.put(e.getGuild().getName(), channel_messages);
			
			channel_messages.put(e.getChannel().getName(), msgs);
			channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
		}
	}
	
	@Override
	public void onMessageUpdate(MessageUpdateEvent e){
		if(message_log.containsKey(e.getGuild().getName())){
			if(message_log.get(e.getGuild().getName()).containsKey(e.getChannel().getName())){
				Map<String, ArrayList<String>> channel_messages = message_log.get(e.getGuild().getName());
				channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
			}else{
				Map<String, ArrayList<String>> channel_messages = message_log.get(e.getGuild().getName());
				ArrayList<String> msgs = new ArrayList<String>();
				
				channel_messages.put(e.getChannel().getName(), msgs);
				channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
			}
		}else{
			Map<String, ArrayList<String>> channel_messages = new HashMap<String, ArrayList<String>>();
			ArrayList<String> msgs = new ArrayList<String>();
			message_log.put(e.getGuild().getName(), channel_messages);
			
			channel_messages.put(e.getChannel().getName(), msgs);
			channel_messages.get(e.getChannel().getName()).add("(" + e.getMessage().getCreationTime() + ") | " + e.getAuthor().getName() + " said " + e.getMessage().getRawContent());
		}
	}
}
