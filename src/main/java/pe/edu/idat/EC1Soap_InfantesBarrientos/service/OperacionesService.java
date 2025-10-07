package pe.edu.idat.EC1Soap_InfantesBarrientos.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.XsdSchema;

@Service
public class OperacionesService {
    public String descuento(int cantidad, double precio) {
        double total = cantidad * precio;

        if (total > 200) {
            double descuento = total * 0.20;
            double totalConDescuento = total - descuento;
            return "El total a pagar con 20% de descuento es: $" + totalConDescuento;
        } else {
            return "El total a pagar sin descuento es: $" + total;
        }
    }
}
