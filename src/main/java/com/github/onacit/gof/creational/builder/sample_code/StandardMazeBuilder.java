package com.github.onacit.gof.creational.builder.sample_code;

import com.github.onacit.gof.creational.Door;
import com.github.onacit.gof.creational.Maze;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.Wall;

class StandardMazeBuilder extends MazeBuilder {

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        if (currentMaze.getRoom(roomNo) != null) {
            return;
        }
        final var room = new Room(roomNo);
        currentMaze.addRoom(room);
        room.setSide(Room.Direction.NORTH, new Wall());
        room.setSide(Room.Direction.SOUTH, new Wall());
        room.setSide(Room.Direction.EAST, new Wall());
        room.setSide(Room.Direction.WEST, new Wall());
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        final var room1 = currentMaze.getRoom(roomFrom);
        final var room2 = currentMaze.getRoom(roomTo);
        final var door = new Door(room1, room2);
        room2.setSide(commonWall(room1, room2), door);
        room2.setSide(commonWall(room1, room2), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Room.Direction commonWall(final Room room1, final Room room2) {
        if (room1.getRoomNo() > room2.getRoomNo()) {
            return Room.Direction.WEST;
        } else {
            return Room.Direction.EAST;
        }
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Maze currentMaze;
}
