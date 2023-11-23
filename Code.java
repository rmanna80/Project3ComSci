import java.security.GeneralSecurityException;
import java.util.Random;

public class Code {
    private String code;

    public Code(){
        generataeCode();
    }
    public String getCode(){
        return code;
    }

    private void generataeCode(){
        StringBuilder codeBuilder = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 4; i++){
            int randResult = random.nextInt(6); // 6 possible colors 
            codeBuilder.append(getIndexofColor(randResult));
        }
        code = codeBuilder.toString();
    }
    private String getIndexofColor(int index){
        switch (index) {
            case 0:
                return "red";
            case 1:
                return "green";
            case 2:
                return "yellow";
            case 3:
                return "blue";
            case 4:
                return "purple";
            case 5:
                return "gray";
            default:
                return ""; // Handle unexpected cases
        }
    }
}
