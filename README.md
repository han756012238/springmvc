# springmvc
springmvc

@Controller与@RestController区别：
@RestController注解，它继承自@Controller注解。它本身使用@Controller和@ResponseBody注解，这样返回类型都被当作responsebody处理。
因此，当返回类型为String时页面直接打印出字符串，而不是寻找相应的页面。

controller给页面传值{message}接收不到：
${}是el表达式,jsp默认支持，如果浏览器里能看见${xxx},说明没有被识别。需要设置<%@ page isELIgnored="false" %>，默认是true。