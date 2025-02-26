# SpringSecurity6

## Spring Security Internal flow for Default behavior

![img.png](img.png)

![img_1.png](img_1.png)

With the help of this Cookie, we don't need to log in one more time.

![img_2.png](img_2.png)

By Default, This bean (configuration) is used (including Security Filter Chain).
org/springframework/boot/autoconfigure/security/servlet/SpringBootWebSecurityConfiguration.java



### EasyBank API
![img_3.png](img_3.png)


### User Management
- Important classes & interfaces
![img_4.png](img_4.png)

- UserDetails and Authentication
![img_5.png](img_5.png) 


```cmd
docker run -p 3306:3306 --name springsecurity -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=easybank -d mysql
```

Get these ddl statements from 

public static final String DEFAULT_USER_SCHEMA_DDL_LOCATION = "org/springframework/security/core/userdetails/jdbc/users.ddl";
```sql
create table users(username varchar_ignorecase(50) not null primary key,password varchar_ignorecase(500) not null,enabled boolean not null);
create table authorities (username varchar_ignorecase(50) not null,authority varchar_ignorecase(50) not null,constraint fk_authorities_users foreign key(username) references users(username));
create unique index ix_auth_username on authorities (username,authority);
```


Sample data
```sql
INSERT IGNORE INTO `users` VALUES ('user', '{noop}EasyBank@12345', '1');
INSERT IGNORE INTO `authorities` VALUES ('user', 'read');

INSERT IGNORE INTO `users` VALUES ('admin', '{bcrypt}$2a$12$mPHprbS37SYbqmAdzCkI7eKYlUwgqfSgzKvLZge4.XDldxqUUhlDe', '1');
INSERT IGNORE INTO `authorities` VALUES ('admin', 'admin')
```