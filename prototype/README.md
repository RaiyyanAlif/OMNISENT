# Java Prototype

This folder contains a small academic Java starter demonstrating a command model, interfaces, mission records, and a console-based interface. It uses a **mock connection** and does not control physical hardware.

## Run (JDK 17+)
From `D:\OMNISENT\prototype`:
```bat
javac -d out src\main\java\org\omnisent\*.java
java -cp out org.omnisent.Main
```

The starter is intended to make the class design concrete. Physical TCP communication, Python integration, camera capture, and motor control are not implemented here; they require a confirmed protocol and controlled tests.
