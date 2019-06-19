function validateEmail(){
	var email = document.myForm.Email.value;
	atpos = email.indexOf("@");
	atdot = email.lastindexOf(".");

	if(atpos < 1 || (atdot - atpos < 2)){
		alert("enter correct password");
		document.myForm.Email.focus();
		return false;
	}
	return true;

}