/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erbjuder.logger.server.web.portlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 *
 * @author Stefan Andersson
 */
public class LogMessagePortlet extends javax.portlet.GenericPortlet {

    private static final Logger logger = Logger.getLogger(LogMessagePortlet.class.getName());

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void doEdit(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        logger.entering(LogMessagePortlet.class.getName(), "doEdit");
        super.doEdit(request, response);
        logger.exiting(LogMessagePortlet.class.getName(), "doEdit");
    }

    @Override
    public void doHelp(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        logger.entering(LogMessagePortlet.class.getName(), "doHelp");
        super.doHelp(request, response);
        logger.exiting(LogMessagePortlet.class.getName(), "doHelp");
    }

    @Override
    public void doView(RenderRequest request, RenderResponse response) throws PortletException, IOException {
        logger.entering(LogMessagePortlet.class.getName(), "doView");
        super.doView(request, response);
        logger.exiting(LogMessagePortlet.class.getName(), "doView");
    }

    @Override
    public void init() throws PortletException {
        super.init();
    }

    @Override
    public void processAction(ActionRequest request, ActionResponse response) throws PortletException {
        logger.entering(LogMessagePortlet.class.getName(), "processAction");
        try {
            super.processAction(request, response);
        } catch (IOException ex) {
            logger.log(Level.SEVERE, null, ex);
        }
        logger.exiting(LogMessagePortlet.class.getName(), "processAction");
    }
}

