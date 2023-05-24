import java.util.Scanner;

public class ex05_agendaAnual {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][][] compromissos = new String[12][31][8];
        String agenda = "";
        int mes = 0;
        int dia = 0;
        int hora = 0;
        boolean valido = true;
        boolean continua = true;

        while (continua) {
            System.out.println("\nMENU DE OPÇÕES - COMPROMISSOS:");
            System.out.println("1 - Inserir compromissos");
            System.out.println("2 - Procurar por um compromissos");
            System.out.println("3 - Exibe todos os compromissos");
            System.out.println("0 - Encerrar Agenda");

            switch (scan.nextInt()) {

                case 0: // encerra Agenda
                    continua = false;
                    break;

                case 1: // Insersão de compromissos

                    valido = true;
                    while (valido) {

                        System.out.print("\nQual mês: ");
                        mes = scan.nextInt();

                        if (mes < 1 || mes > 12) {
                            System.out.println("Mês inválido, digite novamente:");
                        } else {

                            valido = true;
                            while (valido) {

                                System.out.print("Qual dia: ");
                                dia = scan.nextInt();

                                if (dia < 1 || dia > 31) {
                                    System.out.println("Dia inválido, digite novamente:");
                                } else {

                                    valido = true;
                                    while (valido) {
                                        System.out.print("Que horas: ");
                                        hora = scan.nextInt();

                                        if (hora <= 8 || hora > 16) { // horário comercial (9h as 16)
                                            System.out.println("Hora inválida, digite novamente:");
                                        } else {
                                            agenda += dia + "/" + mes + "/23 às " + hora + "h ";
                                            System.out.println("Insira seu compromisso para o dia " + agenda);

                                            mes--;
                                            dia--;
                                            hora -= 9;
                                            
                                            compromissos[mes][dia][hora] = scan.next();
                                            agenda += compromissos[mes][dia][hora];
                                            System.out.println("\n------> " + agenda + "\n\n");
                                            agenda = "";
                                            valido = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 2: // procura de compromissos

                    valido = true;
                    while (valido) {

                        System.out.print("\nQual mês: ");
                        mes = scan.nextInt();

                        if (mes < 1 || mes > 12) {
                            System.out.println("Mês inválido, digite novamente:");
                        } else {

                            valido = true;
                            while (valido) {

                                System.out.print("Qual dia: ");
                                dia = scan.nextInt();

                                if (dia < 1 || dia > 31) {
                                    System.out.println("Dia inválido, digite novamente:");
                                } else {

                                    while (valido) {
                                        System.out.print("Que horas: ");
                                        hora = scan.nextInt();

                                        if (hora <= 8 || hora > 16) { // horário comercial (9h as 16)
                                            System.out.println("Hora inválida, digite novamente:");
                                        } else {
                                            agenda = dia-- + "/" + mes-- + "/23 às " + hora-- + "h: "
                                                    + compromissos[mes][dia][hora - 8];
                                            System.out.println("\n------> " + agenda + "\n\n");
                                            agenda = "";
                                            valido = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;

                case 3: // Lista todos os compromissos
                    System.out.println("\nLista de compromissos");

                    for (mes = 0; mes < compromissos.length; mes++) {
                        for (dia = 0; dia < compromissos[mes].length; dia++) {
                            for (hora = 0; hora < compromissos[mes][dia].length; hora++) {
                                if (compromissos[mes][dia][hora] != null) {
                                    agenda = (dia+1) + "/" + (mes+1) + "/23 às " + (hora+9) + "h: "
                                            + compromissos[mes][dia][hora];
                                    System.out.println("------> " + agenda);
                                }
                            }
                        }
                    }

                    break;

                default:
                    System.out.println("opção inválida");
                    break;
            }
        }
        System.out.println("Programa encerrado\n");
        scan.close();
    }
}