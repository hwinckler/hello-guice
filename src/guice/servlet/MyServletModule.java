package guice.servlet;

import com.google.inject.servlet.ServletModule;

class MyServletModule extends ServletModule {
	
	  protected void configureServlets() {
		  //bind(HelloController.class).to(Hel.class);
		  //serve("/index.html").with(IndexController.class);
		  serve("/hello").with(HelloController.class);
	  }
}
