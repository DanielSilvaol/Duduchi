public class PilhaChar{
   private int tamanho ,topo;
   private char vet[];

   PilhaChar(){
      tamanho = 5;
      vet=new char[5];
      topo = -1;
   }
   
   PilhaChar(int n){
      tamanho=n;
      vet=new char[tamanho];
      topo=-1;
   }
   
   boolean isfull(){
      if (topo==tamanho-1)
         return true;
      else
         return false;
   }
   void push(char elem){
   
      if(isfull()){
      
         System.out.println("Overflow!");
         System.exit(1);
      }
      else
         vet[++topo]=elem;
   
   }
   
   boolean isempty(){
      if(topo ==-1){
         return true;
      }
      else{
         return false;
      }
   }
   char pop(){
      if(isempty()){
         System.out.println("Underflow");
         System.exit(1);
      } 
      return vet[topo--];
   }
   char top(){
      if(isempty()){
      
         System.exit(1);
         System.out.println("Underflow!");
      
      }
      return vet[topo];
   }

   void destroy(){

      topo=-1;
   }





   public static void main(String[] args) {
      System.out.println("criando uma pilha de caracteres com 10 elementos...");
      PilhaChar2 p1 = new PilhaChar2(10);
      System.out.println("verificando status inicial da pilha...");
      System.out.println("est? vazia? "+p1.isempty());
      System.out.println("est? cheia? "+p1.isfull());
      System.out.println("incluindo o caractere A...");
     // p1.push('A');
      System.out.println("verificando status da pilha...");
      System.out.println("est? vazia? "+p1.isempty());
      System.out.println("est? cheia? "+p1.isfull());
      System.out.println("incluindo o caractere B...");
    //  p1.push('B');
      System.out.println("incluindo o caractere C...");
     // p1.push('C');
      System.out.println("realizando 3 pops na seq??ncia...");
    //  System.out.println(p1.pop());
    //  System.out.println(p1.pop());
     // System.out.println(p1.pop());
      System.out.println("verificando status da pilha...");
      System.out.println("est? vazia? "+p1.isempty());
      System.out.println("est? cheia? "+p1.isfull());
   
   }
   
}