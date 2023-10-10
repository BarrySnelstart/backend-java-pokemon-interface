import java.util.List;

public class PokemonTrainer {
    private String name;
    private List <Pokemon> pokemons;

    PokemonTrainer(String name, List <Pokemon> pokemons) {
        this.name = name;
        this.pokemons = pokemons;
    }

    public List <Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List <Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getName() {
        return name;
    }
}
