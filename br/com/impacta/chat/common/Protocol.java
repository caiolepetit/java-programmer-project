package br.com.impacta.chat.common;

public interface Protocol {

		public long getTimestamp();
		public int getClienteIP();
		public String getNickName();
		public String getMessage();
}
