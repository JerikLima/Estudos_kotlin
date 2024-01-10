package com.jeriklima.myapplication

fun main() {
    //imutable list - you cannot items after the initialization
    //val shoppingList = listOf("Processor","Ram", "Graphics Card", "SSD")
    // mutable list - you can add items later
    val shoppingList = mutableListOf("Processor","Ram", "Graphics Card RTX 3060", "SSD")

    //adding items to list
    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card RTX 3060")
    shoppingList.add("Graphics Card RTX 4090")
    //println(shoppingList)
    shoppingList.removeAt(1)
    //println(shoppingList[0])
    shoppingList[0] = "Keyboard"
   // println(shoppingList[0])
    shoppingList.set(1, "Ram")
   // println(shoppingList[1])


    for(item in shoppingList){
        println(item)
        if(item== "Ram"){
            shoppingList.removeLast()
            break
        }
    }
}