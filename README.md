<h1>Projeto Z</h1> 

<p align="center">
  <img src="![Badge em Desenvolvimento](http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge)"/>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="http://img.shields.io/static/v1?label=License&message=MIT&color=green&style=for-the-badge"/>
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>
  <img src="https://img.shields.io/badge/Visual_Studio-5C2D91?style=for-the-badge&logo=visual%20studio&logoColor=white"/>
  <img src="https://badgen.net/badge/ifmg/OuroBranco/green?icon=github"/>
   <img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=RED&style=for-the-badge"/>

</p>


> Status do Projeto: :warning:em desenvolvimento

### Tópicos 

:small_blue_diamond: [Descrição do projeto](#descrição-do-projeto)

:small_blue_diamond: [Diagrama de Classe UML](#diagrama-de-classe-uml)

:small_blue_diamond: [Casos de uso](#casos-de-uso)

:small_blue_diamond: [Diagrama de Casos de uso](#diagrama-de-casos-de-uso)

:small_blue_diamond: [Mapa do Jogo](#mapa-do-jogo)

:small_blue_diamond: [Funcionalidades](#funcionalidades)

:small_blue_diamond: [Deploy da Aplicação](#deploy-da-aplicação-dash)

:small_blue_diamond: [Pré-requisitos](#pré-requisitos)

:small_blue_diamond: [Como rodar a aplicação](#como-rodar-a-aplicação-arrow_forward)

:small_blue_diamond: [Documentação do Código (Javadoc)](#documentação-do-código-(javadoc))

:small_blue_diamond: [Desenvolvedores](#desenvolvedores)




## Descrição do projeto 

<p align="justify">
  Projeto para a disciplina de Engenharia de Software 1. Pequeno jogo baseado no Zelda. O usuário controla um personagem, "Z", todas as demais letras foram raptadas pelos números e Z precisa salvá-las.

  Está sendo utilizada a metodologia SCRUM, na qual os integrantes do grupo estão se desenvolvendo aprendendo mais sobre a mesma, processos ágeis no geral e melhorando o uso do GIThub. 
</p>

## Diagrama de Classe UML
> Link do diagrama da aplicação: https://app.diagrams.net/#G1QgTXF90ZC4XZ5YDw2THYPQspvuOMdrB5
![image](https://github.com/joaocolem/ProjetoZ/assets/105292741/d3444b94-a372-45fe-9f32-f6a8930249c6)

## Casos de Uso

<pre>
Caso de uso: Inserir Nickname
Ator: Usuário
Pré-condição: 
Fluxo normal: 	1. abrir o jogo a partir do menu principal
		2. preencher todos os campos
Fluxos alternativos: 1. Menu secundário e selecionar alterar Nickname
Pós-condição: Nickname atualizado

Caso de uso: Novo jogo
Ator: Usuário
Pré-condição: inserir Nickname
Fluxo normal: 	1. selecionar início de novo jogo		
Fluxos alternativos:	
Pós-condição: Jogo iniciado

Caso de uso: Movimentar personagem
Ator: Usuário
Pré-condição: jogo iniciado
Fluxo normal: 	1. mover com teclas WASD
Fluxos alternativos:	
Pós-condição: personagem movimentado

Caso de uso: Abrir inventário
Ator: Usuário
Pré-condição: jogo iniciado
Fluxo normal: 	1. Pressionar a letra “i”
Fluxos alternativos:	
Pós-condição: mostra o inventário

Caso de uso: Mini-Jogos
Ator: Usuário
Pré-condição: jogo iniciado
Fluxo normal: 	1. Movimentar personagem
		2. Coletar caractere de mini-jogo
Fluxos alternativos:	
Pós-condição: Liberar passagem

</pre>

## Diagrama de Casos de Uso
![diagrama de casosuso](https://github.com/joaocolem/ProjetoZ/assets/105292741/7a0af61f-b57c-4bb3-ac6e-50b512bc407e)
> Link do diagrama de casos de uso:

## Mapa do Jogo
<p align="justify">
  Para melhor entendimento do jogo, foi criado um diagrama que tem como objetivo auxiliar no entedimento dos mapas e sua implementação no jogo. Bem como eventuais expansões.
</p>
![mapa casa](https://github.com/joaocolem/ProjetoZ/assets/105292741/cc0fbcba-804c-4e42-92d4-ac58b17304f6)

Link do mapa do jogo: https://app.diagrams.net/#G187Zbbof69xN_FN1lA6_XiZGg2dCV0A2H

## Funcionalidades

:heavy_check_mark: Explorar mundos  

:heavy_check_mark: Realizar puzzles

:warning: Personalizar personagem

:warning: Interagir com ambiente 

:warning: Interagir com outros personagens  

## Layout ou Deploy da Aplicação :dash:


<div align="center">
<img src="https://github.com/joaocolem/ProjetoZ/blob/Gustavo-Branch/sshot/Captura%20de%20tela%202023-06-26%20125518.png?raw=true" width="300px" />
<img src="https://github.com/joaocolem/ProjetoZ/assets/105292741/a861faf7-8a21-4999-b8a9-920a92106cce" width="300px" />
</div>



## Pré-requisitos

:warning: [Node](https://nodejs.org/en/download/)


Liste todas as dependencias e libs que o usuário deve ter instalado na máquina antes de rodar a aplicação 

## Como rodar a aplicação :arrow_forward:

No terminal, clone o projeto: 

git clone https://github.com/joaocolem/ProjetoZ.git


Coloque um passo a passo para rodar a sua aplicação. **Dica: clone o próprio projeto e verfique se o passo a passo funciona**

## Documentação do Código (Javadoc)
> Link do Javadoc: 

## Resolvendo Problemas :exclamation:

Em [issues]() foram abertos alguns problemas gerados durante o desenvolvimento desse projeto e como foram resolvidos. 

## Tarefas em aberto


:memo: Implementar Cores

:memo: Música durante o jogo

:memo: NPCs em movimento

## Desenvolvedores:octocat:

| [<img src="https://avatars.githubusercontent.com/u/105292741?v=4" width=115><br><sub>João Colem</sub>](https://github.com/joaocolem) |  [<img src="https://avatars.githubusercontent.com/u/79370990?v=4" width=115><br><sub>Gustavo Lima</sub>](https://github.com/hgustavo98) |  [<img src="https://avatars.githubusercontent.com/u/130676497?v=4" width=115><br><sub>João Paulo</sub>](https://github.com/dezumiude) | 
| :---: | :---: | :---: 
[<img src="https://avatars.githubusercontent.com/u/134110807?v=4" width=115><br><sub>Danilo</sub>](https://github.com/danilohenriki) |  [<img src="https://avatars.githubusercontent.com/u/102836495?v=4" width=115><br><sub>Lucas da Costa</sub>](https://github.com/DreaMagici4n) |  [<img src="https://avatars.githubusercontent.com/u/134005292?v=4" width=115><br><sub>Filipe Borges</sub>](https://github.com/FilipeBrges)|| 
| :---: | :---: | :---: 
| [<img src="https://avatars.githubusercontent.com/u/85462812?v=4" width=115><br><sub>Hudwesley Morais</sub>](https://github.com/hudwesley) | [<img src="https://avatars.githubusercontent.com/u/93010166?v=4" width=115><br><sub>Vitor Franco</sub>](https://github.com/vfranco00)


## Licença 

The [MIT License]() (MIT)

Copyright :copyright: 2023 - ProjetoZ
