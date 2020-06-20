package com.printarray;

public class PrintMyArray
{
    public static void toPrint(Integer[] input)
    {
        for(int element:input)
        {
            System.out.println(element);
        }
    }

    public static void toPrint(Double[] input)
    {
        for(double element:input)
        {
            System.out.println(element);
        }
    }

    public static void toPrint(Character[] input)
    {
        for(char element:input)
        {
            System.out.println(element);
        }
    }

    public static void main(String[] args)
    {
        Integer[] integerArray={5,45,12,65,73};
        Double[] doubleArray={1.5,2.8,5.4,76.5,98.9};
        Character[] characterArray={'W','E','L','C','O','M','E'};

        PrintMyArray.toPrint(integerArray);
        PrintMyArray.toPrint(doubleArray);
        PrintMyArray.toPrint(characterArray);
    }
}
