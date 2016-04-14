# springmvc
springmvc

步骤：
1、配置web.xml(spring)
   在 web.xml 中需要配置 DispatcherServlet, 它用于处理符合规则的外部请求, 并将请求分发给合适的控制器来处理。
   spring mvc 约定去 WEB-INF 下查找 [servlet-name]-servlet.xml ( /WEB-INF/mvc-dispatcher-servlet.xml ) 文件作为其配置文件。
2、配置[servlet-name]-servlet.xml(springmvc)
   InternalResourceViewResolver 用于支持 servlet 和 jsp 视图的解析。
   视图的逻辑位置为：prefix + 逻辑名称 + suffix, 如逻辑名称为 hello, 则视图的逻辑位置为 /WEB-INF/pages/hello.jsp。
3、编写controller
   返回类型可以有多种：ModelAndView, Model, ModelMap, Map,View, String, void。
4、编写页面
   页面名称要与controller层命名一致。

@Controller与@RestController区别：
@RestController注解，它继承自@Controller注解。它本身使用@Controller和@ResponseBody注解，这样返回类型都被当作responsebody处理。
因此，当返回类型为String时页面直接打印出字符串，而不是寻找相应的页面。

controller给页面传值{message}接收不到：
${}是el表达式,jsp默认支持，如果浏览器里能看见${xxx},说明没有被识别。需要设置<%@ page isELIgnored="false" %>，默认是true。