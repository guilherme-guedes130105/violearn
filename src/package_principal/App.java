package package_principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário um nome para a playlist
        System.out.print("Digite um nome para a playlist: ");
        String nomePlaylist = scanner.nextLine();

        // Cria uma instância da Playlist com o nome fornecido pelo usuário
        Playlist playlist = new Playlist(nomePlaylist);

        // Lista de músicas predefinidas
        List<Musica> musicasDisponiveis = new ArrayList<>();
        musicasDisponiveis.add(new Musica("Autor1", "Musica1"));
        musicasDisponiveis.add(new Musica("Autor2", "Musica2"));
        musicasDisponiveis.add(new Musica("Autor3", "Musica3"));
        // Adicione mais músicas conforme necessário

        boolean continuar = true;

        while (continuar) {
            // Exibe opções para o usuário
            System.out.println("----------------------------------------\n");
            System.out.println("Opções:");
            System.out.println("1. Adicionar música à playlist");
            System.out.println("2. Ver a playlist");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: \n");
            System.out.println("\n----------------------------------------\n");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    // Exibe as músicas disponíveis para escolha
                    System.out.println("----------------------------------------\n");
                    System.out.println("Músicas disponíveis para adicionar à playlist:");
                    for (int i = 0; i < musicasDisponiveis.size(); i++) {
                        System.out.println((i + 1) + ". " + musicasDisponiveis.get(i).getNomeMusica()
                                + " - " + musicasDisponiveis.get(i).getAutor());
                    }

                    System.out.print("Escolha o número da música a ser adicionada: ");
                    int escolhaMusica = scanner.nextInt();

                    // Verifica se a escolha é válida
                    if (escolhaMusica >= 1 && escolhaMusica <= musicasDisponiveis.size()) {
                        Musica musicaEscolhida = musicasDisponiveis.get(escolhaMusica - 1);
                        playlist.adicionarMusica(musicaEscolhida);
                        System.out.println("Música adicionada à playlist.\n");
                        System.out.println("----------------------------------------\n");
                    } else {
                        System.out.println("Escolha inválida. Tente novamente.\npl1");
                        System.out.println("----------------------------------------\n");
                    }
                    break;
                case 2:
                    playlist.mostrarPlaylist();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
    
}
