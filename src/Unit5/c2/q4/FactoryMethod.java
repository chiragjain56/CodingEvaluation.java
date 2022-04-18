package Unit5.c2.q4;

public class FactoryMethod {
    public static void main(String[] args) {
   Paper paper = MyPaperfactory.createPaper(Country.s1);
        System.out.println(paper.getDifferentSize());
    }
}

class MyPaperfactory{
    public static Paper createPaper(Country country){
        switch (country){
            case s1:return new small();
            case s2: return new medium();
            case s3 : return new large();
        }
     return null;
    }
}

interface Paper{
    public String getDifferentSize();
}

class small implements Paper {

    @Override
    public String getDifferentSize() {
        return "s1";
    }
}

class  medium implements Paper {

    @Override
    public String getDifferentSize() {
        return "s2";
    }
}
class large implements Paper {

    @Override
    public String getDifferentSize() {
        return "s3";
    }
}
enum Country {s1,s2,s3};
