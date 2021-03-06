/*
 *
 * Paros and its related class files.
 * 
 * Paros is an HTTP/HTTPS proxy for assessing web application security.
 * Copyright (C) 2003-2004 Chinotec Technologies Company
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the Clarified Artistic License
 * as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Clarified Artistic License for more details.
 * 
 * You should have received a copy of the Clarified Artistic License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
// ZAP: 2011/08/04 Changed to support new HttpPanel interface
// ZAP: 2012/04/26 Removed the method setStatus(String), no longer used.

package org.parosproxy.paros.extension;

import org.parosproxy.paros.view.MainFrame;
import org.parosproxy.paros.view.MainPopupMenu;
import org.parosproxy.paros.view.OutputPanel;
import org.parosproxy.paros.view.SiteMapPanel;
import org.parosproxy.paros.view.WaitMessageDialog;
import org.zaproxy.zap.extension.httppanel.HttpPanelRequest;
import org.zaproxy.zap.extension.httppanel.HttpPanelResponse;

public interface ViewDelegate {

    public MainFrame getMainFrame();
    
    public SiteMapPanel getSiteTreePanel();
    
    public OutputPanel getOutputPanel();
    
    public int showConfirmDialog(String msg);

    public int showYesNoCancelDialog(String msg);
    
    public void showWarningDialog(String msg);
    
    public void showMessageDialog(String msg);
    
    public WaitMessageDialog getWaitMessageDialog(String msg);
    
    public MainPopupMenu getPopupMenu();
    
    // ZAP: Removed the method setStatus(String), no longer used.
    
    public HttpPanelRequest getRequestPanel();
    
    public HttpPanelResponse getResponsePanel();
    
}
