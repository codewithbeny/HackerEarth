import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int n = in .nextInt();

        int[] array = new int[n];

        int div = 0;

        for (int i = 0; i < array.length; i++)

        {

            array[i] = in .nextInt();

        }

        for (int i = 0; i < array.length / 2; i++)

        {

            int b = array[i];

            while (b >= 10)

            {

                b /= 10;

            }

            if (i % 2 == 0)

            {

                div = div + b;

            } else

            {

                div = div - b;

            }

        }

        for (int i = array.length / 2; i < array.length; i++)

        {

            int b = array[i];

            b = b % 10;

            if (i % 2 == 0)

            {

                div = div + b;

            } else

            {

                div = div - b;

            }

        }

       if (Math.abs(div) % 11 == 0)

        {

            System.out.print("OUI");

        } else

        {

            System.out.print("NON");

        }




    }

}