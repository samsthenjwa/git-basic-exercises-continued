package com.company;

class Hello{

    public static void main(String... args) {
       System.out.println("hello");

    }

    public void hello(String name)
    {
        System.out.println("Hello "+ name);
    }

    public void evenOrOdd(int num1)
    {
        if(num1/2 == 0)
        {
            System.out.println("even");
        }else
            System.out.println("odd");
    }

    public void square(int num)
    {
        for(int i = 0; i < num; num++)
        {
            for(; i < num; num ++)
            {
                System.out.print("#");
            }
        }
    }
}

