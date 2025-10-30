package user;

import java.io.*;
import java.lang.Integer;

public class Bufferedstream {
    public void input(Student student){
        try {
            BufferedWriter w = new BufferedWriter(new FileWriter("members.txt"));

            w.write(student.getId());
            w.write(student.getName());
            w.write(Integer.toString(student.getAge()));
            w.write(Integer.toString(student.getScore()));

            w.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void read(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("members.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}