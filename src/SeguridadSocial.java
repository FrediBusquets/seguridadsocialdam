import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER on 19/09/2016.
 */
public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }

// Debes comprobar que no se introduzcan dos personas con el mismo DNI/Número Seguridad Social

    public void altaPersona(Persona persona) {
    for (Persona personaActual : personasList){
        if (personaActual.getDNI().equals(persona.getDNI())||(personaActual.getDNI().equals(persona.getNumSS()))){

            }
    }
    }

    public void bajaPersona(String dni) {

    }

    public Persona obtenerPersonaPorDNI(String dni) {
    return null;
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
    return null;
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max){
    return null;
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){
    return null;
    }

    public List<Persona> obtenerTodas(){
    return null;
    }

    @Override

    public String toString() {

        return "SeguridadSocial{" +

                "personasList=" + personasList +

                '}';

    }

}
