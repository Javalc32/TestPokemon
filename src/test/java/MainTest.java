import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    // TODO realiza los test que consideres necesarios para comprobar que la función "pelea()" a la que le entran 2
    //  argumentos (pokemon1 y un pokemon2) ubicada en main funciona correctamente. El comportamiento esperado es que
    //  el pokémon más gordo ganará, es decir, la función devuelve al pokémon más gordo. En caso de empate (ambos pesan
    //  lo mismo) entonces la función devuelve null. En caso de que alguno de los pokémon sea null, entonces devolverá
    //  una "exception" de la clase "PokemonInvalido"
    @Test
    public void test1(){
        Pokemon pokemon1 = ObtenerPokemonRequest.Companion.get(3);
        Pokemon pokemon2 = ObtenerPokemonRequest.Companion.get(3);

        Pokemon ganador = MainKt.pelea(pokemon1, pokemon2);
    }


}
