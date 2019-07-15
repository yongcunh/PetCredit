# petCredit
**宠物售卖和转卖分布式市场**

分布式市场可包含以下角色和功能：
```
出售人：将宠物上架、制定价格、售卖成功则收款。
购买人：选择宠物、进行购买。
宠物：ID、名称、品类（猫、狗、兔、恐龙等）、出生日期、价格、描述（一段文字供展示）等、 有效状态、图片所在url等扩展信息
管理员：帐户开户、初始化、监测市场里的宠物价格分布、售卖次数、处理纠纷。
市场：展示在售宠物列表


1. 用戶故事

    1. 寵物上架
        1. 寵物主人將寵物資料輸入系統，寵物資料有：ID,名稱，品類，出生日期，價格，描述，有效狀態，圖片所在url，寵物主人；
    2. 修改價格
        1. 寵物主人可修改價格；
    3. 寵物下架
        1. 寵物主人不想售賣時，可將寵物下架，修改有效狀態；
    4. 售賣成功收款
        1. 寵物主人查看收款；
    5. 瀏覽寵物
        1. 購買人瀏覽寵物列表；        
    6. 查看寵物詳細資料
        1. 購買人 或 寵物主人可查看 寵物詳細資料；
    7. 購買寵物
        1. 購買人選擇寵物進行下單購買；
    8. 支付
        1. 購買人對訂單進行支付；
    9. 賬戶開戶
        1. 管理員建立賬戶，初始化賬戶的金額等；
    10. 監測價格
        1. 管理員可以價格分佈統計寵物數量，比如按 0-100，100-1000，1000以上的價格分段統計寵物數量；
    11. 統計售賣次數
        1. 管理員統計整個市場寵物賣買的次數；
2. 設計要求：
    2. 每個功能的完成需提供提供rest接口；
