package com.example.apps.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.apps.R;

public class StatusActivity extends AppCompatActivity {
    TextView
            tvExplorerName,
            tvAge,
            tvHeight,
            tvWeight,
            tvHobbies,
            tvBirthday;
    ImageView ivExplorerPicture;


    TextView
            addSpeedButton,
            minSpeedButton,
            addMightButton,
            minMightButton,
            addSanityButton,
            minSanityButton,
            addKnowledgeButton,
            minKnowledgeButton;

    RadioButton
            speedRadioButton0,
            speedRadioButton1,
            speedRadioButton2,
            speedRadioButton3,
            speedRadioButton4,
            speedRadioButton5,
            speedRadioButton6,
            speedRadioButton7,
            speedRadioButton8,
            speedRadioButton9;

    TextView
            speedTextView1,
            speedTextView2,
            speedTextView3,
            speedTextView4,
            speedTextView5,
            speedTextView6,
            speedTextView7,
            speedTextView8;

    RadioButton
            mightRadioButton0,
            mightRadioButton1,
            mightRadioButton2,
            mightRadioButton3,
            mightRadioButton4,
            mightRadioButton5,
            mightRadioButton6,
            mightRadioButton7,
            mightRadioButton8,
            mightRadioButton9;

    TextView
            mightTextView1,
            mightTextView2,
            mightTextView3,
            mightTextView4,
            mightTextView5,
            mightTextView6,
            mightTextView7,
            mightTextView8;

    RadioButton
            sanityRadioButton0,
            sanityRadioButton1,
            sanityRadioButton2,
            sanityRadioButton3,
            sanityRadioButton4,
            sanityRadioButton5,
            sanityRadioButton6,
            sanityRadioButton7,
            sanityRadioButton8,
            sanityRadioButton9;

    TextView
            sanityTextView1,
            sanityTextView2,
            sanityTextView3,
            sanityTextView4,
            sanityTextView5,
            sanityTextView6,
            sanityTextView7,
            sanityTextView8;


    RadioButton
            knowledgeRadioButton0,
            knowledgeRadioButton1,
            knowledgeRadioButton2,
            knowledgeRadioButton3,
            knowledgeRadioButton4,
            knowledgeRadioButton5,
            knowledgeRadioButton6,
            knowledgeRadioButton7,
            knowledgeRadioButton8,
            knowledgeRadioButton9;

    TextView
            knowledgeTextView1,
            knowledgeTextView2,
            knowledgeTextView3,
            knowledgeTextView4,
            knowledgeTextView5,
            knowledgeTextView6,
            knowledgeTextView7,
            knowledgeTextView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_status);
        findViewById();
        setPlayerData();

    }

    public void findViewById() {
        ivExplorerPicture = findViewById(R.id.ivExplorerPicture);
        tvExplorerName = findViewById(R.id.tvExplorerName);
        tvAge = findViewById(R.id.tvAge);
        tvHeight = findViewById(R.id.tvHeight);
        tvWeight = findViewById(R.id.tvWeight);
        tvHobbies = findViewById(R.id.tvHobbies);
        tvBirthday = findViewById(R.id.tvBirthday);
        addSpeedButton = findViewById(R.id.addSpeedButton);
        minSpeedButton =findViewById(R.id.minSpeedButton);
        addMightButton =findViewById(R.id.addmightButton);
        minMightButton = findViewById(R.id.minmightButton);
        addSanityButton =findViewById(R.id.addsanityButton);
        minSanityButton =findViewById(R.id.minsanityButton);
        addKnowledgeButton =findViewById(R.id.addknowledgeButton);
        minKnowledgeButton =findViewById(R.id.minknowledgeButton);
        setSpeedView();
        setMightView();
        setSanityView();
        setKnowledgeView();
    }

    public void setPlayerData() {
        String explorerName = getIntent().getStringExtra("EXPLORERNAME");
        tvExplorerName.setText(explorerName);

        if (explorerName.equals("Heather Granville")) {
            ivExplorerPicture.setImageResource(R.drawable.char_heathergranville);
            String profile[] = getResources().getStringArray(R.array.HeatherGranvilleProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

            String speed[] = getResources().getStringArray(R.array.HeatherGranvilleSpeed);
            String might[] = getResources().getStringArray(R.array.HeatherGranvilleMight);
            String sanity[] = getResources().getStringArray(R.array.HeatherGranvilleSanity);
            String knowledge[] = getResources().getStringArray(R.array.HeatherGranvilleKnowledge);
            speedTextView1.setText(speed[0]);
            speedTextView2.setText(speed[1]);
            speedTextView3.setText(speed[2]);
            speedTextView4.setText(speed[3]);
            speedTextView5.setText(speed[4]);
            speedTextView6.setText(speed[5]);
            speedTextView7.setText(speed[6]);
            speedTextView8.setText(speed[7]);

        } else if (explorerName.equals("Jenny Leclerc")) {
            ivExplorerPicture.setImageResource(R.drawable.char_jennyleclerc);
            String profile[] = getResources().getStringArray(R.array.JennyLeclercProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Ox Bellows")) {
            ivExplorerPicture.setImageResource(R.drawable.char_oxbellows);
            String profile[] = getResources().getStringArray(R.array.OxBellowsProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Darrin 'Flash' Williams")) {
            ivExplorerPicture.setImageResource(R.drawable.char_darrinflashwilliams);
            String profile[] = getResources().getStringArray(R.array.DarrinWilliamsProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Vivian Lopez")) {
            ivExplorerPicture.setImageResource(R.drawable.char_vivianlopez);
            String profile[] = getResources().getStringArray(R.array.VivianLopezProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Madame Zostra")) {
            ivExplorerPicture.setImageResource(R.drawable.char_madamezostra);
            String profile[] = getResources().getStringArray(R.array.MadameZostraProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Missy Dubourde")) {
            ivExplorerPicture.setImageResource(R.drawable.char_missydubourde);
            String profile[] = getResources().getStringArray(R.array.MissyDubourdeProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Zoe Ingstrom")) {
            ivExplorerPicture.setImageResource(R.drawable.char_zoeingstrom);
            String profile[] = getResources().getStringArray(R.array.ZoeIngstromProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Peter Akimoto")) {
            ivExplorerPicture.setImageResource(R.drawable.char_peterakimoto);
            String profile[] = getResources().getStringArray(R.array.PeterAkimotoProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Brandon Jaspers")) {
            ivExplorerPicture.setImageResource(R.drawable.char_brandonjasper);
            String profile[] = getResources().getStringArray(R.array.BrandonJaspersProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Professor Longfellow")) {
            ivExplorerPicture.setImageResource(R.drawable.char_professorlongfellow);
            String profile[] = getResources().getStringArray(R.array.ProfessorLongfellowProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        } else if (explorerName.equals("Father Rhinehardt")) {
            ivExplorerPicture.setImageResource(R.drawable.char_fatherrhinehardt);
            String profile[] = getResources().getStringArray(R.array.FatherRhinehardtProfile);
            tvAge.setText(profile[0]);
            tvHeight.setText(profile[1]);
            tvWeight.setText(profile[2]);
            tvHobbies.setText(profile[3]);
            tvBirthday.setText(profile[4]);

        }
    }

    public void setSpeedView() {
        speedRadioButton0 = findViewById(R.id.speedRadioButton0);
        speedRadioButton1 = findViewById(R.id.speedRadioButton1);
        speedRadioButton2 = findViewById(R.id.speedRadioButton2);
        speedRadioButton3 = findViewById(R.id.speedRadioButton3);
        speedRadioButton4 = findViewById(R.id.speedRadioButton4);
        speedRadioButton5 = findViewById(R.id.speedRadioButton5);
        speedRadioButton6 = findViewById(R.id.speedRadioButton6);
        speedRadioButton7 = findViewById(R.id.speedRadioButton7);
        speedRadioButton8 = findViewById(R.id.speedRadioButton8);
        speedRadioButton9 = findViewById(R.id.speedRadioButton9);

        speedTextView1 = findViewById(R.id.speedTextView1);
        speedTextView2 = findViewById(R.id.speedTextView2);
        speedTextView3 = findViewById(R.id.speedTextView3);
        speedTextView4 = findViewById(R.id.speedTextView4);
        speedTextView5 = findViewById(R.id.speedTextView5);
        speedTextView6 = findViewById(R.id.speedTextView6);
        speedTextView7 = findViewById(R.id.speedTextView7);
        speedTextView8 = findViewById(R.id.speedTextView8);
    }

    public void setMightView() {
        mightRadioButton0 = findViewById(R.id.mightRadioButton0);
        mightRadioButton1 = findViewById(R.id.mightRadioButton1);
        mightRadioButton2 = findViewById(R.id.mightRadioButton2);
        mightRadioButton3 = findViewById(R.id.mightRadioButton3);
        mightRadioButton4 = findViewById(R.id.mightRadioButton4);
        mightRadioButton5 = findViewById(R.id.mightRadioButton5);
        mightRadioButton6 = findViewById(R.id.mightRadioButton6);
        mightRadioButton7 = findViewById(R.id.mightRadioButton7);
        mightRadioButton8 = findViewById(R.id.mightRadioButton8);
        mightRadioButton9 = findViewById(R.id.mightRadioButton9);

        mightTextView1 = findViewById(R.id.mightTextView1);
        mightTextView2 = findViewById(R.id.mightTextView2);
        mightTextView3 = findViewById(R.id.mightTextView3);
        mightTextView4 = findViewById(R.id.mightTextView4);
        mightTextView5 = findViewById(R.id.mightTextView5);
        mightTextView6 = findViewById(R.id.mightTextView6);
        mightTextView7 = findViewById(R.id.mightTextView7);
        mightTextView8 = findViewById(R.id.mightTextView8);
    }

    public void setSanityView() {
        sanityRadioButton0 = findViewById(R.id.sanityRadioButton0);
        sanityRadioButton1 = findViewById(R.id.sanityRadioButton1);
        sanityRadioButton2 = findViewById(R.id.sanityRadioButton2);
        sanityRadioButton3 = findViewById(R.id.sanityRadioButton3);
        sanityRadioButton4 = findViewById(R.id.sanityRadioButton4);
        sanityRadioButton5 = findViewById(R.id.sanityRadioButton5);
        sanityRadioButton6 = findViewById(R.id.sanityRadioButton6);
        sanityRadioButton7 = findViewById(R.id.sanityRadioButton7);
        sanityRadioButton8 = findViewById(R.id.sanityRadioButton8);
        sanityRadioButton9 = findViewById(R.id.sanityRadioButton9);

        sanityTextView1 = findViewById(R.id.sanityTextView1);
        sanityTextView2 = findViewById(R.id.sanityTextView2);
        sanityTextView3 = findViewById(R.id.sanityTextView3);
        sanityTextView4 = findViewById(R.id.sanityTextView4);
        sanityTextView5 = findViewById(R.id.sanityTextView5);
        sanityTextView6 = findViewById(R.id.sanityTextView6);
        sanityTextView7 = findViewById(R.id.sanityTextView7);
        sanityTextView8 = findViewById(R.id.sanityTextView8);
    }

    public void setKnowledgeView() {
        knowledgeRadioButton0 = findViewById(R.id.knowledgeRadioButton0);
        knowledgeRadioButton1 = findViewById(R.id.knowledgeRadioButton1);
        knowledgeRadioButton2 = findViewById(R.id.knowledgeRadioButton2);
        knowledgeRadioButton3 = findViewById(R.id.knowledgeRadioButton3);
        knowledgeRadioButton4 = findViewById(R.id.knowledgeRadioButton4);
        knowledgeRadioButton5 = findViewById(R.id.knowledgeRadioButton5);
        knowledgeRadioButton6 = findViewById(R.id.knowledgeRadioButton6);
        knowledgeRadioButton7 = findViewById(R.id.knowledgeRadioButton7);
        knowledgeRadioButton8 = findViewById(R.id.knowledgeRadioButton8);
        knowledgeRadioButton9 = findViewById(R.id.knowledgeRadioButton9);

        knowledgeTextView1 = findViewById(R.id.knowledgeTextView1);
        knowledgeTextView2 = findViewById(R.id.knowledgeTextView2);
        knowledgeTextView3 = findViewById(R.id.knowledgeTextView3);
        knowledgeTextView4 = findViewById(R.id.knowledgeTextView4);
        knowledgeTextView5 = findViewById(R.id.knowledgeTextView5);
        knowledgeTextView6 = findViewById(R.id.knowledgeTextView6);
        knowledgeTextView7 = findViewById(R.id.knowledgeTextView7);
        knowledgeTextView8 = findViewById(R.id.knowledgeTextView8);
    }

}