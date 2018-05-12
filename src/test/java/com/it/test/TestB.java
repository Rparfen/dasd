package com.it.test;

import org.junit.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


public class TestB {

    @Test
    public void testAssertArrayEquals(){
        byte[] expected = "trial".getBytes();
        byte[] actual = "trial".getBytes();
       assertArrayEquals("failure - byte arrays not same", expected, actual);
    }
    @Test
    public void testAssertEquals(){
        assertEquals("failure - strings are not equals", "texe", "text");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("@before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@after");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
        System.out.println("@beforeClass");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        System.out.println("@afterClass");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("test 1");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test 2");
    }

    @Test
    public void test3() throws Exception {
        System.out.println("test 3");
    }
}
