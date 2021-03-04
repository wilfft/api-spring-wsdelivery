## Back end do aplicativo WS DELIVERY

##### Os pedidos sao cadastrados com id, latitude, longitude, e numero. Tambem um conjunto de produtos que possuem ID, eles estão em relacionado no banco de dados, ou seja, somente o id é armazenado no pedido e um tabela de relacionamento interliga pedido com produtos.

##### Cada pedido também é iniciado como PENDENTE e com o horario exato da criaçao, para depois então ser armazenado por ordem de chegada.





#### Get /ordens 

###### retorna a lista de pedidos feitos através do site, os pedidos PENDENTES MAIS ANTIGOS são trazidos por primeiro.



#### Post /ordens 

###### cadastra os novos pedidos feitos pelo site no sistema, um pedido pode conter vários produtos.



#### Put /ordens/{id}/entregue 

###### Atualiza  o pedido para ENTREGUE atraves do ID passado pelo aplicativo mobile



#### Get /Produtos

###### retorna a lista de produtos cadastrados no site.



##### Você pode encontrar o deploy do backend no link https://spring-app-delivery.herokuapp.com/

##### Você pode encontrar o front end dessa aplicaçao no link https://ws-delivery-web.netlify.app/

##### Repositório do front end feito em React https://github.com/wilfft/front-react-ts-wsdelivery

##### Repositório do mobile, feito em React Native https://github.com/wilfft/front-mobile-reactnative-ts-wsdelivery




ALGUNS CODIGOS
##### CONFIGURAÇOES DE SEGURANÇA E CORS
![image](https://user-images.githubusercontent.com/68745408/110033667-732dca80-7d18-11eb-867f-1efd9e224099.png)

##### CONTROLLER DE PRODUTO
![image](https://user-images.githubusercontent.com/68745408/110033808-9f494b80-7d18-11eb-9591-f375f6a5e761.png)


##### CONTROLLER DE ORDENS
 ![image](https://user-images.githubusercontent.com/68745408/110033755-90fb2f80-7d18-11eb-9af2-c3e56d1c3652.png)

##### ORDEM DTO
![image](https://user-images.githubusercontent.com/68745408/110033923-c7d14580-7d18-11eb-9947-d571b126ef96.png)

##### PRODUTO DTO
![image](https://user-images.githubusercontent.com/68745408/110034161-e6cfd780-7d18-11eb-8e24-1e554a153224.png)


##### ENTIDADE ORDEM
![image](https://user-images.githubusercontent.com/68745408/110034389-25fe2880-7d19-11eb-8d03-6c868b64d4fc.png)
![image](https://user-images.githubusercontent.com/68745408/110034411-2bf40980-7d19-11eb-9fe2-98b0a1798a4d.png)

###### ENUM ORDEM STATUS
![image](https://user-images.githubusercontent.com/68745408/110034437-36160800-7d19-11eb-9929-3afa94f9220f.png)

##### ENTIDDADE PRODUTO
![image](https://user-images.githubusercontent.com/68745408/110034475-429a6080-7d19-11eb-879c-a5328b0a844d.png)
![image](https://user-images.githubusercontent.com/68745408/110034495-47f7ab00-7d19-11eb-91b5-76beb1abc785.png)


###### REPOSITO DE ORDENS
![image](https://user-images.githubusercontent.com/68745408/110034539-580f8a80-7d19-11eb-925c-1e451099cd93.png)


###### REPOSITO DE PRODUTOS
![image](https://user-images.githubusercontent.com/68745408/110034568-6198f280-7d19-11eb-9dd4-2aed2cca4b2e.png)

###### SERVICE DE ORDEM
![image](https://user-images.githubusercontent.com/68745408/110034630-74abc280-7d19-11eb-9fa8-86b8858a5a10.png)
![image](https://user-images.githubusercontent.com/68745408/110034706-8725fc00-7d19-11eb-844e-666add825b7a.png)



###### SERVICE DE PRODUTO
![image](https://user-images.githubusercontent.com/68745408/110034730-92792780-7d19-11eb-8be5-317ba3c57ee3.png)

###### AMBIENTES SEPARADOS
![image](https://user-images.githubusercontent.com/68745408/110034799-a58bf780-7d19-11eb-8133-f05f7ec00bd0.png)






