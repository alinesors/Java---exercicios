import java.util.Random;
import java.util.Scanner;

public class lista1 {
    
    Scanner sc = new Scanner(System.in);

    
    public void questao1(){
    
        String mensagem;
        int i;
    
        System.out.println("Digite uma mensagem: ");
        mensagem = sc.nextLine();

        char[] arrayMensagem = mensagem.toCharArray();
        char[] criptografia = new char[arrayMensagem.length];

        for(i = 0; i < arrayMensagem.length; i++){

            if(arrayMensagem[i] >= 65 && arrayMensagem[i] <= 90){
                if(arrayMensagem[i] >= 88){
                    criptografia[i] = (char) (arrayMensagem[i] - 23);
                }
                else{
                    criptografia[i] = (char)(arrayMensagem[i] + 3);
                }
            } 
            else if(arrayMensagem[i] >= 97 && arrayMensagem[i]<= 122){
                if(arrayMensagem[i] >= 120){
                    criptografia[i] = (char) (arrayMensagem[i] - 23);
                }else{
                    criptografia[i] = (char)(arrayMensagem[i] + 3);
                }
            }
            else{
                criptografia[i] = arrayMensagem[i];
            }
        }
        System.out.println(criptografia);
    }

    public void questao2(){

        //classe que instancia numeros aleatorios
        Random rand = new Random();
        //sorteia um numero aleatorio, 0 e 99
        int sorteado = rand.nextInt(100);
        //incremento garantindo que o numero sorteado esteja no range 1 e 100
        sorteado = sorteado + 1;
        
        System.out.println("\nJOGO DA ADIVINHACAO");
        System.out.println("Descubra o numero que estou pensando...");
        System.out.println("o numero esta entre 1 e 100");
        System.out.println("Digite o numero, voce tem ate 10 tentativas: ");

        int palpite = sc.nextInt();

        for(int i = 0; i < 10; i++){

            if(palpite < sorteado){
                System.out.println("Muito baixo!");
            }else if (palpite == sorteado){
                System.out.println("Acertou!\n");
                break;
            }else if (palpite > sorteado){
                System.out.println("Muito alto!");
            }

            //ultima tentativa
            if(i == 9){
                System.out.println("Suas tentativas acabaram! :( o numero era: " + sorteado);
                break;
            }
            System.out.println("Tente novamente:\n");
            palpite = sc.nextInt();
        }
    }

    public void questao3(){

        int numero, soma;
    
        for(numero = 1; numero <= 10000; numero++){
            soma = 0;
            for(int i = 1; i < numero; i++){
                if(numero % i == 0){
                    soma = soma + i;
                }
            }

            if(soma == numero){
                System.out.print(numero + " e um numero perfeito (divisores: ");
            
                for(int i = 1; i < numero; i++){
                    if(numero % i == 0){
                        System.out.print(i + " ");
                    }
                }
                 System.out.println(")");
            }
        }
    }

    public void questao4(){

        int n, m, count = 0, i, j;

        System.out.println("\ndigite a quantidade de linhas: ");
        n = sc.nextInt();

        System.out.println("\ndigite a quantidade de colunas: ");
        m = sc.nextInt();

        System.out.println("\ndigite os valores da matriz: ");
        int[][] matriz = new int[n][m];

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                if(matriz[i][j] == 0){
                    count++;
                }
            }
        }

        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }      
                    
        if(count >= n * m * 0.7){
            System.out.println("a matriz e esparsa");
        }else{
            System.out.println("a matriz nao e esparsa");
        }
    }

    public void questao5(){

        int array[] = new int[9];

        System.out.println("digite uma sequencia de 9 numeros:");
        for(int i = 0; i < 9; i++){
            array[i] = sc.nextInt();
        }

        int soma, maxSoma = array[0], inicio = 0, fim = 0;
        for(int i = 0; i < 9; i++){
            soma = 0;
            for(int j = i; j < 9; j++){
                soma = soma + array[j];
                if(soma > maxSoma){
                    maxSoma = soma;
                    inicio = i;
                    fim = j;
                }
            }
        }

        System.out.println("A soma maxima da subsequencia e: " + maxSoma);
        System.out.print("sequencia: [");
        for(int i = inicio; i <= fim; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("]");
    }

    public void questao6(){
         
        int num, aux;
        boolean existe;
        
        Random rand = new Random();
        System.out.println("digite a quantodade de numeros que deseja: ");
        num = sc.nextInt();
        int random;

        int sorteados[] = new int[num];

        for(int i = 0; i < num; i++){
            random = rand.nextInt(1000) + 1;
            existe = false;
            for(int j = 0; j <= i; j++){
                if(random == sorteados[j]){
                    existe = true;
                }
            }

            if(!existe){
                sorteados[i] = random;
            }
            else{
                i--;
            }
        }

        for(int i = 0; i < num; i++){
            for(int j = 0; j < num - 1; j++){
                if(sorteados[j] > sorteados[j + 1]){
                    aux = sorteados[j];
                    sorteados[j] = sorteados[j + 1];
                    sorteados[j + 1] = aux;
                }
            }
        }
        for(int i = 0; i < num; i++){
            if(i ==  num - 1){
                System.out.print(sorteados[i]);
            }
            else{
                System.out.print(sorteados[i] + ", " );
            }
        }
        System.out.println("\n");
    }

    public void questao7(){

        String frase;
        boolean existe;
        int count;
        int aux, letrasCount = 0;
        sc.nextLine(); //limpeza do buffer
        System.out.println("escreva algo: ");
        frase = sc.nextLine();

        char mensagem[] = frase.toCharArray();
        char letras[] = new char[mensagem.length]; //guardar cada caracter

        for(int i = 0; i < mensagem.length; i++){
            existe = false;
            count = 0;
            for(int j = 0; j < mensagem.length; j++){
                if(mensagem[i] == letras[j]){
                    existe = true;
                }
            }
            if(mensagem[i] == 32 || existe){
                continue; // pula o loop
            }
            
            //caso nao exista
            aux = (int)mensagem[i];
            for(int j = i; j < mensagem.length; j++){
                if(mensagem[j] == aux){
                    count++;
                }
            }

            System.out.print(mensagem[i] + ": ");// letra

            for(int j = 0; j < count; j++){// qtd *
                 System.out.print("*");
            }

            letras[letrasCount] = mensagem[i]; // add letra no ventor de letras e aumenta a qtd der lteras no letras[]
            letrasCount++;

            System.out.println("\n");

        }
    }

    public static void main (String arg[]){
    
        lista1 l = new lista1();
        l.questao1();
        l.questao2();
        l.questao3();
        l.questao4();
        l.questao5();
        l.questao6();
        l.questao7();

        
    }
}