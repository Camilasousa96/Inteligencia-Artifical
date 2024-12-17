import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    private static final DateFormat DEFAULT_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

    //Método para formatar a data
    public static String formatDate(Date date){
        if (date ==null){
            throw new IllegalArgumentException("A data não pode ser nula");
        }
        return DEFAULT_FORMAT.format(date);
    }

    public static void main(String[] args){
        //Criando uma nova data
        Date currentDate = new Date();

        //Formatando a data
        String formattedDate = formatDate(currentDate);

        //Exibindo a data formatada
        System.out.println("Data formatada: " + formattedDate);
    }  
}