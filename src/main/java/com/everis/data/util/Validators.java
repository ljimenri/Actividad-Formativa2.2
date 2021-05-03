package com.everis.data.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validators {
	
	public boolean validarRut(String rut) {

	    boolean validacion = false;
	    try {
	        rut =  rut.toUpperCase();
	        rut = rut.replace(".", "");
	        rut = rut.replace("-", "");
	        int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

	        char dv = rut.charAt(rut.length() - 1);

	        int m = 0, s = 1;
	        for (; rutAux != 0; rutAux /= 10) {
	            s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
	        }
	        if (dv == (char) (s != 0 ? s + 47 : 75)) {
	            validacion = true;
	        }

	    } catch (java.lang.NumberFormatException e) {
	    } catch (Exception e) {
	    }
	    return validacion;
	}
	
	public boolean validatorEmail(String email) {
		 

        Pattern pattern = Pattern.compile(
        		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);
 
        if (mather.find() == true) {
        	return true;
        } else {
            return false;
        }
    }
	
	public boolean validatorNames(String Nombre, String Apellido) {
		if(Nombre.length()>=10 && Apellido.length()>=10) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
