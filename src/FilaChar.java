class FilaChar {
   private int tamanho, front, rear;
   private char vet[];
   FilaChar(){
      tamanho = 5;
      vet = new char[5];
      front = 0;
      rear = 0;
   }
   FilaChar(int n) {
      tamanho = n;
      vet = new char[tamanho];
      front = 0;
      rear = 0;
   }
   int next(int n) {
      if(n == tamanho-1)
         return 0;
      else
         return n+1;
   }
   boolean isfull(){
      if (next(rear) == front)
         return true;
      else
         return false;
   }
   void store(char elem){
      if(isfull()){
         System.out.println("Overflow!");
         System.exit(1);
      }
      else
         vet[rear]=elem;
      rear = next(rear);
   }
   boolean isempty(){
      if (rear == front)
         return true;
      else
         return false;
   }
   char retrieve(){
      if(isempty()){
         System.out.println("Underflow!");
         System.exit(1);
      //return '*';
      }
   //else
      char aux = vet[front];
      front = next(front);
      return aux;
   }
   void destroy(){
      front = rear;
   }
   public static void main(String[] args) {
      System.out.println("criando fila com 10 elementos...");
      FilaChar f1 = new FilaChar(10);
      System.out.println("verificando status inicial da fila...");
      System.out.println("esta? vazia? "+f1.isempty());
      System.out.println("esta? cheia? "+f1.isfull());
      System.out.println("incluindo o caractere A...");
      f1.store('A');
      System.out.println("verificando status da fila...");
      System.out.println("esta? vazia? "+f1.isempty());
      System.out.println("esta? cheia? "+f1.isfull());
      System.out.println("incluindo o caractere B...");
      f1.store('B');
      System.out.println("incluindo o caractere C...");
      f1.store('C');
      System.out.println("realizando 3 retrieves na seq??ncia...");
      System.out.println(f1.retrieve());
      System.out.println(f1.retrieve());
      System.out.println(f1.retrieve());
      System.out.println("verificando status da fila...");
      System.out.println("est? vazia? "+f1.isempty());
      System.out.println("est? cheia? "+f1.isfull());
   }
}