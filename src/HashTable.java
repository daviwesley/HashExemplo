import java.io.IOException;


public class HashTable {
    public static void main(String[] args) throws IOException
    {
        HashMap entry = new HashMap();
        entry.put("Wasif", 36100);
        entry.put("Stephen Hughes", 22100);
        if(entry.get("Stephen Hughes") == 22100){
        System.out.println("Senha correta");
        }
    }
}