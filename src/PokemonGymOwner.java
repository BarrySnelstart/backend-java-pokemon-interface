import java.util.List;

public class PokemonGymOwner extends PokemonTrainer{
    String name;
    List <Pokemon> pokemons;
    String town;
    PokemonGymOwner(String name, String town, List<Pokemon> pokemons) {
        super(name, pokemons);
        this.name = name;
        this.pokemons = pokemons;
        this.town = town;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public List <Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public void setPokemons(List <Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
