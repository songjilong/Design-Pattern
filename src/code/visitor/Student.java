package code.visitor;

/**
 * @author songjilong
 * @date 2020/4/26 22:36
 */
public class Student implements Element{
    private String name;
    private Integer score;
    private Integer paperCount;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public Student(String name, Integer score, Integer paperCount) {
        this.name = name;
        this.score = score;
        this.paperCount = paperCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getPaperCount() {
        return paperCount;
    }

    public void setPaperCount(Integer paperCount) {
        this.paperCount = paperCount;
    }
}
