package Lap6;
import java.util.Scanner;
public class New  implements INew {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList = new int[3];

    public New() {
        baimoi();
    }

    public New(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        baimoi();
    }

    public int getID() { return ID; }
    public void setID(int ID) { this.ID = ID; }
    public String getTitle() { return Title; }
    public void setTitle(String title) { Title = title; }
    public String getPublishDate() { return PublishDate; }
    public void setPublishDate(String publishDate) { PublishDate = publishDate; }
    public String getAuthor() { return Author; }
    public void setAuthor(String author) { Author = author; }
    public String getContent() { return Content; }
    public void setContent(String content) { Content = content; }
    public float getAverageRate() { return AverageRate; }

    @Override
    public void Display() {
        System.out.println("Thong tin chi tiet cua bai bao:");
        System.out.println("Title:"+getTitle()+" - Publish: "+getPublishDate()
                +" - Author: "+getAuthor()+" - Content: "+getContent()+" - AverageRate: "+this.AverageRate);

    }

    public float Calculate(){
        AverageRate = ((float)RateList[0] + (float)RateList[1] + (float)RateList[2])/3;
        return AverageRate;
    }

    public void baimoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID");
        this.setID(sc.hasNextInt()?sc.nextInt():0);
        sc.nextLine();
        System.out.println("Nhap Title");
        this.setTitle(sc.nextLine());
        System.out.println("Nhap Publishdate");
        this.setPublishDate(sc.nextLine());
        System.out.println("Nhap Author");
        this.setAuthor(sc.nextLine());
        System.out.println("Nhap Content");
        this.setContent(sc.nextLine());

        System.out.println("Nhap 3 so Ratelist");
        for (int i = 0;i<3;i++){
            this.RateList[i] = sc.hasNextInt()?sc.nextInt():0;
        }
    }



}
