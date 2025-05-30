package com.github.onacit.gof.creational.builder.sample_code;

import com.github.onacit.gof.creational.Maze;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.Wall;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;

class CountingMazeBuilder extends MazeBuilder {

    // -----------------------------------------------------------------------------------------------------------------
    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        doors++;
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    // -----------------------------------------------------------------------------------------------------------------
    void addWall(int roomNo, final Room.Direction direction) {
        currentMaze.getRoom(roomNo).setSide(direction, new Wall());
    }

    void getCounts(final IntFunction<? extends IntConsumer> function) {
        function.apply(rooms).accept(doors);
    }

    // -----------------------------------------------------------------------------------------------------------------
    private Maze currentMaze;

    private int rooms;

    private int doors;
}
