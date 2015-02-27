package com.anshumanbajpai.sudoku;

import java.util.List;

public class GameChecker
{
    public static boolean isValidSolution(int[][] board)
    {
        for (int i = 0; i < Config.BOARD_SIZE; i++)
        {
            boolean[] marker = new boolean[Config.BOARD_SIZE];

            for (int j = 0; j < Config.BOARD_SIZE; j++)
            {
                marker[board[i][j] - 1] = true;
            }

            for (int k = 0; k < Config.BOARD_SIZE; k++)
            {
                if (!marker[k])
                {
                    return false;
                }
            }
        }

        for (int j = 0; j < Config.BOARD_SIZE; j++)
        {
            boolean[] marker = new boolean[Config.BOARD_SIZE];

            for (int i = 0; i < Config.BOARD_SIZE; i++)
            {
                marker[board[i][j] - 1] = true;
            }

            for (int k = 0; k < Config.BOARD_SIZE; k++)
            {
                if (!marker[k])
                {
                    return false;
                }
            }
        }

        for (int i = 0; i <= Config.BOARD_SIZE - 3; i = i + 3)
        {
            for (int j = 0; j <= Config.BOARD_SIZE - 3; j = j + 3)
            {
                if (!isValidBlock(i, j, board))
                {
                    return false;
                }
            }
        }

        return true;
    }

    //x & y are top left coordinates of sub matrices
    private static boolean isValidBlock(int x, int y, int[][] board)
    {
        boolean[] marker = new boolean[Config.BOARD_SIZE];

        for (int i = x; i < x + 3; i++)
        {
            for (int j = y; j < y + 3; j++)
            {
                marker[board[i][j] - 1] = true;
            }
        }

        for (int i = 0; i < Config.BOARD_SIZE; i++)
        {
            if (!marker[i])
            {
                return false;
            }
        }

        return true;
    }
}
