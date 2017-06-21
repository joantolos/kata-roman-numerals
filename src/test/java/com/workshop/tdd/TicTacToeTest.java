package com.workshop.tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TicTacToeTest {

    private TicTacToe ticTacToe;

    @Before
    public void setUp(){
        this.ticTacToe = new TicTacToe(3,3);
    }

    @Test
    public void shouldCreateBoard(){
        Assert.assertNotNull(this.ticTacToe);
    }

    @Test
    public void shouldMarksAsEmpty(){
        Assert.assertTrue(this.ticTacToe.isPositionEmpty(1,1));
    }

    @Test
    public void shouldPlay(){
        Assert.assertTrue(this.ticTacToe.play(1,1,1));
    }
}
