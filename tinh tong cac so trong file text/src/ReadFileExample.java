import java.io.*;

public class ReadFileExample {
    public static void readFileText(String path){
        File file = new File(path);
        BufferedReader bufferedReader = null;
        if(!file.exists()){
            System.out.println("khong co file nay");
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while((line=bufferedReader.readLine())!=null){
                sum +=Integer.parseInt(line);
            }
            System.out.println("tong la: "+sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ReadFileExample rf = new ReadFileExample();
        rf.readFileText("tinh tong.txt");
    }

}
