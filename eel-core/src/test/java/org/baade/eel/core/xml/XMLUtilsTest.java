package org.baade.eel.core.xml;

import org.baade.eel.core.conf.Config;
import org.baade.eel.core.conf.ServerConfig;
import org.baade.eel.core.utils.XMLUtils;
import org.junit.Before;
import org.junit.Test;

public class XMLUtilsTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testObj2XMLStr() {
		Human human = new Human(1, "xiaoming", "man");
		String humanStr = XMLUtils.obj2XMLStr(human);
//		System.out.println(humanStr);
//		fail("Not yet implemented");
	}
	
	@Test
	public void testObj2XMLFile() {
//		login server 默认HTTP端口：9001
//		login server 默认Socket端口：9007
//		world server 默认Socket端口：9011
//		chat server 默认Socket端口：9013
//		game server 默认Socket端口：9029
//		data server 默认Socket端口：9041
		
		Config config = new Config("UTF-8");
	
		ServerConfig login = new ServerConfig(1, "127.0.0.1", 9007);
		login.setHttpPort(9001);
		
		ServerConfig world = new ServerConfig(3, "127.0.0.1", 9011);
		ServerConfig chat = new ServerConfig(4, "127.0.0.1", 9013);
		ServerConfig game = new ServerConfig(5, "127.0.0.1", 9029);
		ServerConfig data = new ServerConfig(6, "127.0.0.1", 9041);
		
		config.setLoginServer(login);
		config.setWorldServer(world);
		config.setChatServer(chat);
		config.setGameServer(game);
		config.setDataServer(data);
		
		
		
		
//		XMLUtils.obj2XMLFile(config, "d:/config.xml");
//		fail("Not yet implemented");
	}
	
	@Test
	public void testXmlFile2Obj() {
		
		Config config = XMLUtils.xmlFile2Obj(Config.class, "d:/config.xml");
		System.out.println(config);
	}


}
