package day19StringManipulations;

import java.util.Scanner;

public class Task3CombineInScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter first word");
        String word1 = scan.next().toLowerCase();// Apple

        System.out.println("Enter second word");
        String word2 = scan.next().toLowerCase();// pie

        System.out.println(word1.concat(word2));

        String let1 = " " + word1.charAt(word1.length()-1);
        System.out.println(let1);

        String let2 = word2.substring(0,1 );
        System.out.println(let2);

        if(word1.charAt(word1.length()-1) == word2.charAt(0)){

            System.out.println(word1+word2.substring(1));



            }else{
                System.out.println(word1+word2);
            }















        }


    }
