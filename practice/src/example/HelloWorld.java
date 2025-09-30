package example;
import java.util.TreeSet; // 1. 导入TreeSet类
import java.util.HashSet;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world.");
	}

}

class Hello2 {
	public static void main(String[] arguments) {
		System.out.println("Hello World");
		System.out.println("LineNumber2");
	}
}

class Hello3 {
	public static void main(String[] args) {
		String foo = "IAP 6.092";
		System.out.println(foo);
		foo = "Something else";
		System.out.println(foo);
	}
}

class test {
	public static void main(String[] args) {
		int foo = (int) 5.2;
		System.out.println(foo);
	}
}

class NewLine {
	public static void newLine() {
		System.out.println("");
	}

	public static void threeLines() {
		newLine();
		newLine();
		newLine();
	}

	public static void main(String[] arguments) {
		System.out.println("Line 1");
		threeLines();
		System.out.println("Line 2");
	}
}

class Square {
	public static void printSquare(int x) {
		System.out.println(x * x);
	}

	public static void main(String[] arguments) {
		int value = 2;
		printSquare(value);
		printSquare(3);
		printSquare(value * 2);
	}
}

class Square3 {
	public static void printSquare(double x) {
		System.out.println(x * x);
	}

	public static void main(String[] arguments) {
		printSquare(5);
	}
}

class SquareChange {
	public static void printSquare(int x) {
		System.out.println("printSquare x = " + x);
		x = x * x;
		System.out.println("printSquare x = " + x);
	}

	public static void main(String[] arguments) {
		int x = 5;
		System.out.println("main x = " + x);
		printSquare(x);
		System.out.println("main x = " + x);
	}
}

//class Scope {
//	public static void main(String[] arguments) {
//		int x = 5;
//		if (x == 5) {
//			x = 6;
//			int y = 72;        // 变量的声明需放在最开始
//			System.out.println("x = " + x + " y = " + y);
//		}
//		System.out.println("x = " + x + " y = " + y);
//	}
//}

class floatcompare {
	public static void main(String[] args) {
		double a = Math.cos(Math.PI / 2);
		double b = 0.0;
		System.out.println(a == b);
	}
}

class stringlens {
	public static void main(String[] arguments) {
		System.out.println(arguments.length);
		System.out.println(arguments[0]);
		System.out.println(arguments[1]);

	}
}



class SetExample {
    public static void main(String[] arguments) {
        // 2. 创建一个TreeSet来存放字符串
        TreeSet<String> strings = new TreeSet<String>();

        // 3. 添加元素（注意：重复添加相同元素会被自动忽略）
        strings.add("Evan");
        strings.add("Eugene");
        strings.add("Adam"); // 此时集合内有3个元素
        strings.add("Adam");

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



class SocialNetworkExample {
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

