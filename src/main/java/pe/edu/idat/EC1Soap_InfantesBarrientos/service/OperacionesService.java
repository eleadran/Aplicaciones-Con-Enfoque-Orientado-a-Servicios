package pe.edu.idat.EC1Soap_InfantesBarrientos.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class OperacionesService {
    @Bean(name = "descuento")
    public DefaultWsdl11Definition descuentoWsdl(
            XsdSchema schema){
        DefaultWsdl11Definition wsdl =
                new DefaultWsdl11Definition();
        wsdl.setPortTypeName("DescuentoPort");
        wsdl.setLocationUri("/ws/descuento");
        wsdl.setTargetNamespace("http://www.idat.edu.pe/ws/descuento");
        wsdl.setSchema(schema);
        return wsdl;
    }
}
