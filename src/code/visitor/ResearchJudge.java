package code.visitor;

/**
 * @author songjilong
 * @date 2020/4/26 22:47
 */
public class ResearchJudge implements Visitor {
    private String awardWords = "%s的论文数是%d，荣获了科研优秀奖。";

    @Override
    public void visit(Student student) {
        if(student.getPaperCount() >= 5){
            System.out.println(String.format(awardWords, student.getName(), student.getPaperCount()));
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getPaperCount() >= 10){
            System.out.println(String.format(awardWords, teacher.getName(), teacher.getPaperCount()));
        }
    }
}
