package com.github.onacit.gof.creational.builder.sample_code;

import com.github.onacit.gof.creational.Maze;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor(access = AccessLevel.PACKAGE)
class MazeGame {

    Maze createMaze(final MazeBuilder builder) {
        Objects.requireNonNull(builder, "builder is null");
        builder.buildMaze();
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        return builder.getMaze();
    }
}
