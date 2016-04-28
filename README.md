# viernes-alegres-java8
Em meados de 2015, a Oracle lançou o Java 8, que chegou com  muitas novidades e muito barulho que eu não via desde o lançamento do Java 5 (around 2004).

Esta release contém inúmeras features, improvements, bugs fixes e tunnings para melhorar a eficiência e execução JAVA.

A lista de novidades é imensa, [lista de novidades](http://www.oracle.com/technetwork/java/javase/8-whats-new-2157071.html),  e a nossa idéia inicial é abordar inicialmente as novidadesda linguagem que acreditamos ser as mais relevantes e vai mudar a forma pelo qual escrevemos nossos códigos.

### Default Method

Agora é possível ter métodos concretos em interfaces. Basta utilizar o modificador **default**. Eles serão ‘herdados’ por todos que implementarem essa interface.

Com este recurso, pode se evoluir uma interface sem quebrar compatibilidade. É uma técnica já bem conhecida no C#, Scala e outras linguagens. 

Há muitos métodos default que foram adicionados a API de coleções, como Collection.removeIf, Map.getOrDefault e até mesmo no Comparator, como o Comparator.reversed, que devolve um novo comparador que ordena ao contrário.


**Markdown**

**Markdown**

## Referências

[http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8](http://blog.caelum.com.br/o-minimo-que-voce-deve-saber-de-java-8)

[https://www.thoughtworks.com/insights/blog/composition-vs-inheritance-how-choose](https://www.thoughtworks.com/insights/blog/composition-vs-inheritance-how-choose)


