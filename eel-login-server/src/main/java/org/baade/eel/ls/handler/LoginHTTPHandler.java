package org.baade.eel.ls.handler;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginHTTPHandler extends AbstractHandler {

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
		response.getWriter().println("sssssss你好sssss");

//		request.getpa;
	}

}
