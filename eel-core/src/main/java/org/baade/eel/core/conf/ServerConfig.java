package org.baade.eel.core.conf;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "id", "ip", "httpPort", "socketPort"})
public class ServerConfig {

	private int id;
	private String ip;
	private int httpPort;
	private int socketPort;
	
	

	public ServerConfig() {
		super();
	}

	public ServerConfig(int id, String ip, int socketPort) {
		super();
		this.id = id;
		this.ip = ip;
		this.socketPort = socketPort;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getHttpPort() {
		return httpPort;
	}

	public void setHttpPort(int httpPort) {
		this.httpPort = httpPort;
	}

	public int getSocketPort() {
		return socketPort;
	}

	public void setSocketPort(int socketPort) {
		this.socketPort = socketPort;
	}


}
