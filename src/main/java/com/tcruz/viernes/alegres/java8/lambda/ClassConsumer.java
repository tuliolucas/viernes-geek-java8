package com.tcruz.viernes.alegres.java8.lambda;

import com.tcruz.viernes.alegres.java8.functionalinterface.DoSomething;

public class ClassConsumer {

    public String consume(DoSomething doSomething){
        return "The operation was successful:" + doSomething.execute();
    }
}
