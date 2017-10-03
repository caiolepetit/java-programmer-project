package br.com.impacta.chat.common;

public class Message implements Protocol {

	private final String message;
	private final String nickName;
	private final int ipAddress;
	private final long timestamp;

	public Message(final String message, final String nickName,
			final int ipAddress, final long timestamp) {
		this.message = message;
		this.nickName = nickName;
		this.ipAddress = ipAddress;
		this.timestamp = timestamp;
	}

	@Override
	public long getTimestamp() {
		return timestamp;
	}

	@Override
	public int getClienteIP() {
		return ipAddress;
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
