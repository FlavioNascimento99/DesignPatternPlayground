# Padrão Proxy
`@FlavioNascimento99`

#### Introdução
Padrão Proxy é bem simples, se trata de um Objeto que será intermediador para acesso à outro. Interessante de se implementar em determinados cenários para controle de Segurança, Cache ou _Lazy Loadings_

```
Lazy Loadings ou Carregamento tardio/preguiçoso é geralmente visto como alternativas para lidar com tarefas de busca de dados em larga escala que possa causar problemas de perfomance.
```
#### Visual	
[Client] ----> [Proxy Class] ----> [Main Object]


#### Ideia do Código
Apresentação simulada do padrão Proxy dentro de um "Sistema de Gerenciamento de Arquivos de Imagem" que poderia possuir problemas de latência.

#### Camadas de Código
1. Interface Imagem 	- Criada com o objetivo de termos um controle de tipagem dentro do nosso contexto, é utilizada entre todas os personagens do código.
2. Classe ImagemReal	- É o protagonista da aplicação, é o Objeto que não deve ser alcansável pelo client (Main.java) seja lá o motivo.
3. Classe ImagemProxy	- É o trabalhador, ele será o intermédio entre Client e a Classe principal do código, tem como objetivo trabalhar, aqui, na criação de um Objeto exatamente igual à ImagemReal.

#### Explicação de ImagemProxy:
Temos uma classe concreta que implementa, assim como a que ela sobrepõe, a interface _Imagem_ . Dentro dela temos uma injeção de dependência da _ImagemReal_ e uma invocação de variável do tipo String. Observável o construtor que assim como _ImagemReal_ pede um parâmetro do tipo String. E finalmente, criamos o método do contrato de Interface, onde verifica se _ImagemReal_ existe dentro do contexto de execução (No caso, dentro da memória do Computador), se não, cria uma ImagemReal, se sim, apenas executa seu método da Interface implementada.

- Note que, dentro de Main, temos duas chamadas de exibir, exatamente com o objetivo de entrarmos em ambas condicionais.