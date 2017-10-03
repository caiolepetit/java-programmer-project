package br.com.impacta.chat.common;

public interface Sendable {

	public byte[] getBytes();

	public Protocol fromBytes(byte[] bytes);
}
