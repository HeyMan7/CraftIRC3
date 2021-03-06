package com.ensifera.animosity.craftirc;

public interface CommandEndPoint extends SecuredEndPoint {
    /**
     * This is called when a command is sent to this endpoint.
     * 
     * @param cmd
     */
    public void commandIn(RelayedCommand cmd);
}
