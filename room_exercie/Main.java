package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Room[] rooms = new Room[5];
        rooms[0] = new Room();
        rooms[1] = new VIPRoom();
        rooms[2] = new StandrdRoom();
        rooms[3] = new VIPRoomPresidents();
        rooms[4] = new VIpRoomCelebs();
        callCleaner(rooms[0]);
        callCleaner(rooms[1]);
        callCleaner(rooms[2]);
        callCleaner(rooms[3]);
        callCleaner(rooms[4]);

        VIPRoom viproom = new VIPRoom();
        VIPRoomPresidents viproom_p = new VIPRoomPresidents();
        VIpRoomCelebs viproom_c = new VIpRoomCelebs();
        Room r = new Room();
        partyAtVIPRoom(viproom_p);
        partyAtVIPRoom(viproom_c);
        partyAtVIPRoom(viproom);
        //partyAtVIPRoom(r);

    }
    static void callCleaner(Room room)
    {
        room.cleanRoom();
    }
    static void partyAtVIPRoom(VIPRoom vip)
    {
        vip.party();
    }

}
