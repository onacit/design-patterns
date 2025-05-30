package com.github.onacit.gof.creational;

import java.util.EnumMap;

public class Room extends MapSite {

    public enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    // -----------------------------------------------------------------------------------------------------------------
    public Room(final int roomNo) {
        super();
        this.roomNo = roomNo;
        sides = new EnumMap<>(Direction.class);
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    void enter() {

    }

    // ---------------------------------------------------------------------------------------------------------- roomNo
    public int getRoomNo() {
        return roomNo;
    }

    // ----------------------------------------------------------------------------------------------------------- sides
    public MapSite getSide(final Direction direction) {
        return sides.get(direction);
    }

    public MapSite setSide(final Direction direction, MapSite mapSite) {
        return sides.put(direction, mapSite);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final int roomNo;

    private final EnumMap<Direction, MapSite> sides;
}
