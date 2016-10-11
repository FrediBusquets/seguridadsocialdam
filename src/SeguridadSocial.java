import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * Created by USER on 19/09/2016.
 */
public class SeguridadSocial {

    private List<Persona> personasList;

    public SeguridadSocial() {

        personasList = new ArrayList<>();

    }
    //HashMap
    public  Map<String, Persona> personaMapDNI = new HashMap<>();
    private Map <String, Persona> personaMapNumSS = new HashMap<>();


    public void altaPersona(Persona persona) {
        if (!personaMapDNI. containsKey(persona.getDNI()) && !personaMapNumSS.containsKey(persona.getNumSS())) {
            personaMapDNI.put(persona.getDNI(), persona);
            personaMapNumSS.put(persona.getNumSS(), persona);
        }
  /*
            Boolean repetido = false;

            for (int i = 0; i< personasList.size();i++){
                Persona p = personasList.get(i);
                if(p.getDNI().equalsIgnoreCase(persona.getDNI())){
                    repetido = true;
                }
            }
            if(!repetido){
                personasList.add(persona);
            }
            boolean repetida = personasList.stream().anyMatch(p -> p.getDNI().equals(persona.getDNI())) ;
       */ }


    public void bajaPersona(String dni) {
        //HashMap
        personaMapNumSS.remove(personaMapDNI.get(dni).getNumSS());

      //  personasList.removeIf(persona -> persona.getDNI().equals(dni));
    }
    public Persona obtenerPersonaPorDNI(String dni) {
         // HashMap
        return personaMapDNI.get(dni);

      //  return personasList.stream().filter(persona -> persona.getDNI().equals(dni)).findFirst().get();
    }

    public Persona obtenerPersonaPorNumSS(String numSS) {
         //HashMap
        return personaMapNumSS.get(numSS);

      //  return personasList.stream().filter(persona -> persona.getNumSS() == numSS).findFirst().get();
    }

    public List<Persona> obtenerPersonasRangoSalarial(double min, double max) {
        // HashMap
        return personaMapDNI.values().stream().filter(persona -> persona.getSalario()>=min && persona.getSalario()<=max).collect(Collectors.toList());
    }

    public List<Persona> obtenerPersonasMayoresQue(int edad){

        ArrayList<Persona> temporal = new ArrayList<>();
        for(Persona y : personasList){
           if (y.getEdad() > edad){
               temporal.add(y);
           }
       }
    return temporal;

        //return personasList.stream().filter(persona -> persona.getEdad() > edad).collect(Collectors.toList());
    }


    public List<Persona> obtenerTodas(){
        return personasList;

    }

    @Override

    public String toString() {

        return "SeguridadSocial{" +

                "personasList=" + personasList +

                '}';

    }

}
