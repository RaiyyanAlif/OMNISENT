package org.omnisent;
import java.time.Instant;
public final class RobotStatus {
    private final String state; private final Instant updatedAt;
    public RobotStatus(String state){ this.state=state; this.updatedAt=Instant.now(); }
    public String getState(){ return state; }
    public Instant getUpdatedAt(){ return updatedAt; }
    @Override public String toString(){ return state + " (updated " + updatedAt + ")"; }
}
