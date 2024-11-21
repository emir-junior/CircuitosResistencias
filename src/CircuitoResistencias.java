import java.util.Scanner;

public class CircuitoResistencias {
    private double[] resistencias;

    public CircuitoResistencias(double[] resistencias) {
        this.resistencias = resistencias;
    }

    public double calcularResistenciaEquivalente() {
        double resistenciaEquivalente = 0;
        for (double resistencia : resistencias) {
            resistenciaEquivalente += resistencia;
        }
        return resistenciaEquivalente;
    }

    public double encontrarMaiorResistencia() {
        double maior = resistencias[0];
        for (double resistencia : resistencias) {
            if (resistencia > maior) {
                maior = resistencia;
            }
        }
        return maior;
    }

    public double encontrarMenorResistencia() {
        double menor = resistencias[0];
        for (double resistencia : resistencias) {
            if (resistencia < menor) {
                menor = resistencia;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resistencias = new double[4];

        for (int i = 0; i < resistencias.length; i++) {
            System.out.print("Digite o valor da resistência " + (i + 1) + ": ");
            resistencias[i] = scanner.nextDouble();
        }

        CircuitoResistencias circuito = new CircuitoResistencias(resistencias);

        System.out.println("Resistência Equivalente: " + circuito.calcularResistenciaEquivalente());
        System.out.println("Maior Resistência: " + circuito.encontrarMaiorResistencia());
        System.out.println("Menor Resistência: " + circuito.encontrarMenorResistencia());

        scanner.close();
    }
}
