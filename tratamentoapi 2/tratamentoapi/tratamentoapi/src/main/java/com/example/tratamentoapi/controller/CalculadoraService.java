package com.example.tratamentoapi.controller;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CalculadoraService {

    // Operações Básicas
    public double adicionar(double a, double b) {
        return a + b;
    }

    public double subtrairValores(double a, double b) {
        return a - b;
    }

    public double multiplicarValores(double a, double b) {
        return a * b;
    }

    public double dividirValores(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return a / b;
    }

    // Operações Avançadas
    public double calcularRaiz(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não é permitida.");
        }
        return Math.sqrt(a);
    }

    public double calcularPotencia(double a, double b) {
        return Math.pow(a, b);
    }

    public double calcularInverso(double a) {
        if (a == 0) {
            throw new ArithmeticException("Não é possível calcular o inverso de 0.");
        }
        return 1 / a;
    }

    public double calcularModulo(double a, double b) {
        return a % b;
    }

    public double calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fatorial de número negativo não existe.");
        }
        return (n == 0 || n == 1) ? 1 : n * calcularFatorial(n - 1);
    }

    public double calcularMedia(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }

    public double calcularMediana(double a, double b, double c, double d, double e) {
        double[] valores = {a, b, c, d, e};
        Arrays.sort(valores);  // Ordena os valores
        return valores[2];     // Retorna o valor do meio
    }
}
