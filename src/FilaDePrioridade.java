class FilaDePrioridades {
    private int tamanho, front, rear,rear2;

    private char vet[];

    FilaDePrioridades(){
        tamanho = 5;
        vet = new char[5];
        front = 0;
        rear = 0;
        rear2=0;
    }
    FilaDePrioridades(int n) {
        tamanho = n;
        vet = new char[tamanho];
        front = 0;
        rear = 0;
        rear2=0;
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
    void store(int n,char elem) {
        if (n == 1) {
            if (isfull()) {
                System.out.println("Overflow!");
                System.exit(1);
            } else {
                if(rear==0) {

                    vet[rear] = elem;
                    rear = next(rear);

                }
                else{

                rear++;
                        vet[rear] = elem;
                        rear= next(rear);
                }

                }


        }
        if (n == 2) {
            if (isfull()) {
                System.out.println("Overflow!");
                System.exit(1);
            } else {

                vet[rear] = elem;
                rear = next(rear);
            }

        } else if (n == 3) {
            if (isfull()) {
                System.out.println("Overflow!");
                System.exit(1);
            } else {

                vet[rear] = elem;
                rear = next(rear);
            }

        }
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
        FilaDePrioridades fp = new FilaDePrioridades(10);

        System.out.println("verificando status inicial da fila...");
        System.out.println("esta? vazia? "+fp.isempty());
        System.out.println("esta? cheia? "+fp.isfull());
        System.out.println("incluindo o caractere A...");

        fp.store(1,'A');
        System.out.println("verificando status da fila...");
        System.out.println("esta? vazia? "+fp.isempty());
        System.out.println("esta? cheia? "+fp.isfull());
        System.out.println("incluindo o caractere B...");
        fp.store(2,'B');
        System.out.println("incluindo o caractere C...");
        fp.store(3,'C');
        fp.store(1,'D');
        System.out.println("realizando 3 retrieves na seq??ncia...");
        System.out.println(fp.retrieve());
        System.out.println(fp.retrieve());
        System.out.println(fp.retrieve());
        System.out.println(fp.retrieve());
        System.out.println("verificando status da fila...");
        System.out.println("est? vazia? "+fp.isempty());
        System.out.println("est? cheia? "+fp.isfull());
    }
}
