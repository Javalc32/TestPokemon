import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class Ejercicio4Test {

    static Ejercicio4 ej;


    @BeforeAll
    static void firstInit() {
        System.out.println("firstInit");
        ej = new Ejercicio4();
        ej.arrayPokemons = ObtenerPokemonsRequest.Companion.get(1,9);
        for (Pokemon poke : ej.arrayPokemons){
            System.out.println(poke);
        }
    }


    @BeforeEach
    void setUp() {
        System.out.println("setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown");
    }


    @Test
    void pokemonMasGordosQue() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(17, 6, "charizard", 905),
                new Pokemon(16, 9, "blastoise", 855)
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(250);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonMasGordosQue2() {
        Pokemon[] pokemonEsperados = new Pokemon[0];
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(4000);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonMasGordosQue3() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(20, 3, "venusaur", 1000),
                new Pokemon(17, 6, "charizard", 905)
        };
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(855);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonMasGordosQue4() {
        Pokemon[] pokemonActuales = ej.pokemonMasGordosQue(0);
        Assertions.assertArrayEquals(ej.arrayPokemons, pokemonActuales);
    }

    @Test
    void getPokemonMenosGordo() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(6, 4, "charmander", 85),
        };
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(90);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void getPokemonMenosGordo2() {
        Pokemon[] pokemonEsperados = new Pokemon[0];
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(69);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void getpokemonMenosGordos3() {
        Pokemon[] pokemonActuales = ej.getPokemonMenosGordo(10000);
        Assertions.assertArrayEquals(ej.arrayPokemons, pokemonActuales);
    }

    @Test
    void pokemonEntrePesos(){
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(6, 4, "charmander", 85),
                new Pokemon(5, 7, "squirtle", 90)
        };
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(95, 50);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonEntrePesos2(){
        //Comprueba que siendo uno de los dos pesos igual al peso de un pokemon, no se le incluya.
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(6, 4, "charmander", 85),
        };
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(90, 50);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonEntrePesos3(){
        //Comprueba que cambiando el peso minimo como el maximo y el maximo como el minimo
        // devuelva un array vacio.
        Pokemon[] pokemonEsperados = new Pokemon[0];
        Pokemon[] pokemonActuales = ej.getPokemonPesoEntre(50, 90);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }

    @Test
    void pokemonNombreMasLargoQue(){
        //Comprueba que el nombre de los pokemon dados son mas largos que el numero
        //introducido
        Pokemon[] pokemonEsperados = {
                new Pokemon(6, 4, "charmander", 85),
                new Pokemon(11, 5, "charmeleon", 190)
        };
        Pokemon[] pokemonActuales = ej.getPokemonNombreMasLargoQue(9);
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }


    @Test
    void getPokemonQueContengaLasSiguientesLetras() {
        Pokemon[] pokemonEsperados = {
                new Pokemon(7, 1, "bulbasaur", 69),
                new Pokemon(10, 2, "ivysaur", 130),
                new Pokemon(20, 3, "venusaur", 1000)
        };
        Pokemon[] pokemonActuales = ej.getPokemonQueContengaLasSiguientesLetras("saur");
        Assertions.assertArrayEquals(pokemonEsperados, pokemonActuales);
    }


}