package org.joget.marketplace;

import java.io.IOException;
import org.joget.plugin.base.ExtDefaultPlugin;
import org.joget.plugin.base.PluginWebSupport;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimpleWebservicePlugin extends ExtDefaultPlugin implements PluginWebSupport {

    @Override
    public String getName() {
        return "Simple Webservice Plugin";
    }

    @Override
    public String getDescription() {
        return "Simple Webservice Plugin";
    }

    @Override
    public String getVersion() {
        return "8.0.0";
    }


    @Override
    public String getClassName() {
        return getClass().getName();
    }

    @Override
    public void webService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        return;
    }
}
