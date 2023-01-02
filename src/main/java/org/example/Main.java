package org.example;

import reactor.core.publisher.Mono;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mono<Integer> mono = Mono.just(1);
        System.out.println(mono.block());
        System.out.println(mono.subscribe(x->System.out.println(x)));

        //Mono.
        //Mono.just(1);
    }
}