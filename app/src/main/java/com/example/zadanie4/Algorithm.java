package com.example.zadanie4;

public class Algorithm {
    public Algorithm() {
    }
    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);
        int s1 = 0, s2 = 0;
        for (int i = 0; i < 3; i++) {
            s1 = s1 + inputInt % 10;
            inputInt = inputInt / 10;
        }
        for (int i = 0; i < 3; i++) {
            s2 = s2 + inputInt % 10;
            inputInt = inputInt / 10;
        }
        if (s1 == s2) {
            return true;
        } else {
            return false;
        }
    }
        public int nextHappyTicket(String input){
            int inputInt = Integer.parseInt(input);
            int count = 0;

            for (int i = inputInt; i < 1_000_000; i++) {
                int s1 = i % 10 + (i / 10) % 10 + (i / 100) % 10;
                int j = i / 1000;
                int s2 = j % 10 + (j / 10) % 10 + (j / 100) % 10;
                if (s1 == s2) {
                    break;
                } else {
                    count++;
                }
            }
            return inputInt + count;
        }
    }