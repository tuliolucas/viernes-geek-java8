# viernes-alegres-java8
Em meados de 2015, a Oracle lançou o Java 8, que chegou com  muitas novidades e muito barulho que eu não via desde o lançamento do Java 5 (around 2004).

Esta release contém inúmeras features, improvements, bugs fixes e tunnings para melhorar a eficiência e execução JAVA.

A lista de novidades é imensa, [lista de novidades](http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html),  e a nossa idéia inicial é abordar inicialmente as novidadesda linguagem que acreditamos ser as mais relevantes e vai mudar a forma pelo qual escrevemos nossos códigos.

### Default Method

Agora é possível ter métodos concretos em interfaces. Basta utilizar o modificador **default**. Eles serão ‘herdados’ por todos que implementarem essa interface.

Com este recurso, pode se evoluir uma interface sem quebrar compatibilidade. É uma técnica já bem conhecida no C#, Scala e outras linguagens. 

Há muitos métodos default que foram adicionados a API de coleções, como Collection.removeIf, Map.getOrDefault e até mesmo no Comparator, como o Comparator.reversed, que devolve um novo comparador que ordena ao contrário.


### Functional Interface

Uma novidade também são é a Interface Funcional, o conceito é de uma Interface que contém apenas um método abstrato. Este tipo de Interface é usado em situações específicas, sendo comum a instanciação é através de uma classe anônima. 

```
@FunctionalInterface
public interface Runnable {
   public abstract void run();
}
```

Esta funcionalidade foi criada para suportar a utilização de Lambdas (que veremos mais abaixo).


### Lambda Expression


Lambda Expressions foi a maneira escolhida para que a linguagem Java finalmente possua “nuances” bem leves de programação funcional.
Sobre a definição de “programação funcional”, sempre existem controvérvisas, mas o meu brother Wikipedia afirma o seguinte:

“...Em ciência da computação, programação funcional é um paradigma de programação que trata a computação como uma avaliação de funções matemáticas e que evita estados ou dados mutáveis. Ela enfatiza a aplicação de funções, em contraste da programação imperativa, que enfatiza mudanças no estado do programa...”

Em resumo, utilizar lambda expressions vai permitir passar comportamentos, funções, como argumentos em uma chamada de método. É um paradigma realmente um pouco diferente do que programadores java estão acostumados, que desde então só escrevem métodos que aceitam objetos como parâmetro, e não outros métodos!

A plataforma Java na verdade chegou um pouco atrasada nessa festa. Outras linguagens como Scala, C#, Python e até Javascript já fazem isso há tempos. 

Há quem diga que o uso de lambdas compromete a legibilidade do código. 

Em minha opinião existem pelo menos dois bons argumentos a favor das expressões lambda: O primeiro é o Paralelismo. Até então em Java, não havia uma maneira simples de escrever código para percorrer grandes coleções de objetos em paralelo. O segundo argumento é a possibilidade de deixar a linguagem menos verbosa.

**Method Reference**

É comum um lambda simplesmente invocar um único método. 
Para deixar a coisa mais exuta, um lambda também pode ser escrito como forma de method reference.

Em vez de s -> s.length() fazemos simplesmente String::length, ficando implícito que queremos, para a String passada como argumento, que o length seja invocado.

### Stream

### Optional

### Date



## Referências

[http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8](http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8)

[https://www.thoughtworks.com/insights/blog/composition-vs-inheritance-how-choose](https://www.thoughtworks.com/insights/blog/composition-vs-inheritance-how-choose)

[http://pt.stackoverflow.com/questions/11162/o-que-s%C3%A3o-interfaces-funcionais](http://pt.stackoverflow.com/questions/11162/o-que-s%C3%A3o-interfaces-funcionais)

http://pt.stackoverflow.com/questions/269/quais-as-vantagens-das-express%C3%B5es-lambda-presentes-no-java-8

