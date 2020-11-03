### 完成度：
* 没有实现专门查询分组的接口

__Details:__

- \- 分组功能实现错误

### 测试：
* 无测试

__Details:__



### 知识点：
* 需要了解下三层架构
* 了解下lombok的使用
* 需要了解Restful实践

__Details:__

- \- 推荐使用构造器注入
- \- 违反Restful实践, 创建资源的请求应该使用POST
- \- 违反Restful实践, url不合理
- \- @CrossOrigin可以放在类上
- \- 没有使用泛型
- \- 违反Restful实践, Post请求成功后应该返回201
- \- ResponseEntity不应该侵入到Service层
- \- 应该使用Repository层保存数据
- \- 以下代码可以使用Java8 Stream简化
- \- 打乱顺序可以了解下Collections.shuffle()

### 工程实践：
* 注意单一职责，group和student应该有单独的Controller和Service

__Details:__

- \- 违反了封装性，字段应该使用private
- \- 拼写错误
- \- 未使用的import语句
- \- Magic Number

### 综合：


__Details:__



