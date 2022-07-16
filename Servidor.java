package atividade03tcpobjetos;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author 1134728-Ricardo A. Silveira <ricardoas30@gmail.com>
 */
public class Servidor {
    
    private static Socket socket;
    private static ServerSocket server;
    
    private static ObjectInputStream entrada;    
    private static ObjectOutputStream saida;

    
    public static void main(String[] args) {
   
        try {
            
            server = new ServerSocket(50000);
            
            socket = server.accept();
            
            // Entrada
            entrada = new ObjectInputStream(socket.getInputStream());
            
            Pessoa p = (Pessoa) entrada.readObject(); 
            
            
            // Saída
            saida = new ObjectOutputStream(socket.getOutputStream());
            
            saida.writeObject(p);

            socket.close();
            
        } catch(Exception e) {
            
        }
        
    }
}
