package heuristics;

import board.EightPuzzleBoard;

/**
 * Created by udokanwosu on 12/11/2016.
 */
public interface Heuristics {
    double getHeuristic(EightPuzzleBoard board);
}