package com.pan.bishi.zhongxin;

import javafx.concurrent.Worker;

import java.util.ArrayList;

/**
 * @author panyexiong
 * @date 2019/9/11 - 11:53
 */
public class Main {
    static int count = 0;
    public static void main(String[] args) {

    }

    ArrayList<ArrayList<Integer>> criticalConnections(int numOfServers,
                                                      int numOfConnections,
                                                      ArrayList<ArrayList<Integer>> connections) {
        // WRITE YOUR CODE HERE
        int[][] arr = new int[numOfServers][numOfServers];
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        int row;
        int col;
        for (int i = 0; i < numOfConnections; i++) {
            row = connections.get(i).get(0);
            col = connections.get(i).get(1);
            arr[row - 1][col - 1] = 1;
            arr[col - 1][row - 1] = 1;
        }

        for (int i = 0; i < numOfConnections; i++) {
            int num1 = connections.get(i).get(0);
            int num2 = connections.get(i).get(1);

            if (fun1(num1, num2, arr)) {
                arrayLists.add(connections.get(i));
            }
        }
        return arrayLists;

    }

    public boolean fun1(int num1, int num2, int[][] arr) {

        for (int i = 0; i < arr[0].length; i++) {
            if (arr[i][num1 - 1] == num2) {
                count++;
                continue;
            }
            if (arr[i][num1 - 1] != 0) {
                fun1(i, num2, arr);
            }
        }
        if (count>=2){
            return true;
        }else{
            return false;
        }

    }
}
