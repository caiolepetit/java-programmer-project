package br.com.impacta.chat.common;

public class Message implements Protocol {

	private final String message;
	private final String nickName;
	private final int clientIP;
	private final long timestamp;

	public Message(final String message, final String nickName,
			final int ipAddress, final long timestamp) {
		this.message = safeString(message);
		this.nickName = safeString(nickName);
		this.clientIP = ipAddress;
		this.timestamp = timestamp;
	}
	
	private String safeString(String text){
		if (text == null){
			return "";
		}
		return text;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public int getClientIP() {
		return clientIP;
	}

	@Override
	public String getNickName() {
		return nickName;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
