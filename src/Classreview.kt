fun main() {
    var doc=Doctor("Dr Audrey",19)
    var assistant=Nurse("Kiyana",19)
    var mkulima=Farmer("Collo",32)
    mkulima.work()
    doc.eat()
    assistant.sleep()
    doc.eat()
}
open class Person(var name: String, var age: Int){
    open fun eat(){
        println("You should eat healthy food")
    }
    fun work(){
        println("I work eight hours a day")
    }
    fun sleep(){
        println("You should all sleep for eight hours")
    }
}
class Doctor( name:String, age:Int):Person(name,age){
    fun patient(patientName:String,disease:String, mssg:String){
        println("Hello $patientName, you tested positive for $disease $mssg")
        }
    override fun eat(){
        println("I am eating all the food that I have grown")
    }
    }
class Nurse( name: String, age:Int):Person(name, age){
    fun nightShift(name: String,patients:Int){
        println("Nurse $name,reporting there are $patients in the ward")
    }
}
class Farmer( name: String, age :Int):Person(name, age){
    fun cultivate(){
        println("dig dig dig")

    }


}
