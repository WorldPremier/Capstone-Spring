@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/favorites").setViewName("index");
        registry.addViewController("/search").setViewName("index");
    }



}
