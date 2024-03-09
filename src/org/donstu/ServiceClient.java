package org.donstu;

import org.donstu.client.ReservationService;
import org.donstu.client.ReservationService_Service;
import org.donstu.client.Seat;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class ServiceClient {
    private static final QName FQDN = new QName("https://donstu.org/reservation", "ReservationService");

    private static URL getWsdlUrl(String urlStr) {
        URL url = null;
        try {
            url = new URL(urlStr);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        return url;
    }

    public void processFreeSeats(URL url) {
        ReservationService_Service svc = new ReservationService_Service(url, FQDN);
        ReservationService port = svc.getReservationPort();
        List<Seat> freeSeats = port.getFreeSeats();
        freeSeats.forEach(seat -> System.out.println("Seat{" +
                "hall='" + seat.getHall() + '\'' +
                ", row=" + seat.getRow() +
                ", seat=" + seat.getSeat() +
                '}'));
    }

    public static void main(String[] args) {
        URL wsdlUrl = getWsdlUrl("http://127.0.0.1:8090/reservation?wsdl");
        ServiceClient client = new ServiceClient();
        client.processFreeSeats(wsdlUrl);
    }
}
