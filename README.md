# springmvc
springmvc

���裺
1������web.xml(spring)
   �� web.xml ����Ҫ���� DispatcherServlet, �����ڴ�����Ϲ�����ⲿ����, ��������ַ������ʵĿ�����������
   spring mvc Լ��ȥ WEB-INF �²��� [servlet-name]-servlet.xml ( /WEB-INF/mvc-dispatcher-servlet.xml ) �ļ���Ϊ�������ļ���
2������[servlet-name]-servlet.xml(springmvc)
   InternalResourceViewResolver ����֧�� servlet �� jsp ��ͼ�Ľ�����
   ��ͼ���߼�λ��Ϊ��prefix + �߼����� + suffix, ���߼�����Ϊ hello, ����ͼ���߼�λ��Ϊ /WEB-INF/pages/hello.jsp��
3����дcontroller
   �������Ϳ����ж��֣�ModelAndView, Model, ModelMap, Map,View, String, void��
4����дҳ��
   ҳ������Ҫ��controller������һ�¡�

@Controller��@RestController����
@RestControllerע�⣬���̳���@Controllerע�⡣������ʹ��@Controller��@ResponseBodyע�⣬�����������Ͷ�������responsebody����
��ˣ�����������ΪStringʱҳ��ֱ�Ӵ�ӡ���ַ�����������Ѱ����Ӧ��ҳ�档

controller��ҳ�洫ֵ{message}���ղ�����
${}��el���ʽ,jspĬ��֧�֣������������ܿ���${xxx},˵��û�б�ʶ����Ҫ����<%@ page isELIgnored="false" %>��Ĭ����true��