
// window.alert("Seja bem vindo a Gama Academy");
var empresa = "Gama Academy";
var curso = "Front End com Java Script";
var separador = " - ";
//alert(empresa+separador+curso);



function validar() {
    // alert("oi funcionou");

    var nome = formuser.nome.value;
    var email = formuser.email.value;
    var senha = formuser.senha.value;

    if (nome == "") {
        alert("Preencha o campo Nome");
        formuser.nome.focus();
        return false;
    }

    if(email=="" || email.indexOf('@')==-1 ){
        alert("Preencha o campo email, com uma conta válida");
        formuser.email.focus();
        return false;
    }

    if(senha=="" || senha.length <=5){
        alert("Preencha o campo e digite uma senha maior que 6 caracteres");
        formuser.senha.focus();
        return false;

    }

    alert("Prezado "+nome+" estaremos lhe enviando o nosso contato para o email "+email);
}
