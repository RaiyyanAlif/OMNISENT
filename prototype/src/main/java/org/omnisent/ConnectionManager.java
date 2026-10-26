package org.omnisent;
public interface ConnectionManager {
    boolean connect(); CommandResult send(String command); void disconnect(); boolean isConnected();
}
