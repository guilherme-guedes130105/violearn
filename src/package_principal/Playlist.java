package package_principal;

public class Playlist {
    private String nomePlaylist;
    private Musica[] musicas;
    private int tamanho;

    public Playlist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
        this.musicas = new Musica[10]; // Inicializa o vetor de músicas com tamanho 10
        this.tamanho = 0; // Inicializa o tamanho da playlist como 0
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public void adicionarMusica(Musica musica) {
        if (tamanho < 10) {
            musicas[tamanho] = musica;
            tamanho++;
        } else {
            System.out.println("A playlist está cheia. Não é possível adicionar mais músicas.");
        }
    }

    public void mostrarPlaylist() {
        System.out.println("----------------------------------------\n");
        System.out.println("Playlist: " + nomePlaylist + "\n");
        System.out.println("Músicas na playlist: \n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + ". " + musicas[i].getNomeMusica() + " - " + musicas[i].getAutor());
        }
        System.out.println("\n----------------------------------------\n");
    }
}
