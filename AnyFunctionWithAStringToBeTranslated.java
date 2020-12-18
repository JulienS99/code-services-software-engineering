@Autowired
private LocalisationUtil localisationUtil;

public void AnyFunctionWithAStringToBeTranslated(Person person) {
  final String phoneLanguage = person.getPhoneLanguagePreference();  //phone Lnaguage preference of the user
  String messageToBeTranslated = "This message will be translated";
  String defaultMessage = "default message in case key is not found"; // preferable to store all the defaultMessages in an enum
  String translatedBasedOnUserPreference = localisationUtil.getTranslation(key, phoneLanguage, defaultMessage) // Key here will be a string of a key written in the resource folder, inside message.properties.
}
