package kduraj;

public class Main {

public static Double[][] array = {

        { 1.9,  2.4,  4.8,  5.1,  6.3},
        { 7.4,  8.5,  9.3, 10.2, 12.2},
        {13.7, 14.2, 15.2, 16.3, 17.3},
        {18.9, 19.5, 20.8, 21.6, 22.8},
        {23.0, 24.1, 25.0, 26.8, 27.9},
};

    public static int search(Double x) {

        int n = array[0].length;
        int i = 0, j = n-1;

        while ( i < n && j >= 0 )
        {
            if ( array[i][j].equals(x) ) {
                System.out.println("Found: row= " +  i + " col=" + j);
                return 1;
            }
            if ( array[i][j] > x )
                j--;
            else
                i++;
        }

        System.out.println("\n Element not found");
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("Finding element in the array");
        search(15.2);
    }

}
