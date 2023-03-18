/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author thule
 */
public class Room {
    private String roomID;
    private String roomName;
    private RoomType roomType;
    private RoomStatusType roomStatusType;
    private String describe;

    public Room() {
    }

    public Room(String roomID, String roomName, RoomType roomType, RoomStatusType roomStatusType, String describe) {
        this.roomID = roomID;
        this.roomName = roomName;
        this.roomType = roomType;
        this.roomStatusType = roomStatusType;
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Room{" + "roomID=" + roomID + ", roomName=" + roomName + ", roomType=" + roomType + ", roomStatusType=" + roomStatusType + ", describe=" + describe + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.roomID);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        return Objects.equals(this.roomID, other.roomID);
    }
    
}
