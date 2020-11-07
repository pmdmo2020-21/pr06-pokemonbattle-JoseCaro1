package es.iessaladillo.pedrojoya.intents.data.local

import es.iessaladillo.pedrojoya.intents.R
import es.iessaladillo.pedrojoya.intents.data.local.model.Pokemon
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

// TODO: Haz que Database implemente DataSource
object Database : DataSource {
    private val pikachu: Pokemon = Pokemon(0,R.string.pikachu,R.drawable.pikachu,100)
    private val gyarados: Pokemon = Pokemon(1,R.string.gyarados,R.drawable.gyarados,50)
    private val feebas: Pokemon = Pokemon(2,R.string.feebas,R.drawable.feebas,25)
    private val bulbasur: Pokemon = Pokemon(3,R.string.bulbasur,R.drawable.bulbasur,200)
    private val cubone: Pokemon = Pokemon(4,R.string.cubone,R.drawable.cubone,150)
    private val giratina: Pokemon = Pokemon(5,R.string.giratina,R.drawable.giratina,175)
    private var listPokemon: List<Pokemon> =
        listOf(pikachu, gyarados, feebas, bulbasur, cubone, giratina)

    override fun getRandomPokemon(): Pokemon {
        var randomInt = nextInt(6)
        return listPokemon[randomInt]
    }

    override fun getAllPokemons(): List<Pokemon> {
        return listPokemon
    }

    override fun getPokemonById(id: Long): Pokemon? {
        for (pokemon in listPokemon){
            if(pokemon.id.toLong()==id) return pokemon
        }
        return null
    }

}