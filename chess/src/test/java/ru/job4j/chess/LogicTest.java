package ru.job4j.chess;

import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;
import ru.job4j.chess.firuges.black.KingBlack;

public class LogicTest {

    @Test(expected = ImpossibleMoveException.class)
    public void whenImpossibleMove()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F7));
        logic.move(Cell.F7, Cell.B1);
    }

    @Test(expected = OccupiedCellException.class)
    public void whenOccupiedPos()
            throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.A1));
        logic.add(new BishopBlack(Cell.B2));
        logic.move(Cell.A1, Cell.C3);
    }

    @Test(expected = FigureNotFoundException.class)
    public void whenNotFound() throws FigureNotFoundException, OccupiedCellException, ImpossibleMoveException {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.F1));
        logic.move(Cell.A1, Cell.C3);
    }
}