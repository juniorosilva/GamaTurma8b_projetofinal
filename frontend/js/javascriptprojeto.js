
// window.alert("Seja bem vindo a Gama Academy");
var empresa = "Gama Academy";
var curso = "Front End com Java Script";
var separador = " - ";
//alert(empresa+separador+curso);


// var nome = prompt("Insira seu nome");

function validar() {
    // alert("oi funcionou");

    var racf = formuser.racf.value;
    var email = formuser.email.value;
    var senha = formuser.senha.value;

    if (racf == "") {
        alert("Preencha o campo User Name");
        formuser.racf.focus();
        return false;
    }

    if(email=="" || email.indexOf('@')==-1 ){
        alert("Preencha o campo email, com uma conta válida");
        formuser.email.focus();
        return false;
    }

    if(senha=="" || senha.length <=5){
        alert("Preencha o campo e digite uma senha válida");
        formuser.senha.focus();
        return false;

    }

    
    if (racf == "TIOPATI")
    {
        window.open("..\html\visaogestor.html")
    }
    else
       {
        window.open("..\html\visaocolaborador.html")
        }

}
