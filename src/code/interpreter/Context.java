package code.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author songjilong
 * @date 2020/5/11 21:13
 * 环境上下文
 */
public class Context {
    private final Map<String, Integer> valueMap = new HashMap<>();

    public void addValue(final String key, final int value) {
        valueMap.put(key, value);
    }

    public int getValue(final String key) {
        return valueMap.get(key);
    }

    public Map<String, Integer> getValueMap() {
        return valueMap;
    }
}