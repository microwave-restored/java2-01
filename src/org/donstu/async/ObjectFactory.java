
package org.donstu.async;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.donstu.async package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFreeSeatsResponse_QNAME = new QName("https://donstu.org/reservation", "getFreeSeatsResponse");
    private final static QName _GetFreeSeats_QNAME = new QName("https://donstu.org/reservation", "getFreeSeats");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.donstu.async
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetFreeSeatsResponse }
     * 
     */
    public GetFreeSeatsResponse createGetFreeSeatsResponse() {
        return new GetFreeSeatsResponse();
    }

    /**
     * Create an instance of {@link GetFreeSeats }
     * 
     */
    public GetFreeSeats createGetFreeSeats() {
        return new GetFreeSeats();
    }

    /**
     * Create an instance of {@link Seat }
     * 
     */
    public Seat createSeat() {
        return new Seat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeSeatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/reservation", name = "getFreeSeatsResponse")
    public JAXBElement<GetFreeSeatsResponse> createGetFreeSeatsResponse(GetFreeSeatsResponse value) {
        return new JAXBElement<GetFreeSeatsResponse>(_GetFreeSeatsResponse_QNAME, GetFreeSeatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFreeSeats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://donstu.org/reservation", name = "getFreeSeats")
    public JAXBElement<GetFreeSeats> createGetFreeSeats(GetFreeSeats value) {
        return new JAXBElement<GetFreeSeats>(_GetFreeSeats_QNAME, GetFreeSeats.class, null, value);
    }

}
