class Carnivorous(name: String, Family: String, habitat: String,var danger: Any) : Animals(name, Family, habitat) {

    override fun toString(): String {
        return "Carnivorous (name= $name, Family= $Family, habitat: $habitat, danger: $danger)"
    }


}