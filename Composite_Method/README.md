# Composite Method
Markdown

### Nome e Classificação do Padrão:
Chain of Responsibility - Padrão Comportamental

### Intenção e Objetivo:
Este padrão tem como função representar um encadeamento de objetos para realizar o processamento de um série de requisições diferentes.

### Motivação:
Na programação orientada a objetos devemos tentar ao máximo manter os objetos com fraco acoplamento de informações, havendo um mínima responsabilidade entre eles, fazendo com que falhas e riscos sejam evitadas.

### Aplicabilidade:
Uma solicitação pode ser tratada por mais de um objeto;
A solicitação poderá ser emitida entre vários objetos e o receptor não é necessário ser especificado explicitamente;

### Participantes:

Alimentador : define a interface para tratar as solicitações e implementa a referência ao sucessor (opcional).
AlimentadorConcretoA, ..., AlimentadorConcretoN : trata as solicitações pelas quais é responsável. Pode acessar seu sucessor. Se o AlimentadorConcreto pode tratar a solicitação, ele assim o faz; caso contrário ele repassa a solicitação para o seu sucessor.
Cliente : Inicia a solicitação para um objeto AlimentadorConcreto da cadeia.
Requisição : As instâncias de Requisição é que iram transportar as informações para os alimentadores executarem algo.

### Conseqüências
Vantagens
Evita acoplamento do transmissor de um requisição com seus receptores, fazendo com que mais de um projeto tenha a chance de manipular a requisição.
Encadeia os objetos receptores e passa a requisição ao longo dessa cadeia até que um objeto possa manipulá-lo.
Reduz a vinculação.
Adiciona flexibilidade.
Permite que um conjunto de classes atue como uma classe; eventos produzidos em uma classe podem ser enviados para outras classes dentro da composição.

## Exemplo de Código Aplicável

package chain;

public class Pizza {

    private String sabor;
    private String tamanho;

    public Pizza(String s, String t) {
        this.sabor = s;
        this.tamanho = t;
    }

    public String getSabor() {
        return this.sabor;
    }

    public String getTamanho() {
        return this.tamanho;
    }
}

---------------------------------------------------------------------------------------------------


package chain;

public abstract class Alimentador {

    private Alimentador sucessor;

    public abstract String processaRequisicao(Pizza pizza);

    public void setSucessor(Alimentador sucessor) {
        this.sucessor = sucessor;
    }

    public Alimentador getSucessor() {
        return this.sucessor;
    }
}


---------------------------------------------------------------------------------------------------

package chain;

public class AlimentadorAtumPequeno extends Alimentador {

  
    @Override
    public String processaRequisicao(Pizza pizza) {
        if ("atum".equals(pizza.getSabor()) && "pequeno".equals(pizza.getTamanho())) {
            return "Preço: R$"+(15.50);
        } else {
            return this.getSucessor().processaRequisicao(pizza);
        }
    }

    public AlimentadorAtumPequeno() {
    }
}


---------------------------------------------------------------------------------------------------
package chain;

public class AlimentadorAtumMedio extends Alimentador {

  
    @Override
    public String processaRequisicao(Pizza pizza) {
        if ("atum".equals(pizza.getSabor()) && "medio".equals(pizza.getTamanho())) {
            return "Preço: R$"+(20.50);
        } else {
            return this.getSucessor().processaRequisicao(pizza);
        }
    }

    public AlimentadorAtumMedio() {
    }
}
---------------------------------------------------------------------------------------------------


package chain;

public class AlimentadorDesconhecido extends Alimentador {

  
    @Override
    public String processaRequisicao(Pizza pizza) {
       return "Pizza inexistente";
    }

    public AlimentadorDesconhecido() {
    }
}

---------------------------------------------------------------------------------------------------

package chain;

public class Main {

    public static void main(String args[]) {
// Declaração dos alimentadores.
        AlimentadorAtumPequeno ali_pequeno = new AlimentadorAtumPequeno();
        AlimentadorAtumMedio ali_medio = new AlimentadorAtumMedio();
        AlimentadorDesconhecido ali_desconhecido = new AlimentadorDesconhecido();
// Configuração das sucessões.
        ali_pequeno.setSucessor(ali_medio);
        ali_medio.setSucessor(ali_desconhecido);
// Definição das pizzas.
        Pizza pizza1 = new Pizza("atum", "pequeno"); // R$ 15.50
        Pizza pizza2 = new Pizza("atum", "medio"); // R$ 20.50
        Pizza pizza3 = new Pizza("quatro queijos", "grande"); // inexistente
// Imprime o valor das pizzas.
        System.out.println(ali_pequeno.processaRequisicao(pizza1));
        System.out.println(ali_pequeno.processaRequisicao(pizza2));
        System.out.println(ali_pequeno.processaRequisicao(pizza3));
    }
}

### Usos conhecidos: 
 -Tratamento de eventos em GUIs: MacApp, ET++, TCL, NeXT, Qt4
 -Unidraw

### Padrões Relacionado:
 -Composite
 
 ## Código de Exemplo - Adicionar alunos em uma determinada escola -
 #### Diretório:
 -Academic-Works/Composite_Method/src/
 
