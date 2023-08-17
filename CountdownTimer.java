public class CountdownTimer {
    public static void main(String[] args) throws InterruptedException { //Debemos manejar la excepción de interrupción ya que manejamos hilos
        int seconds = 60;
        
        for (int i = seconds; i >= 0; i--) {
            System.out.println("Tiempo restante: " + i + " segundos");
            Thread.sleep(1000); // Pausa de 1 segundo
            
            if (i == 0) {
                System.out.println("Tiempo agotado!");
            }
        }
    }
}
