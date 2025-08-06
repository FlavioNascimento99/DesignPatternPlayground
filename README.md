# DesignPatternPlayground


## Conceitos Essenciais 
1. Herança
    Permite que uma sub-classe herde atributos e métodos de outra classe, trazendo a possibilidade de reaproveitamento de código, criando assim uma relação de especialista por parte do filho para seu pai.
    
    Exemplo: `Veiculo` teria `Bicicleta` ou `Carro` como seus Herdeiros ou Especialista, por carregarem consigo características específicas dentro de si.

2. Encapsulamento
    Tem como principal característica trazer proteção para determinados dados, impedindo que o seu uso possa ser feito de qualquer maneira, expondo assim, apenas o necesário para ser trabalhado em determinados escopos.

3. Polimorfismo
    Traz a ideia de que uma mesma ação possa ser executada por _N_ sub-classes porém, tendo como resultado, diferentes retornos para cada caso.
    
    Exemplo: Imagine em uma `class Animal` um método `emitirSom()`, em `class Dog extends Animal` o mesmo método seria algo como "Au! Au!", enquanto que em `class Cat extends Animal` o retorno seria "Miau!".

4. Composição
    É criada uma relação de forte entre uma Classe e sua Sub-Classe onde não seria permitido uma classe filha existir sem seu pai, este que por sua vez, seria responsável por gerenciar seus comportamentos, criar e destruí-lo.

5. Agregação
    Por sua vez, existe uma relação mais fraca onde as sub-classes possuem auto-suficiência em relação à seus pais, nesta relação existe apenas referência de quem é pai/filho de quem.

    Exemplo: Um `Funcionario` possui em seu registro um `Setor`, mas não deixaria de existir sem um, podendo por conta própria cuidar de seus comportamento, como até mudar as propriedades de referência (Como mudar o próprio Setor).