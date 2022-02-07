public class Correio {

    public static String formula = "distanciaDeEntrega * peso * 0.1 ";

    public static double calcularFrete(double peso, double distanciaDeEntrega) {
        String expressao;
        expressao = formula.replace("peso", Double.toString(peso));
        expressao = expressao.replace("distanciaDeEntrega", Double.toString(distanciaDeEntrega));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
