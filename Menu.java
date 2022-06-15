import java.util.Scanner;

class Menu {
    public static double X1(double delta,double a,double b){
        double x1=((-1*b)+delta/2*a);   //Cálculo do X1
        return x1;           
    }
    public static double X2(double delta,double a,double b){
        double x2=((-1*b)-delta/2*a);   //Cálculo do X2
        return x2;                                                             
    }

    public static void Palindromo (String palavra){
        String palavraInvertida = new StringBuffer(palavra).reverse().toString();
        if(palavra.equals(palavraInvertida)){
            System.out.println("Essa palavra é um Palindromo");
        }
        else{
            System.out.println("Essa palavra não é um Palindromo");
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner( System.in);
        char opcao;

        do{
            opcao=ler.next().charAt(0);
            switch(opcao){
                case 'a':
                    double lado1, lado2, raio, pi = 3.14;
                    double baseMaior,baseMenor, areaQuadrilatero,areaC;
                    double areaT, hT,bT, hTrapezio, areaTrapezio;
                    double aH,pH,apostema;
                    int opc=ler.nextInt();

                    do{
                        System.out.println();

                        switch(opc){
                            case 1:
                                System.out.println("Digite o valor do lado 1 do quadrilátero: ");
                                lado1 = ler.nextDouble();
                                System.out.println("Digite o valor do lado 2 do quadrilátero:");
                                lado2 = ler.nextDouble();
                                areaQuadrilatero = lado1* lado2;
                                System.out.println("A área do quadrilátero é: " + areaQuadrilatero + "m²");
                            break;
                            case 2:
                                System.out.println(" Digite o valor do raio do circulo: ");
                                raio= ler.nextDouble();
                                areaC = (raio*raio) * pi;
                                System.out.println("A área do circulo é: " + areaC + "m²");
                            break;
                            case 3:
                                System.out.println("Digite o valor da altura do triângulo:");
                                hT = ler.nextDouble();
                                System.out.println("Digite o valor da base do triângulo: ");
                                bT = ler.nextDouble();
                                areaT = hT * bT / 2;
                                System.out.println(" A área do triângulo é: " + areaT + "m²");
                            break;
                            case 4:
                                System.out.println("Digite o valor da base maior do trapézio: ");
                                baseMaior = ler.nextDouble();
                                System.out.println(" Digite o valor da base menor do trapézio: ");
                                baseMenor = ler.nextDouble();
                                System.out.println(" Digite o valor da altura do trapézio: ");
                                hTrapezio = ler.nextDouble();
                                areaTrapezio = hTrapezio * (baseMaior + baseMenor) /2;
                                System.out.println("A área do trapézio é: " + areaTrapezio + "m²");
                            break;
                            case 5:
                                System.out.println("Digite o valor do perímetro do hexágono: ");
                                pH = ler.nextDouble();
                                System.out.println("Digite o valor da apóstema: ");
                                apostema = ler.nextDouble();
                                aH = (pH * apostema)/2;
                                System.out.println("A área do hexágono é: " + aH + "m²");
                            break;
                            case 0:
                            break;
                        }
                        opc=ler.nextInt();
                    }while(opc!=0);
                break;
                case 'b':
                
                break;
                case 'c':
                    double A,B,C,Delta;

                    System.out.println("Bem vindo usuário, ao Cálculo de equação do segundo grau ");

                    System.out.println("Digite o valor A");
                    A=ler.nextDouble();
                    System.out.println("Digite o valor B"); //Colocação dos valores A,B e C
                    B=ler.nextDouble();
                    System.out.println("Digite o valor C");
                    C=ler.nextDouble();

                    B=Math.pow(B,2); // CÁLCULO
                    Delta=B-4*A*C;   // DO DELTA

                    if(Delta>0){
                        Delta=Math.sqrt(Delta);//Raiz de Delta
                        System.out.println("O Valor de X1:");
                        System.out.println(X1(Delta,A,B));//Impressão do valor X1 
                        System.out.println("O Valor de X2:");
                        System.out.println(X2(Delta,A,B));//Impressão do valor X2

                    }else{
                        System.out.println("Não existe raizes");
                    }
                break;
                case 'e':
                    double num = ler.nextInt(); 
                    double f = num; 
        
                    if (num > 0){
        
                        while (num > 1){
                        f = f *(num-1); 
                        num--; 
                    }
                        System.out.println((int)f);
                    }else{
                        System.out.println("Número negativo e zero não possuem fatorial" + "\nHAHAHA");
                    }
                break;
                case 'f':
                    String palavra=ler.next();
                    Palindromo(palavra);
                break;
                case 'p':
                break;
            }
        }while(opcao!='p');
        ler.close();
    }
}
