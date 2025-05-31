package com.github.onacit.gof.creational;

import java.util.HashMap;
import java.util.Map;

public class Maze extends MapSite implements TypedCloneable<Maze> {

    public Maze() {
        super();
        this.rooms = new HashMap<>();
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void enter() {
    }

    // ----------------------------------------------------------------------------------------------------------- rooms
    public Room addRoom(final Room room) {
        return rooms.put(room.getRoomNo(), room);
    }

    public Room getRoom(final int roomNo) {
        return rooms.get(roomNo);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final Map<Integer, Room> rooms;
}
