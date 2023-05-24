import java.util.Scanner;

public class ex04_agendaMensal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] compromissos = new String[31][24];
        String agenda = "";
        int mes = 5;  // mes fixo determinado
        int dia = 0;
        int hora = 0;
        boolean valido = true;
        boolean continua = true;

        while (continua) {
            System.out.println("\nMENU DE OPÇÕES - COMPROMISSOS:");
            System.out.println("1 - Inserir compromissos");
            System.out.println("2 - procurar compromissos");
            System.out.println("3 - Encerrar Agenda");

            switch (scan.nextInt()) {
                case 1: // Insersão de compromissos

                    valido = true;
                    while (valido) {

                        System.out.print("\nQual dia: ");
                        dia = scan.nextInt();

                        if (dia < 1 || dia > 30) {
                            System.out.println("Dia inválido, digite novamente:");
                        } else {

                            valido = true;
                            while (valido) {
                                System.out.print("Que horas: ");
                                hora = scan.nextInt();

                                if (hora < 0 || hora > 23) {
                                    System.out.println("Hora inválida, digite novamente:");
                                } else {
                                    agenda += dia + "/" + mes + "/23 às " + hora + "h ";
                                    System.out.println("Insira seu compromisso para o dia " + agenda);
                                    compromissos[dia][hora] = scan.next();
                                    agenda += compromissos[dia][hora];
                                    System.out.println("\n------> " + agenda + "\n\n");
                                    agenda = "";
                                    valido = false;
                                }
                            }
                        }
                    }
                    break;

                case 2:  // procura de compromissos

                    valido = true;
                    while (valido) {

                        System.out.print("\nQual dia: ");
                        dia = scan.nextInt();

                        if (dia < 1 || dia > 30) {
                            System.out.println("Dia inválido, digite novamente:");
                        } else {

                            while (valido) {
                                System.out.print("Que horas: ");
                                hora = scan.nextInt();

                                if (hora < 0 || hora > 23) {
                                    System.out.println("Hora inválida, digite novamente:");
                                } else {
                                    agenda = dia + "/" + mes + "/23 às " + hora + "h: " + compromissos[dia][hora];
                                    System.out.println("\n------> " + agenda + "\n\n");
                                    agenda = "";
                                    valido = false;
                                }
                            }
                        }

                    }
                    break;

                case 3:  // encerra Agenda
                    continua = false;
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