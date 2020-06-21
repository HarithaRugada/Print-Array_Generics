package com.printarray;

public class PrintArray
{
    public static <E> void toPrint(E[] input)
    {
        for(E element:input)
        {
            System.out.println(element);
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Integer[] integerArray={1,6,10,64,2};
        Double[] doubleArray={6.9,5.66,43.8,65.1,98.5};
        Character[] characterArray={'H','E','L','L','O'};

        toPrint(integerArray);
        toPrint(doubleArray);
        toPrint(characterArray);
    }
}
