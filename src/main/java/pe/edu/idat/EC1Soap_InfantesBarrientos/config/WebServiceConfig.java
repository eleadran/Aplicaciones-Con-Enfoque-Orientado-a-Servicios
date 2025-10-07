package pe.edu.idat.EC1Soap_InfantesBarrientos.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

public class WebServiceConfig { @Bean
public ServletRegistrationBean<MessageDispatcherServlet>
messageDispatcher(ApplicationContext app){
    MessageDispatcherServlet servlet =
            new MessageDispatcherServlet();
    servlet.setApplicationContext(app);
    servlet.setTransformWsdlLocations(true);
    return new ServletRegistrationBean<>(servlet,
            "/ws/*");
}
    @Bean
    public XsdSchema operacionesSchema(){
        return new SimpleXsdSchema(
                new ClassPathResource("xsd/descuento.xsd")
        );
    }
}
