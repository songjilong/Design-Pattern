package code.composite;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author song
 * @create 2020/4/7 12:29
 */
public class Client {
    @Test
    public void test01(){
        OrganizationComponent company = new Company("阿里巴巴");

        OrganizationComponent department1 = new Department("市场部");
        OrganizationComponent department2 = new Department("技术部");

        OrganizationComponent group1 = new Group("市场一组");
        OrganizationComponent group2 = new Group("市场二组");
        OrganizationComponent group3 = new Group("技术一组");
        OrganizationComponent group4 = new Group("技术二组");

        //添加部门
        company.add(department1);
        company.add(department2);
        //添加小组
        department1.add(group1);
        department1.add(group2);
        department2.add(group3);
        department2.add(group4);

        //打印结果
        company.print();
    }

    @Test
    public void test02(){
        Map<String, String> map = new HashMap<>();
        map.put("k1", "v1");
        map.put("k2", "v2");
        System.out.println(map);
    }
}
