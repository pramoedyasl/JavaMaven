package com.javamaven.project;

import static org.junit.Assert.*;
import org.junit.Test;

public class CounterTest {

	@Test
<<<<<<< Updated upstream
    public void testAdd() {
        assertEquals(34, new Driver().Add(8, 26).getResult());
=======
    public void testTambah() {
        assertEquals(20, new Driver().Tambah(8, 26).getResult());
>>>>>>> Stashed changes
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
