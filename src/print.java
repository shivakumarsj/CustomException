import jdk.nashorn.internal.parser.JSONParser;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class print
{
    public static void main(String args[]) throws IOException {

        try{
            int num1=30, num2=0;
            int output=num1/num2;
            System.out.println ("Result: "+output);
            throw new MyException();
        }
        catch(ArithmeticException | MyException | IOException e)
        {
            Properties prop = new Properties();
            FileInputStream ip = new FileInputStream("src/config.properties");
            prop.load(ip);
            String msg = prop.getProperty("msg");
            System.out.println(msg);
        }

    }

}
