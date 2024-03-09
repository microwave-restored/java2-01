package org.donstu.service;

import org.donstu.domain.Seat;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import java.util.ArrayList;
import java.util.List;

import static javax.jws.soap.SOAPBinding.ParameterStyle.WRAPPED;
import static javax.jws.soap.SOAPBinding.Style.DOCUMENT;
import static javax.jws.soap.SOAPBinding.Use.LITERAL;

@WebService(serviceName = "ReservationService", portName = "ReservationPort",
    targetNamespace = "https://donstu.org/reservation")
@SOAPBinding(style = DOCUMENT, use = LITERAL, parameterStyle = WRAPPED)
public class ReservationService {

    @WebMethod(operationName = "getFreeSeats")
    public List<Seat> getFreeSeats() {
        List<Seat> result = new ArrayList<>();

        result.add(new Seat("First", 3, 7));
        result.add(new Seat("First", 3, 8));
        result.add(new Seat("First", 3, 9));
        result.add(new Seat("Second", 2, 5));
        result.add(new Seat("Second", 1, 5));
        result.add(new Seat("Third", 4, 15));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
