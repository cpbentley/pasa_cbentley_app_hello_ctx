

project id | pasa_cbentley_app_hello_ctx
------------ | -------------
author | Charles-Philip Bentley
tags | Java Ant
created | June 2019

Quote by Антон Павлович Чехов
> Умный любит учитьчся, а дурак - учить.

# Hello Ctx

Test the build process with core.src4 and ant.

## Installation

### How to Run / Build

[//]: # (This may be the most platform independent comment)

#### 1 Setup

* Install Java 8 **JDK** (author used 191). You need the Java _Development_ Kit, which includes the Runtime (JRE)
* Install Eclipse (author used 2019-06)
* When launching Eclipse, create or use an existing workspace where you will check out all the github repos.

* Import the first github dependency listed below

  1. Right click on link and copy link to clipboard
  2. In Eclipse, use the menu File -> Import
  3. In the dialog find Git -> Projects from Git -> Clone URI


* Import other dependencies in order use the process detailed above.

* Import the final link (actual project of this repository) using the same process.
* Optional: Check the source code.

#### Github Repository Dependencies

num | id | links
----| -- | -------------
1 | pasa_cbentley_core_src4 | [Import Link](https://github.com/cpbentley/pasa_cbentley_core_src4)
final | pasa_cbentley_app_hello_ctx | [Import Link](https://github.com/cpbentley/pasa_cbentley_app_hello_ctx)


#### Run within Eclipse
In Eclipse Project **_pasa_cbentley_app_hello_ctx_**, src folder, look up a Java file with the following method

```java
public static void main(String[] args) {

}
```

Right click on it and select Run As

![eclipse_run_as.jpg](/res/tutorial/eclipse_run_as.jpg "Optional title")

 #### <span style="color:#CC007F">Build a Jar with Ant </span>

* The Build process is always a weak link. Sure the source is open but if the build process is corrupted, the builder can insert anything in the final executable of the program.

* The build process here uses Ant from Eclipse. Some people complain Ant is old. It has advantages. To my experience and knowledge its not backdoored, its extensible and you control every step of the build process. Author does not trust magic. There is no free lunch.

* Author uses a custom build script using proguard and a preprocessor to optimize away debug statements

*  Author responsibility is to provide the complete source code.
  1. antenna-simplepreprocessor1.1-bin-with-src.jar
  2. proguard-5.3.3-bin-with-src.jar

* User responsibility.
    1. Make sure Eclipse and Ant shipping with it are \<legit\>.
    2. If your security protocol requires it, inspect and rebuild the jars in build-libs folder.

# This is an  tag
## This is an \<H2\> tag
###### This is an \<h6\> tag

- [x] this is a complete item
- [ ] this is an incomplete item
- [x] @mentions, #refs, [links](),**formatting**, and <del>tags</del> supported
- [x] list syntax required (any unordered or
