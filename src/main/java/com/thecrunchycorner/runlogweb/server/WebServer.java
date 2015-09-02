package com.thecrunchycorner.runlogweb.server;

import org.eclipse.jetty.jmx.MBeanContainer;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;
import java.lang.management.ManagementFactory;

public class WebServer {
    public static void main (String[] args) throws Exception {
        Server server = new Server(8080);

        MBeanContainer mBeanContainer = new MBeanContainer(ManagementFactory.getPlatformMBeanServer());
        server.addBean(mBeanContainer);

        WebAppContext webApp = new WebAppContext();
        webApp.setContextPath("/");

        File warFIle = new File("target/runlog-web");
        webApp.setWar(warFIle.getAbsolutePath());
        webApp.addAliasCheck(new AllowSymLinkAliasChecker());

        server.setHandler(webApp);

        server.start();
        server.dumpStdErr();
        server.join();
    }
}
