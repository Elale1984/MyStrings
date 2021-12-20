public class MyString {

    char[] data;
    int curr_length;

    //    constructor that initialize array to null and curr_length to 0
    public MyString() {
    }

    public MyString(char[] data, int curr_length) {
        this.data = data;
        this.curr_length = curr_length;
    }

    //    Constructor that takes in  a String parameter and initializes the char
    //    array to the characters of the String

    public MyString(String myString) {
        this.curr_length = myString.length();
        this.data = myString.toCharArray();

    }

    //  copy constructor
    public MyString(MyString copy) {
        this.curr_length = copy.curr_length;
        this.data = copy.data;

    }

    //    toString method returns a string representation of the myString Object
    public String toString() {
        return new String(this.data);
    }

    //    Returns the current length of the MyString object
    public int length() {
        return this.curr_length;
    }


    //    concat method takes in a myString and returns the concatenation of the myString that is calling it

    public MyString concat(MyString concatString) {
        return new MyString(new String(this.data) + new String(concatString.data));
    }

    //    isEqual method takes in a myString and compares it to the myString that is calling it.

    public boolean isEqual(MyString myString){
        return this.data == myString.data;
    }

    //    compare will compare two myString objects alphabetically. returns 0 if they are the same. returns
    //    negative integer if the this.MyString comes before the parameter. Returns positive integer if
    //    parameter comes before this.MyString
    public int compare(MyString myString) {
        for (int i = 0; i < myString.length(); i++) {
            if (this.data[i] > myString.data[i]) {
                return -1;
            } else if (this.data[i] < myString.data[i])
                return 1;
        }
        return 0;
    }

    //    get() method will take in an integer and return the char at that index of the array for the MyString object
    public String get(int index){
        if(index >= 0 && index <= this.curr_length){
            return String.valueOf(this.data[index]);
        }
        else
            return "Error, Index is out of bounds for " + this;
    }

    //    toUpper() method will convert the entire MyString object to upper case using ASCII values
    public MyString convertToUpperCase(){
        int asciiRep;

        for (int i = 0; i < this.length(); i++) {
            if(this.data[i] > 96 && this.data[i] < 123){
                asciiRep = this.data[i];
                asciiRep = asciiRep - 32;
                this.data[i] = (char) asciiRep;
            }

        }
        return this;
    }

    //    toLower() method will convert the entire MyString object to lower case using ASCII values
    public MyString convertToLowerCase(){

        int asciiRep;

        for (int i = 0; i < this.length(); i++) {
            if(this.data[i] > 64 && this.data[i] < 91){
                asciiRep = this.data[i];
                asciiRep = asciiRep + 32;
                this.data[i] = (char) asciiRep;
            }

        }

        return this;

    }

    //  subAtIndex() method returns the substring from a given index to the end of the string
    public MyString subAtIndex(int index){
        int substringSize = this.curr_length-(index);

        char[] subCharAry = new char[substringSize];
        MyString substring = new MyString(subCharAry, substringSize);

        for (int i = 0; i < substringSize; i++){
            substring.data[i] = this.data[i + index];
        }
        return substring;
    }

    //  subAtIndex(int n int m) overloads the subAtIndex() method and takes in the beginning substring index
    //  (inclusively) and the end substring index (exclusively) and returns the substring
    public MyString subAtIndex(int n, int m){
        int substringSize = (m - n) + 1;

        char[] substringAry = new char[substringSize];
        MyString substring = new MyString(substringAry, substringSize);

        for(int i = 0; i < substringSize; i++){
            substring.data[i] = this.data[i + n];
        }

        return substring;
    }

    //  indexOf(MyString) method will take in a MyString object and return the index at which that MyString can be found
    //  in another MyString object. If not found, it will return -1


//    public int indexOf(MyString myString){
//
//        int searchCounter = 0;
//        for(int i = 0; i < this.length(); i++){
//            if(this.data[i] == myString.data[searchCounter]){
//                MyString sub = new MyString(this.subAtIndex(i,(i + myString.length())));
//                while (searchCounter < myString.length()) {
//                    if (sub.data[searchCounter] == myString.data[searchCounter]) {
//                        searchCounter++;
//                    }
//                    if (searchCounter == myString.length()) {
//                        return i;
//                    }
//                    searchCounter++;
//                }
//            }
//
//        }
//        return -1;
//    }

}