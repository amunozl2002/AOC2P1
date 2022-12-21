// https://adventofcode.com/2022/day/2

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {

        int TotalPoints;

        TotalPoints = calculatePoints();
        System.out.println("Total points: " + TotalPoints);
    }

    private static int calculatePoints() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        String inputLine = br.readLine();

        int res = 0;
//        System.out.println("Enemy Option: " + enemyOption);
//        System.out.println("My Option: " + myOption);

        while (inputLine != null ) {
            String enemyOption = inputLine.substring(0, 1); // take the first letter as enemyOption
            String myOption = inputLine.substring(2, 3);    // take the last letter as myOption

            switch (enemyOption) {
                case "A":                           // enemy rock vs:
                    switch (myOption) {
                        case "X":
                            res += 3;                      //  lose
                            break;
                        case "Y":
                            res += 4;                      //  draw
                            break;
                        case "Z":
                            res += 8;                      //  win
                            break;
                    }
                    break;
                case "B":                            // enemy paper vs:
                    switch (myOption) {
                        case "X":
                            res += 1;                      //  lose
                            break;
                        case "Y":
                            res += 5;                      //  draw
                            break;
                        case "Z":
                            res += 9;                      //  win
                            break;
                    }
                    break;
                case "C":                            // enemy scissors vs:
                    switch (myOption) {
                        case "X":
                            res += 2;                      //  lose
                            break;
                        case "Y":
                            res += 6;                      //  draw
                            break;
                        case "Z":
                            res += 7;                      //  win
                            break;
                    }
                    break;
             }
             inputLine = br.readLine(); // move to the next line

        }

        return res;
    }
}
