# 🛒 Calculadora de Descontos - Padrão Strategy

Este é um projeto desenvolvido como desafio final para consolidar os conhecimentos em **Padrões de Projeto (Design Patterns)** na trilha de Java da DIO. O objetivo principal foi implementar uma solução limpa e escalável utilizando **Java Puro**.

## 🎯 O Objetivo

A proposta do projeto é criar um sistema simples de cálculo de descontos para uma loja. Em vez de utilizar múltiplas estruturas condicionais (`if/else` ou `switch/case`) para verificar o tipo de cliente e aplicar o desconto correspondente, a arquitetura foi desenhada utilizando o **Padrão Strategy**.

Isso permite que a regra de negócio fique isolada, facilitando a manutenção e a adição de novos tipos de descontos no futuro sem alterar o código existente (respeitando o princípio Open/Closed do SOLID).

## 🛠️ Tecnologias Utilizadas

* **Java** (Puro)
* **IDE:** IntelliJ IDEA
* **Paradigma:** Orientação a Objetos

## 🧠 Entendendo a Estrutura (Strategy)

O padrão Strategy foi implementado através de três componentes principais:

1. **A Estratégia (Interface `Desconto`):** Define o contrato de que todo desconto precisa ter um método `aplicar(double valor)`.
2. **As Implementações Concretas:** * `DescontoVIP`: Aplica 20% de desconto.
   * `DescontoNovoCliente`: Aplica 5% de desconto.
3. **O Contexto (`Calculadora`):** Recebe o valor da compra e a estratégia de desconto escolhida, executando o cálculo sem precisar saber os detalhes da matemática por trás.

## 🚀 Como Executar

1. Faça o clone deste repositório:
   ```bash
   git clone https://github.com/leticiabrilhante/desafio-dio-java.git
