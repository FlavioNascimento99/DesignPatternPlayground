# Proxy
### Descrição
_Se trata de um intermediário para acesso à um Objeto Real._

### Onde é utilizado


### Como funciona?
1. Primeiramente é visível uma `Interface` compartilhada entre a `Objeto Alvo` e o `Objeto Proxy`.
2. Dentro da `Objeto Alvo` temos além da implementação, o construtor que pede uma String como representação de um documento.
3. Já na `Objeto Proxy` é notório alguns pontos;
   1. Temos uma injeção de dependência do `Objeto Alvo` e do parâmetro que o mesmo necessita para instanciação.
   2. `Objeto Proxy` possui um construtor semelhante ao `Objeto Alvo`, essa é a ideia do mesmo, replicar parte do ciclo de vida do Objeto alvo, adicionando ou removendo determinados comportamentos.
   3. Além do construtor, também teremos o método do contrato com a `interface Image`, que possui uma lógica simples para verificação existencial do `Objeto Alvo` no contexto de execução (que no nosso caso será em um simples Client "`Main.java`"); 
4. Dentro do `Main.java` temos a aplicação simplificada do código, onde instanciamos indiretamente, por meio do `Proxy`, o `Objeto Alvo`, quando às duas invocações feitas, será notável retornos distintos (Algo como "_Loading picture.jpg_" e em seguida "_Showing image._")