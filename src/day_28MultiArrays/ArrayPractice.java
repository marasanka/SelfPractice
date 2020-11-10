package day_28MultiArrays;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
   /*
   Scrum team:
   testers:{"Dorin", "Adil","Fatih","Subhi"}
   developers:{"Kastrinsi","Mustafa","Ruslan"}
   scrm master SM;{"Ayes"}
   PO{"Omid"}
   BA {"Agalar"}
    */

        String[][] scrumTeam = {
                {"Dorin", "Adil", "Fatih", "Subhi"},//0
                {"Kastrinsi", "Mustafa", "Ruslan"},//1
                {"Ayes"},//2
                {"Omid"},//3
                {"Agalar"}//4
        };

        System.out.println(Arrays.deepToString(scrumTeam));

        for (int i = 0; i <= scrumTeam.length - 1; i++) {
            System.out.println(Arrays.toString(scrumTeam[i]));//prints the each groop from STeam
            for (int j = 0; j <= scrumTeam[i].length - 1; j++) {//j represents index num of each element
                System.out.println(scrumTeam[i][j]);

            }


        }
    }
}