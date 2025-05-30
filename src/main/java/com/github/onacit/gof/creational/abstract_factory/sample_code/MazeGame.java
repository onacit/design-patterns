package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Maze;
import com.github.onacit.gof.creational.Room;

class MazeGame {

    ///  Creates a maze game looks like,
    /// ```
    /// +--- maze -----------------+
    /// | +---N---+      +---N---+ |
    /// | | room1 |      | room2 | |
    /// | W       + door +       E |
    /// | |       |      |       | |
    /// | +---S---+      +---S---+ |
    /// +--------------------------+
    ///```
    /// .
    Maze createMaze(final MazeFactory factory) {
        final var maze = factory.makeMaze();
        final var room1 = factory.makeRoom(1);
        final var room2 = factory.makeRoom(2);
        maze.addRoom(room1);
        maze.addRoom(room2);
        final var door = factory.makeDoor(room1, room2);
        room1.setSide(Room.Direction.NORTH, factory.makeWall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, factory.makeWall());
        room1.setSide(Room.Direction.WEST, factory.makeWall());
        room2.setSide(Room.Direction.NORTH, factory.makeWall());
        room2.setSide(Room.Direction.EAST, factory.makeWall());
        room2.setSide(Room.Direction.SOUTH, factory.makeWall());
        room2.setSide(Room.Direction.WEST, door);
        return maze;
    }
}
