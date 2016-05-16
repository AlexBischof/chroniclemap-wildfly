This repository serves as example for using chroniclemap with value types for JavaEE as describe at

[http://blog.siteos.de//java/javaee/chroniclemap/2016/05/16/How-To-Use-ChronicleMap-With-JavaEE.html](http://blog.siteos.de//java/javaee/chroniclemap/2016/05/16/How-To-Use-ChronicleMap-With-JavaEE.html)

### Usage

In order to produce the failure delete all *$$* classes and proceed the following lines.

 - mvn clean package
 - cd postalcode
 - mvn exec:java -Dexec.mainClass="test.MyMap"
 - cd ../wildfly
 - mvn wildfly:run