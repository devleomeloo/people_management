Desenvolvimento de uma API REST com SpringBoot.

Objetivo: Gerenciar o cadastro de pessoas, gravando informações como nome, CPF, data de nascimento e telefones.
DBA: H2
Deploy: Heroku

Link da API: https://apipeople-management.herokuapp.com/api/v1/people

Modelo Request:
{
    "firstName": "Leonardo",
    "lastName": "Melo",
    "cpf": "873.708.920-00",
    "phones": [
        {
            "type": "MOBILE",
            "number": "(11)964602330"
        }
    ]
}


Modelo Response:
{
    "message": "Created person with ID 1"
}
