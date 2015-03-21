package guice.servlet;

import guice.hello.Hello;
import guice.hello.HelloWorld;

import com.google.inject.AbstractModule;

class AppModule extends AbstractModule {
	
	  protected void configure() {
		  bind(Hello.class).to(HelloWorld.class);
	  }
}
