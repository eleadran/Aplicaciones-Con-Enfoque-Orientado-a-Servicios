//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v4.0.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
//


package pe.edu.idat.ws.descuento;

import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.edu.idat.ws.descuento package. 
 * <p>An ObjectFactory allows you to programmatically 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.edu.idat.ws.descuento
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDescuentoRequest }
     * 
     * @return
     *     the new instance of {@link GetDescuentoRequest }
     */
    public GetDescuentoRequest createGetDescuentoRequest() {
        return new GetDescuentoRequest();
    }

    /**
     * Create an instance of {@link GetDescuentoResponse }
     * 
     * @return
     *     the new instance of {@link GetDescuentoResponse }
     */
    public GetDescuentoResponse createGetDescuentoResponse() {
        return new GetDescuentoResponse();
    }

}
