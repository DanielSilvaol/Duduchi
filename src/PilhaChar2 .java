
class PilhaChar2 {
// �rea de dados
   private int tamanho, topo;
   private char vet[];
   private int topo2;
// Construtor com tamanho fixo
   PilhaChar2(){
      tamanho = 5;
      vet = new char[5];
      topo = -1;
      topo2 =  tamanho ;
   } // Construtor com tamanho vari�vel apartir de n
   
   PilhaChar2(int n) {
      tamanho = n;
      vet = new char[tamanho];
      topo = -1;
      topo2 = vet.length;
   
   }
   boolean isempty(){
      if (topo == -1 && topo2 == tamanho )
         return true;
      else
         return false;
   }
   char pop(int po){
      if(po == 1){
         if(isempty()){
            System.out.println("Underflow!");
            System.exit(1);
         //return '*';
         }
      //else
         return vet[topo--];
      }
      else{
         if(isempty()){
            System.out.println("Underflow!");
            System.exit(1);
         //return '*';
         }
      //else
         return vet[topo2++];
      }
   }
   char top(int lado){
      if(lado == 1){
         if(isempty()){
            System.out.println("Underflow!");
            System.exit(1);
         //return '*';
         } //else
         return vet[topo];
      }
      else{
         if(isempty()){
            System.out.println("Underflow!");
            System.exit(1);
         //return '*';
         } //else
         return vet[topo2];
      }
   }
   void destroy(){
      topo=-1;
     
      topo2 =  tamanho+1 ;
   
   }
   boolean isfull(){
      if (topo+1==topo2)
         return true;
      else
         return false;
   }
   void push(int lado, char elem){
      if(lado == 1){
         if(isfull()){
            System.out.println("Overflow!");
            System.exit(1);
         }
         else
            vet[++topo]=elem;
      }
      else{
         if(isfull()){
            System.out.println("Overflow!");
            System.exit(1);
         }
         else{
            vet[--topo2]=elem;
         
         }
      
      }   
   }
   public static void main(String[] args) {
      System.out.println("criando uma pilha de caracteres com 10 elementos...");
      PilhaChar2 p1 = new PilhaChar2(10);
      System.out.println("verificando status inicial da pilha...");
      System.out.println("esta vazia? "+p1.isempty());
      System.out.println("esta cheia? "+p1.isfull());
      System.out.println("incluindo os caracteres...");
      p1.push(2,'P');
      p1.push(2,'I');
      p1.push(2,'L');
      p1.push(2,'H');
      p1.push(2,'A');
      System.out.println("verificando status da pilha...");
      System.out.println("esta vazia? "+p1.isempty());
      System.out.println("esta cheia? "+p1.isfull());
      System.out.println("incluindo os caracteres");
      p1.push(1,'T');
      p1.push(1,'E');
      p1.push(1,'S');
      p1.push(1,'T');
      p1.push(1,'E');
      System.out.println("esta vazia? "+p1.isempty());
      System.out.println("esta cheia? "+p1.isfull());
   
      System.out.println("realizando pops do lado 2 na sequencia...");
      System.out.println(p1.pop(2));
      System.out.println(p1.pop(2));
      System.out.println(p1.pop(2));
      System.out.println(p1.pop(2));
      System.out.println(p1.pop(2));
      System.out.println("verificando status da pilha...");
      System.out.println("esta vazia? "+p1.isempty());
      System.out.println("esta cheia? "+p1.isfull());
      
      System.out.println("realizando pops do lado 1 na sequencia...");
      System.out.println(p1.pop(1));
      System.out.println(p1.pop(1));
      System.out.println(p1.pop(1));
      System.out.println(p1.pop(1));
      System.out.println(p1.pop(1));

      System.out.println("verificando status da pilha...");
      System.out.println("esta vazia? "+p1.isempty());
      System.out.println("esta cheia? "+p1.isfull());
   
   
   }
}
