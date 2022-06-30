package com.javamaven.project;

import javax.ws.rs.QueryParam;

public class Driver {

	public Counters Add(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counters(x, y, x + y);
    }

    public Counters Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counters(x, y, x - y);
    }

    public Counters Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counters(x, y, x * y);
    }

    public Counters Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counters(x, y, x / y);
    }

}
