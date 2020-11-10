# Memento
O Memento é um padrão de projeto comportamental que permite tirar um “retrato” do estado de um objeto e restaurá-lo no futuro. O Memento não compromete a estrutura interna do objeto com o qual trabalha, nem os dados mantidos dentro dos retratos.

## • Intenção
– Sem violar o encapsulamento, capturar e externalizar
o estado interno de um objeto, de forma que este
possa ser restaurado mais tarde.

### • Motivação
– Algumas vezes é necessário registrar o estado interno
de um objeto (checkpoints, undo).

### • Aplicabilidade
– Um instantâneo do estado de um objeto deve ser
salvo para que possa ser restaurado mais tarde.

– Uma interface direta para acesso ao estado exporia
detalhes de implementação do objeto, violando o
encapsulamento.

### • Participantes
– Um Caretaker (curador) solicita um memento de um originador, mantém o
mesmo durante um tempo e quando necessário, o devolve ao originador.

– Mementos são passivos. Somente o originador que o criou irá atribuir ou
recuperar o seu estado.

### • Conseqüências
– Preserva o encapsulamento.

– Simplifica o originador.

– Pode ser computacionalmente caro.

– Interfaces podem ser estreitas ou largas.

– Custos ocultos na custódia dos mementos.

### Diretório:
-Academic-Works/Observer_Method/src/
