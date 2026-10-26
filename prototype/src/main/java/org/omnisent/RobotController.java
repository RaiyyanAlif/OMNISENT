package org.omnisent;
import java.util.Set;
public final class RobotController implements CommandHandler {
    private static final Set<String> ALLOWED=Set.of("FORWARD","BACKWARD","LEFT","RIGHT","STOP");
    private final ConnectionManager connectionManager; private final String robotId;
    private RobotStatus status=new RobotStatus("DISCONNECTED");
    public RobotController(String robotId, ConnectionManager connectionManager){
        this.robotId=robotId; this.connectionManager=connectionManager;
    }
    public CommandResult connect(){
        boolean ok=connectionManager.connect(); status=new RobotStatus(ok?"CONNECTED":"DISCONNECTED");
        return new CommandResult(ok,ok?"Connected to "+robotId:"Connection failed");
    }
    public CommandResult execute(String command){
        if(command==null) return new CommandResult(false,"Command cannot be empty.");
        String c=command.trim().toUpperCase();
        if(!ALLOWED.contains(c)) return new CommandResult(false,"Unsupported command: "+command);
        if(!connectionManager.isConnected()) return new CommandResult(false,"Robot is not connected.");
        CommandResult result=connectionManager.send(c);
        if(result.isSuccess()) status=new RobotStatus("LAST_COMMAND_"+c);
        return result;
    }
    public CommandResult stop(){ return execute("STOP"); }
    public RobotStatus getStatus(){ return status; }
    public String getRobotId(){ return robotId; }
    public void disconnect(){ connectionManager.disconnect(); status=new RobotStatus("DISCONNECTED"); }
}
