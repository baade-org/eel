package org.baade.eel.ls.handler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.baade.eel.core.server.IServerHandler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class HTTPHandler extends AbstractHandler implements IServerHandler {

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		System.out.println("target : " + target);
		System.out.println("baseRequest : " + baseRequest);
		System.out.println("request : " + request);
		System.out.println("response : " + response);

//		response.getWriter().write("ss");

		response.setContentType("text/json;charset=utf-8");
		response.setStatus(HttpServletResponse.SC_OK);
		baseRequest.setHandled(true);
		response.getWriter().println("ssssssssssss");
	}

}
