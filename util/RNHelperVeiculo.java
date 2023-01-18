package util;

public class RNHelperVeiculo {

    public static boolean trataFabricante(String fabricante){
        return fabricante.length() >= 3 && fabricante.matches("[A-Z]*");
    }

    public static boolean trataModelo(String modelo){
        return modelo.length() >= 3 && modelo.matches("[A-Z]*");
    }

    public static boolean trataPlaca(String placa){
        return placa.length() == 7 && placa.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}");
    }

    public static boolean trataAno(String ano){
        int anoI = Integer.parseInt(ano);
        return anoI >= 1980 && anoI <= 2030 && ano.matches("[0-9]*");
    }
}
