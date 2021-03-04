Back end do aplicativo WS DELIVERY



#### Get /ordens 

###### retorna a lista de pedidos feitos através do site, os pedidos PENDENTES MAIS ANTIGOS são trazidos por primeiro.



#### Post /ordens 

###### cadastra os novos pedidos feitos pelo site no sistema, um pedido pode conter vários produtos.



#### Put /ordens/{id}/entregue 

###### Atualiza  o pedido para ENTREGUE atraves do ID passado pelo aplicativo mobile



#### Get /Produtos

###### retorna a lista de produtos cadastrados no site.



##### Você pode encontrar o deploy no link  https://spring-app-delivery.herokuapp.com/

##### Repositório do front end feito em React https://github.com/wilfft/front-react-ts-wsdelivery

##### Repositório do mobile, feito em React Native https://github.com/wilfft/front-mobile-reactnative-ts-wsdelivery
