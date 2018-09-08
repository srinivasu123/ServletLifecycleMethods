package com.nt.Servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServlet extends GenericServlet {



	public void init(ServletConfig config)throws ServletException


	{
		System.out.println("LifeCycleServlet.init()");

	}
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("LifeCycleServlet.service()");
	}
	public void destory(){
		System.out.println("LifeCycleServlet.destory()");
	}





}
