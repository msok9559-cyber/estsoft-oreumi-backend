package day06;

public class Teacher extends Person {
    private  int id;
    private  String subject;

    public Teacher(String name, int age, Gender gender, int id, String subject) {
        super(name, age, gender);
        setId(id);
        this.subject = subject;
    }
    public Teacher() {this(null,0,Gender.UNDISCLOSED,0,null);}

    public int getId() {return id;}
    public String getSubject() {return subject;}
    public void setId(int id) {
        // TODO: 올바른 ID인지 검사하고 나서 필드에 작성
        this.id = id;
    }
    public void setSubject(String subject) {this.subject = subject;}

    @Override
    public void print(){
        super.print();
        System.out.println("Teacher ID: " + id);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}
