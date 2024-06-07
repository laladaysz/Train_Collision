public class Funcoes {
    public static double equacao_Do_Trem(double posicao_Inicial, double velocidade, double tempo){
        return posicao_Inicial + (velocidade *tempo);
    }
    public static  double equacao_De_Tempo(double posicao_Inicial_A,double posicao_Inicial_B, double velocidade_A,double velocidade_B){
        return (posicao_Inicial_A - posicao_Inicial_B)/(velocidade_B - velocidade_A);
    }
    public static double segundos(double horas){
        horas = horas *60;
        double segundos = horas *60;

        return segundos;
    }
}
