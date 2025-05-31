package com.github.onacit.gof.creational;

import java.util.Objects;

public class Door extends MapSite implements TypedCloneable<Door> {

    public Door(final Room room1, final Room room2) {
        super();
        initialize(room1, room2);
    }

    public void initialize(final Room room1, final Room room2) {
        this.room1 = Objects.requireNonNull(room1, "room1 is null");
        this.room2 = Objects.requireNonNull(room2, "room2 is null");
    }

    // -----------------------------------------------------------------------------------------------------------------
    public Door clone() {
        try {
            return (Door) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // -----------------------------------------------------------------------------------------------------------------

    @Override
    void enter() {
    }

    // -----------------------------------------------------------------------------------------------------------------
    public Room getOtherSide(final Room room) {
        Objects.requireNonNull(room, "room is null");
        return room.equals(room1) ? room2 : room1;
    }

    // ----------------------------------------------------------------------------------------------------------- room1
    public Room getRoom1() {
        return room1;
    }

    // ----------------------------------------------------------------------------------------------------------- room2
    public Room getRoom2() {
        return room2;
    }

    // ------------------------------------------------------------------------------------------------------------ open
    public boolean isOpen() {
        return open;
    }

    public void setOpen(final boolean open) {
        this.open = open;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Room room1;

    private Room room2;

    private boolean open = false;
}
