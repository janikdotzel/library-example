package example

object Hello extends Greeting with App {
  println(greeting)

//  println(hello.Hello.greeting)

}

trait Greeting {
  lazy val greeting: String = "Service B says hello"
}
