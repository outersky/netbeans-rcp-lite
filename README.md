# netbeans-rcp-lite

A lite RCP(Rich Client Platform) for building desktop applications.

## Why creating netbeans-rcp-lite?

1: Netbeans platform is a very great product to based on.

1: Make it a maven project. 

1: Simplify the module system in netbeans.

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