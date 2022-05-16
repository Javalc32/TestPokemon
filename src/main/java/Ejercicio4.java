import java.util.Arrays;

public class Ejercicio4 {

    public Pokemon[] arrayPokemons = new Pokemon[0];


    public void iniciarEjercicio4() {
        System.out.println("Empezando el ej4");
        for (Pokemon pokemon : arrayPokemons) {
            System.out.println(pokemon);
        }
        System.out.println("Resultado de pokemonMasGordosQue");
        Pokemon[] result = pokemonMasGordosQue(225);
        for (Pokemon pokemon : result) {
            System.out.println(pokemon);
        }
    }

    public Pokemon[] pokemonMasGordosQue(int peso){
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() > peso) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);
    }

    public Pokemon[] getPokemonMenosGordo(int peso) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < peso) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);

    }

    public Pokemon[] getPokemonPesoEntre(int pesoMaximo, int pesoMinimo){
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
            for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getWeight() < pesoMaximo && pokemon.getWeight()>pesoMinimo) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);
    }

    public Pokemon[] getPokemonNombreMasLargoQue(int longitudDelTexto) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getName().length() > longitudDelTexto) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);

    }

    public Pokemon[] getPokemonNombreMasCortoQue(int longitudDelTexto) {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            if (pokemon.getName().length() < longitudDelTexto) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);

    }
    public Pokemon[] getPokemonQueContengaLasSiguientesLetras(String letras)  {
        Pokemon[] out = new Pokemon[arrayPokemons.length];
        int i = 0;
        for (Pokemon pokemon : arrayPokemons) {
            char[] arrayLetras = letras.toCharArray();

            boolean encontrado = true;
            for (char letra : arrayLetras) {
                if (!pokemon.getName().contains(String.valueOf(letra))) {
                    encontrado = false;
                    break;
                }
            }
            if (encontrado) {
                out[i] = pokemon;
                i++;
            }
        }
        return getArraySinNulos(out, i);
    }

    public Pokemon[] getArraySinNulos(Pokemon[] pokemons, int comienzoNulos) {
        return Arrays.copyOfRange(pokemons, 0, comienzoNulos);
    }


}
