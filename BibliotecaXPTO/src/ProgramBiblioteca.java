public class ProgramBiblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro("TRono de Vidro", "Sarah J. Maas" , 2019, "Fantasia", "Galera", 20, "Edição padrão", "978-85-01-11260-6");

        Filme filme1 = new Filme("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997, "Fantasia", "Warner Bros", 56, "Chris Columbus", "Daniel Radcliffe", "Harry Potter é um garoto órfão que vive infeliz com seus tios, os Dursleys. Ele recebe uma carta contendo um convite para ingressar em Hogwarts, uma famosa escola especializada em formar jovens bruxos. Inicialmente, Harry é impedido de ler a carta por seu tio, mas logo recebe a visita de Hagrid, o guarda-caça de Hogwarts, que chega para levá-lo até a escola. Harry adentra um mundo mágico que jamais imaginara, vivendo diversas aventuras com seus novos amigos, Rony Weasley e Hermione Granger.", "2h32m");

        Publicacao[] publicacoes = new Publicacao[2];
        publicacoes[0] = livro1;
        publicacoes[1] = filme1;

        for(Publicacao publicacao : publicacoes){
            publicacao.imprimirDados();
            System.out.println();
        }
        /*Resposta D-V) Pelo fato das classes Livro e Filme herdarem da classe Publicacao,
        foi possível os objetos do tipo Livro e do tipo Filme serem adicionados no
        array de Publicacao. Sendo assim, um objeto do tipo Livro ou Filme, segundo o polimorfismo, é um tipo de Publicacao.

         Resposta - VI) Graças ao polimorfismo, o método abstrato "imprimeDados" é definido na classe "Publicacao" e pode ser
         implementado de formas especícicas nas classes "Livro" e "Filme".
         */
    }
}