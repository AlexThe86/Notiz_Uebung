/*fun main() {
    val fruits: List<String> = listOf("Strawberry", "Apple", "Banana")

    repeat(fruits.size) { index ->
        val fruit = fruits[index]
        println(fruit)
    }
}*/

fun main() {
    notice()
}
var list = mutableListOf<String>() // eine mutable liste zum hinzufügen / überschreiben / löschen /

fun notice() {
    var hilfsvariable = true
    while (hilfsvariable) { // soloange wie true , dann weiter //

        println("Bitte gebe deine Notiz ein:")
        var input = readln() //eingabezeile//

        list.add(input) // einfügen von input //
        println(list) //ausgabe liste//

        println("Bitte treffe eine auswahl:")
        println("1. Notiz Anzeigen")
        println("2. Notiz Löschen")
        println("3. Notiz Überschreiben.")
        println("4. Beenden.")
        var input2 = readln().toIntOrNull()

        when(input2){
            1 ->{
                println("Deine Notizen:")
                for (notice in list)
                    println("$notice")
            }
            2 ->{
                println("Welche Notiz möchtest du löschen?") //funktion erstellen dafür //
                delete()
            }
            3 ->{
                println("Wähle eine Notiz zum überschreiben.") // funktion zum überschreiben erstellen//
                for (notice in list)
                    println("$notice")
            }
            4 ->{
                println("Programm wird beendet.")
                Thread.sleep(3000)
                hilfsvariable = false
            }
            else ->{
                println("Ungültige Eingabe.")
            }
        }
    }
}
fun delete(){
    for (notice in list)
        println(notice)
    var input = readln()
    list.remove(input)
    println("$input wurde aus der Liste entfernt.")
}