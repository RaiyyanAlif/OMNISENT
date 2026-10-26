package org.omnisent;
import java.util.ArrayList; import java.util.Collections; import java.util.List;
public final class MissionManager {
    private final List<MissionRecord> missions=new ArrayList<>();
    public MissionRecord startMission(String robotId){ MissionRecord r=new MissionRecord(robotId); missions.add(r); return r; }
    public boolean endMission(String missionId){
        for(MissionRecord r:missions){ if(r.getMissionId().equals(missionId)){ r.close(); return true; } }
        return false;
    }
    public List<MissionRecord> getHistory(){ return Collections.unmodifiableList(missions); }
}
