package com.github.onacit.gof.creational;

class MazeGame {

    Maze createMaze() {
        final Maze maze = new Maze();
        final Room room1 = new Room(1);
        final Room room2 = new Room(2);
        final Door door = new Door(room1, room2);
        room1.setSide(Room.Direction.NORTH, new Wall());
        room1.setSide(Room.Direction.EAST, door);
        room1.setSide(Room.Direction.SOUTH, new Wall());
        room1.setSide(Room.Direction.WEST, new Wall());
        room2.setSide(Room.Direction.NORTH, new Wall());
        room2.setSide(Room.Direction.EAST, new Wall());
        room2.setSide(Room.Direction.SOUTH, new Wall());
        room2.setSide(Room.Direction.WEST, door);
        maze.addRoom(room1);
        maze.addRoom(room2);
        return maze;
    }
}
