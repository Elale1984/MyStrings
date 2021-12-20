public class MyStringsDriver {

    public static void  main(String[] args){

        //MyString object created from the MyString(String str) constructor
        MyString s1 = new MyString("Bob");
        System.out.println("s1 = " + s1);

        //MyString object created from the MyString(String str) constructor
        MyString s2 = new MyString(s1);
        System.out.println("s2 = " + s2);

        //MyString object created from the MyString(String str) constructor
        MyString s3 = new MyString(" Ross");
        System.out.println("s3 = " + s3);

        // Demonstrating the concat method
        System.out.println("This demonstrates the concat method for s1 and s3 = "+ s1.concat(s3));

        // Demonstrating the isEqual method for s1 and s3
        System.out.println("Demonstrating the isEqual method for s1 and s3 = " + s1.isEqual(s3));

        // Demonstrating the compare method for s3 and s1
        System.out.println("Demonstrating the compare method for s3 and s1 = " + s3.compare(s1));

        // Demonstrating the get() method for s3 at index 2
        System.out.println("Demonstrating the get() method for s3 at index 2 = " + s3.get(2));

        // Create s4
        MyString s4 = new MyString("abcdefghijklmnopqrstuvwxyz");
        System.out.println("s4 = " + s4);

        // Demonstrating the convertToUpperCase() method on s4
        System.out.println("Demonstrating the convertToUpperCase() method on s4 = " + s4.convertToUpperCase());

        // Demonstrating the convertToLowerCase() method on s5
        System.out.println("Demonstrating the convertToLowerCase() method on s4 = " + s4.convertToLowerCase());

        // Demonstrating the subAtIndex(int) method on s4
        System.out.println("Demonstrating the subAtIndex(int) method on s4 = " + s4.subAtIndex(6));

        // Demonstrating the subAtIndex(int m, int n) method on s4
        System.out.println("Demonstrating the subAtIndex(int m, int n) method on s4 = " + s4.subAtIndex(2,7));




    }


}
