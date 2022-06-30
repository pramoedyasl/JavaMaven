package com.javamaven.project;

import javax.ws.rs.QueryParam;

public class Driver {

	public Counter Tambah(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counter(x, y, x + y);
    }

    public Counter Sub(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counter(x, y, x - y);
    }

    public Counter Mul(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counter(x, y, x * y);
    }

    public Counter Div(@QueryParam("x") int x, @QueryParam("y") int y) {
        return new Counter(x, y, x / y);
    }

}
