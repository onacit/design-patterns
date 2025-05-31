package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.Maze;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.Wall;

public class MazeFactory {

    protected Maze makeMaze() {
        return new Maze();
    }

    protected Wall makeWall() {
        return new Wall();
    }

    protected Room makeRoom(final int roomNo) {
        return new Room(roomNo);
    }

    protected Door makeDoor(final Room r1, final Room r2) {
        return new Door(r1, r2);
    }
}
