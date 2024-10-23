package org.Servletex1;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        //to run the Tomcat Server we are creating an object for Tomcat and then starting the server

        Tomcat tomcat = new Tomcat();

        //Since we are using an Embedded Server we have to do the mapping for the Servlet using the
        //Tomcat Server.
        Context context = tomcat.addContext("", null);
        //sending a request to servlet
        Tomcat.addServlet(context, "HelloServlet", new HelloServlet());
        //mapping the request to the servlet
        context.addServletMappingDecoded("/hello", "HelloServlet");


        tomcat.start();
        tomcat.getServer().await();

    }
}
