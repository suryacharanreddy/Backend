import java.io.*;
class Abc{
    public static void main(String []args) throws FileNotFoundException{
        PrintWriter pw=new PrintWriter("abc.txt");  // compile time error.Checked by compiler,beacuse of third party file used. 
    }
}