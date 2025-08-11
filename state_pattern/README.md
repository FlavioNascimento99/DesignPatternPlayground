# State

---

_Mudando comportamento de um Objeto alterando seu estado ou propriedades internas._

---


---
1. Primeiramente temos a criação de uma `interface State`, comum entre os Objetos modificadores de Estado.
2. Temos dois exemplos de Classe com esse poder modificador, ambos possui o método do contrário definido à sua maneira.
3. A `class Light` é o alvo de mudança de estado e isso ocorre por meio de DI, objeto privado`currentState`, que é utilizado como parâmetro no método modificador `setCurrentState()`;
4. O método assinado `execute()` é utilizado apenas para redirecionar à `action()`.
