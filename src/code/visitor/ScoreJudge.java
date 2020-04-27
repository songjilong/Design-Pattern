package code.visitor;

/**
 * @author songjilong
 * @date 2020/4/26 22:44
 */
public class ScoreJudge implements Visitor {

    private String awardWords = "%s的分数是%d，荣获了成绩优秀奖。";

    @Override
    public void visit(Student student) {
        if(student.getScore() >= 90){
            System.out.println(String.format(awardWords, student.getName(), student.getScore()));
        }
    }

    @Override
    public void visit(Teacher teacher) {
        if(teacher.getScore() >= 85){
            System.out.println(String.format(awardWords, teacher.getName(), teacher.getScore()));
        }
    }
}
