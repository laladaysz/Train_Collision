import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double soA,soB,vA,vB,tempo,equacao,segundos;
        int reinicio;

        System.out.println("|=*=*=*=*BEM-VINDO=*=*=*=*=*|");
        System.out.println("Digite sua escolha: \n1- Sim \n2- Não");
        int escolha = sc.nextInt();
        if (escolha == 1) {
            while (true) {
                while (true){
                    try {
                        System.out.println("Digite a posição inicial do tremA:");
                        soA = sc.nextDouble();
                        if (soA> 10000 || soA < -1){
                            System.err.println("!!!!!Valor Incoreto!!!!");
                            continue;
                        }
                        break;
                    }catch (InputMismatchException e ){
                        System.err.println("Informe um numero valido");
                    }

                }
                while (true){
                    try {
                        System.out.println("Digite a posição inicial do tremB:");
                        soB = sc.nextDouble();
                        if (soB> 10000 || soA < -1 || soB < soA){
                            System.err.println("!!!!!Valor Incoreto!!!!");
                            continue;
                        }
                        break;
                    }catch (InputMismatchException e ){
                        System.err.println("erro");
                    }

                }
                while (true){
                    try {
                        System.out.println("Digite a velocidade do tremA:");
                        vA = sc.nextDouble();
                        if (vA>300  ||  vA<-1){
                            System.err.println("!!!!!Valor Incoreto!!!!");
                            continue;
                        }

                        break;

                    }catch (InputMismatchException e ){
                        System.err.println("Valor incorreto");
                    }
                }
                while (true){
                    try{
                        System.out.println("Digite a velocidade do tremB:");
                        vB = sc.nextDouble();
                        if (vB > -1 ||  vB< -300){
                            System.out.println("!!!!!Valor Incoreto!!!!");
                            continue;
                        }
                        if (vA == 0 && vB == 0){
                            System.out.println("OS TRENS NÃO IRAM SE BATER :(");
                        }
                        break;

                    }catch (InputMismatchException e){
                        System.out.println("!!!!Valor Invalido!!!");
                    }
                }
                while (true){
                    try {
                        tempo = Funcoes.equacao_De_Tempo(soA,soB,vA,vB);
                        equacao = Funcoes.equacao_Do_Trem(soA,vA,tempo);
                        segundos = Funcoes.segundos(tempo);

                        System.out.println(tempo);
                        System.out.println(equacao);

                        System.out.printf("A colisao de trens acontecerá no KM %f.0 e ocorrerá após %f.0 segundos no horario de %f.0 \n",equacao,segundos,tempo);
                        System.out.println();

                        System.out.println("Jogar Novamente? \n1- Sim \n2- Não");
                        reinicio = sc.nextInt();

                        if (reinicio == 1) {
                            break;
                        }
                        return;
                    }catch (InputMismatchException e){
                        System.out.println("Valor invalido");
                    }

                }

            }
        }
    }
}


