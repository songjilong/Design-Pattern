package code.visitor;

/**
 * @author songjilong
 * @date 2020/4/26 22:42
 */
public interface Visitor {
    /**
     * 访问学生元素
     */
    void visit(Student student);

    /**
     * 访问老师元素
     */
    void visit(Teacher teacher);
}
