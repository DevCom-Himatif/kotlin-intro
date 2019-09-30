// 1. class
public class ChildClass : ParentClass, Contract{

    lateinit var nama: String;
    // assign nama // nama = "Argil"

    // Static in kotlin
    companion object{
        fun getName() = "Argil"

        fun apani() : Int {
            return 10 * 120
        }
    }

    // method
    private fun methodA(name: String, id: Integer){
        // method body
    }

    // override method
    override fun move(): String{
        return "Jalan sekali"
    }
}

// 2. interface
interface Contract{
    fun stringMethod(): String
    fun voidMethod()
    fun intMethod(): Int
}

// 3. data class
// Java
/*
public class Customer {
    private String id;
    private String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
*/
// Kotlin
data class Customer(val id: Long, val name: String)

// 4. 