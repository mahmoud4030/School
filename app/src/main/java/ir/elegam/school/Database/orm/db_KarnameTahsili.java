package ir.elegam.school.Database.orm;

import com.orm.SugarRecord;

/**
 * Created by Droid on 8/16/2016.
 */
public class db_KarnameTahsili extends SugarRecord {
    String number,english_name,image_url,pdf_url;

    public db_KarnameTahsili(){}

    public db_KarnameTahsili(String number, String english_name, String image_url, String pdf_url){
        this.number=number;
        this.english_name=english_name;
        this.image_url=image_url;
        this.pdf_url=pdf_url;
    }

    public String getNumber(){return this.number;}
    public String getEnglish_name(){return this.english_name;}
    public String getImage_url(){return this.image_url;}
    public String getPdf_url(){return this.pdf_url;}
}
