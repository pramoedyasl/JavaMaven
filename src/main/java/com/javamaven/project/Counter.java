package com.javamaven.project;

public class Counter {

	int _xs;
    int _ys;
    int _esult;

    public Counter(int x, int y, int result) {
        _xs = x;
        _ys = y;
        _esult = result;
    }

    public int getX() {
        return _xs;
    }

    public int getY() {
        return _ys;
    }

    public int getResult() {
        return _esult;
    }

    
}
