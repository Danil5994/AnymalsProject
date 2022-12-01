fun main(args: Array<String>) {

val Carnivorous1: Carnivorous = Carnivorous("Кошка","Кошачьи", "Дом", "1%")
val Carnivorous2: Carnivorous = Carnivorous("Лев","Кошачьи", "Саванна", "99%")
val Herbivores1: Herbivores = Herbivores("Слон", "Хоботный", "Саванна", "Львы")
val Herbivores2: Herbivores = Herbivores("Альпака","Верблюдовые", "Пояс гор Анды", "Пумы,Ягуары,Койоты")


    val list = mutableListOf<Any>()
    list.add(Carnivorous1)
    list.add(Carnivorous2)
    list.add(Herbivores1)
    list.add(Herbivores2)

    print(list)
}