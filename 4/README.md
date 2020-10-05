# Quarta Etapa:

1.	Você notou a existência de duplicidade de código nas classes Aluno, ProfessorEfetivo e ProfessorSubstituto? Implemente uma solução para esse problema. Continue a leitura deste documento e apresente o diagrama de classes ao professor antes de qualquer codificação.

2.	A aplicação deverá prever uma forma de tratamento específica para os professores e alunos, dentre outros que possam ser incorporados ao sistema no futuro. Por enquanto considere essa funcionalidade apenas para os professores e alunos. A forma de tratamento deve levar em conta o sexo da pessoa. Algumas sugestões:

•	Para aluno: Prezado Aluno Jose da Silva, Prezada Aluna Joana da Silva. 
•	Para professores: Prof Efetivo José da Silva,  Profa Efetiva Joana da Silva, Prof Sub José da Silva,  Profa Sub Joana da Silva.

3.	Implementar o cálculo do salário de forma diferenciada para os professores: 

•	Para professor efetivo o salário é fixo baseado no regime de dedicação. Para cada regime de dedicação haverá um salário específico.
•	Para professor substituto o salário é calculado proporcionalmente ao valor da hora/aula e a quantidade de aulas ministradas mensalmente. 

4.	Apresente o diagrama de classe ao professor antes de continuar. 

5.	Crie uma classe de nome IdentificadorDePessoas que seja capaz de identificar os diferentes tipos de pessoas. Por exemplo: para uma determinada pessoa a funcionalidade proposta deve identificá-la como “Aluno” ou “Professor Efetivo” ou “Professor Substituto”, dentre outros tipos de pessoas que podem ser incorporadas ao sistema no futuro. Essa classe deve disponibilizar suas funcionalidades sem a necessidade de instanciar objetos.
