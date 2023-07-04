# language: pt
Funcionalidade: Tentativa de Login

  Eu com cliente do site Ebac
  desejo fazer login
  para que eu possa acessar o site e fazer compras


  Cenário: login com sucesso
    Dado que eu esteja na página de login do site ebac
    Quando insiro meu email e senha
    E clico no botão login
    Então eu vejo minha conta


  Cenário: senha errada
    Dado que eu esteja na página de login do site ebac
    Quando insiro meu email e senha errada
    E clico no botão login
    Então eu vejo a mensagem de erro


  Cenário: email errado
    Dado que eu esteja na página de login do site ebac
    Quando insiro meu email errado e senha
    E clico no botão login
    Então eu vejo a mensagem de erro de email

