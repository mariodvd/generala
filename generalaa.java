package dia5;

public class generalaa {
    String jugada(String dados) {
        if (dados.equals("11111") || dados.equals("22222") || dados.equals("33333") || dados.equals("44444") || dados.equals("55555") || dados.equals("66666")) {
            return "GENERALA";
        }
        return "NADA";
    }

    
    public static void main(String[] args) {
        //creacion de una lista para almacenar los dados
        int [] listaDados = new int[5];
        int [] listaDados2 = new int[6];
        int d=0;
        
        //crear los dados y almacenarlos en la lista
        for (int i = 0; i < 5; i++) {
            listaDados[i] = (int)(Math.random()*6)+1;
            if(listaDados[i] == 1) {
                listaDados2[0] = listaDados2[0] + 1;
            }
            if (listaDados[i] == 2) {
                listaDados2[1] = listaDados2[1] + 1;
            }
            if (listaDados[i] == 3) {
                listaDados2[2] = listaDados2[2] + 1;
            }
            if (listaDados[i] == 4) {
                listaDados2[3] = listaDados2[3] + 1;
            }
            if (listaDados[i] == 5) {
                listaDados2[4] = listaDados2[4] + 1;
            }
            if (listaDados[i] == 6) {
                listaDados2[5] = listaDados2[5] + 1;
            }
        }

        //ordenar los dados de menor a mayor
        for (int i = 0; i < listaDados.length; i++) {
            for (int j = i+1; j < listaDados.length; j++) {
                if (listaDados[i] > listaDados[j]) {
                    int aux = listaDados[i];
                    listaDados[i] = listaDados[j];
                    listaDados[j] = aux;
                }
            }
        }

        //imprimir los dados
        for (int i = 0; i < listaDados.length; i++) {
            System.out.print(listaDados[i] + " ");
        }
        
        //recorrer la lista de dados 2 para ver si hay poker
        for (int i = 0; i < listaDados2.length; i++) {
            if (listaDados2[i] == 4) {
                System.out.println("POKER");
                d=1;
            }else if (listaDados2[i] == 5) {
                System.out.println("Generala");
                d=1;
            }
        }

        //recorrer la lista de dados 2 para ver si hay full
        for (int j = 0; j < listaDados2.length; j++) {
            if (listaDados2[j] == 3 && listaDados2[j+1] == 2) {
                System.out.println("FULL");
                d=1;
            }
        }

        //ver si hay escalera
        
        if (listaDados[0] == 1 && listaDados[1] == 2 && listaDados[2] == 3 && listaDados[3] == 4 && listaDados[4] == 5) {
            System.out.println("ESCALERA");
            d=1;
        }else if (listaDados[0] == 2 && listaDados[1] == 3 && listaDados[2] == 4 && listaDados[3] == 5 && listaDados[4] == 6) {
            System.out.println("ESCALERA");
            d=1;
        }else if (listaDados[0] == 1 && listaDados[1] == 3 && listaDados[2] == 4 && listaDados[3] == 5 && listaDados[4] == 6) {
            System.out.println("ESCALERA");
            d=1;
        }

        //imprimir si no hay nada
        if (d==0) {
            System.out.println("NADA");
        }
    } 
}