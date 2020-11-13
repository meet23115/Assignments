package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] TITLES = {"Title : Scam 1992: The Harshad Mehta Story",
                       "Title : Avengers: Endgame (2019)",
                       "Title : Ludo (2020)",
                       "Title : Iron Man (2008)",
                       "Title : Captain America: Civil War (2016)",
                       "Title : Fast Five (2011)"};

    String[] RATINGS = {"Ratings : 9.6/10",
                        "Ratings : 8.4/10",
                        "Ratings : 7.9/10",
                        "Ratings : 7.9/10",
                        "Ratings : 7.8/10",
                        "Ratings : 7.3/10"};

    String[] DESC = {"Description : Set in 1980's and 90's Bombay, it follows the life of Harshad Mehta, a stockbroker who took the stock market to dizzying heights and his catastrophic downfall.",
                     "Description : After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                     "Description : A dark comedy anthology, which was supposed to be center on unavoidable jeopardize of life and has four different stories set in a quintessential Indian metro.",
                     "Description : After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil.",
                     "Description : Political involvement in the Avengers' affairs causes a rift between Captain America and Iron Man.",
                     "Description : Dominic Toretto and his crew of street racers plan a massive heist to buy their freedom while in the sights of a powerful Brazilian drug lord and a dangerous federal agent."};

    int[] IMAGES = {R.drawable.scam1992,
                    R.drawable.avengersendgame,
                    R.drawable.ludo,
                    R.drawable.ironman,
                    R.drawable.civilwar,
                    R.drawable.fastfive,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return IMAGES.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {

            view = getLayoutInflater().inflate(R.layout.customlayout,null);

            TextView textView_title = (TextView)view.findViewById(R.id.textView_title);
            TextView textView_ratings = (TextView)view.findViewById(R.id.textView_ratings);
            TextView textView_desc = (TextView)view.findViewById(R.id.textView_desc);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);

            textView_title.setText(TITLES[i]);
            textView_ratings.setText(RATINGS[i]);
            textView_desc.setText(DESC[i]);
            imageView.setImageResource(IMAGES[i]);

            return view;
        }
    }

}