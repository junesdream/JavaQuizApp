package com.rainbowdev.board;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Quiz q = new Quiz();
        q.logic();
    }
}

class Quiz {

    Scanner sc = new Scanner(System.in);
    int correctAnsCount = 0;
    int wrongAnsCount = 0;
    public void logic(){
    Questions q1 = new Questions("What is the capital of India?", "a)New Delhi", "b)Chandigarh", "c)Mumbai", "d)Delhi");
    Questions q2 = new Questions("What is the capital of USA?", "a)New York", "b)LA", "c)Boston", "d)Washington");
    Questions q3 = new Questions("What is the capital of Japan?", "a)Hiroshima", "b)Nagoya", "c)Tokyo", "d)Nagasaki ");
    Questions q4 = new Questions("What is the capital of UK?", "a)New Castle", "b)London", "c)Bristol", "d)York");
    Questions q5 = new Questions("What is the capital of Canada?", "a)Vancouver", "b)Toronto", "c)Edmonton", "d)Ottawa");
    Questions q6 = new Questions("What is the capital of South Korea?", "a)Pyongyang", "b)Seoul", "c)Pusan", "d)Inchon");

        Map<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'a');
        hmap.put(q2, 'd');
        hmap.put(q3, 'c');
        hmap.put(q4, 'b');
        hmap.put(q5, 'd');
        hmap.put(q6, 'b');

        for(Map.Entry<Questions, Character> map: hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter Your Answer: ");
            Character ans = sc.next().charAt(0);
            int cans = Character.compare(ans,map.getValue());
            if(cans == 0){
                System.out.println("Correct Answer");
                correctAnsCount++;
            }
            else{
                System.out.println("Wrong Answer");
                wrongAnsCount++;
            }
        }

        System.out.println();
        System.out.println("---------Result---------");
        System.out.println("Total Questions: "+ hmap.size());
        System.out.println("Correct Answer: " + correctAnsCount);
        System.out.println("Wrong Answer: " + correctAnsCount);
        int per = (correctAnsCount*100)/hmap.size();
        System.out.println("Precentage : " +per + "%");
        if(per > 95){
            System.out.println("Your are very good!");
        }
        else if(per < 35) {
            System.out.println("You are under low");
        }
        else{
            System.out.println("You are medium.");
        }
    }

}