# E_magazine_Generator
this is java project using swing, awt, and itext7..
It takes news on four topics sports,scinece,economics and politics then generates e-magazine in pdf format
user have to login and signup accordingly..

//procedure
1. install apache netbeans...
2. open the project..
3. click on build button to install all dependencies..
4. download xampp..
5. Activate Apache and mysql.. 
6. create database in xampp named e_magazine_generator..
7. in database create a table user of followig type

id -> int 11 primary key  NULL(defualt Value)
full_name -> varchar 127 NULL
email-> varchar 127 primary key NULL
password -> varchar 127 NULL
politics -> LLongtext ... as defined
science -> LLongtext ... as defined
economics -> LLongtext ... as defined
sports -> LLongtext ... as defined

//open project in netbeans;
9. change path in file named selectTemplate.java
10. also remove connection port 3307 or change it to 3306(default) or as per your device 
8. click on run button
