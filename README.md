# Trabalho Prático LPOO

O objetivo deste trabalho é implementar em linguagem de programação Java um sistema de combates de um jogo de RPG (Role Playing Game). Para isso, deve ser implementado a possibilidade de escolha entre três personagens principais, cada um possuindo armas e habilidades únicas.

# Personagens
Inicialmente, estarão presentes para escolha três tipos de personagens: Mago, Paladino e Clérigo. Todos possuem três status: saúde, força e destreza com pontos variando de 0.0 a 10.0. Quando os pontos de saúde de um personagem se tornam menor que 1.0, ele é declarado morto. Além disso, também são capazes de desferir ataques e se defender quando atacados.

# Armas
Cada personagem é capaz de carregar uma arma compatível com seu perfil, isto é: um Mago não pode carregar uma arma de um Paladino ou Clérigo (e vice-versa). Além disso, cada arma possui um modificador de força de ataque cujo valor varia de 0.0 a 1.0, ou seja: de 0 a 100%. A seguir, listamos as armas disponíveis para cada classe com os respectivos códigos de cada uma:

1  Mago:
  1. Magia da transmutação: reduz o cálcio dos ossos do oponente, deixando-os mais porosos. Modificador: 0.25.
  2. Psi-kappa: com o poder de telecinese, arremessa o oponente à distância. Modificador: 0.5.

2  Paladino:
  1. Espada: possui uma lamina afiada mas é frágil. Modificador: 0.3.
  2. Lança: Ataques em longa distância. Modificador: 0.5.

3  Clérigo:
  1. Martelo: apesar de pesado, é uma arma letal. Modificador: 0.6.
  2. Maça: por ser mais leve, é mais fácil de manusear. Modificador: 0.4.

# Batalha
Ao ser criado, o personagem deve receber o nome de seu tipo (“Mago”, “Paladino” ou “Clérigo”), o valor de seus status iniciais (saúde, força e destreza) e carregar uma arma compatível para usar (Arma de Mago, de Paladino ou de Clérigo). Essas invariantes devem ser definidas e validadas construtor das classes concretas dos personagens.

# Entrada
O programa deve receber como entrada as informações necessárias para criar dois personagens com seus pontos de saúde, força, destreza e arma carregada. Os códigos de cada personagem e respectiva arma foram listados na Armas. Logo após, são especificados os índices dos personagens que serão o atacante e o defensor.

Por exemplo, para criar dois personagens:

• Clérigo com 10 pontos de saúde, 6 de força, 4 de destreza com Martelo;
• Mago com 10 pontos de saúde, 5 de força, 6 de destreza com Magia da Transmutação;

Teríamos como entrada:

3 10 6 4 1
1 10 5 6 1

E seria impresso:

Clérigo [Saude: 10.0, Forca: 6.0, Destreza: 4.0, Martelo]
Mago [Saude: 10.0, Forca: 5.0, Destreza: 6.0, Magia da Transmutação]

A seguir, o programa esperaria como entrada a sequencia de ataques. A sequencia de ataques deve ser informada com dois números: o primeiro número do personagem atacante e o segundo número do personagem defensor.

Por exemplo, para informar o ataque do Clérigo contra o Mago, a entrada seria:

1 2

Para informar o fim da batalha, a entrada deve ser informada com o número zero.
