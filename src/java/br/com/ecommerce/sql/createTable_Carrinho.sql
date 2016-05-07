/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Mychel Rennó
 * Created: 06/05/2016
 */
CREATE TABLE Carrinho
(
carr_id int NOT NULL PRIMARY KEY,
prod_id FOREIGN KEY REFERENCES Produto(prod_id)
);
