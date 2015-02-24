package com.anshumanbajpai.sudoku;

import com.google.common.primitives.Ints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seeds
{
    private static final int[][][] SEEDS = new int[][][]{
            {
                    {4, 3, 5, 2, 6, 9, 7, 8, 1},
                    {6, 8, 2, 5, 7, 1, 4, 9, 3},
                    {1, 9, 7, 8, 3, 4, 5, 6, 2},
                    {8, 2, 6, 1, 9, 5, 3, 4, 7},
                    {3, 7, 4, 6, 8, 2, 9, 1, 5},
                    {9, 5, 1, 7, 4, 3, 6, 2, 8},
                    {5, 1, 9, 3, 2, 6, 8, 7, 4},
                    {2, 4, 8, 9, 5, 7, 1, 3, 6},
                    {7, 6, 3, 4, 1, 8, 2, 5, 9}
            },

            {
                    {1, 5, 2, 4, 8, 9, 3, 7, 6},
                    {7, 3, 9, 2, 5, 6, 8, 4, 1},
                    {4, 6, 8, 3, 7, 1, 2, 9, 5},
                    {3, 8, 7, 1, 2, 4, 6, 5, 9},
                    {5, 9, 1, 7, 6, 3, 4, 2, 8},
                    {2, 4, 6, 8, 9, 5, 7, 1, 3},
                    {9, 1, 4, 6, 3, 7, 5, 8, 2},
                    {6, 2, 5, 9, 4, 8, 1, 3, 7},
                    {8, 7, 3, 5, 1, 2, 9, 6, 4}
            }
    };

    public static List<List<List<Integer>>> getSeeds()
    {
        List<List<List<Integer>>> seedsList = new ArrayList<>(SEEDS.length);

        for (int i = 0; i < SEEDS.length; i++)
        {
            List<List<Integer>> seed = new ArrayList<>();

            for (int j = 0; j < SEEDS[i][0].length; j++)
            {
                seed.add(Collections.unmodifiableList(Ints.asList(SEEDS[i][j])));
            }

            seedsList.add(seed);
        }

        return seedsList;
    }
}
