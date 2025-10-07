package pe.edu.idat.EC1Soap_InfantesBarrientos.service;

import org.springframework.stereotype.Service;

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
