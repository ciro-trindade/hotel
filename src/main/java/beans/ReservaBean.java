package beans;

import java.util.HashMap;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Reserva;

/**
 *
 * @author Ciro C. Trindade
 */
@ManagedBean
@RequestScoped
public class ReservaBean {
    private static final double DIARIA_SIMPLES = 190.;
    private static final double DIARIA_DUPLO = 350.;
    private static final double DIARIA_TRIPLO = 500.;
    private static final double DIARIA_QUADRUPLO = 620.;
    private static final double[] DIARIAS = {DIARIA_SIMPLES,
        DIARIA_DUPLO, DIARIA_TRIPLO, DIARIA_QUADRUPLO};
    private static final Map<String, Object> VALORESDOSATRIBUTOS;
    static {
        VALORESDOSATRIBUTOS = new HashMap<>();
        VALORESDOSATRIBUTOS.put("type", "number");
        VALORESDOSATRIBUTOS.put("min", "1");
        VALORESDOSATRIBUTOS.put("max", "4");
        VALORESDOSATRIBUTOS.put("required", "required");
        VALORESDOSATRIBUTOS.put("title",
                "O número de hóspedes deve ser um valor entre 1 e 4");
    }
    
    private Reserva reserva = new Reserva();

    public ReservaBean() {
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Map<String, Object> getValoresDosAtributos() {
        return VALORESDOSATRIBUTOS;
    }

    public String reservar() {
        reserva.setValor(DIARIAS[reserva.getHospedes() - 1] * reserva.getNoites());
        return "/confirmacao";
    }

}
