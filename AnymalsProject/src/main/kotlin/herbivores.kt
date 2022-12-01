class Herbivores(name: String, Family: String, habitat: String,var NaturalEnemy: String) : Animals(name, Family, habitat){

    override fun toString(): String {
        return "Carnivorous (name= $name, Family= $Family, habitat: $habitat, NaturalEnemy: $NaturalEnemy)"
    }
}