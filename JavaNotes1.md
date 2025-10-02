[TOC]
# JAVA

# Types, Variables, Operators

## Program Structure

~~~java
class CLASSNAME {
	public static void main(String[] arguments) {
		STATEMENTS
	}
}
~~~

## Variables

> 静态类型，需显示定义变量类型，相关规则类似于C

~~~java
TYPE NAME
// example: string foo
// use "=" to give variables a value
// example: foo = "IAP 6.092"
// example: string foo = "IAP 6.092"
~~~

`boolean int double string`

## operation

`= + - * /`

`( )` >` /` and `*` > ` +` and  `-`

# More types, Methods, Conditionals
## methods

~~~java
// Adding methods
public static void NAME() {
	STATEMENTS
}
// Call a methods
NAME();
~~~

## paramaters

~~~java
public static void NAME(TYPE NAME) {
	STATEMENTS
}
// To call
NAME(EXPRESSION)
~~~

注意变量类型问题，与C类似

## Multiple Parameters

~~~java
[…] NAME(TYPE NAME, TYPE NAME) {
	STATEMENTS
}
// To call
NAME(arg1, arg2);
~~~

## Return Values

~~~java
public static TYPE NAME() {
	STATEMENTS
	return EXPRESSION;
}
~~~

> void means “no type”

## Variable Scope
Variables live in the block ({}) where theyare defined (**scope**)
Method parameters are **like** defining a **new variable** in the method

**核心规则：一个变量从它被声明的那一刻起，直到它所在的那个代码块 `{}` 结束为止，都是可用的。**

形参与实参, 方法内定义的参数不改变函数外实际的参数

## Methods: Building Blocks

* Big programs are built out of small methods
* Methods can be individually developed, tested and reused
* User of method does not need to know how it works
* In Computer Science, this is called “**abstraction**”

## Mathematical Functions

`Math.`

## conditions

### if statement

~~~java
if (CONDITION) {
	STATEMENTS
}
~~~

**Boolean operators**

`&&: logical AND`
`||: logical OR`

### else

~~~java
if (CONDITION) {
	STATEMENTS
} else {
	STATEMENTS
}
~~~

### else if

~~~java
if (CONDITION) {
	STATEMENTS
} else if (CONDITION) {
	STATEMENTS
} else if (CONDITION) {
	STATEMENTS
} else {
	STATEMENTS
}
~~~

## Conversion by method

~~~java
// int to String:
String five = 5; // ERROR!
String five = Integer.toString (5);
String five = “” + 5; // five = “5”
// String to int:
int foo = “18”; // ERROR!
int foo = Integer.parseInt (“18”);
~~~

## Comparison operator

==Do NOT call` == `on doubles!  EVER.==

~~~java
double a = Math.cos (Math.PI / 2);
double b = 0.0;
a = 6.123233995736766E-17
a == b will return FALSE!
~~~

浮点数的表示会造成精度问题，算式算出来的理论值并不是实际值。

# Loops Arrays

## Good programming style

1. use good (meaningful) names

2. Use indentation(缩进)

   > Ctrl-shift-F to auto-format the file

3. Use whitespaces

   > Put whitespaces in complex expressions

4. Do not duplicate tests
   ~~~java
   // BAD version
   if (basePay < 8.0) {
   ...
   } else if (hours > 60) {
   ...
   } else if (basePay >= 8.0 && hours <= 60){
   ...
   }
   // Good version
   if (basePay < 8.0) {
   ...
   } else if (hours > 60) {
   ...
   } else {
   ...
   }
   ~~~

## Loops

### The while operator

~~~java
while (condition) {
	statements
}
~~~

### The for operator 

~~~java
for (initialization;condition;update){
	statements
}
~~~

(`i=i+1`equals to `i++`)

### Branching Statements

* **break** terminates a for or while loop
* **continue** skips the current iteration of a loop
  and proceeds directly to the next iteratio

### Embedded loops

Scope of the variable defined in the initialization: **respective for block**

## Arrays

> * An array is an indexed list of values.
> * You can make an array of **any type**: int, double, String, etc..
> * All elements of an array must have the **same type**.
> * The index **starts at zero** and **ends at length-1.**

~~~java
// define
TYPE[]
int[] values; // array of int
int[][] values; // int[] is a type
~~~

To create an array of a given size, use the operator **new** 

~~~java
int[] values = new int[5];
~~~

or you may use a **variable** to specify the size:

~~~java
int size = 12;
int[] values = new int[size];
~~~

**Curly braces** can be used to initialize an array. It can **ONLY** be used when you declare the variable.

~~~java
int[] values = { 12, 24, -23, 47 };
~~~

To access the elements of an array, use the **[]** operator:

~~~java
values[index]
// example
int[] values = { 12, 24, -23, 47 };
values[3] = 18; // {12,24,-23,18}
int x = values[1] + 3; // {12,24,-23,18}
~~~

Each array has a **length variable** built-in that contains the length of the array.

数组有一个`.length`方法

~~~java
int[] values = new int[12];
int size = values.length; // 12
int[] values2 = {1,2,3,4,5}
int size2 = values2.length; // 5
~~~

---

<img src="./图片/javaarray.png" alt="javaarray" style="zoom:50%;" />

`main` 方法是 Java 应用程序的入口点。它的参数 `String[] arguments`（也常写作 `String[] args`）是一个**字符串数组**。

1. `String[] arguments`: 专门用来接收用户从**命令行**（或终端、IDE 配置中）在运行程序时传入的参数。

2. `System.out.println(arguments.length);`

- **作用**：打印 `arguments` 数组的**长度**，即用户本次运行程序时一共传入了几个参数。

3. `System.out.println(arguments[0]);`

- **作用**：访问并打印数组中的**第一个元素**，即用户传入的第一个参数。
- **注意**：数组的索引从 `0` 开始，所以 `[0]` 表示第一个元素。

4. `System.out.println(arguments[1]);`

- **作用**：访问并打印数组中的**第二个元素**，即用户传入的第二个参数。

---

# Classes and Objects

~~~java
Integer.MAX_VALUE
~~~

Don't defining a method inside a method

**Debugging Notes**

* Use System.out.println throughout your code to see what it’s doing

* Formatting, **Ctrl-shift-f** is your friend.

## Object oriented programming

### Why use Classes ? ( Use Baby fields as a demo )

统一变量和方法模版，避免重复定义，方便随时取用，以及做相应更改。

* Class names are Capitalized
* 1 Class = 1 file
* Having a main method means the class can be run

### Defining classes

#### Class - overview

~~~java
// Class - definition
public class Baby {
	String name;
	boolean isMale;
	double weight;
	double decibels;
	int numPoops = 0;
	void poop() {
		numPoops += 1;
		System.out.println(“Dear mother, ”+
		“I have pooped. Ready the diaper.”);
	}
}

// Class - instance
Baby myBaby = new Baby();
~~~

#### Baby fields

~~~java
public class Baby {
	TYPE var_name;
	TYPE var_name = some_value;
  
  
}
~~~

#### Baby Sibilings

~~~java
public class Baby {
	String name;
	double weight = 5.0;
	boolean isMale;
	int numPoops = 0;
	Baby[] siblings;
}
~~~

在 `Baby` 类内部声明了一个名为 `siblings` 的**实例变量**。

- **`Baby[]`**： 这表示变量的**类型**是一个**数组**，而这个数组里存放的元素类型是 `Baby` 类。
- **`siblings`**： 这是变量的名字，意为“兄弟姐妹”。

*一对多关系，自引用，递归引用*

同理，可以添加`static Baby ourBaby = new Baby();` **执行**一个创建`Baby`对象的操作

但语句必须放在变量声明/初始化环节内，即通过以下途径声明/初始化：

1. 在成员变量声明初始化
   **每个 `Baby` 对象都拥有一个默认的 `ourBaby`**，在声明它的同时进行初始化

2. 先声明，后在构造函数中初始化
   将初始化的工作放在构造函数里，这样可以传递参数，进行更复杂的操作

3. 先声明，在某个方法中初始化
   在某个方法被调用时才创建这个对象

4. 使用静态变量（如果这个`Baby`是共享的）
   如果你希望**所有 `Baby` 对象都共享同一个 `ourBaby`**（即只有一个），那么你需要使用 `static` 关键字。

**方法对比表格：**

| 初始化方式           | 语法示例                                       | 执行时机                                                     | 特点与用途                                                   |
| :------------------- | :--------------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| **声明时初始化**     | `Baby ourBaby = new Baby();`                   | 在**构造函数之前**执行，每次创建实例对象时都会执行           | 简单直接，适用于简单的默认值初始化。但要警惕循环依赖和无限递归。 |
| **构造函数中初始化** | `public Baby() { this.ourBaby = new Baby(); }` | 在**创建实例对象时**执行，在声明初始化之后执行               | **最常用、最灵活**。可接收参数，可进行复杂逻辑，可调用其他方法。 |
| **静态块初始化**     | `static { ourBaby = new Baby(); }`             | 在**类被加载到内存时**执行，**仅一次**                       | 用于初始化**静态成员**（`static` 变量），适合加载昂贵资源或需异常处理的初始化。 |
| **实例块初始化**     | `{ ourBaby = new Baby(); }`                    | 在**每次创建实例对象时**执行，在声明初始化之后、构造函数之前执行 | 不常用，可用于将多个构造函数的公共初始化代码提取出来。       |


#### make this baby

~~~java
Baby ourBaby = new Baby();
~~~

#### Constructors

~~~java
// Define Class
public class CLASSNAME{ 
	CLASSNAME ( ) {
	}
	CLASSNAME ([ARGUMENTS]) {
	}
	}

// Use Class
CLASSNAME obj1 = new CLASSNAME(); 
CLASSNAME obj2 = new CLASSNAME([ARGUMENTS])
  
// Baby constructors
public class Baby {
	String name;
	boolean isMale;
  
	Baby(String myname, boolean maleBaby){  // 初始化baby对象，类似于python的__init__方法
		name = myname;
		isMale = maleBaby;
	}
  
}
~~~

* Constructor name == the class name

* No return type – never returns anything

* Usually initialize fields

* All classes need at least one constructor 
  – If you don’t write one, defaults to

  ~~~java
  CLASSNAME () {
  }
  ~~~

#### Baby Methods

~~~java
public class Baby {
	String name = “Slim Shady”;
	...
	void sayHi() {
	System.out.println(
	“Hi, my name is.. “ + name);
	}
}

public class Baby {
	String weight = 5.0;
	void eat(double foodWeight) {
	if (foodWeight >= 0 &&
			foodWeight < weight) {
			weight = weight + foodWeight;
			}
	}
}

public class Baby {
	String name;
	double weight = 5.0;
	boolean isMale;
	int numPoops = 0;
	Baby[] siblings;
	void sayHi() {…}
	void eat(double foodWeight) {…}
}
~~~

### Using Classes

#### Classes and Instances

~~~java
// class Definition
public class Baby {…}
// class Instances
Baby shiloh = new Baby(“Shiloh Jolie-Pitt”, true);
Baby knox = new Baby(“Knox Jolie-Pitt”, true);
~~~

#### Accessing fields

> `Object.FIELDNAME`

~~~java
Baby shiloh = new Baby(“Shiloh Jolie-Pitt”,
												true)
System.out.println(shiloh.name);
System.out.println(shiloh.numPoops);
~~~

#### Calling Methods

> `Object.METHODNAME([ARGUMENTS])`

~~~java
Baby shiloh = new Baby(“Shiloh Jolie-Pitt”,
											true)
shiloh.sayHi() ; // “Hi, my name is ...”
shiloh.eat(1);
~~~

## References vs Values

### Primitives vs References

原始类型 和 引用类型

* Primitive types are basic java types
  * int, long, double, boolean, char, short, byte, float
  * The actual values are stored in the variable
* Reference types are **arrays** and **objects**
  * String, int[], Baby, …

---

**How java stores primitives**

* Variables are like fixed size cups
* Primitives are small enough that they just fit into the cup

**How java stores objects**

* Objects are too big to fit in a variable
  * Stored somewhere else
  * Variable stores a number that locates the object（地址）

#### reference

==The object’s location is called a **reference**==

* == compares the references

  ~~~java
  Baby shiloh1 = new Baby(“shiloh”);
  Baby shiloh2 = new Baby(“shiloh”);
  ~~~

  `shiloh1 == shiloh2` return `false`
  使用了两次`new`命令，创建了两个独立的、完全不同的 `Baby` 对象。虽然这两个 `Baby` 对象内部的 `name` 属性值可能都是 `"shiloh"`（即它们的内容相等），但它们位于内存中的两个不同位置，拥有两个不同的地址。
  <img src="./图片/java引用.png" alt="java引用" style="zoom:50%;" />

* Using = updates the reference.
  ~~~java
  baby1 = baby2
  ~~~

* using [ ] or ·
  – Follows the reference to the object
  – May modify the object, but never the reference

* Imagine
  – Following directions to a house
  – Moving the furniture around

*  Analogous to
  – Following the reference to an object
  – Changing fields in the object

| 特性            | **原始类型 (Primitive Types)**                               | **引用类型 (Reference Types)**                               |
| :-------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| **本质**        | Java 语言中最基本、内置的数据类型                            | 对**对象**或**数组**的引用（可以理解为“地址”或“遥控器”）     |
| **包括**        | `int`, `long`, `double`, `boolean`, `char`, `short`, `byte`, `float` | 类（如 `String`, 你自己定义的 `Baby`）、接口、数组（如 `int[]`） |
| **存储内容**    | **实际的值**本身（例如 `5`, `3.14`, `true`）                 | 一个指向**对象在内存中地址**的引用（地址值），而**非对象本身** |
| **内存分配**    | 在**栈内存 (Stack)** 中直接分配空间存储值                    | 对象本身存储在**堆内存 (Heap)** 中，变量（引用）存储在栈内存中，并指向堆中的对象 |
| **默认值**      | 有默认值（如 `int` 为 `0`，`boolean` 为 `false`）            | 默认值为 `null`（表示尚未指向任何对象）                      |
| **赋值操作**    | 直接**复制值**                                               | **复制引用地址**，使得两个变量指向**同一个对象**             |
| **比较 (`==`)** | 比较的是**值**是否相等                                       | 比较的是**引用地址**是否相同（即是否指向同一个对象），而非对象内容是否相同 |

### Methods and references

~~~java
void doSomething(int x, int[] ys, Baby b) {
	x = 99;
	ys[0] = 99;
	b.name = “99”;
}
...
int i = 0;
int[] j = {0};
Baby k = new Baby(“50”, true);
doSomething(i, j, k);
~~~

- `i` 的值是 **0**（基本类型，值传递，未改变）。
- `j` 的值是 **{99}**（数组引用类型，通过引用修改了元素）。
- `k` 的值是 **一个Baby对象，其name属性为"99"**（对象引用类型，通过引用修改了属性）。

---

==Java中，方法参数传递是值传递：==

- 对于基本类型（如int），传递的是值的副本，修改副本不影响原始值。
- 对于引用类型（如数组和对象），传递的是引用的副本，但通过引用可以修改原始对象的内容。

## static types and methods

### static

* Applies to fields and methods
*  Means the field/method
  – Is defined for the class declaration,
  – Is not unique for each instance

代表变量和方法全类通用

Non-static methods can reference static methods, but not the other way around

- **非静态方法可以引用静态方法**
- **静态方法不能引用非静态方法或变量**

- **静态成员**（static）：属于类，通过`类名.成员`访问
- **实例成员**（非static）：属于对象，通过`对象.成员`访问
- **访问规则**：静态方法只能直接访问其他静态成员；实例方法既可以访问实例成员，也可以访问静态成员。

### `main` must be `static`

如何在main里访问非静态变量？

——可以在 `main` 方法内部**创建该类的实例对象**，然后通过这个**对象**来访问所有非静态的变量和方法。

例如：
~~~java
public class MyProgram {

    // 一个非静态变量
    int nonStaticVariable = 10;

    // 一个非静态方法
    public void nonStaticMethod() {
        System.out.println("这是一个非静态方法！");
    }

    // 静态的main方法
    public static void main(String[] args) {
        // 直接访问会报错！
        // System.out.println(nonStaticVariable); // 错误！
        // nonStaticMethod(); // 错误！

        // 正确的做法：创建本类的实例对象
        MyProgram myObject = new MyProgram(); // 这就是“桥梁”

        // 然后通过对象来访问
        System.out.println(myObject.nonStaticVariable); // 正确！输出 10
        myObject.nonStaticMethod(); // 正确！输出 "这是一个非静态方法！"
    }
}
~~~

# Access Control, Class Scope, Packages, Java API

## Access Control

### Public vs. Private

* Public: others can use this

- ﻿﻿Private: only the class can use this

public/private applies to any field or method

### Why Access Control

- ﻿﻿Protect private information (sorta)
- ﻿﻿Clarify how others should use your class
- ﻿﻿Keep implementation separate from interface

## Class Scope

> **作用域**指的是变量在代码中"存活"和可以被访问的范围。在 Java 中，作用域主要由大括号 `{}` 来界定。

1. 方法级作用域

~~~java
void method(int arg1) {
    int arg2 = arg1 + 1;  // arg1和arg2只能在这个方法内访问
}
~~~

- 变量在其声明的**方法内部**有效
- 方法执行结束后，这些变量就被销毁

2. 类作用域
   ~~~java
   class Example {
       int memberVariable;  // ← 类级变量
       
       void setVariable(int newVal) {
           memberVariable += newVal;  // ← 任何方法都可以访问
       }
   }
   ~~~

   - 变量在其声明的**类内部**的任何地方都有效
   - 类的所有方法都可以访问这些变量
   - 生命周期与对象实例相同

3. 变量隐蔽

   当局部变量（包括方法参数）与实例变量同名时，**局部变量具有更高的优先级**。这被称为"变量遮蔽"。

   ~~~java
   public class Baby {
       int servings;  // 实例变量（类级作用域）
       
       void feed(int servings) {  // 方法参数（方法级作用域）
           servings = servings + servings;  // ❌ 问题在这里！
       }
       
       void poop() {
           System.out.println("All better!");
           servings = 0;  // ✅ 正确访问实例变量
       }
   }
   ~~~

    `feed` 方法中的问题
   ~~~java
   void feed(int servings) {
       servings = servings + servings;
   }
   ~~~
   
   - 这里的两个 `servings` 都指的是**方法参数**，而不是实例变量
   - 相当于：`参数 = 参数 + 参数`
   - **实例变量 `servings` 完全没有被修改**

解决方法：使用`This`keywords

- Clarifies scope

- Means 'my object'

- ﻿﻿（类似于Python类中的`self`关键字）

~~~java
Usage:
   class Example {
   int memberVariable;
   void setVariable(int newVal) {
   		this.memberVariable += newVal;
   		}
   }
~~~

在本例中，改写`feed`方法为：

~~~java
void feed(int servings) {
    this.servings = this.servings + servings;  // ✅ 明确指定实例变量
}
~~~

- `this.servings` 明确指向实例变量
- `servings` 指向方法参数

## Package

- Each class belongs to a package
- ﻿﻿Classes in the same package serve a similar purpose
- ﻿﻿Packages are just directories
- ﻿﻿Classes in other packages need to be imported

### Defining Packages

~~~java
package path.to.package.foo; // foo: 占位符
class Foo {
•••
}
~~~

### Using Packages

~~~java
import path.to.package.foo.Foo; 
import path.to.package.foo.*;
~~~

**Demo**

~~~java
package adult;
import parenttools.Baby;
import parenttools.BabyFood;
public class Parent {
	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.feed(new BabyFood());
  }
}
~~~

### Why Packages

- Combine similar functionality
  将功能相关的类组织在一起，形成一个模块化的单元。
  结构清晰，易于理解和维护。当你看到一个类的全名（包名+类名），你就能立刻知道它的功能范畴。

  * org.boston libraries.Library

  * org.boston.libraries.Book

- ﻿﻿Separate similar names
  解决类名冲突的问题。允许在不同的上下文中使用相同的类名。
  这是 Java 管理庞大生态系统（有成千上万的类）的基石。如果没有包，你就不能使用别人已经用过的类名。

  * shopping.List

  * packing.List

### Special Packages

All classes "see" classes in the same package (по import needed)
在同一个包中的类，可以**直接访问**彼此，而**不需要使用 `import` 语句**。

All classes "see" classes in java.lang
`java.lang` 包下的所有类（如 `String`, `System`, `Integer` 等）会被**编译器自动导入**到每一个 Java 程序中。

Example: java.lang.String; java.lang.System

## Java API

Java includes lots of packages/classes

Reuse classes to avoid extra work

http://java.sun.com/javase/6/docs/api/

### Arrays with items
> Create the array bigger than you need
> Track the next “available” slot

**使用索引跟踪法来模拟“动态”数组**。

1. **预留空间**：创建一个比当前所需更大的数组。
2. **指针跟踪**：使用一个整型变量（如 `nextIndex`）来记录数组中下一个可用的空位置。

~~~java
Book[] books = new Book[10];
int nextIndex = 0;
books[nextIndex] = b;
nextIndex = nextIndex + 1;
~~~

### ArrayList

> Modifiable list
> Internally implemented with arrays

**Features**

* Get/put items by index
* Add items
* Delete items
* Loop over all items

<img src="./图片/Array和ArrayList.png" style="zoom:50%;" />

~~~java
// Usage:
import java.util.ArrayList;
class ArrayListExample {
	public static void main{String[] arguments) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Evan"); 
    strings.add("Eugene"); 
    strings.add("Adam");
		System.out.printIn(strings.size());
		System.out.printIn(strings.get(0));
		System.out.printIn(strings.get(1));
		strings.set(0, "Goodbye"); 
    strings.remove(1);
		for (int i = 0; i < strings.size(); i++) {
				System.out.println(strings.get(i));
		｝
		for (String s : strings) {
				System.out.printIn(s);
		}
	}
}
// Another Usage (Made by DeepSeek)
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        
        // 添加元素
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add(1, "Orange"); // 在索引1处插入
        System.out.println("After additions: " + fruits); // [Apple, Orange, Banana, Cherry]
        
        // 获取元素
        String secondFruit = fruits.get(1);
        System.out.println("Element at index 1: " + secondFruit); // Orange
        
        // 修改元素
        fruits.set(2, "Blueberry");
        System.out.println("After set: " + fruits); // [Apple, Orange, Blueberry, Cherry]
        
        // 删除元素
        fruits.remove("Orange"); // 按对象删除
        fruits.remove(0);        // 按索引删除
        System.out.println("After removals: " + fruits); // [Blueberry, Cherry]
        
        // 其他操作
        System.out.println("Size: " + fruits.size()); // 2
        System.out.println("Contains 'Cherry'? " + fruits.contains("Cherry")); // true
        System.out.println("Index of 'Blueberry': " + fruits.indexOf("Blueberry")); // 0
        
        // 遍历 - 增强for循环
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 与数组转换
        String[] fruitArray = fruits.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(fruitArray));
    }
}
~~~

### Sets

> **元素的唯一性**
>
> Like an ArrayList, but
>
> * Only one copy of each object, and
>
>   无重复元素
>
> * No array index
>   无索引，一般无顺序（TreeSet除外）

**Features**

* Add objects to the set
  **添加对象** (`add(object)`)
* Remove objects from the set
  **移除对象** (`remove(object)`)
* Is an object in the set? 
  **判断对象是否存在** (`contains(object)`)

TreeSet: Sorted (lowest to highest)
HashSet: Unordered (pseudo-random)

1. **`TreeSet`**：

   > **元素自动排序**

   - **特点**：会将元素**自动排序**（默认从低到高，或按字典序）。
   - **优点**：你可以方便地获取第一个（`first()`）、最后一个（`last()`）元素，或者获取某个范围内的子集。
   - **要求**：放入 `TreeSet` 中的元素必须是可比较的（实现 `Comparable` 接口或创建时提供 `Comparator`）。

2. **`HashSet`**：

   > **快速访问且不关心顺序**

   - **特点**：**不保证任何顺序**，元素的排列看起来是随机的（实际上是基于哈希值，但开发者不应依赖其顺序）。
   - **优点**：**添加、删除和查找的速度非常快**，是最高效的通用 Set 实现。
   - **要求**：放入 `HashSet` 的元素必须正确实现 `hashCode()` 和 `equals()` 方法。

`HashSet` 的插入、删除、查找操作的时间复杂度接近常数时间 O(1)，

而 `TreeSet` 的这些操作是对数时间 O(log n)，因为需要维护排序。

~~~java
// Usage-TreeSet
import java.util.TreeSet; // 1. 导入TreeSet类

class SetExample {
    public static void main(String[] arguments) {
        // 2. 创建一个TreeSet来存放字符串
        TreeSet<String> strings = new TreeSet<String>();

        // 3. 添加元素（注意：重复添加相同元素会被自动忽略）
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam"); // 此时集合内有3个元素

        // 4. 打印集合大小（元素个数）
        System.out.println(strings.size()); // 输出：3

        // 5. 利用TreeSet有序的特性，获取第一个和最后一个元素
        System.out.println(strings.first()); // 输出："Adam"（按字典序排第一）
        System.out.println(strings.last());  // 输出："Evan"（按字典序排最后）

        // 6. 移除一个元素
        strings.remove("Eugene");

        // 7. 遍历集合（增强for循环）
        for (String s : strings) {
            System.out.println(s);
        }
        // 输出：
        // Adam
        // Evan
    }
}

// Usage-HashSet
import java.util.HashSet;
import java.util.Set;

public class SocialNetworkExample {

    public static void main(String[] args) {
        // 1. 初始化用户的好友列表
        // 小明的好友：小红、小刚、小芳
        Set<String> xiaomingFriends = new HashSet<>();
        xiaomingFriends.add("小红");
        xiaomingFriends.add("小刚");
        xiaomingFriends.add("小芳");

        // 小华的好友：小刚、小芳、小丽
        Set<String> xiaohuaFriends = new HashSet<>();
        xiaohuaFriends.add("小刚");
        xiaohuaFriends.add("小芳");
        xiaohuaFriends.add("小丽");

        System.out.println("小明的好友: " + xiaomingFriends);
        System.out.println("小华的好友: " + xiaohuaFriends);

        // 2. 核心功能：查找共同好友
        Set<String> commonFriends = new HashSet<>(xiaomingFriends); // 先复制小明的好友列表
        commonFriends.retainAll(xiaohuaFriends); // 保留也存在于小华好友列表中的好友

        System.out.println("小明和小华的共同好友: " + commonFriends);

        // 3. 扩展操作：合并好友圈（并集）
        Set<String> allFriends = new HashSet<>(xiaomingFriends);
        allFriends.addAll(xiaohuaFriends); // 添加小华的所有好友，自动去重
        System.out.println("合并后的好友圈: " + allFriends);

        // 4. 扩展操作：小明独有的好友（差集）
        Set<String> onlyInXiaoming = new HashSet<>(xiaomingFriends);
        onlyInXiaoming.removeAll(xiaohuaFriends); // 移除同时是小华好友的人
        System.out.println("只属于小明的好友: " + onlyInXiaoming);

        // 5. 动态更新：小明新认识了一个朋友
        String newFriend = "小强";
        if (xiaomingFriends.add(newFriend)) {
            System.out.println("成功添加新好友: " + newFriend);
        } else {
            System.out.println(newFriend + " 已经是好友了。");
        }
        System.out.println("更新后小明的好友: " + xiaomingFriends);

        // 尝试重复添加同一好友
        System.out.println("再次尝试添加小强: " + xiaomingFriends.add(newFriend)); // 输出 false

        // 6. 查找特定好友
        String searchFriend = "小丽";
        if (allFriends.contains(searchFriend)) {
            System.out.println(searchFriend + " 在合并好友圈中。");
        }
    }
}
~~~

**增强for循环：**

~~~java
for (元素类型 局部变量 : 要遍历的数组或集合) {
    // 循环体，使用局部变量进行操作
}
~~~

如：
~~~java
for (String s : strings) {
    System.out.println(s);
}
~~~

TreeSet 与 HashSet 的接口的申明格式问题（见附页）

### Maps

> Stores a (key, value) pair of objects
> Look up the key, get back the value
> Example: Address Book
>
> * Map from names to email addresses
>
> Map 是一种用于存储 **“键-值对”** 的数据结构。你可以把它想象成一个**字典**或**通讯录**：*（类似于Python中的字典）*
>
> - **键**：用于查找的唯一标识，就像字典里的**单词**或通讯录里的**姓名**。
> - **值**：键所对应的具体数据，就像单词的**解释**或姓名对应的**电话号码/邮箱**。

TreeMap: Sorted (lowest to highest)
HashMap: Unordered (pseudo-random)

| **核心功能** | 存储 (key, value) 对象对，通过键查找值           | 查字典：通过“Apple”这个键，找到“苹果”这个值                |
| ------------ | ------------------------------------------------ | ---------------------------------------------------------- |
| **TreeMap**  | 按键的**自然顺序**（如字母序、数字大小）进行排序 | 一本按字母顺序排列的字典                                   |
| **HashMap**  | **不保证顺序**，查找速度通常非常快               | 一本单词排列看起来是随机的，但通过特殊索引能快速找到的字典 |

**1. 创建Map并添加键值对**

```java
// 创建一个键和值都是String类型的HashMap
HashMap<String, String> strings = new HashMap<String, String>();

// 使用 put() 方法添加键值对
strings.put("Evan", "email1@mit.edu");
strings.put("Eugene", "email2@mit.edu");
strings.put("Adam", "email3@mit.edu");
```

**2. 基本操作**

```java
System.out.println(strings.size()); // 获取Map中键值对的数量，输出 3
strings.remove("Evan"); // 通过键"Evan"来移除整个键值对
System.out.println(strings.get("Eugene")); // 通过键"Eugene"查找对应的值，输出 "email2@mit.edu"
```

**3. 三种遍历方式（重点）**
这是Map操作中最重要的部分，对应三种不同的视角：

```java
// 1. 遍历所有的键（Key）
for (String s : strings.keySet()) {
    System.out.println(s); // 输出: Adam, Eugene (顺序不确定，因为HashMap无序)
}

// 2. 遍历所有的值（Value）
for (String s : strings.values()) {
    System.out.println(s); // 输出: email3@mit.edu, email2@mit.edu
}

// 3. 遍历所有的键值对（Entry） - 最常用、信息最完整的方式
for (Map.Entry<String, String> pairs : strings.entrySet()) {
    // pairs.getKey() 获取键， pairs.getValue() 获取值
    System.out.println(pairs); 
    // 输出格式类似： Adam=email3@mit.edu
}
```

**关键要点与总结**

- **键的唯一性**：Map 中每个**键**必须是唯一的。如果你用已存在的键再次调用 `put()` 方法，新的值会**覆盖**旧的值。
- **选择哪种Map**：
  - 如果需要**快速访问且不关心顺序**，用 `HashMap`（最常用）。
  - 如果需要**按键自动排序**，用 `TreeMap`。
  - 如果需要保持**键的插入顺序**，可以用 `LinkedHashMap`。
- **`Map.Entry`**：表示一个键值对对象，是遍历时获取完整信息最高效的方式。


​        **TreeMap 示例：自动排序的映射**

```java
import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // 创建TreeMap - 按键的自然顺序自动排序
        TreeMap<String, String> emailMap = new TreeMap<>();    
    // 添加键值对（注意：故意不按字母顺序添加）
    emailMap.put("Evan", "email1@mit.edu");
    emailMap.put("Zoe", "zoe@mit.edu");     // Z开头的名字
    emailMap.put("Adam", "adam@mit.edu");   // A开头的名字
    emailMap.put("Maria", "maria@mit.edu"); // M开头的名字
    
    System.out.println("=== TreeMap 自动排序演示 ===");
    
    // 1. 遍历键集 - 会自动按字母顺序排序
    System.out.println("\n1. 按键顺序遍历:");
    for (String name : emailMap.keySet()) {
        System.out.println(name + " -> " + emailMap.get(name));
    }
    // 输出结果会是：Adam, Evan, Maria, Zoe（按字母顺序）
    
    // 2. 遍历键值对 - 同样保持排序
    System.out.println("\n2. 键值对遍历:");
    for (Map.Entry<String, String> entry : emailMap.entrySet()) {
        System.out.println(entry.getKey() + " = " + entry.getValue());
    }
    
    // 3. TreeMap 特有的方法 - 利用排序特性
    System.out.println("\n3. TreeMap 特有方法:");
    System.out.println("第一个键（最小的）: " + emailMap.firstKey());        // Adam
    System.out.println("最后一个键（最大的）: " + emailMap.lastKey());       // Zoe
    System.out.println("比 'Evan' 大的第一个键: " + emailMap.higherKey("Evan")); // Maria
    System.out.println("比 'Maria' 小的第一个键: " + emailMap.lowerKey("Maria")); // Evan
    
    // 4. 获取子映射（范围查询）
    System.out.println("\n4. 范围查询（从C到P）:");
    Map<String, String> subMap = emailMap.subMap("C", "Q");
    for (String key : subMap.keySet()) {
        System.out.println(key + " -> " + subMap.get(key));
    }
    // 输出：Evan, Maria（因为它们在C和Q之间）
}
}
```
### Warnings

Using TreeSet/TreeMap?
	Read about Comparable interface
Using HashSet/HashMap?
	Read about equals, hashCode methods
Note: This only matters for classes you build, not for java built-in types

**当你把自己定义的类（如 `Student`, `Book`, `Product`）作为 `TreeSet/TreeMap` 的键或元素，或者作为 `HashSet/HashMap` 的键时，你必须为这个类提供相应的比较或相等性判断方法，否则程序可能不会按你期望的方式工作，甚至直接报错。**

*（详情见附页）*



---

<div style="page-break-after: always;"></div>

# 附页

## Public and static

`public`：公共类
`static`：静态，变量和方法在类中只有一份实例，被修改时会影响所有变量。

**访问修饰符：public 与 无public (默认/包私有)**

| 特性方面     | **有 public 修饰**                                      | **无 public 修饰 (默认权限, 包私有)**                    |
| :----------- | :------------------------------------------------------ | :------------------------------------------------------- |
| **访问范围** | **所有类** (可跨包，需导入)                             | **仅同一包内**的类可以访问                               |
| **修饰对象** | 类、变量、方法                                          | 类、变量、方法                                           |
| **继承性**   | 可以被子类继承                                          | **不能**被子类继承                                       |
| **权限等级** | 最宽松                                                  | 比 `private` 和 `protected` 更严格，但比 `public` 更严格 |
| **代码示例** | `public int count;` <br> `public void doSomething() {}` | `int count;` <br> `void doSomething() {}`                |
| **主要用途** | 声明对外接口或需要广泛共享的常量                        | 包内共享的辅助方法或变量，隐藏包外实现细节               |

**变量：static 与 无static (实例变量)**

| 特性方面       | **无 static (实例变量)**                         | **有 static (静态变量/类变量)**                 |
| :------------- | :----------------------------------------------- | :---------------------------------------------- |
| **归属**       | 属于**单个对象** (每个对象独立一份)              | 属于**类本身** (所有对象共享一份)               |
| **内存分配**   | 每个对象被创建时，在**堆内存**中分配独立空间     | 在类加载时，于**方法区**中初始化，仅分配一次    |
| **调用方式**   | 通过**对象名**访问 (如 `a.numPoops`)             | 主要通过**类名**访问 (如 `Baby.numPoops`)       |
| **生命周期**   | 与对象共存亡 (对象被回收，变量即消失)            | 与类共存亡 (随类的加载而存在，随类的卸载而消失) |
| **值的影响**   | 修改一个对象的变量，**不影响**其他对象的同名变量 | 修改该变量，**所有**对象访问到的值都会改变      |
| **初始化时机** | 在对象被创建 (`new`) 时初始化                    | 在类被加载时初始化                              |
| **代码示例**   | `public int instanceVar;`                        | `public static int classVar;`                   |

**方法：static 与 无static (实例方法)**

| 特性方面         | **无 static (实例方法)**               | **有 static (静态方法/类方法)**                          |
| :--------------- | :------------------------------------- | :------------------------------------------------------- |
| **归属**         | 属于**对象实例**                       | 属于**类本身**                                           |
| **调用方式**     | 通过**对象名**访问 (如 `obj.method()`) | 通过**类名**访问 (如 `ClassName.method()`)               |
| **内部访问权限** | 可直接访问**实例成员**和**静态成员**   | **只能直接访问静态成员**，不能直接访问实例成员           |
| **关键字使用**   | 可使用 `this` 和 `super` 关键字        | **不能**使用 `this` 和 `super` 关键字                    |
| **重写与隐藏**   | 可以被子类**重写** (Override)          | 只能被子类**隐藏** (Hide)，而非重写                      |
| **生命周期**     | 与对象绑定                             | 与类绑定                                                 |
| **代码示例**     | `public void instanceMethod() {}`      | `public static void staticMethod() {}`                   |
| **主要用途**     | 处理与对象实例状态相关的操作           | 执行与类相关、不依赖对象实例状态的操作（常用作工具方法） |

核心概念与记忆技巧

*   **`public` vs. 无`public`**：核心是思考“谁可以访问”。`public` 是对外公开，无 `public` 是包内共享。
*   **`static` vs. 无`static`**：核心是思考“它属于谁”。`static` 属于类，无 `static` 属于对象实例。判断一个方法是否需要定义为 `static`，一个很实用的技巧是：**如果方法体内没有使用任何实例变量（即没有使用到对象的特有状态），这个方法通常就可以考虑定义为静态方法**。

组合使用与注意事项

这些修饰符经常组合使用，例如：
*   `public static`：常用于工具类方法和常量（如 `Math.PI`, `Arrays.asList()`），方便通过类名直接调用。
*   `private static`：常用于类内部使用的静态常量或需要在类所有实例间共享但又不想对外暴露的数据。
*   实例方法（无 `static`）可以调用静态方法，但**静态方法不能直接调用实例方法**（除非先创建对象）。

---

## TreeSet与HashSet 接口问题

| 特性对比       | `Set<String> strings = new TreeSet<>();` (接口/父类声明) | `TreeSet<String> strings = new TreeSet<>();` (具体类声明)    |
| :------------- | :------------------------------------------------------- | :----------------------------------------------------------- |
| **声明类型**   | **接口 (`Set`)** 或 **父类**                             | **具体实现类 (`TreeSet`)**                                   |
| **编程范式**   | **面向接口/抽象编程**                                    | **面向实现编程**                                             |
| **灵活性**     | **高**。可轻松替换实现（如换为`HashSet`）                | **低**。代码与`TreeSet`强绑定，更换实现需修改多处            |
| **可访问方法** | 仅能调用 `Set` 接口定义的方法                            | 可调用 `TreeSet` 所有公有方法（包括`first()`, `last()`等特有方法） |
| **代码通用性** | **强**。强调“需要一个不重复的集合”                       | **弱**。强调“需要一个红黑树实现的有序集合”                   |
| **推荐程度**   | **推荐**，符合最佳实践                                   | 在需要`TreeSet`特有功能时使用                                |

| 特性对比       | `Set<String> strings = new HashSet<>();` (接口声明)          | `HashSet<String> strings = new HashSet<>();` (具体类声明)    |
| :------------- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| **声明类型**   | **接口 (`Set`)**                                             | **具体实现类 (`HashSet`)**                                   |
| **编程范式**   | **面向接口编程**                                             | **面向实现编程**                                             |
| **灵活性**     | **高**。可轻松替换为其他`Set`实现（如`LinkedHashSet`, `TreeSet`） | **低**。代码与`HashSet`强绑定，更换实现需修改代码            |
| **可访问方法** | 仅能调用 `Set` 接口定义的方法（如 `add()`, `remove()`, `contains()`） | 可调用 `HashSet` 所有公有方法（包括`clone()`等特有方法，但`HashSet`特有方法较少） |
| **代码通用性** | **强**。强调“需要一个不重复元素的集合”，不关心具体实现       | **弱**。强调“需要一个基于哈希表实现的快速访问集合”           |
| **推荐程度**   | **推荐**，符合面向接口编程原则，提升代码可维护性和扩展性     | 在需要强调使用`HashSet`特定底层实现或极少需要切换实现时使用  |

## 自定义类的Set和Maps避坑指南

>  Using TreeSet/TreeMap?
> 	Read about Comparable interface
> Using HashSet/HashMap?
> 	Read about equals, hashCode methods
> Note: This only matters for classes you build, not for java built-in types

**当你把自己定义的类（如 `Student`, `Book`, `Product`）作为 `TreeSet/TreeMap` 的键或元素，或者作为 `HashSet/HashMap` 的键时，你必须为这个类提供相应的比较或相等性判断方法，否则程序可能不会按你期望的方式工作，甚至直接报错。**

下面这个表格清晰地总结了这两种情况的核心规则和后果：

| 你想使用的集合            | 核心要求（你必须为你自定义的类做这件事）                     | 如果你不遵守，会发生什么？                                   |
| :------------------------ | :----------------------------------------------------------- | :----------------------------------------------------------- |
| **`TreeSet` / `TreeMap`** | 让类实现 **`Comparable` 接口**，并定义 `compareTo()` 方法，告诉集合如何对你的对象进行排序。 | 程序在运行时（比如添加元素时）会抛出 **`ClassCastException`** 异常并崩溃。 |
| **`HashSet` / `HashMap`** | **正确重写 `equals()` 和 `hashCode()` 方法**，告诉集合如何判断两个你的对象是否“相等”，以及如何高效地找到它们。 | 集合将无法正确去重和查找，会出现**重复元素**、**查找失败**等逻辑错误，但程序不会报错，更难排查。 |

---

### 🌳 针对 `TreeSet/TreeMap` 的详解

`TreeSet` 和 `TreeMap` 的内部是**基于树结构**的，它们会**自动对元素进行排序**。

**问题来了：** 如果你创建了一个 `Book` 类，那么当你把 `Book` 对象放入 `TreeSet` 时，树结构会问：“我应该把你的这本《Book A》放在《Book B》的前面还是后面？我怎么知道谁大谁小？”

**解决方案：** 你必须实现 `Comparable` 接口，在 `compareTo` 方法中定义比较规则。

**代码示例：**
```java
// 正确的做法：实现 Comparable 接口
public class Book implements Comparable<Book> {
    private String title;
    
    @Override
    public int compareTo(Book otherBook) {
        // 规定按书名排序
        return this.title.compareTo(otherBook.title);
    }
}

// 现在可以正常使用了
TreeSet<Book> bookSet = new TreeSet<>();
bookSet.add(new Book("Java Guide"));
bookSet.add(new Book("Algorithms")); // 会根据书名 "Algorithms" 和 "Java Guide" 自动排序
```

---

### ⚙️ 针对 `HashSet/HashMap` 的详解

`HashSet` 和 `HashMap` 的内部是**基于哈希表**的，它们的核心功能是**快速查找和去重**。

**它们依靠两个方法来工作：**
1.  `hashCode()`: 快速定位到对象的“大概位置”。
2.  `equals()`: 在找到的“大概位置”上精确比较对象是否相等。

**问题来了：** 如果你没有在你的类中正确重写这两个方法，Java 会使用从 `Object` 类继承来的默认实现。默认的 `equals()` 只检查是否是同一个对象（`==`），默认的 `hashCode()` 通常基于内存地址。这会导致即使内容相同的两个对象，也被认为是不同的。

**代码示例：**
```java
// 有问题的类
public class Student {
    public String id;
    // 没有重写 equals 和 hashCode
}

// 使用时会出问题
Student s1 = new Student("123");
Student s2 = new Student("123"); // 内容相同，但不是同一个对象

HashSet<Student> set = new HashSet<>();
set.add(s1);
set.add(s2);

System.out.println(set.size()); // 输出 2！出现了重复元素，这通常不是我们想要的
```

**解决方案：** 必须同时重写 `equals()` 和 `hashCode()`，并且要确保一个基本原则：**如果两个对象通过 `equals()` 比较是相等的，那么它们的 `hashCode()` 返回值也必须相等**。

```java
// 正确的做法：重写 equals 和 hashCode
public class Student {
    public String id;
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id); // 根据id判断是否相等
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id); // 根据id生成哈希码
    }
}

// 现在可以正常使用了
Student s1 = new Student("123");
Student s2 = new Student("123");
HashSet<Student> set = new HashSet<>();
set.add(s1);
set.add(s2);
System.out.println(set.size()); // 输出 1！正确去重
```

---

### 💡 关于图中的 “Note”

**“Note: This only matters for classes you build, not for java built-in types.”**

这句话是告诉你：**这个警告只对你自定义的类有效。**

对于 Java 内置的类，如 `String`、`Integer`、`Date` 等，Sun/Oracle 的工程师早就为你正确实现了 `Comparable`、`equals()` 和 `hashCode()` 方法。这就是为什么你可以直接这样用，而不会出错：

```java
TreeSet<String> names = new TreeSet<>(); // String 已实现 Comparable
HashSet<Integer> numbers = new HashSet<>(); // Integer 已正确重写 equals 和 hashCode
```

### 💎 总结

记住这个简单的法则：
-   要用 **`TreeSet`/`TreeMap`** → 让你的类 `implements Comparable`，定义 `compareTo`。
-   要用 **`HashSet`/`HashMap`**（作为键）→ 重写 `equals()` 和 `hashCode()`。

这张图是你从“简单使用集合”到“正确使用集合”的关键一步，理解它非常重要！

---

## 注解

在 Java 中，以 `@` 符号开头的标识符被称为**注解**。它自 JDK 5.0 引入，是一种代码级别的元数据，其本身并不直接影响代码逻辑，而是为代码提供额外的信息或指令，这些信息可以被编译器、开发工具或运行时框架读取并利用。

### 🔍 注解的核心作用

简单来说，注解主要有以下三大作用：

| 作用领域           | 说明                                                 | 典型例子                                                     |
| :----------------- | :--------------------------------------------------- | :----------------------------------------------------------- |
| **编译器指令**     | 指导编译器进行特定检查或操作，从源头确保代码正确性。 | `@Override`（检查方法重写），`@SuppressWarnings`（抑制编译警告）。 |
| **代码分析工具**   | 为各类开发工具提供信息，用于生成文档、分析代码等。   | `@Deprecated`（标记过时元素，在文档中提示）。                |
| **运行时框架处理** | 在程序运行时，通过反射机制被框架读取，实现复杂功能。 | Spring 框架中的 `@Autowired`（依赖注入）。                   |

### 📚 常见的预定义注解

Java 提供了一些内置注解，以下是五个最常用的：

| 注解                       | 主要功能                                                     |
| :------------------------- | :----------------------------------------------------------- |
| **`@Override`**            | 标记一个方法旨在重写父类中的方法。编译器会检查该方法是否真的成功重写，有助于避免因拼写错误导致的意外行为。 |
| **`@Deprecated`**          | 标记某个程序元素（类、方法、字段等）已过时，不建议继续使用。通常编译器会给出警告，并可以提供替代方案的说明。 |
| **`@SuppressWarnings`**    | 指示编译器忽略特定的警告信息（如`"unchecked"`表示忽略泛型相关的未检查警告）。可用于类、方法、字段等。 |
| **`@FunctionalInterface`** | 标记一个接口是函数式接口，确保该接口只有一个抽象方法。方便使用 Lambda 表达式。 |
| **`@SafeVarargs`**         | 在方法或构造器使用可变参数（varargs）且参数类型是泛型时，用于抑制可能产生的“堆污染”警告。 |

### 🛠️ 自定义注解与元注解

除了使用内置注解，你还可以创建自己的注解，这就需要用到**元注解**——即用于修饰其他注解的注解。

**1. 定义自定义注解**
使用 `@interface` 关键字来定义，注解内可以声明一些“元素”（类似方法），这些元素可以带有默认值。
```java
public @interface MyAnnotation {
    String value() default "default_value"; // 一个名为value的元素
    int priority() default 0;
}
```

**2. 关键元注解**
定义自定义注解时，通常需要用到元注解来指定其行为，最重要的两个是：

| 元注解           | 功能说明                                                     |
| :--------------- | :----------------------------------------------------------- |
| **`@Target`**    | 指定注解可以应用在哪些程序元素上。例如 `ElementType.METHOD` 表示该注解只能用于方法。 |
| **`@Retention`** | 指定注解的生命周期，即注解信息保留到哪个阶段。关键是 `RetentionPolicy.RUNTIME`，表示注解在运行时可通过反射读取，这是许多框架（如 Spring）依赖的基础。 |

一个相对完整的自定义注解例子如下：
```java
@Target(ElementType.METHOD) // 该注解只能用于方法
@Retention(RetentionPolicy.RUNTIME) // 注解信息在运行时可用
public @interface MyCustomAnnotation {
    String author() default "Anonymous";
    String date();
    int version() default 1;
}
```

### 💡 总结与价值

简单来说，Java 注解就像是贴在代码上的“标签”或“指令贴”。它本身不做任何事情，但它所携带的信息可以被编译器、工具或框架识别，从而完成编译检查、生成代码、配置行为等强大功能。

正是由于注解的存在，才使得像 Spring 这样“约定优于配置”的现代开发框架成为可能，极大地简化了企业级应用的开发。

希望这些解释能帮助你理解 Java 中的 `@` 注解。如果你对某个具体的注解或应用场景有进一步的疑问，我们可以继续探讨。

## Comparable and Comparator

理解 `Comparable` 和 `Comparator` 的区别确实是掌握 Java 排序的关键。它们虽然都用于对象比较，但设计初衷和使用场景截然不同。下面这个表格能帮你快速把握它们的核心区别：

| 特性对比     | **Comparable (自然排序)**              | **Comparator (定制排序)**               |
| :----------- | :------------------------------------- | :-------------------------------------- |
| **核心概念** | 对象的**内在**默认排序规则（自然顺序） | **外部**定义的灵活排序规则              |
| **包位置**   | `java.lang`                            | `java.util`                             |
| **接口方法** | `int compareTo(T o)`                   | `int compare(T o1, T o2)`               |
| **实现位置** | 在需要比较的**类内部实现**             | 在**独立的类**或匿名内部类/Lambda中实现 |
| **侵入性**   | **侵入式**，需要修改原类               | **非侵入式**，无需修改原类              |
| **排序规则** | 一个类通常只有一种自然顺序             | 可为同一类创建**多种**排序规则          |
| **调用方式** | `Collections.sort(list)`               | `Collections.sort(list, comparator)`    |

### 🌱 详解 Comparable (自然排序)

`Comparable` 接口让类的对象自身就具备比较能力，这种比较规则被认为是对象的“自然顺序”。例如，`String` 类按字典序排序、`Integer` 按数值大小排序，这些都是自然排序的典型例子。

**如何使用 Comparable：**
1.  让类实现 `Comparable<T>` 接口。
2.  重写 `compareTo(T o)` 方法，定义比较逻辑。

**示例：为学生类定义按年龄排序的自然顺序**
```java
class Student implements Comparable<Student> {
    private String name;
    private int age;

    // 构造方法、getter、setter 省略...

    @Override
    public int compareTo(Student other) {
        // 按年龄进行自然排序
        return Integer.compare(this.age, other.age);
    }
}
```
使用这个自然排序非常简单：
```java
List<Student> students = ... ; // 获取学生列表
Collections.sort(students); // 使用 Comparable 实现的自然排序
```

`compareTo` 方法的返回值需要遵循特定规则：
-   **正整数**：当前对象大于参数对象 (`this > other`)
-   **零**：当前对象等于参数对象 (`this == other`)
-   **负整数**：当前对象小于参数对象 (`this < other`)

### 🛠️ 详解 Comparator (定制排序)

当需要对一个类进行多种不同方式的排序，或者无法修改类的源代码（例如使用第三方库的类）时，`Comparator` 是理想的选择。它允许你定义外部比较器，实现高度灵活的排序规则。

**如何使用 Comparator：**
1.  创建一个类实现 `Comparator<T>` 接口（或使用匿名内部类、Lambda表达式）。
2.  重写 `compare(T o1, T o2)` 方法，定义比较逻辑。

**示例：为学生类定义按姓名排序的定制规则**
```java
// 方式1：实现一个独立的比较器类
class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

// 使用独立比较器类
List<Student> students = ... ;
Collections.sort(students, new StudentNameComparator());
```

**更简洁的现代写法（Lambda表达式）：**
```java
List<Student> students = ... ;
// 使用Lambda表达式按姓名排序
Collections.sort(students, (s1, s2) -> s1.getName().compareTo(s2.getName()));

// Java 8 以后更推荐的写法：使用Comparator.comparing
Collections.sort(students, Comparator.comparing(Student::getName));
```

`Comparator` 的强大之处还在于支持**多级排序**。例如，先按成绩降序排列，成绩相同的再按姓名升序排列：
```java
Comparator<Student> sophisticatedComparator = Comparator
    .comparing(Student::getScore, Comparator.reverseOrder()) // 成绩降序
    .thenComparing(Student::getName); // 成绩相同则按姓名升序
```

### 💡 如何选择：Comparable 还是 Comparator？

记住这个原则：**如果对象有一种公认的、主要的排序方式，使用 `Comparable`；如果需要多种排序方式，或者排序规则是特定场景下的，使用 `Comparator`**。

-   **选择 `Comparable` 的情况**：
    -   对象有一个**明确的、自然的比较顺序**（如时间先后、数值大小、字典序）。
    -   你**能够修改该类的源代码**。
    -   你预期这个排序规则将是该对象**最常用**的排序方式。

-   **选择 `Comparator` 的情况**：
    -   需要为同一个类提供**多种不同的排序规则**（如对学生列表按年龄、姓名、成绩等多种方式排序）。
    -   **无法修改类的源码**（例如对第三方库中的类进行排序）。
    -   排序规则是**临时的**，或者只在特定业务逻辑中使用。
    -   需要实现复杂的**多级排序**。

### ⚠️ 重要注意事项

1.  **与 `equals` 方法的一致性**：实现 `Comparable` 接口时，强烈建议保持 `compareTo` 方法与 `equals` 方法结果的一致性。即当 `compareTo` 返回 0 时，`equals` 方法应返回 `true`。这对于使用 `SortedSet`（如 `TreeSet`）和 `SortedMap`（如 `TreeMap`）的集合非常重要，否则可能导致重复元素判断异常。

2.  **`Comparator` 的现代工具方法**：Java 8 为 `Comparator` 接口引入了许多强大的静态方法（如 `comparing`、`thenComparing`、`reverseOrder` 等），利用这些方法可以极大地简化比较器的编写。

### 💎 总结

`Comparable` 和 `Comparator` 是 Java 中实现对象排序的两种互补机制。`Comparable` 定义了对象**内在的、默认的**排序行为，而 `Comparator` 提供了**外部的、灵活的**排序策略。理解它们的区别并根据具体场景做出正确选择，是编写清晰、灵活且易于维护的 Java 代码的重要基础。

希望这些解释能帮助你彻底理解 `Comparable` 和 `Comparator`！

---

## Integer

参考文档：https://download.oracle.com/technetwork/java/javase/6/docs/zh/api/java/lang/Integer.html

Integer 类是 Java 中一个非常基础且重要的类，它是基本数据类型 `int` 的包装类。下面这个表格汇总了它的核心信息，帮你快速建立整体认识。

| 特性方面          | 说明                                                         |
| :---------------- | :----------------------------------------------------------- |
| **本质与包位置**  | `java.lang.Integer`，是 `int` 的包装类，无需手动导入。       |
| **继承与实现**    | 继承 `Number` 类，实现 `Comparable` 接口，被 `final` 修饰，不可被继承。 |
| **核心字段**      | `private final int value;`，用于存储 `int` 值。              |
| **核心功能**      | 将 `int` 视为对象处理，提供 `int` 与 `String` 间的转换、进制转换、比较等方法。 |
| **常量**          | 提供 `MAX_VALUE`、`MIN_VALUE`、`SIZE`、`TYPE` 等有用常量。   |
| **对象创建**      | 构造函数（如 `new Integer(10)`）或静态方法（如 `Integer.valueOf(10)`）。 |
| **自动装箱/拆箱** | Java 5+ 支持 `Integer num = 42;`（自动装箱）和 `int value = num;`（自动拆箱）。 |
| **常量池**        | 对 -128 到 127 的整数，`Integer.valueOf()` 会返回缓存的对象。 |

### 🔧 核心方法与常量

Integer 类提供了丰富的方法和常量，是其强大功能的体现。

**1. 常用方法举例**
- **数值转换**：`Integer.parseInt(String s)` 将字符串转换为 `int` 值。使用时需注意，如果字符串包含非数字字符，会抛出 `NumberFormatException`。
    ```java
    int num = Integer.parseInt("456"); // 将字符串 "456" 转换为 int 值 456
    ```
- **进制转换**：`toBinaryString()`, `toHexString()`, `toOctalString()` 可将 `int` 值转换为二、十六、八进制字符串。
    ```java
    String binary = Integer.toBinaryString(10); // 将10转换为二进制字符串 "1010"
    ```
- **对象比较**：`compareTo()` 用于比较两个 `Integer` 对象的值。
    ```java
    Integer a = 5;
    Integer b = 15;
    System.out.println(a.compareTo(b)); // 输出 -1，因为5小于15
    ```

**2. 重要常量**
Integer 类定义了几个有用的常量：
- `Integer.MAX_VALUE`：表示 `int` 类型能存储的最大值，即 \(2^{31}-1\)（2147483647）。
- `Integer.MIN_VALUE`：表示 `int` 类型能存储的最小值，即 \(-2^{31}\)（-2147483648）。
- `Integer.SIZE`：表示 `int` 值的二进制位数（32位）。
- `Integer.TYPE`：表示基本类型 `int` 的 Class 对象。

### ⚠️ 注意事项与特性

1.  **"==" 与 `equals()` 的区别**
    这是使用 Integer 时最容易出错的地方。
    - `==` 比较的是对象的**内存地址**是否相同。
    - `equals()` 比较的是**包装的值**是否相等。

    由于常量池的存在，对于 -128 到 127 之间的整数，`Integer.valueOf()` 或自动装箱会返回缓存的对象，此时 `==` 比较可能为 `true`。但超出此范围或使用 `new` 创建的对象，`==` 比较就会为 `false`。因此，**比较两个 Integer 对象的值是否相等，应始终使用 `equals()` 方法**。

2.  **数值溢出**
    `int` 类型有固定的范围。如果计算结果超出 `Integer.MAX_VALUE` 或 `Integer.MIN_VALUE`，会发生**整数溢出**。例如，`Integer.MAX_VALUE + 1` 的结果是 `Integer.MIN_VALUE`。在对安全性要求高的计算中需要注意这一点。

3.  **自动装箱与性能**
    虽然自动装箱和拆箱很方便，但在密集的循环中，频繁的装箱和拆箱可能会带来不必要的对象创建和内存开销，影响性能。在这些场景下，直接使用 `int` 可能更高效。

### 📚 主要用途

- **泛型与集合**：Java 的泛型不支持基本类型，所以要将 `int` 值存入 `ArrayList` 等集合时，必须使用 `Integer`。
- **区分 null 和 0**：`Integer` 可以为 `null`，可以表示“未知”或“未赋值”的状态，而 `int` 默认值永远是 `0`。
- **对象化操作**：当需要将 `int` 作为对象传递或使用其提供的方法时（如进制转换、字符串转换）。

希望这些解释能帮助你全面理解 Java 中的 Integer 类。
