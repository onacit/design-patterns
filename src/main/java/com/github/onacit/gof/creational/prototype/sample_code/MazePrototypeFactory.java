package com.github.onacit.gof.creational.prototype.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.Maze;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.Wall;
import com.github.onacit.gof.creational.abstract_factory.sample_code.MazeFactory;

import java.util.Objects;

class MazePrototypeFactory extends MazeFactory {

    MazePrototypeFactory(final Maze m, final Room w, final Wall r, final Door d) {
        super();
        this.prototypeMaze = Objects.requireNonNull(m, "m is null");
        this.prototypeRoom = Objects.requireNonNull(w, "w is null");
        this.prototypeWall = Objects.requireNonNull(r, "r is null");
        this.prototypeDoor = Objects.requireNonNull(d, "d is null");
    }

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    protected Maze makeMaze() {
        return prototypeMaze.cloneTyped();
    }

    @Override
    protected Wall makeWall() {
        return prototypeWall.cloneTyped();
    }

    @Override
    protected Room makeRoom(int roomNo) {
        final var clone = prototypeRoom.cloneTyped();
        clone.setRoomNo(roomNo);
        return clone;
    }

    @Override
    protected Door makeDoor(final Room r1, final Room r2) {
        final var clone = prototypeDoor.cloneTyped();
        clone.initialize(r1, r2);
        return clone;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private final Maze prototypeMaze;

    private final Room prototypeRoom;

    private final Wall prototypeWall;

    private final Door prototypeDoor;
}
