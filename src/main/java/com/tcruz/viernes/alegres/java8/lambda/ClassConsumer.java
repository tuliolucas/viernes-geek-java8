package com.tcruz.viernes.alegres.java8.lambda;

import com.tcruz.viernes.alegres.java8.lambda.functionalinterface.*;

public class ClassConsumer {

    public String consume(Behaviour behaviour){
        //Do something
        return "The operation was successful:" + behaviour.execute();
    }
}
