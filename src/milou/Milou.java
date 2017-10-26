/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package milou;

import generated.Carto;
import generated.Carto.Markers.Marker;
import generated.Station;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author thomas.sauvajon
 */
public class Milou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        JAXBContext cartoContext = JAXBContext.newInstance(Carto.class);
        Unmarshaller u = cartoContext.createUnmarshaller();
        
        URL url = new URL("http://www.velib.paris/service/carto");
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        Carto cartale = (Carto) u.unmarshal(con.getInputStream());
        
        Scanner sc = new Scanner(System.in);
        
        int idStation = sc.nextInt();

        Marker randomStation = cartale.getMarkers().getMarker().get(idStation);

        URL stationURL = new URL("http://www.velib.paris/service/stationdetails/" + randomStation.getNumber());
        HttpURLConnection stationConnection = (HttpURLConnection) stationURL.openConnection();
        stationConnection.setRequestMethod("GET");
        
        
        JAXBContext stationContext = JAXBContext.newInstance(Station.class);
        Unmarshaller u2 = stationContext.createUnmarshaller();
        Station station = (Station) u2.unmarshal(stationConnection.getInputStream());
        
        System.out.println("Station " + randomStation.getName());
        System.out.println(randomStation.getFullAddress());
        System.out.println("Coordonnées : [" + randomStation.getLat() + "; " + randomStation.getLng() + "]");
        System.out.println("Google maps : https://www.google.fr/maps/@" + randomStation.getLat() + "," + randomStation.getLng() + ",15z");
        System.out.println("Total de places " + station.getTotal());
        System.out.println("Dont libres : " + station.getAvailable());
    }
}
