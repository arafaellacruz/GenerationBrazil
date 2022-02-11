/*
Java Script é uma linguagem de programação orientada a FUNÇÃO.

Função é um bloco de código.

Tipos de definições de váriaveis em JS:
• var variavel de escopo global
• let variavel de escopo local
• const variavel de escopo global mas é uma variavel constante, que não muda o seu valor no decorrer da programação (não é muito usada.) 

Case Sensitive = reconhece letras maiusculas e minusculas

Outras formas de acessar o DOM:
• por Tag: getElementByTagName
• por Id: getElementById()
• por Nome: getElementByName
• por Classe: getElementsByClassName()
• por Seletor: querySelector()
*/

let nome = window.document.getElementById("nome");
let email = window.document.querySelector("#email")
let assunto = document.querySelector("#assunto")
let nomeOk = false
let emailOk = false
let assuntoOk = false
let mapa = document.querySelector("#mapa")

nome.style.width = "100%"
email.style.width = "100%"

/* O nome da função "validaNome" não é uma palavra reservada, mas é de boas prátivas colocar um  nome óbvio para a função, mas ao inserir mais de 1 palavra no nome, as demais precisam ter a primeiraa letra maiuscula.

Essas funções só funcionam quando referenciamos um evento.

Os eventos são basicamente um conjunto de ações que são realizadas em um determinado elemento da página web, seja ele um texto, uma imagem, ou uma div, por exemplo. Muitas das interações do usuário que está visitando sua página com o conteúdo do seu site podem ser consideradas eventos.
*/
function validaNome() {
    let txtNome = document.querySelector("#txtNome")
    if (nome.value.length < 3) {
        txtNome.innerHTML = "Nome Inválido"
        txtNome.style.color = "red"       
    } else {
        txtNome.innerHTML = "Nome Válido"
        txtNome.style.color = "green"
        nomeOk = true
    }

}

function validaEmail() {
    let txtEmail = document.querySelector("#txtEmail")
    
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = "E-mail inválido"
        txtEmail.style.color = "red"

    } else {
        txtEmail.innerHTML = "E-mail Válido"
        txtEmail.style.color = "green"
        emailOk = true
    }
}

/*
O DOM (Document Object Model) representa o mesmo documento para que possa ser manipulado. O DOM é uma representação orientada a objetos da página da web, que pode ser modificada com uma linguagem de script como JavaScript. 
*/

function  validaAssunto() {
    let txtAssunto = document.querySelector("#txtAssunto")

    if (assunto.value.length >= 150) {
        txtAssunto.innerHTML = "Seu texto é muito grande, digite no máximo 150 caracteres."
        txtAssunto.style.color = "red"
        txtAssunto.style.display = "block"
        assuntoOk = false
    } else {
        txtAssunto.style.display = "none"
        assuntoOk = true
    }
}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        alert("Mensagem enviada com sucesso! ♥")
    } else {
        alert ("Preencha o formulário corretamente antes de enviar.")
    }
}

function mapaZoom() {
    mapa.style.width = "500px"
    mapa.style.height = "400px"
}

function mapaNormal() {
    mapa.style.width = "300px"
    mapa.style.height = "250px"
}