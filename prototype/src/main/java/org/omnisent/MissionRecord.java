package org.omnisent;
import java.time.Instant; import java.util.UUID;
public final class MissionRecord {
    private final String missionId; private final String robotId; private final Instant startedAt;
    private Instant endedAt; private String status;
    public MissionRecord(String robotId){
        this.missionId="M-"+UUID.randomUUID().toString().substring(0,8).toUpperCase();
        this.robotId=robotId; this.startedAt=Instant.now(); this.status="IN_PROGRESS";
    }
    public void close(){ if(endedAt==null){ endedAt=Instant.now(); status="COMPLETED"; } }
    public String getMissionId(){ return missionId; }
    public String getRobotId(){ return robotId; }
    public Instant getStartedAt(){ return startedAt; }
    public Instant getEndedAt(){ return endedAt; }
    public String getStatus(){ return status; }
    public String summary(){ return missionId+" | robot="+robotId+" | status="+status+" | started="+startedAt+(endedAt==null?"":" | ended="+endedAt); }
}
