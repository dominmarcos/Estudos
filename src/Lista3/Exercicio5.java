package Lista3;

public class Exercicio5 {
    public static void main(String[] args) {
        int[] vet = new int[12];
        int[] vet1 = new int[12];
        int[] vet2 = new int[12];
        int d = 0, e = 0, f = 0;
        for(int i = 0 ; i<12 ; i++){
            vet[i] = (int) (Math.random()*1000);
            vet1[i] = (int) (Math.random()*1000);
            vet2[i] = (int) (Math.random()*1000);
        }
        for(int i = 0 ; i<12 ; i++){
            if(i == 0){
                d = i;
                e = i;
                f = i;
            }else{
                if(vet[i] > vet[i-1]){
                    vet[i-1] = vet[i];
                    d = i;
                }
                if(vet1[i] > vet1[i-1]){
                    vet1[i-1] = vet1[i];
                    e = i;
                }
                if(vet2[i ]> vet2[i-1]){
                    vet2[i-1] = vet2[i];
                    f = i;
                }
            }
        }
        
        System.out.println("Loja 1:");
        for(int i = 0 ; i<12 ; i++){
            if(vet[i]<100){
                System.out.print("0"+vet[i]+" ");
            }else{
                System.out.print(vet[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Maior lucro mes:" + (d+1) + " Valor: R$"+vet[d]);
        System.out.println("__________________________________________________________________");
        System.out.println("Loja 2:");
        for(int i = 0 ; i<12 ; i++){
            if(vet1[i]<100){
                System.out.print("0"+vet1[i]+" ");
            }else{
                System.out.print(vet1[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Maior lucro mes:" + (e+1) + " Valor: R$"+vet1[e]);
        System.out.println("__________________________________________________________________");
        System.out.println("loja 3:");
        for(int i = 0 ; i<12 ; i++){
            if(vet2[i]<100){
                System.out.print("0"+vet2[i]+" ");
            }else{
                System.out.print(vet2[i]+" ");
            }
        }
        System.out.println("");
        System.out.println("Maior lucro mes:" + (f+1)+" Valor: R$"+vet2[f]);
        System.out.println("__________________________________________________________________");
        
        if(vet[d] > vet1[e] && vet[d] > vet2[f]){
            System.out.println("Loja 1 teve o maior lucro.");
        }else{
            if(vet1[e] > vet[d] && vet1[e] > vet2[f]){
                System.out.println("Loja 2 teve o maior lucro.");
            }else{
                if(vet2[f] > vet[d] && vet2[f] > vet1[e]){
                System.out.println("Loja 3 teve o maior lucro.");
                }
            }
        }
    }
    
}
