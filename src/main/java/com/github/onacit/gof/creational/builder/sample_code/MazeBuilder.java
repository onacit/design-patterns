package com.github.onacit.gof.creational.builder.sample_code;

import com.github.onacit.gof.creational.Maze;

abstract class MazeBuilder {

    abstract void buildMaze();

    abstract void buildRoom(int room);

    abstract void buildDoor(int roomFrom, int roomTo);

    abstract Maze getMaze();
}
