# Chain of Responsibility

---
_Imagine passar uma solicitação por uma corrente de manipuladores que trabalharão com a mesma ou passarão para o próximo da corrente._

---



---
1. Temos uma `abstract class Support` com a lógica a ser extendida às classes da _Chain_.
    - Criamos uma propriedade do tipo `Support`, para Injeção de Dependência.
    - Temos um método `setNext()` para chamar próxima classe da _Chain_.
    - E outro, `dealWith()` para trabalhar a solicitação dentro da _Chain_.
2. Temos três extensões de `abstract Support`, sendo estas em, `SupportBasic`, `SupportAdvanced` e `SupportFinal`.
3. As extensões da abstração deverão ter acesso ao método, também abstrato, `dealWith()`.
   - Sabendo disso, note que as classes que extendem `Support` também possuem `dealWith()`, que é responsável por, baseado em `level`, tratar ou passar para o próximo objeto da _Chain_.

No `Client` temos a instanciação de um Objeto do tipo SupportBasic e SupportAdvanced.
1. Definimos em `basic`, qual será o Objeto subsequente (`advanced`) assim como em `advanced` com (`finalize`).
2. A sequência de `dealWith()` trará os três tipos de Objeto ao serem invocadas.
    