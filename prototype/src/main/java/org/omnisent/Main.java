package org.omnisent;
public final class Main {
    private Main(){}
    public static void main(String[] args){
        ConnectionManager connection=new MockConnectionManager();
        RobotController controller=new RobotController("OMNI-01",connection);
        MissionManager missions=new MissionManager();
        new RobotDashboard(controller,missions).run();
    }
}
