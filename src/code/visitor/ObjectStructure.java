package code.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * @author songjilong
 * @date 2020/4/26 22:51
 */
public class ObjectStructure {
    /**
     * 用于存放所有元素
     */
    private List<Element> elements = new LinkedList<>();

    /**
     * 访问者访问元素的入口
     */
    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void attach(Element e) {
        elements.add(e);
    }

    public void detach(Element e) {
        elements.remove(e);
    }
}
