# Decorator

## Problema
Imagine que surgiu uma demanda para construção multi-plataforma de notificação, que deverá e poderá ser extensível, sendo que, inicialmente iríamos precisar implementar apenas para Facebook, WhatsApp e Slack, como poderíamos implementar dentro do Sistema além de notificar para cada um dos end-points a possibilidade de multiplas combinações como Facebook e Slack ou Slack e WhatsApp?

A princípio poderíamos pegar o método `Notificacao` e criamos algumas heranças para cada uma das plataformas, porém, teríamos que lidar com um problema.

    Heranças são estáticas, não é possível criá-las de maneira dinâmica, ou seja, teríamos que possuir uma classe para CADA COMBINAÇÃO DE REDES, além das específicas, o que traria um trabalhos posterior que cresceria exponencialmente a medida que fossem adicionadas novas rotas de notificação.

## Estrutura
Dentro 