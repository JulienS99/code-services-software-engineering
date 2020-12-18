@Configuration
public class LocalConfig {

    @Bean
    public ResourceBundleMessageSource messageSource() {

    	ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasenames("Messages/messages");   // directory inside the resource folder.
        source.setUseCodeAsDefaultMessage(true);

        return source;
    }
}
