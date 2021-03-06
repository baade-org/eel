package org.baade.eel.core.constants;

import java.util.Arrays;
import java.util.List;

/**
 * 端口选择器
 * 
 * @author <a href="http://eel.baade.org">Baade Eel Project</a>
 *
 */
public enum PortSelector {

	/**
	 * 登录服务器HTTP默认端口
	 */
	LOGIN_SERVER_HTTP_DEFAULT(9001, "登录服务器HTTP默认端口"),
	
	/**
	 * 登录服务器Socket默认端口
	 */
	LOGIN_SERVER_SOCKET_DEFAULT(9007, "登录服务器Socket默认端口"),
	
	/**
	 * 世界服务器Socket默认端口
	 */
	WORLD_SERVER_SOCKET_DEFAULT(9011, "世界服务器Socket默认端口"),
	
	/**
	 * 聊天服务器Socket默认端口
	 */
	CHAT_SERVER_SOCKET_DEFAULT(9013, "聊天服务器Socket默认端口"),
	
	
	/**
	 * 游戏逻辑服务器Socket默认端口
	 */
	GAME_SERVER_SOCKET_DEFAULT(9029, "游戏逻辑服务器Socket默认端口"),
	
	/**
	 * 数据服务器Socket默认端口
	 */
	DATA_SERVER_SOCKET_DEFAULT(9041, "数据服务器Socket默认端口"),
	
	/** 
	 * 可选端口9043 
	 */ 
	CAN_CHOOSE_9043(9043, "可选端口9043"), 
	/** 
	 * 可选端口9049 
	 */ 
	CAN_CHOOSE_9049(9049, "可选端口9049"), 
	/** 
	 * 可选端口9059 
	 */ 
	CAN_CHOOSE_9059(9059, "可选端口9059"), 
	/** 
	 * 可选端口9067 
	 */ 
	CAN_CHOOSE_9067(9067, "可选端口9067"), 
	/** 
	 * 可选端口9091 
	 */ 
	CAN_CHOOSE_9091(9091, "可选端口9091"), 
	/** 
	 * 可选端口9103 
	 */ 
	CAN_CHOOSE_9103(9103, "可选端口9103"), 
	/** 
	 * 可选端口9109 
	 */ 
	CAN_CHOOSE_9109(9109, "可选端口9109"), 
	/** 
	 * 可选端口9127 
	 */ 
	CAN_CHOOSE_9127(9127, "可选端口9127"), 
	/** 
	 * 可选端口9133 
	 */ 
	CAN_CHOOSE_9133(9133, "可选端口9133"), 
	/** 
	 * 可选端口9137 
	 */ 
	CAN_CHOOSE_9137(9137, "可选端口9137"), 
	/** 
	 * 可选端口9151 
	 */ 
	CAN_CHOOSE_9151(9151, "可选端口9151"), 
	/** 
	 * 可选端口9157 
	 */ 
	CAN_CHOOSE_9157(9157, "可选端口9157"), 
	/** 
	 * 可选端口9161 
	 */ 
	CAN_CHOOSE_9161(9161, "可选端口9161"), 
	/** 
	 * 可选端口9173 
	 */ 
	CAN_CHOOSE_9173(9173, "可选端口9173"), 
	/** 
	 * 可选端口9181 
	 */ 
	CAN_CHOOSE_9181(9181, "可选端口9181"), 
	/** 
	 * 可选端口9187 
	 */ 
	CAN_CHOOSE_9187(9187, "可选端口9187"), 
	/** 
	 * 可选端口9199 
	 */ 
	CAN_CHOOSE_9199(9199, "可选端口9199"), 
	/** 
	 * 可选端口9203 
	 */ 
	CAN_CHOOSE_9203(9203, "可选端口9203"), 
	/** 
	 * 可选端口9209 
	 */ 
	CAN_CHOOSE_9209(9209, "可选端口9209"), 
	/** 
	 * 可选端口9221 
	 */ 
	CAN_CHOOSE_9221(9221, "可选端口9221"), 
	/** 
	 * 可选端口9227 
	 */ 
	CAN_CHOOSE_9227(9227, "可选端口9227"), 
	/** 
	 * 可选端口9239 
	 */ 
	CAN_CHOOSE_9239(9239, "可选端口9239"), 
	/** 
	 * 可选端口9241 
	 */ 
	CAN_CHOOSE_9241(9241, "可选端口9241"), 
	/** 
	 * 可选端口9257 
	 */ 
	CAN_CHOOSE_9257(9257, "可选端口9257"), 
	/** 
	 * 可选端口9277 
	 */ 
	CAN_CHOOSE_9277(9277, "可选端口9277"), 
	/** 
	 * 可选端口9281 
	 */ 
	CAN_CHOOSE_9281(9281, "可选端口9281"), 
	/** 
	 * 可选端口9283 
	 */ 
	CAN_CHOOSE_9283(9283, "可选端口9283"), 
	/** 
	 * 可选端口9293 
	 */ 
	CAN_CHOOSE_9293(9293, "可选端口9293"), 
	/** 
	 * 可选端口9311 
	 */ 
	CAN_CHOOSE_9311(9311, "可选端口9311"), 
	/** 
	 * 可选端口9319 
	 */ 
	CAN_CHOOSE_9319(9319, "可选端口9319"), 
	/** 
	 * 可选端口9323 
	 */ 
	CAN_CHOOSE_9323(9323, "可选端口9323"), 
	/** 
	 * 可选端口9337 
	 */ 
	CAN_CHOOSE_9337(9337, "可选端口9337"), 
	/** 
	 * 可选端口9341 
	 */ 
	CAN_CHOOSE_9341(9341, "可选端口9341"), 
	/** 
	 * 可选端口9343 
	 */ 
	CAN_CHOOSE_9343(9343, "可选端口9343"), 
	/** 
	 * 可选端口9349 
	 */ 
	CAN_CHOOSE_9349(9349, "可选端口9349"), 
	/** 
	 * 可选端口9371 
	 */ 
	CAN_CHOOSE_9371(9371, "可选端口9371"), 
	/** 
	 * 可选端口9377 
	 */ 
	CAN_CHOOSE_9377(9377, "可选端口9377"), 
	/** 
	 * 可选端口9391 
	 */ 
	CAN_CHOOSE_9391(9391, "可选端口9391"), 
	/** 
	 * 可选端口9397 
	 */ 
	CAN_CHOOSE_9397(9397, "可选端口9397"), 
	/** 
	 * 可选端口9403 
	 */ 
	CAN_CHOOSE_9403(9403, "可选端口9403"), 
	/** 
	 * 可选端口9413 
	 */ 
	CAN_CHOOSE_9413(9413, "可选端口9413"), 
	/** 
	 * 可选端口9419 
	 */ 
	CAN_CHOOSE_9419(9419, "可选端口9419"), 
	/** 
	 * 可选端口9421 
	 */ 
	CAN_CHOOSE_9421(9421, "可选端口9421"), 
	/** 
	 * 可选端口9431 
	 */ 
	CAN_CHOOSE_9431(9431, "可选端口9431"), 
	/** 
	 * 可选端口9433 
	 */ 
	CAN_CHOOSE_9433(9433, "可选端口9433"), 
	/** 
	 * 可选端口9437 
	 */ 
	CAN_CHOOSE_9437(9437, "可选端口9437"), 
	/** 
	 * 可选端口9439 
	 */ 
	CAN_CHOOSE_9439(9439, "可选端口9439"), 
	/** 
	 * 可选端口9461 
	 */ 
	CAN_CHOOSE_9461(9461, "可选端口9461"), 
	/** 
	 * 可选端口9463 
	 */ 
	CAN_CHOOSE_9463(9463, "可选端口9463"), 
	/** 
	 * 可选端口9467 
	 */ 
	CAN_CHOOSE_9467(9467, "可选端口9467"), 
	/** 
	 * 可选端口9473 
	 */ 
	CAN_CHOOSE_9473(9473, "可选端口9473"), 
	/** 
	 * 可选端口9479 
	 */ 
	CAN_CHOOSE_9479(9479, "可选端口9479"), 
	/** 
	 * 可选端口9491 
	 */ 
	CAN_CHOOSE_9491(9491, "可选端口9491"), 
	/** 
	 * 可选端口9497 
	 */ 
	CAN_CHOOSE_9497(9497, "可选端口9497"), 
	/** 
	 * 可选端口9511 
	 */ 
	CAN_CHOOSE_9511(9511, "可选端口9511"), 
	/** 
	 * 可选端口9521 
	 */ 
	CAN_CHOOSE_9521(9521, "可选端口9521"), 
	/** 
	 * 可选端口9533 
	 */ 
	CAN_CHOOSE_9533(9533, "可选端口9533"), 
	/** 
	 * 可选端口9539 
	 */ 
	CAN_CHOOSE_9539(9539, "可选端口9539"), 
	/** 
	 * 可选端口9547 
	 */ 
	CAN_CHOOSE_9547(9547, "可选端口9547"), 
	/** 
	 * 可选端口9551 
	 */ 
	CAN_CHOOSE_9551(9551, "可选端口9551"), 
	/** 
	 * 可选端口9587 
	 */ 
	CAN_CHOOSE_9587(9587, "可选端口9587"), 
	/** 
	 * 可选端口9601 
	 */ 
	CAN_CHOOSE_9601(9601, "可选端口9601"), 
	/** 
	 * 可选端口9613 
	 */ 
	CAN_CHOOSE_9613(9613, "可选端口9613"), 
	/** 
	 * 可选端口9619 
	 */ 
	CAN_CHOOSE_9619(9619, "可选端口9619"), 
	/** 
	 * 可选端口9623 
	 */ 
	CAN_CHOOSE_9623(9623, "可选端口9623"), 
	/** 
	 * 可选端口9629 
	 */ 
	CAN_CHOOSE_9629(9629, "可选端口9629"), 
	/** 
	 * 可选端口9631 
	 */ 
	CAN_CHOOSE_9631(9631, "可选端口9631"), 
	/** 
	 * 可选端口9643 
	 */ 
	CAN_CHOOSE_9643(9643, "可选端口9643"), 
	/** 
	 * 可选端口9649 
	 */ 
	CAN_CHOOSE_9649(9649, "可选端口9649"), 
	/** 
	 * 可选端口9661 
	 */ 
	CAN_CHOOSE_9661(9661, "可选端口9661"), 
	/** 
	 * 可选端口9677 
	 */ 
	CAN_CHOOSE_9677(9677, "可选端口9677"), 
	/** 
	 * 可选端口9679 
	 */ 
	CAN_CHOOSE_9679(9679, "可选端口9679"), 
	/** 
	 * 可选端口9689 
	 */ 
	CAN_CHOOSE_9689(9689, "可选端口9689"), 
	/** 
	 * 可选端口9697 
	 */ 
	CAN_CHOOSE_9697(9697, "可选端口9697"), 
	/** 
	 * 可选端口9719 
	 */ 
	CAN_CHOOSE_9719(9719, "可选端口9719"), 
	/** 
	 * 可选端口9721 
	 */ 
	CAN_CHOOSE_9721(9721, "可选端口9721"), 
	/** 
	 * 可选端口9733 
	 */ 
	CAN_CHOOSE_9733(9733, "可选端口9733"), 
	/** 
	 * 可选端口9739 
	 */ 
	CAN_CHOOSE_9739(9739, "可选端口9739"), 
	/** 
	 * 可选端口9743 
	 */ 
	CAN_CHOOSE_9743(9743, "可选端口9743"), 
	/** 
	 * 可选端口9749 
	 */ 
	CAN_CHOOSE_9749(9749, "可选端口9749"), 
	/** 
	 * 可选端口9767 
	 */ 
	CAN_CHOOSE_9767(9767, "可选端口9767"), 
	/** 
	 * 可选端口9769 
	 */ 
	CAN_CHOOSE_9769(9769, "可选端口9769"), 
	/** 
	 * 可选端口9781 
	 */ 
	CAN_CHOOSE_9781(9781, "可选端口9781"), 
	/** 
	 * 可选端口9787 
	 */ 
	CAN_CHOOSE_9787(9787, "可选端口9787"), 
	/** 
	 * 可选端口9791 
	 */ 
	CAN_CHOOSE_9791(9791, "可选端口9791"), 
	/** 
	 * 可选端口9803 
	 */ 
	CAN_CHOOSE_9803(9803, "可选端口9803"), 
	/** 
	 * 可选端口9811 
	 */ 
	CAN_CHOOSE_9811(9811, "可选端口9811"), 
	/** 
	 * 可选端口9817 
	 */ 
	CAN_CHOOSE_9817(9817, "可选端口9817"), 
	/** 
	 * 可选端口9829 
	 */ 
	CAN_CHOOSE_9829(9829, "可选端口9829"), 
	/** 
	 * 可选端口9833 
	 */ 
	CAN_CHOOSE_9833(9833, "可选端口9833"), 
	/** 
	 * 可选端口9839 
	 */ 
	CAN_CHOOSE_9839(9839, "可选端口9839"), 
	/** 
	 * 可选端口9851 
	 */ 
	CAN_CHOOSE_9851(9851, "可选端口9851"), 
	/** 
	 * 可选端口9857 
	 */ 
	CAN_CHOOSE_9857(9857, "可选端口9857"), 
	/** 
	 * 可选端口9859 
	 */ 
	CAN_CHOOSE_9859(9859, "可选端口9859"), 
	/** 
	 * 可选端口9871 
	 */ 
	CAN_CHOOSE_9871(9871, "可选端口9871"), 
	/** 
	 * 可选端口9883 
	 */ 
	CAN_CHOOSE_9883(9883, "可选端口9883"), 
	/** 
	 * 可选端口9887 
	 */ 
	CAN_CHOOSE_9887(9887, "可选端口9887"), 
	/** 
	 * 可选端口9901 
	 */ 
	CAN_CHOOSE_9901(9901, "可选端口9901"), 
	/** 
	 * 可选端口9907 
	 */ 
	CAN_CHOOSE_9907(9907, "可选端口9907"), 
	/** 
	 * 可选端口9923 
	 */ 
	CAN_CHOOSE_9923(9923, "可选端口9923"), 
	/** 
	 * 可选端口9929 
	 */ 
	CAN_CHOOSE_9929(9929, "可选端口9929"), 
	/** 
	 * 可选端口9931 
	 */ 
	CAN_CHOOSE_9931(9931, "可选端口9931"), 
	/** 
	 * 可选端口9941 
	 */ 
	CAN_CHOOSE_9941(9941, "可选端口9941"), 
	/** 
	 * 可选端口9949 
	 */ 
	CAN_CHOOSE_9949(9949, "可选端口9949"), 
	/** 
	 * 可选端口9967 
	 */ 
	CAN_CHOOSE_9967(9967, "可选端口9967"), 
	/** 
	 * 可选端口9973 
	 */ 
	CAN_CHOOSE_9973(9973, "可选端口9973"), 


	;
	private int port;
	private String name;
	
	public static final int[] CAN_CHOOSE = {9043, 9049, 9059, 9067, 9091,   
	                               	9103, 9109, 9127, 9133, 9137, 9151, 9157, 9161, 9173, 9181, 9187, 9199,  
	                            	9203, 9209, 9221, 9227, 9239, 9241, 9257, 9277, 9281, 9283, 9293,  
	                            	9311, 9319, 9323, 9337, 9341, 9343, 9349, 9371, 9377, 9391, 9397,  
	                            	9403, 9413, 9419, 9421, 9431, 9433, 9437, 9439, 9461, 9463, 9467, 9473, 9479, 9491, 9497,  
	                            	9511, 9521, 9533, 9539, 9547, 9551, 9587,  
	                            	9601, 9613, 9619, 9623, 9629, 9631, 9643, 9649, 9661, 9677, 9679, 9689, 9697,  
	                            	9719, 9721, 9733, 9739, 9743, 9749, 9767, 9769, 9781, 9787, 9791,   
	                            	9803, 9811, 9817, 9829, 9833, 9839, 9851, 9857, 9859, 9871, 9883, 9887,  
	                            	9901, 9907, 9923, 9929, 9931, 9941, 9949, 9967, 9973};

	private PortSelector(int port, String name) {
		this.port = port;
		this.name = name;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<PortSelector> toList(){
		List<PortSelector> list = Arrays.asList(PortSelector.values());
		return list;
	}
	
//	public static void main(String[] args) {
//		
//		StringBuffer buff = new StringBuffer();
//		String str = "";
//		String strCotent = "";
//		for(int i=0;i< CAN_CHOOSE.length;i++){
//			strCotent = "可选端口" + CAN_CHOOSE[i];
//			str = "/** \n * " + strCotent + " \n */ \n";
//			buff.append(str);
//			buff.append("CAN_CHOOSE_" + CAN_CHOOSE[i] +"(" + CAN_CHOOSE[i] + ", \"" +strCotent+ "\"), \n");
//		}
//		System.out.println(buff);
//	}

}
