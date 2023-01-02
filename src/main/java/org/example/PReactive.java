package org.example;

public class PReactive {

    public static void main(String[] args) {

        // flux = null;
        //Flux flux=null;


        //https://www.baeldung.com/java-string-from-mono

        /*  Mono<String> blockingHelloWorld() {
            return Mono.just("Hello world!");
        }

        String result = blockingHelloWorld().block();
        assertEquals("Hello world!", result);

        String result = blockingHelloWorld().block(Duration.of(1000, ChronoUnit.MILLIS));
assertEquals(expected, result);

Optional<String> result = Mono.<String>empty().blockOptional();
assertEquals(Optional.empty(), result);

blockingHelloWorld()
  .subscribe(result -> assertEquals(expected, result));

  blockingHelloWorld()
  .doOnNext(result -> assertEquals(expected, result))
  .subscribe();
        */
    }
}
