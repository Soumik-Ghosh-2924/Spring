package org.Servletex1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/hello") -- we used this annotation way to configure it and map it while using
//an external Tomcat Server.
public class HelloServlet  extends HttpServlet
{
    //this method below is accepting the servlet request.
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println();
        System.out.println();
        System.out.println("In Service");


        res.setContentType("text/html");

        //this line below is to return the data back to the client
        //res.getWriter().println("Hey there ! ");
        PrintWriter out = res.getWriter();
        out.println("<i><b>Hey there.</b></i>");
    }
}
