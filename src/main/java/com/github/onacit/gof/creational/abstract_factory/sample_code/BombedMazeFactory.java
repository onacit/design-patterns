package com.github.onacit.gof.creational.abstract_factory.sample_code;

import com.github.onacit.gof.creational.Wall;

class BombedMazeFactory extends MazeFactory {

    @Override
    protected Wall makeWall() {
        return new BombedWall();
    }
}
