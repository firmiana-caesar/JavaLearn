package com.company.test;

public class Main {
    public static int  Number = 20151656;
    private String sex = "M";
    private String School = "CQU";

    public Main(){}

    public Main(int Num){
        System.out.println("This is a new object name " + Num);
    }

    public static void main(String[] args) {
	// write your code here
        Main fine = new Main(0);

        int[] JudgePrime = new int[4];
        JudgePrime[0] = 4549;
        JudgePrime[1] = 8461;
        JudgePrime[2] = 641;
        JudgePrime[3] = 313;

        for(int i = 0; i < 4; i++)
            fine.Test(JudgePrime[i]);

        //fine.Test(100);
        fine.Draw(8);
    }

    public void Test(int test){
        Main fuckme = new Main(1);
        boolean result = true;
        for (int i = 2; i * i <= test; i++)
        {
            if(test % i == 0)
            {
                result = false;
                break;
            }
        }
        System.out.println(result);
    }

    public void Draw(int level){
        Main fuck = new Main(2);

        int count = 1;
        for(int i = 1; i <= level; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.printf("%02d"+" ", count);
                count++;
            }
            System.out.println();
        }
    }

    public void printNum(){
        System.out.println("this is a super class print number function");
    }
}

