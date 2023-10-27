package exercicio1;
public class Principal {
    public static void main(String[] args) {
        // Solicitar dados da Rede Social
        String dataCriacao = "2023-10-27";
        String nomeUsuario = "exemplo";
        String dataNascimento = "2000-01-01";
        String senha = "senha123";

        // Criar objeto RedeSocial
        RedeSocial redeSocial = new RedeSocial(dataCriacao, nomeUsuario, dataNascimento, senha);

        // Solicitar dados das Publicações
        String dataPub1 = "2023-10-27";
        String textoPub1 = "Primeira publicação";
        String linkPub1 = "https://example.com/pub1";

        String dataPub2 = "2023-10-28";
        String textoPub2 = "Segunda publicação";
        String linkPub2 = "https://example.com/pub2";

        // Criar objetos Publicacao
        Publicacao pub1 = new Publicacao(dataPub1, textoPub1, linkPub1);
        Publicacao pub2 = new Publicacao(dataPub2, textoPub2, linkPub2);

        // Inserir as Publicações na Rede Social
        redeSocial.inserePublicacao(pub1);
        redeSocial.inserePublicacao(pub2);

        // Imprimir as Publicações da Rede Social
        redeSocial.imprimePublicacoes();
    }
}
