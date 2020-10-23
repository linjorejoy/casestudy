# TRUYUM CASE STUDY

## A SAMPLE CASE STUDY IN A MALL

### Packages and Classes

* com.cognizant.truyum.dao
  * CartDao  --> (I)
  * CartDaoCollectionImpl
  * CartDaoCollectionImplTest
  * CartDaoSqlImpl
  * CartDaoSqlImplTest
  * CartEmptyException
  * ConnctionHandler
  * MenuItemDao  --> (I)
  * MenuItemDaoCollectionImpl
  * MenuItemDaoColelctionImplTest
  * MenuItemDaoSqlImpl
  * MenuItemDaoSqlImplTest
  * package-info
* com.cognizant.truyum.model
  * Cart
  * MenuItem
  * package-info
* com.cognizant.truyum.util
  * DateUtil
  * package-info


<br>
<br>

---
---
### SQL TABLES
---
<br>

#### MENU_ITEMS

|Field| Type|Null|Key|Default|Extra|
|---|---|---|---|---|---|
|id|int(11)|NO|PRI|1||
|item_name|varchar(45)|NO||NULL||
|price|float|NO||NULL||
|active|tinyint(4)|NO||NULL||
|date_of_launch|date|NO||NULL||
|category|varchar(45)|NO||NULL||
|free_delivery|varchar(45)|NO||NULL||  

<br>
<br>
  
#### USER

|Field| Type|Null|Key|Default|Extra|
|---|---|---|---|---|---|
|user_id|int(11)|NO|PRI|NULL||
|user_name|varchar(45)|NO||NULL||

<br>
<br>
  
#### CART

|Field| Type|Null|Key|Default|Extra|
|---|---|---|---|---|---|
|cart_id|int(11)|NO|PRI|0||
|ct_user_id|int(11)|YES|MUL|NULL||
|ct_menu_id|int(11)|YES|MUL|NULL||

<br>

> CART.ct_user_id = user.user_id  
> CART.ct_menu_id = menu_item.id
