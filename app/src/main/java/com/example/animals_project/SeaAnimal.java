package com.example.animals_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animals_project.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class SeaAnimal extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea_animal);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Animal> animals= new ArrayList<Animal>();
        Animal animal = new Animal();
        animal.setAnimal_name("เพนกวินกาลาปาโกส์");
        animal.setAnimal_name2("Galapagos Penguin");
        animal.setAnimal_image("https://latintrails.com/wp-content/uploads/2019/01/Galapagos-Penguin-Bartolome-Island1.jpg");
        animal.setAnimal_type("สัตว์ปีก");
        animal.setAnimal_pop("น้อยกว่า600");
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
        animal4.setAnimal_name("โลมาหัวบาตรหลังเรียบ");
        animal4.setAnimal_name2("Finless porpoise");
        animal4.setAnimal_image("https://wwfint.awsassets.panda.org/img/original/dolphin_11.jpg");
        animal4.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal4.setAnimal_pop("ประมาณ1040");
        animals.add(animal4);

        Animal animal5 = new Animal();
        animal5.setAnimal_name("โลมาแม่น้ำ");
        animal5.setAnimal_name2("river dolphins");
        animal5.setAnimal_image("https://static.scientificamerican.com/sciam/cache/file/8B9B5135-B072-4DFC-B91822C1732ECBC1.jpg");
        animal5.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal5.setAnimal_pop("ประมาณ600ถึง1500");
        animals.add(animal5);


        Animal animal6 = new Animal();
        animal6.setAnimal_name("ปลากระเบนปีศาจยักษ์");
        animal6.setAnimal_name2("giant devil ray");
        animal6.setAnimal_image("https://media.fisheries.noaa.gov/styles/full_width/s3/dam-migration/manta_ray_flower_garden_banks.jpg?VersionId=null&itok=zGfsIs-_");
        animal6.setAnimal_type("ปลากระดูกอ่อน");
        animal6.setAnimal_pop("ประมาณ100ถึง1500");
        animals.add(animal6);

        Animal animal7 = new Animal();
        animal7.setAnimal_name("ปลานโปเลียน");
        animal7.setAnimal_name2("Humphead Wrasse");
        animal7.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/9/92/Cheilinus_undulatus_by_Patryk_Krzyzak.jpg");
        animal7.setAnimal_type("ปลา");
        animal7.setAnimal_pop("ประมาณ860");
        animals.add(animal7);


        Animal animal8 = new Animal();
        animal8.setAnimal_name("เต่ากระ");
        animal8.setAnimal_name2("Hawksbill sea turtle");
        animal8.setAnimal_image("https://t1.bdtcdn.net/photos/2020/04/5e88f697be31ce0c764a24f9_800x0xcover_sOMXoppb.jpg");
        animal8.setAnimal_type("สัตว์เลื้อยคลาน");
        animal8.setAnimal_pop("20000 ถึง 23000");
        animals.add(animal8);


        Animal animal9 = new Animal();
        animal9.setAnimal_name("วาฬสีน้ำเงิน");
        animal9.setAnimal_name2("blue whale ");
        animal9.setAnimal_image("https://scx2.b-cdn.net/gfx/news/2021/new-population-of-blue.jpg");
        animal9.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal9.setAnimal_pop("ประมาณ20000ถึง30000");
        animals.add(animal9);




        mAdapter = new MyAdapter(animals, this);
        recyclerView.setAdapter(mAdapter);

    }
}