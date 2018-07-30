## guia de build do projeto craft-beer / por Jefferson Maretti ##

-descompacte o .zip em um diretório de sua prefefência;
-abra na raiz do projeto o terminal e execute o comando mvn clean install;


## acesso ao bd em memória ##
http://localhost:8080/craft-beer/h2-console/login.jsp?jsessionid=1d8ed1f0071cbe3fff841c8a44a16015

## aesso ao contexto da aplicação ##
http://localhost:8080/craft-beer

## testando os serviços ##
nar raiz do projeto existe um arquivo chamado 
craft-beer-test-microservices.postman_collection.json, onde estão os testes dos serviços
insert, update, delete e list

sendo:

cadastrar nova cerveja:
http://localhost:8080/craft-beer/api/save

ataulizar cerveja:
http://localhost:8080/craft-beer/api/update

excluir cerveja:
http://localhost:8080/craft-beer/api/delete

listar cervejas:
http://localhost:8080/craft-beer/api/list