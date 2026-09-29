# Relatório sobre implementação de comunicação entre tarefas em FIXME

## Introdução

Este relato faz parte do processo avaliativo da disciplina de sistemas operacionas no curso superior em análise e desenvolvimento de sistemas, ofertado na Diretoria acadêmica de gestão e tecnologia da informação no campus natal-central do instituto federal de educação, ciência e tecnologia do rio grande do norte.

Tem como objetivo principal relatar as implementações de comunicação entre tarefas na linguagem FIXME.

O grupo de trabalho foi formado por FIXME.

## Comunicação entre tarefas em FIXME

### Informações gerais

FIXME
> qual o objetivo de comunicação entre tarefas? 

FIXME
> explicar porque usar docker nesse trabalho.
> qual a configuração do docker?

### Comunicação entre tarefas com linhas de execução no mesmo processo

FIXME
> texto explicando o código
> mostrar o código completo

FIXME
> explicar como foi executado
> mostrar as saídas do terminal
> mostrar as saídas do terminal

FIXME
> se houve problema na execução, enumerar os problemas e suas respectivas soluções

### Comunicação entre tarefas em processos diferentes no mesmo computador

FIXME
> texto explicando o código
> mostrar o código completo

FIXME
> explicar como foi executado
> mostrar as saídas do terminal
> mostrar as saídas do terminal

FIXME
> se houve problema na execução, enumerar os problemas e suas respectivas soluções

### Comunicação entre tarefas em processos diferentes em computadores diferentes

Ex-1:
> A primeira linha desse código permite que o program faço o importe de uma classe do pacote nativo que gera números aleatórios.
> Após isso é criada a função "produziDados" que indica o retorno de uma lista de números inteiros.

> <img width="302" height="47" alt="image" src="https://github.com/user-attachments/assets/b2df1b85-d802-4012-9f4d-2cd46574fb20" />

> Temos, então, o bloco dentro das chaves é executado 100 vezes (uma para cada elemento da lista). A cada repetição, Random.nextInt(0, 111) gera um inteiro aleatório no intervalo de 0 a 110 (o limite 111 é exclusivo).
> Após isso, temos a função "consumirDados" que realiza uma operação de soma de todos os valores recebidos na lista e gera o resultado.

> <img width="257" height="47" alt="image" src="https://github.com/user-attachments/assets/f915aae2-9f29-464f-8355-4a33d24cbafa" />

> Logo após temos a principal função definida como "principal", essa função realiza a chamada da produção de dados e atirbui a lista a variavel "dados" após isso faz a chamada para afunçaõ seguinte que a realiza a operação já mencionada.


Ex-2:
> A linha 1 e 2 são importes para ferramentas que vamos usar no código, a primeira serve para as corotinas em kotlin e a segunda é uma classe de geração de número aleatório que usaremos na lista que iremos criar:

> <img width="262" height="45" alt="image" src="https://github.com/user-attachments/assets/84c24927-00ea-4b37-ad87-aa2f9c966427" />

> Após isso é criada a variável que irá guardar a lista de números, em seguida definimos uma função para que os valores da lista gerados sejam armazenados na variavel, com respectivos "printl" para indicar o processo sendo realizado.
> Após isso, criamos outra função "consumirDados" que iremos usar para realizar operações, no caso do exemplo a soma de todos os números da lista que foi criada e armazenada.

> <img width="226" height="31" alt="image" src="https://github.com/user-attachments/assets/6fe62279-245a-405f-9137-e030389ca7d0" />

> Por fim, há a função principal "main" que usa o runBlocking. O runBlocking bloqueia a thread principal até que todas as corrotinas criadas dentro do seu bloco terminem de executar. Dentro dele temos as execuções e chamadas das funções anteriores também.

Ex-3:
>

 
> Ex-1 código:
> <img width="327" height="627" alt="image" src="https://github.com/user-attachments/assets/bafc0802-9900-495f-808c-2e0f36bfea12" />

> Ex-2 código:
> <img width="607" height="827" alt="image" src="https://github.com/user-attachments/assets/4ec92b3e-38b6-4894-950b-76cbed5d980e" />

> Ex-3 código:





FIXME
> explicar como foi executado
> mostrar as saídas do terminal
> mostrar as saídas do terminal

FIXME
> se houve problema na execução, enumerar os problemas e suas respectivas soluções

## Considerações finais

FIXME
> conseguiu implementar tudo e executar?
> qual foi o aprendizado nesse trabalho?
> alguma recomendação para próximos alunos?
