import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args){
        String s1="welcome;500";
        int hallo =0;
        int i = 0;
        System.out.println("returning words:");
        for(String w:s1.split(";",0)){

            if(i == 0) {
                System.out.println(w);
                i++;
            }
            else{
                System.out.println(hallo = Integer.parseInt(w));
            }
        }
        System.out.println(hallo * 5);
        /*
        List<String> circledata = new ArrayList<>();
        String zeile = "";
        String input ="";
        if(args.length == 1){
            input = args[0];

        }
        try {
            FileReader fr = new FileReader(input);
            BufferedReader br = new BufferedReader(fr);
                try {
                 do   {
                        zeile = br.readLine();
                        circledata.add(zeile);
                    }while (zeile != null);

                } catch (IOException e) {
                    e.printStackTrace();
                }


        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
*/



    }

}
