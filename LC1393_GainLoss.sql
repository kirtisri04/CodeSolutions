# Write your MySQL query statement below

with 
buy as 
(
  select stock_name , operation , sum(price) as BUY_AMT 
    from Stocks 
    where operation = 'Buy' 
    group by stock_name , operation 
) ,
sell as 
( select stock_name , operation , sum(price) as SELL_AMT
   from Stocks 
    where operation = 'Sell'
   group by stock_name , operation 
 ) 
 select 
 buy.stock_name , (sell.SELL_AMT - buy.BUY_AMT) as capital_gain_loss 
from buy join sell
 ON buy.stock_name = sell.stock_name 


order by stock_name 