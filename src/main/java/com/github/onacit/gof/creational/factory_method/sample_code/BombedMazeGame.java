package com.github.onacit.gof.creational.factory_method.sample_code;

import com.github.onacit.gof.creational.MazeGame;
import com.github.onacit.gof.creational.Room;
import com.github.onacit.gof.creational.Wall;
import com.github.onacit.gof.creational.abstract_factory.sample_code.BombedWall;
import com.github.onacit.gof.creational.abstract_factory.sample_code.RoomWithABomb;

class BombedMazeGame extends MazeGame {

    @Override
    protected Wall makeWall() {
        return new BombedWall();
    }

    @Override
    protected Room makeRoom(final int roomNo) {
        return new RoomWithABomb(roomNo);
    }
}
