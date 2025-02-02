package com.example.tratamentoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    // Operações Básicas
    @GetMapping("/adicionar")
    public double adicionar(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.adicionar(a, b);
    }

    @GetMapping("/subtrair")
    public double subtrair(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.subtrairValores(a, b);
    }

    @GetMapping("/multiplicar")
    public double multiplicar(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.multiplicarValores(a, b);
    }

    @GetMapping("/dividir")
    public double dividir(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.dividirValores(a, b);
    }

    // Operações Avançadas
    @GetMapping("/raiz")
    public double raiz(@RequestParam double a) {
        return calculadoraService.calcularRaiz(a);
    }

    @GetMapping("/potencia")
    public double potencia(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.calcularPotencia(a, b);
    }

    @GetMapping("/inverso")
    public double inverso(@RequestParam double a) {
        return calculadoraService.calcularInverso(a);
    }

    @GetMapping("/modulo")
    public double modulo(@RequestParam double a, @RequestParam double b) {
        return calculadoraService.calcularModulo(a, b);
    }

    @GetMapping("/fatorial")
    public double fatorial(@RequestParam int n) {
        return calculadoraService.calcularFatorial(n);
    }

    @GetMapping("/media")
    public double media(@RequestParam double a, @RequestParam double b, @RequestParam double c,
                         @RequestParam double d, @RequestParam double e) {
        return calculadoraService.calcularMedia(a, b, c, d, e);
    }

    @GetMapping("/mediana")
    public double mediana(@RequestParam double a, @RequestParam double b, @RequestParam double c,
                           @RequestParam double d, @RequestParam double e) {
        return calculadoraService.calcularMediana(a, b, c, d, e);
    }
}
