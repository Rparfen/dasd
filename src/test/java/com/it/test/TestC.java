package com.it.test;

import org.junit.*;


public class TestC {
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
