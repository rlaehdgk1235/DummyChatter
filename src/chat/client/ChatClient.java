package chat.client;

import chat.common.ChatCommon;
import chat.common.ChatUtil;

public class ChatClient {
	ChatCommon com = null;
	ChatUtil util = null;
	public ChatClient() {
		com = new ChatCommon();
		util = new ChatUtil();
		System.out.println("ChatClient created");
	}
}