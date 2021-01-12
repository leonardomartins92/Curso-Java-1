# Segunda Etapa:

1.	Crie uma classe de nome Avaliacao. Defina os seguintes atributos: descrição da avaliação e valor da avaliação. Implemente um construtor para inicializar todos os seus atributos e  sobrescreva o método toString.

2.	Crie uma classe de nome Disciplina. Defina os seguintes atributos: descrição e lista de avaliações da disciplina. Essa lista deve ser composta de várias avaliações. Implemente um construtor para inicializar todos os seus atributos e  sobrescreva o método toString.

3.	Acrescente na classe Aluno um atributo de nome historicoDisciplinas. Esse atributo deve ser composto de várias disciplinas. 

4.	Adicione um atributo de nome matricula na classe Aluno. A matricula deve ser um número inteiro gerado automaticamente pelo sistema, único, sequencial e iniciando em 1. Quando houver mudança de ano este número sequencial deve ser reiniciado em 1, exemplo: 2019-1, 2019-2, 2019-3,... , 2020-1, 2020-2, ...

5.	Adicione um atributo na classe Disciplina capaz de armazenar o número identificador. Seu conteúdo deve ser gerado automaticamente, sugestão: D1, D2, D3, ...

6.	Adicione um atributo na classe Avaliacao capaz de armazenar o número identificador. Seu conteúdo deve ser gerado automaticamente, sugestão: A1, A2, A3, ...

7.	Acrescentar na classe ProfessorSubstituto um atributo responsável por armazenar o valor da aula/hora do professor. Esse atributo é exclusivo para o professor substituto e compartilhado por todos os professores substitutos.

8.	Crie uma classe de nome Regime. Essa classe representa os diversos regimes de dedicação que os professores efetivos estarão submetidos. Defina os seguintes atributos: descrição (pode ser dedicação exclusiva, 40horas, 20horas, dentre outros) e salário.

9.	Altere o tipo do atributo regime da classe ProfessorEfetivo. Agora deve ser do tipo Regime.
 
10.	Disponibilize na classe Disciplina um método responsável por calcular a média aritmética das pontuações obtidas em uma determinada disciplina. 

11.	Disponibilize na classe Aluno um método responsável por calcular o índice de rendimento acadêmico (IRA) para um determinado aluno. O IRA deve ser a média aritmética das pontuações obtidas em todo as disciplinas cursadas. 

