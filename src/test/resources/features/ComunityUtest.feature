#Autor: Uberney Delgado Polo

   @stories
  Feature: Formulario registro
      El usuario debe poder ingresar a la pagina Utest y completar el formulario de registro

  @Scenario1:
  Scenario: Llenar completamente el formulario de registro
      Given El usuario debe ingresar a utest
      When El usuario completa todos los campos
    |firtsName|secondName|email                |monthBirthDay|dayBirthDay|yearBirthDay|city    |zipCode|yourComputer|version|language|yourMovileDevice|modelDevice|operatingSystem|password|
    |Uberney  |Delgado   |uberney2001@gmail.com|August       |31         |2001        |Medellin|050016|Windows      |10 64-bit|Spanish|Xiaomi         |Redmi Note 10 Pro|Android 12|Secompleto123|
      Then El registro fue completo con un nuevo usuario
      |textCompleto|
      |Welcome to the world´s largest community of freelance software testers!|
