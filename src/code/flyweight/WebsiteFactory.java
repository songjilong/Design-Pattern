package code.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author songjilong
 * @date 2020/4/14 13:12
 */
public class WebsiteFactory {

    /**
     * 以 HashMap 作为对象池
     */
    private Map<String, ConcreteWebsite> pool = new HashMap<>();

    /**
     * 从对象池中返回指定类型的对象，没有则创建
     */
    public AbstractWebsite getWebsite(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }
        return pool.get(type);
    }

    /**
     * 计算对象池中对象的个数
     */
    public int count() {
        return pool.size();
    }
}
