package com.example.animals_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animals_project.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class ThaiAnimal extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thai_animal);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Animal> animals= new ArrayList<Animal>();
        Animal animal = new Animal();
        animal.setAnimal_name("ลิ่น");
        animal.setAnimal_name2("Manis pentadactyla");
        animal.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/9/94/Manis_pentadactyla_%2829054818144%29.jpg");
        animal.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal.setAnimal_pop("ประมาณ1000");
        animals.add(animal);

        Animal animal2 = new Animal();
        animal2.setAnimal_name("เต่ามะเฟือง");
        animal2.setAnimal_name2("Dermochelys coriacea");
        animal2.setAnimal_image("https://www.greenpeace.org/static/planet4-thailand-stateless/2019/05/7ae56a53-gp0zdy.jpg");
        animal2.setAnimal_type("สัตว์เลิ้อยคลาน");
        animal2.setAnimal_pop("เหลือไม่กี่ร้อย");
        animals.add(animal2);

        Animal animal3 = new Animal();
        animal3.setAnimal_name("พะยูน");
        animal3.setAnimal_name2("Dugong dugon");
        animal3.setAnimal_image("https://t1.bdtcdn.net/photos/2021/01/60153fb2a37105033760c5eb_800x0xcover_QkYi7Kuw.jpg");
        animal3.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal3.setAnimal_pop("ประมาณ200 ");
        animals.add(animal3);

        Animal animal4 = new Animal();
        animal4.setAnimal_name("มหิงสา หรือ ควายป่า");
        animal4.setAnimal_name2("Bubalus arnee");
        animal4.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/5/51/Indian_Water_Buffalo_Bubalus_arnee_by_Dr_Raju_Kasambe_IMG_0347_%2811%29_%28cropped%29.jpg");
        animal4.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal4.setAnimal_pop("69");
        animals.add(animal4);

        Animal animal5 = new Animal();
        animal5.setAnimal_name("นกแต้วแล้วท้องดำ");
        animal5.setAnimal_name2("Hydrornis gurneyi");
        animal5.setAnimal_image("https://www.thairath.co.th/media/mSQWlZdCq5b6ZLkz5noLiuoVx9kTAYt8.jpg");
        animal5.setAnimal_type("สัตว์ปีก");
        animal5.setAnimal_pop("4");
        animals.add(animal5);


        Animal animal6 = new Animal();
        animal6.setAnimal_name("นกชนหิน");
        animal6.setAnimal_name2("Rhinoplax vigil");
        animal6.setAnimal_image("https://www.seub.or.th/seubweb/wp-content/uploads/2019/09/%E0%B8%AB%E0%B8%B1%E0%B8%A7%E0%B8%99%E0%B8%81%E0%B8%8A%E0%B8%99%E0%B8%AB%E0%B8%B4%E0%B8%99-1.jpg");
        animal6.setAnimal_type("สัตว์ปีก");
        animal6.setAnimal_pop("ประมาณ 20 ");
        animals.add(animal6);

        mAdapter = new MyAdapter(animals, this);
        recyclerView.setAdapter(mAdapter);
    }
}