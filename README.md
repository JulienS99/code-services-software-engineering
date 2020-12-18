# Localisation of an application and website. Guide using springboot MessageSource.

# In the resource folder of the project. Create a new folder with the name of Messages. Inside this folder, create a message.properties file. Include in this file all the keys in a format of:
# thekeythatwillbecalled=thevalueofthekey.


# The messages.properties file should include the initial language.
# another file with the name of messages_en.properties or messages_fr.properties depending on the language.

# the localConfig class will direct the messageSource function to the resource folder.

# the localisationUtil class will hold the function that will be used accross the project.

# the AnyFunctionWithAStringToBeTranslated function is the template of the function that will be used accross the project. It include as parameters:
# Key to be searched for in the property file
# Default message in case no key was found
# Phone language preference that will be extracted from the user. It should be in the format of: "en", "ar", "de", "fr" etc
