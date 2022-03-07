package mvc.springBoot;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Application.class);
	}

//	public void onStartup(ServletContext servletContext) throws ServletException  {
//		super.onStartup(servletContext);
//		registerHiddenFieldFilter(servletContext);
//	}
//
//	private void registerHiddenFieldFilter(ServletContext aContext) {
//		aContext.addFilter("hiddenHttpMethodFilter",
//				new HiddenHttpMethodFilter()).addMappingForUrlPatterns(null ,true, "/*");
//	}

}
