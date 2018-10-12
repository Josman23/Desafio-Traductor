package traductor;

public class Traductor {

    public String Traductor(String cadena) {

        String cadenaFinal="",
        abecedario = "abcdefghijklmnñopqrstuvwxyz",
        patronDeSustitucion = "ghijklmnñopqrstuvwxyzabcdef";

        for(int i=1; i <= cadena.length(); i++){

            String letra=cadena.substring(i-1,i);

            if(letra.matches("[a-z]")){
                cadenaFinal = cadenaFinal + abecedario.substring(patronDeSustitucion.indexOf(letra),patronDeSustitucion.indexOf(letra)+1);
            }else if(letra.matches("[A-Z]")){
                cadenaFinal = cadenaFinal + abecedario.toUpperCase().substring(patronDeSustitucion.toUpperCase().indexOf(letra),patronDeSustitucion.toUpperCase().indexOf(letra)+1);
            }else{
                cadenaFinal = cadenaFinal + letra;
            }
        }
        return cadenaFinal;
    }
}
