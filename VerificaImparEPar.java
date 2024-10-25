public class VerificaImparEPar {
    public static void main(String[] args) {
        
        int par=0;
        int impar=1;

        for(int i=0; i<=20;i++){
            if(i%2==0){
                System.out.println(i+" par");
            }else{
                System.out.println(i+" impar");
            }

        }
    }
    
}