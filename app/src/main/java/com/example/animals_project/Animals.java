package com.example.animals_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.animals_project.model.Animal;

import java.util.ArrayList;
import java.util.List;

public class Animals extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<Animal> animals= new ArrayList<Animal>();
        Animal animal = new Animal();
        animal.setAnimal_name("เสือดาวอามูร์");
        animal.setAnimal_name2("Amur Leopard");
        animal.setAnimal_image("https://nattawut364640637.files.wordpress.com/2018/07/kapook_world-5741772.jpg");
        animal.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal.setAnimal_pop("เหลือไม่กี่ร้อยตัว");
        animals.add(animal);

        Animal animal2 = new Animal();
        animal2.setAnimal_name("แรดดำ");
        animal2.setAnimal_name2("black rhino");
        animal2.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Black_Rhino_Diceros_bicornis.JPG/1024px-Black_Rhino_Diceros_bicornis.JPG");
        animal2.setAnimal_type("สัตว์เลิ้อยคลาน");
        animal2.setAnimal_pop("ประมาณ5000");
        animals.add(animal2);

        Animal animal3 = new Animal();
        animal3.setAnimal_name("แรดชวา");
        animal3.setAnimal_name2("javan rhino");
        animal3.setAnimal_image("https://i.pinimg.com/originals/f1/af/51/f1af519f0f515bf424bb7ccfd2bde4d8.jpg");
        animal3.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal3.setAnimal_pop("75 ");
        animals.add(animal3);

        Animal animal4 = new Animal();
        animal4.setAnimal_name("อุรังอุตังบอร์เนียว");
        animal4.setAnimal_name2("Bornean orangutan");
        animal4.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Orang_Utan%2C_Semenggok_Forest_Reserve%2C_Sarawak%2C_Borneo%2C_Malaysia_crop.JPG/225px-Orang_Utan%2C_Semenggok_Forest_Reserve%2C_Sarawak%2C_Borneo%2C_Malaysia_crop.JPG");
        animal4.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal4.setAnimal_pop("104700");
        animals.add(animal4);

        Animal animal5 = new Animal();
        animal5.setAnimal_name("ไพกา");
        animal5.setAnimal_name2("Pika");
        animal5.setAnimal_image("https://t1.bdtcdn.net/photos/2019/03/5c7ce9b0044b910ca87b60c4_800x0xcover_InLS9iwO.jpg");
        animal5.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal5.setAnimal_pop("น้อยกว่า1000");
        animals.add(animal5);


        Animal animal6 = new Animal();
        animal6.setAnimal_name("โคอาลา");
        animal6.setAnimal_name2("Koala");
        animal6.setAnimal_image("https://d1jyxxz9imt9yb.cloudfront.net/animal/27/meta_image/regular/DR_2020-01-18_Koroit-Victoria-AU_Bushfires-MosswoodWildlife-RescuedKoalas_1D_MelanieMahoney_094V1176.jpg");
        animal6.setAnimal_type("สัตว์เลี้ยงลูกด้วยนมมีกระเป๋าหน้าท้อง");
        animal6.setAnimal_pop("น้อยกว่า100000 ");
        animals.add(animal6);

        Animal animal7 = new Animal();
        animal7.setAnimal_name("เสือโคร่งมลายู");
        animal7.setAnimal_name2("Malayan tiger");
        animal7.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/c/c5/MalayanTiger.jpg");
        animal7.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal7.setAnimal_pop("น้อยกว่า200");
        animals.add(animal7);

        Animal animal8 = new Animal();
        animal8.setAnimal_name("กอริลลาที่ราบลุ่มทางตะวันออก");
        animal8.setAnimal_name2("Eastern lowland gorilla");
        animal8.setAnimal_image("https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Eastern_lowland_gorilla.jpg/1200px-Eastern_lowland_gorilla.jpg");
        animal8.setAnimal_type("สัตว์เลี้ยงลูกด้วยนม");
        animal8.setAnimal_pop("น้อยกว่า3800");
        animals.add(animal8);



        mAdapter = new MyAdapter(animals, this);
        recyclerView.setAdapter(mAdapter);

    }
}
