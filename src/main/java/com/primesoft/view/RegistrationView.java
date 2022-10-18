package com.primesoft.view;

import com.primesoft.response.RegistrationForm;
import com.primesoft.validation.RegistrationFormBinder;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@SuppressWarnings("serial")
public class RegistrationView extends VerticalLayout{

	public RegistrationView() {
	       RegistrationForm registrationForm = new RegistrationForm();
	       // Center the RegistrationForm
	       setHorizontalComponentAlignment(Alignment.CENTER, registrationForm);

	       add(registrationForm);

	       RegistrationFormBinder registrationFormBinder = new RegistrationFormBinder(registrationForm);
	       registrationFormBinder.addBindingAndValidation();
	   }
	
}
