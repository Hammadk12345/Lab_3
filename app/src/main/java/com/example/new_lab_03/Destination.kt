package com.example.new_lab_03



interface Destinations{
    val route:String
}
object Login:Destinations{
    override val route = "Login"
}

object Signup:Destinations{
    override val route = "Signup"
}
object Details:Destinations{
    override val route = "Details"
}
object Friends:Destinations{
    override val route = "Friends"
}