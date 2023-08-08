public class AgendaCheiaException extends Exception {

    @Override
    public String getMessage() {
       return "Agenda já está cheia";
    }

}