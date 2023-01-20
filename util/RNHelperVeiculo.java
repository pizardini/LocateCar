package util;

public class RNHelperVeiculo {

    public static String trataFabricante() {
        String fabricante;
        while (true) {
            fabricante = ConsoleUIHelper.askNoEmptyInput("Digite o Fabricante do veículo", 3).toUpperCase();
            if (!(fabricante.length() >= 3 && fabricante.matches("[A-Z]*"))) {
                System.out.println(fabricante + " Não é um nome válido como um fabricante, digite novamente.");
                fabricante = " ";
                continue;
            }
            break;
        }
        return fabricante;
    }

    public static String trataModelo() {
        String modelo;
        while (true) {
            modelo = ConsoleUIHelper.askNoEmptyInput("Digite o modelo do veículo", 3).toUpperCase();
            if (!(modelo.length() >= 3 && modelo.matches("[A-Z]*"))) {
                System.out.println(modelo + " Não é um nome válido para modelo, digite novamente.");
                modelo = " ";

                continue;
            }
            break;
        }
        return modelo;
    }

    public static String trataPlaca() {
        String placa;
        while (true) {
            placa = ConsoleUIHelper.askNoEmptyInput("Digite a placa do veículo EX: AAA-1234, AAA2341", 3).toUpperCase().replaceAll("-", "");
            if (!(placa.length() == 7 && placa.matches("[A-Z]{3}[0-9][0-9A-Z][0-9]{2}"))) {
                System.out.println(placa + " Não é um valor válido para uma placa de veiculo, digite novamente.");
                placa = " ";

                continue;
            }
            break;
        }
        /*System.out.println("placa  " + placa);
        placa = placa.substring(0, 3) + "-" + placa.substring(4, 7);
        System.out.println("placa depois " + placa);*/

        return placa;
    }

    public static String trataAno() {
        String ano = null;
        while (true) {
            ano = ConsoleUIHelper.askNoEmptyInput("Digite o ano do veículo", 3).toUpperCase();
            try{
                if (!(Integer.parseInt(ano) >= 1980 && Integer.parseInt(ano) <= 2030 && ano.matches("[0-9]*"))) {
                    System.out.println(ano + " Não é um valor válido para o ano de um veículo, digite novamente.");
                    ano = " ";
                    continue;
                }
            } catch (NumberFormatException e){
                System.out.println(ano + " Não é um valor válido para o ano de um veículo, digite novamente.");
                ano = " ";
                continue;
            }
            break;
        }
        return ano;
    }
}
