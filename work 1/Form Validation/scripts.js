function validate(){
	if(document.myForm.Name.value == ""){
		alert("provide your name");
		document.myForm.Name.focus();
		return false;
	}
	if( document.myForm.EMail.value == "" )
         {
            alert( "Please provide your Email!" );
            document.myForm.Email.focus() ;
            return false;
         }
     if(document.myForm.Zip.value == "" ||isNaN(document.myForm.Zip.value)||document.myForm.Zip.value.length !=6){
     	alert( "Please provide a zip in the format #####." );
            document.myForm.Zip.focus() ;
            return false;

     }
     if( document.myForm.Country.value == "-1" )
         {
            alert( "Please provide your country!" );
            return false;
         }
         return( true );
}