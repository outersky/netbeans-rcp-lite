# netbeans-rcp-lite

The original netbeans project uses ant to build, I just tried to remove all build magic and make it a simple maven project. 

## build

```
mvn clean install
```

## run rcp demo

```
mvn -p rcp
```

or in Netbeans, right click rcp project, and click `Run`

## run elsewhere

```
cd rcp
mvn clean package
```

just copy target/rcp-*.jar & target/lib dir to somewhere, and run `java -jar rcp-*.jar` 


## screenshots

![RCP demo](doc/rcp-demo.png)