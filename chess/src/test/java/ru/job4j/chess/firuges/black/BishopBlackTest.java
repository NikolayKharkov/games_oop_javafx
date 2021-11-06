package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;


public class BishopBlackTest extends TestCase {

    @Test
    public void testPosition() {
        Cell checkPos = Cell.F8;
        BishopBlack bishopblack = new BishopBlack(Cell.F8);
        boolean result = checkPos.getX() == bishopblack.position().getX()
                && checkPos.getY() == bishopblack.position().getY();
        Assert.assertTrue(result);
    }

    @Test
    public void testCopy() {
        Cell checkPos = Cell.F7;
        BishopBlack bishopblack = new BishopBlack(Cell.F8);
        BishopBlack bishopblackCopy = (BishopBlack) bishopblack.copy(checkPos);
        boolean result = checkPos.getX() == bishopblackCopy.position().getX()
                && checkPos.getY() == bishopblackCopy.position().getY();
        Assert.assertTrue(result);
    }

    @Test
    public void testWay() {
        BishopBlack bishopblack = new BishopBlack(Cell.C1);
        Cell[] actual = bishopblack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(actual, expected);
    }

    @Test
    public void testIsDiagonal() {
        Cell source = Cell.E1;
        Cell dest = Cell.D2;
        BishopBlack bishopblack = new BishopBlack(source);
        boolean result = bishopblack.isDiagonal(source, dest);
        Assert.assertTrue(result);
    }
}