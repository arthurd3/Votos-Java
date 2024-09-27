import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        int i = 0, totalPessoas = 10, voto = 0;

        Scanner le = new Scanner(System.in);

        Pessoas pessoa1 = new Pessoas();
        Pessoas pessoa2 = new Pessoas();
        Pessoas pessoa3 = new Pessoas();

        pessoa1.setNome("Claudio");
        pessoa2.setNome("Antonio");
        pessoa3.setNome("Josemar");

     
        while(i < totalPessoas) {
            System.out.println("Em quem deseja votar: \n1. Claudio (11) \n2. Antonio (22) \n3. Josemar (33)");
            voto = le.nextInt();

            
            if(voto == 11){
                pessoa1.votar();
            } else if (voto == 22) {
                pessoa2.votar();
            } else {
                pessoa3.votar();
            }
            i++;
        }

        
        int totalVotos = pessoa1.getVotos() + pessoa2.getVotos() + pessoa3.getVotos();

        
        double percentualPessoa1 = (pessoa1.getVotos() * 100.0) / totalVotos;
        double percentualPessoa2 = (pessoa2.getVotos() * 100.0) / totalVotos;
        double percentualPessoa3 = (pessoa3.getVotos() * 100.0) / totalVotos;

       
        System.out.println("Votos de " + pessoa1.getNome() + ": " + pessoa1.getVotos() + " (" + percentualPessoa1 + "%)");
        System.out.println("Votos de " + pessoa2.getNome() + ": " + pessoa2.getVotos() + " (" + percentualPessoa2 + "%)");
        System.out.println("Votos de " + pessoa3.getNome() + ": " + pessoa3.getVotos() + " (" + percentualPessoa3 + "%)");

        if (pessoa1.getVotos() > pessoa2.getVotos() && pessoa1.getVotos() > pessoa3.getVotos()) {
            System.out.println("Ganhador: " + pessoa1.getNome() + " com " + pessoa1.getVotos() + " votos (" + percentualPessoa1 + "%)");
        } else if (pessoa2.getVotos() > pessoa1.getVotos() && pessoa2.getVotos() > pessoa3.getVotos()) {
            System.out.println("Ganhador: " + pessoa2.getNome() + " com " + pessoa2.getVotos() + " votos (" + percentualPessoa2 + "%)");
        } else if (pessoa3.getVotos() > pessoa1.getVotos() && pessoa3.getVotos() > pessoa2.getVotos()) {
            System.out.println("Ganhador: " + pessoa3.getNome() + " com " + pessoa3.getVotos() + " votos (" + percentualPessoa3 + "%)");
        } else {
            System.out.println("Empate entre os candidatos.");
        }
    }
}
