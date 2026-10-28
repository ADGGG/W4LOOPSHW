public class Loop2 {
    public static void main(String[] args) {
        int count = 0;
        for (int r = 1; r <= 3; r++) {
            for (int c = 1; c <= 3; c++) {
                if (c == 2) 
                    continue;  
                    count++;
                
            }
        }
        System.out.println(count);//Predic
    }
    
}
