package pe.edu.idat.EC1Soap_InfantesBarrientos.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import pe.edu.idat.EC1Soap_InfantesBarrientos.service.OperacionesService;
import pe.edu.idat.ws.descuento.GetDescuentoRequest;
import pe.edu.idat.ws.descuento.GetDescuentoResponse;

@Endpoint
public class OperacionesEndpoint {

    private static final String NAMESPACE_URI = "http://www.idat.edu.pe/ws/descuento";

    private final OperacionesService operacionesService;

    public OperacionesEndpoint(OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDescuentoRequest")
    @ResponsePayload
    public GetDescuentoResponse obtenerDescuento(@RequestPayload GetDescuentoRequest request) {
        double total = operacionesService.calcularTotal(request.getCantidad(), request.getPrecio());
        String mensaje = operacionesService.generarMensaje(total);

        GetDescuentoResponse response = new GetDescuentoResponse();
        response.setTotal(total);
        response.setMensaje(mensaje);

        return response;
    }
}
