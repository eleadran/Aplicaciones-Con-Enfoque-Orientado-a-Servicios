package pe.edu.idat.EC1Soap_InfantesBarrientos.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

public class OperacionesWsdlConfig {
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
