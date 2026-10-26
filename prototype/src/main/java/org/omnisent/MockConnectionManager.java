package org.omnisent;
public final class MockConnectionManager implements ConnectionManager {
    private boolean connected;
    public boolean connect(){ connected=true; return true; }
    public CommandResult send(String command){
        if(!connected) return new CommandResult(false,"Not connected.");
        return new CommandResult(true,"Mock command accepted: "+command);
    }
    public void disconnect(){ connected=false; }
    public boolean isConnected(){ return connected; }
}
