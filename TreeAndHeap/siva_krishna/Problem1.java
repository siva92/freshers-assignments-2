package com.siva;

import java.util.Scanner;

/**
 * Created by Siva Krishna on 5/10/16.
 *
 * Nineleaps has a client ABC which manages Events for other companies.
 * ABC has a requirement that given n no. of employees in a hierarchical
 * structure, it should be able to arrange them in a 5 seater row .
 *
 * You as a Developer from Nineleaps should write code to ease the job of ABC.

 * Input Format:
 * The first line contains a single integer,denoting the number of vertices in the tree.
 * The second line contains n-1 space-separated integers where the kth integer denotes the parent vertex of vertex  k+1
 * All vertices are numbered from 1 to n. Root is always 1
 * Constraints:
 * 1 <= n <= 10power5
 *
 * Output Format:
 * print the seating arrangement with a space after each integer in a row.
 * Line separation after each row.
 *
 * Example1:
 *
 * Input:
 * 6
 * 1 4 1 2 2
 *
 * Output:
 * 1 2 4 5 6
 * 3
 *
 * Example2:
 * 5
 * 1 2 2 3
 *
 * Output:
 * 1 2 3 4 5

 * .
 */
public class Problem1 {

    /**
     * Describe what this method does.
     * @param n
     * @param a
     */
    private static void method(int n, int a[]) {
        //your logic comes here

        System.out.println("Your job to do this now");
    }


    /**
     * Run this file for a demo
     * @param apples
     */
    public static void main(String apples[]) {

        Scanner scanner = new Scanner(System.in);
        // Takes n as input
        int n = scanner.nextInt();

        int a[] = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt();
        }

        method(n, a);



    }
}
