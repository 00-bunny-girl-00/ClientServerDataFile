import java.net.ServerSocket;
import java.net.Socket;

public class MultithreadedSocketServer {
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(8888);

            System.out.println("Серверок запущен 0з0");

            while(true){
                Socket serverClient = server.accept();  // сервер принимает запрос на подключение клиента
                System.out.println(" >>Вы подключились, поток данных запущен...");
                ServerClientThread sct = new ServerClientThread(serverClient); // отправляем запрос в отдельный поток
                sct.start();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}

