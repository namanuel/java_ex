package at.namanuel;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;

import static at.namanuel.JSONUtils.readJsonFromUrl;

public class Weatherdata {

    public static void getJSONdatafromURL(String location, int days){

        String api_key ="e9b3e40b1174e2215b4d761f665ef1b5";
        String url = "http://api.openweathermap.org/data/2.5/forecast?q="+location+"&APPID="+api_key;
        int counter = 0;
        String datum, land, stadt;
        double temperatur;

        try {
            JSONObject obj = readJsonFromUrl(url);
            stadt = obj.getJSONObject("city").getString("name");
            land = obj.getJSONObject("city").getString("country");
            JSONArray jsonArray = obj.getJSONArray("list");

            //Überprüfung wie viele Einträge ausgeben werden sollen
            switch(days){
                case 1: counter = 9;
                break;
                case 2: counter = 18;
                break;
                case 3: counter = 40;
                break;
                default:
                    break;
            }

            for(int i = 0; i<jsonArray.length(); i++){
                if(i == counter) {
                    break;
                }else{
                    JSONObject help = jsonArray.getJSONObject(i);
                    datum = help.getString("dt_txt");
                    temperatur = help.getJSONObject("main").getDouble("temp");
                    printWeather(stadt, datum, temperatur, land, i);
                }
            }



        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printWeather(String stadt, String datum, double temperatur, String land, int counter){

        System.out.println("----------------------------------------------------------------\n" +
                "| ["+counter+"]\n" +
                "----------------------------------------------------------------\n" +
                "|"+datum+" \n" +
                "----------------------------------------------------------------\n" +
                "| Stadt: "+stadt+"\n" +
                "----------------------------------------------------------------\n" +
                "| Land: "+land+"\n" +
                "----------------------------------------------------------------\n" +
                "| Temperatur: "+String.format("%.1f", ((temperatur - 273.15)))+" °C\n" +
                "----------------------------------------------------------------\n\n");
    }



}
