# Chain of Responsibility Pattern

#### Introdução
_"Passa uma solicitação por uma corrente de manipuladores."_
Evita acoplamento entre remetente e receptor, decidindo se processa solicitação ou passa à diante.

#### 

1. `abstract class Support` é a classe responsável por possuir a lógica da _Chain_;
2. Por meio de __Injeção de Dependência__, ele guarda uma _referência para o próximo Objeto_ (Note que as camadas da _Chain_ possuem o mesmo tipo Abstrato `Support`, logo, todos são comunicáveis entre si);
3. O método `Support.setNext(Support next)` define qual será o próximo Objeto de __tipagem semelhante__ da Chain;
4. O método `Support.dealWith(int level)` é um método condicional(para "Controle de nível de complexidade") que dirá se o Objeto da Chain será ou não capaz de lidar com o objeto trabalhado em questão;
5. A `class SupportBasic extends Support` é responsável por tratar, desde que, o nível de complexidade seja igual ou menor que 1, caso contrário, seguiremos para o próximo objeto de tratamento da cadeia.

   a. Existe um `else if (next != null)` para garantirmos que existe de fato um objeto em sequência na cadeia, caso contrário, se não existisse essa checagem e o objeto seguinte, tomaríamos um `NullPointerException` já que o objeto referenciado não existe.

6. Assim como no caso anterior, temos agora o `SupportAdvanced` que por sua vez irá trabalhar com um nível de complexidade superior onde caso não consiga, irá trazer uma referência à um outro Objeto.

   a. Como não existe um nível superior à este, o retorno ao executarmos o `Main.java` será vazio.