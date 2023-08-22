package Dom.inne;

import javax.imageio.IIOException;
import java.io.*;

public class IoExceptionTest {
    public static void main(String[] args){
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(new File("plik.txt")));
        } catch (FileNotFoundException e1){
            e1.printStackTrace();
        }

        try {
            br.readLine();
        }catch (IIOException e){
            System.out.println("Bład odczytu pliku");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
