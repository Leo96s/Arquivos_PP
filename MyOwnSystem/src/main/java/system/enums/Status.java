package system.enums;

import java.io.Serializable;

public enum Status implements Serializable{
    ONLINE, OFFLINE, OCUPADO;

    public static String statustoString(Status status){
        switch(status){
            case ONLINE:
            return "ONLINE";
            case OCUPADO:
            return "OCUPADO";
            default:
            return "OFFLINE";
        }
    }
}
