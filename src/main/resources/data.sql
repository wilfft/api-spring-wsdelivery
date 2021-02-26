INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Pizza Bacon', 49.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_bacon.jpg', 'Pizza de bacon com mussarela, orégano, molho especial e tempero da casa.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Pizza Moda da Casa', 59.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_moda.jpg', 'Pizza à moda da casa, com molho especial e todos ingredientes básicos, e queijo à sua escolha.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Pizza Portuguesa', 45.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/pizza_portuguesa.jpg', 'Pizza Portuguesa com molho especial, mussarela, presunto, ovos e especiarias.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Risoto de Carne', 52.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_carne.jpg', 'Risoto de carne com especiarias e um delicioso molho de acompanhamento.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Risoto Funghi', 59.95, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/risoto_funghi.jpg', 'Risoto Funghi feito com ingredientes finos e o toque especial do chef.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Macarrão Espaguete', 35.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_espaguete.jpg', 'Macarrão fresco espaguete com molho especial e tempero da casa.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Macarrão Fusili', 38.0, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_fusili.jpg', 'Macarrão fusili com toque do chef e especiarias.');
INSERT INTO TB_PRODUTO (nome, preco, image_Uri, descricao) VALUES ('Macarrão Penne', 37.9, 'https://raw.githubusercontent.com/devsuperior/sds2/master/assets/macarrao_penne.jpg', 'Macarrão penne fresco ao dente com tempero especial.');


INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T10:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (1, -22.946779, -43.217753, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T15:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (0, -25.439787, -49.237759, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T16:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T12:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (1, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T08:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T14:00:00Z');
INSERT INTO TB_ORDEM (status, latitude, longitude, ENDERECO, MOMENTO) VALUES (0, -23.561680, -46.656139, 'Avenida Paulista, 1500', TIMESTAMP WITH TIME ZONE '2021-01-01T09:00:00Z');

INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (1 , 1);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (1 , 4);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (2 , 2);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (2 , 5);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (2 , 8);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (3 , 3);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (3 , 4);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (4 , 2);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (4 , 6);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (5 , 4);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (5 , 6);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (6 , 5);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (6 , 1);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (7 , 7);
INSERT INTO TB_ORDEM_PEDIDO (ORDEM_ID, PRODUTO_ID) VALUES (7 , 5);