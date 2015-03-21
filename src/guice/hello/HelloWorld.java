package guice.hello;

import javax.inject.Singleton;



@Singleton
public class HelloWorld implements Hello {

	public String say(){
		return "Hello World Impl!!";
	}
}
