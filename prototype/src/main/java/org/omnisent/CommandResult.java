package org.omnisent;
public final class CommandResult {
    private final boolean success; private final String message;
    public CommandResult(boolean success, String message) { this.success=success; this.message=message; }
    public boolean isSuccess(){ return success; }
    public String getMessage(){ return message; }
    @Override public String toString(){ return (success ? "SUCCESS: " : "ERROR: ") + message; }
}
