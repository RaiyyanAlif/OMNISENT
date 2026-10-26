package org.omnisent;
import java.util.Scanner;
public final class RobotDashboard {
    private final RobotController controller; private final MissionManager missionManager;
    public RobotDashboard(RobotController c, MissionManager m){ controller=c; missionManager=m; }
    public void run(){
        try(Scanner in=new Scanner(System.in)){
            System.out.println("=== OMNISENT Java Prototype (Mock Connection) ===");
            System.out.println("WARNING: This prototype does NOT control physical hardware.");
            System.out.println(controller.connect().getMessage());
            boolean running=true;
            while(running){
                System.out.println("\\n1 Forward  2 Backward  3 Left  4 Right  5 Stop");
                System.out.println("6 Start mission  7 Show history  8 Status  0 Exit");
                System.out.print("Select: "); String choice=in.nextLine().trim();
                switch(choice){
                    case "1" -> print(controller.execute("FORWARD"));
                    case "2" -> print(controller.execute("BACKWARD"));
                    case "3" -> print(controller.execute("LEFT"));
                    case "4" -> print(controller.execute("RIGHT"));
                    case "5" -> print(controller.stop());
                    case "6" -> System.out.println("Started: "+missionManager.startMission(controller.getRobotId()).summary());
                    case "7" -> missionManager.getHistory().forEach(r->System.out.println(r.summary()));
                    case "8" -> System.out.println(controller.getStatus());
                    case "0" -> running=false;
                    default -> System.out.println("Choose one of the listed options.");
                }
            }
            controller.disconnect(); System.out.println("Disconnected. Prototype ended.");
        }
    }
    private void print(CommandResult r){ System.out.println(r); }
}
