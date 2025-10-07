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

    private final OperacionesService operacionesService;
    private final String NAME_SPACE = "http://www.idat.edu.pe/ws/descuento";

    public OperacionesEndpoint(OperacionesService operacionesService) {
        this.operacionesService = operacionesService;
    }

    @PayloadRoot(namespace = NAME_SPACE, localPart = "getDescuentoRequest")
    @ResponsePayload
    public GetDescuentoResponse getDescuento(
            @RequestPayload GetDescuentoRequest request) {
        GetDescuentoResponse response = new GetDescuentoResponse();
        response.setMensaje(
                operacionesService.descuento(
                        request.getCantidad(),
                        request.getPrecio()
                )
        );
        return response;
    }

}
