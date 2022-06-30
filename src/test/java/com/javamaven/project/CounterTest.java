package com.javamaven.project;

import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

	@Test
    public void testTambah() {
        assertEquals(34, new Driver().Tambah(8, 26).getResult());
    }

    @Test
    public void testSub() {
        assertEquals(4, new Driver().Sub(12, 8).getResult());
    }

    @Test
    public void testMul() {
        assertEquals(88, new Driver().Mul(11, 8).getResult());
    }

    @Test
    public void testDiv() {
        assertEquals(1, new Driver().Div(12, 12).getResult());
    }

}
