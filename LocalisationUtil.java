@Component
public class LocalisationUtil  {
    @Autowired
    private MessageSource messageSource;

    public String getTranslation (String key, String phoneLanguage, String defaultMessage) {
    	Locale locale = new Locale(phoneLanguage);  // Creating a new singleton Local variable with the extracted phone language preference.
    	return messageSource.getMessage(key, null, defaultMessage,  locale);
    }
}
