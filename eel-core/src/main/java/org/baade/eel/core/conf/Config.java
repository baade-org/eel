package org.baade.eel.core.conf;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.baade.eel.core.constants.Constants;
import org.baade.eel.core.utils.XMLUtils;

@XmlRootElement
@XmlType(propOrder = { 
		"charsetName",
		"loginServer", "worldServer", "chatServer", "gameServer", "dataServer"})
public class Config {
	
	private String charsetName;

	private ServerConfig loginServer;
	
	private ServerConfig worldServer;
	
	private ServerConfig chatServer;
	
	private ServerConfig gameServer;
	
	private ServerConfig dataServer;
	

	public Config() {
		super();
	}

	public Config(String charsetName) {
		super();
		this.charsetName = charsetName;
	}
	
	public static Config loadDefault(){
		return load(Constants.CONFIG_XML_FILE_PATH);
	}
	
	public static Config load(String xmlFilePath){
		return XMLUtils.xmlFile2Obj(Config.class, xmlFilePath);
	}

	public String getCharsetName() {
		return charsetName;
	}

	public void setCharsetName(String charsetName) {
		this.charsetName = charsetName;
	}



	public ServerConfig getLoginServer() {
		return loginServer;
	}

	public void setLoginServer(ServerConfig loginServer) {
		this.loginServer = loginServer;
	}

	public ServerConfig getWorldServer() {
		return worldServer;
	}

	public void setWorldServer(ServerConfig worldServer) {
		this.worldServer = worldServer;
	}

	public ServerConfig getChatServer() {
		return chatServer;
	}

	public void setChatServer(ServerConfig chatServer) {
		this.chatServer = chatServer;
	}

	public ServerConfig getGameServer() {
		return gameServer;
	}

	public void setGameServer(ServerConfig gameServer) {
		this.gameServer = gameServer;
	}

	public ServerConfig getDataServer() {
		return dataServer;
	}

	public void setDataServer(ServerConfig dataServer) {
		this.dataServer = dataServer;
	}
	
	
	@Override
	public String toString() {
		return XMLUtils.obj2XMLStr(this);
	}
	
	
}
