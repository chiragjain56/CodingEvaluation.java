package Unit4C3.q2;

public class UnChecked {
    public static void main(String[] args) {
        String a = "Chirag";
        String b = "Jain";
        if(a!=b){
            try{
                throw new equalException();
            }catch (equalException e){
                e.getMessage();
            }
        }

    }
}
class  EqualExceptin extends RuntimeException{
    public EqualExceptin(){
        super();
    }


}
