package com.advantageonlineshopping.pruebas.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://advantageonlineshopping.com/#/")
public class AdvantageHomeUI extends PageObject {
    public static final Target BTN_USUARIO  = Target.the("Clic Boton Usuario").locatedBy("//a[@id=\"menuUserLink\"]");
    public static final Target BTN_CREARUSUARIO  = Target.the("Clic Boton Crear Usuario").locatedBy("//a[@class=\"create-new-account ng-scope\"]");
    public static final Target TXT_NOMBRE_USUARIO = Target.the("Caja Texto Nombre Usuario").locatedBy("//input[@name=\"usernameRegisterPage\"]");
    public static final Target TXT_EMAIL = Target.the("Caja Texto Email").locatedBy("//input[@name=\"emailRegisterPage\"]");
    public static final Target TXT_CLAVE = Target.the("Caja Texto Clave").locatedBy("//input[@name=\"passwordRegisterPage\"]");
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("Caja Texto Confirmar Clave").locatedBy("//input[@name=\"confirm_passwordRegisterPage\"]");
    public static final Target TXT_NOMBRE = Target.the("Punto Refencia Bajar").locatedBy("//input[@name=\"first_nameRegisterPage\"]");

    public static final Target TXT_DIRECCION = Target.the("Punto Refencia Bajar").locatedBy("//input[@name=\"addressRegisterPage\"]");

    public static final Target RDO_I_AGREE = Target.the("Radio Aceptar Terminos").locatedBy("//input[@name=\"i_agree\"]");
    public static final Target BTN_REGISTRAR = Target.the("Boton Registrar").locatedBy("//button[@id=\"register_btnundefined\"]");

}
