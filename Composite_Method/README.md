# Composite Method
Markdown

### Classification: 
Estrutural de objetos

### Subject:
Estrutura de árvore, Hierarquias parte-todo

### Descrição:
Compor objetos em estruturas de árvore para representarem hierarquias parte-todo. Composite permite aos clientes tratarem de maneira uniforme objetos individuais e composições de objetos.

### Motivação:

Em alguns sistemas, como por exemplo, aplicações gráficas tais como editores de desenhos e sistemas de captura esquemáticas, permitem aos usuários construir diagramas complexos a partir de componenetes simples. O usuário pode agrupar componentes para formar componentes maiores, os quais, por sua vez, podem ser agrupados para formar componentes ainda maiores. Uma implementação simples poderia definir classes que funcionam como recepientes para essas primitivas. Porém, há um problema com essa abordagem: o código que usa essas classes deve tratar objetos primitivos e objetos recepientes de modo diferente, mesmo se na maior parte do tempo o usuário os trata de forma idêntica. Ter que distinguir entre esses objetos torna a aplicação mais complexa. O padrão Composite descreve como usar a composição recursiva de maneira que os clientes não tenham que fazer essa distinção.
A chave para o padrão Composite é uma classe abstrata que representa tanto as primitivas como os seus recepientes.

### Aplicabilidade
O framework compilador RTL Smalltalk usa o padão Composite extensamente.
A RTL Expression é uma classe Component para árvores de análise.
Esse padrão ocorre no domínio financeiro, em que um portifólio agrega atrativos individuais. Pode-se suportar agregações complexas de atrativos implementando um porifólio como um Composite compatível com a interface de um atrativo individual.

### Participantes
Aluno e Turma

Classe Aluno contem nome e matricula e interage com a classe turma.
Classe Turma contem aluno(s) e interage com Classe aluno adcionando ou removendo aluno.

### Consequências

Define hierarquias de classe que consistem de objetos primitivos e objetos compostos. Os objetos primitivos podem compor objetos mais complexos, os quais, por sua vez, também podem compor outros objetos, e assim por diante, recursivamente
Com Composite, não se pode confiar no sistema de tipos para garantir a obediência a essas restrições. Ao invês disso, verificações tem que ser usadas e testes em tempo de execução.

 ## Código de Exemplo - Adicionar alunos em uma determinada escola.
 #### Diretório:
 -Academic-Works/Composite_Method/src/
 
