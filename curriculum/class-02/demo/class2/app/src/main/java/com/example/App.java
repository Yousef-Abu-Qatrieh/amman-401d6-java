/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public String getGreeting() {
        return "Hello World! Class";
    }

    public static void main(String[] args) {
        arrayList();

        String[] names = arrayDemo();

        for (String name :
                names) {
            System.out.println(name);
        }

        System.out.println(new App().getGreeting());

        try {

            Document doc = Jsoup.connect("https://en.wikipdia.org/").get();

            System.out.println(doc.title());
            logger.info("THE LOGGER SHOULD WORK NOW");
            Elements newsHeadlines = doc.select("#mp-itn b a");

            for (Element headline : newsHeadlines) {
                System.out.println(headline.attr("title"));
                System.out.println(headline.absUrl("href"));
            }

        } catch (Exception exception) {
            System.out.println("Load info from local storage");
//            logger.error(exception.getMessage());
        }
    }

    public static String[] arrayDemo() {
        double[] salaries; // array declaration, no memory space allocated
        int[] marks = {1, 2, 3, 4, 5, 10}; // declaration and initialisation
        String[] names = new String[6]; // declaration and memory allocated

        int size = 4;
        int[] countries = new int[size];

        // 2 Dimensional array
        int[][] matrix = new int[4][4];
        matrix[0][0] = 23;

        // rows x columns
        // 3 x 2
        char[][] initials = {
                {'Q', 'U'}, // row 0
                {'W', 'P'}, // row 1
                {'E', 'D'}  // row 2
        };

        System.out.println("the contents of the matrix => " + matrix[0][0]);

        salaries = new double[10];
        salaries[0] = 89.9d;
        salaries[1] = 23;
        salaries[2] = 829.5;
        salaries[3] = 89985.;
        salaries[4] = 56;
        salaries[5] = 89.5;
        salaries[6] = 11;
        salaries[7] = 1212.8;
        salaries[8] = 300;
        salaries[9] = 898;

        for (int index = 0; index < salaries.length; index++) {
            System.out.println("The salaray at pos => " + index + " is => " + salaries[index]);

            if (index < marks.length) {
                System.out.println("marks are => " + marks[index]);
                names[index] = "bob_" + index;
            } else {
                System.out.println("we finished printing the marks array");
            }
        }

        salaries[9] = 10000;

        System.out.println("pos 9 => " + salaries[9]);

        try {
            System.out.println("pos 10 => " + salaries[100]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hi your array index does not exist in this array");
        }

        return names;
    }

    public static void arrayList() {

        int test = 100;
        System.out.println("the byte is => " + test);

        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<Integer> names = new ArrayList<>();
        // insert three t the add methodhings with
        ages.add(23); // 0
        ages.add(49); // 1
        ages.add(100); // 2
        ages.add(67); // 3

        for (int counter = 1; counter <= 10; counter++) {
            ages.add(counter * 10);
        }

        ages.add(1, 99);

        ArrayList<Integer> likes = new ArrayList<>(ages);


        for (int index = 0; index < ages.size(); index++) {
            System.out.println(ages.get(index));
        }

        // remove from the array list
        ages.remove(0);

        System.out.println("\n\n\n");
        for (int index = 0; index < ages.size(); index++) {
            System.out.println(ages.get(index));
        }

        ArrayList<ArrayList<Integer>> twoD = new ArrayList<>();
        twoD.add(ages);
        twoD.add(likes);
        twoD.add(names);

        System.out.println("the value => " + twoD.get(0).get(0));

        System.out.println(likes);
    }

    public int calculate(int num1, int num2, String operation) {

        int x = getLambda();

        int result;

        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * x;
                break;
            case "divide":
                result = num1 / num2;
                break;
            default:
                result = -999;
        }

        return result;
    }

    public int getLambda() {
        System.out.println();
        return 0; // represents logic
    }

    public String pluralize(String word, int number) {

        if (number > 1) {
            word = word + "s";
        }

        return word;
    }
}
