package com.example.apps.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.apps.R;

import java.util.List;

public class SelectCharacter extends AppCompatActivity {
    CardView cvHeatherGranville,
        cvJennyLeClerc,
        cvOxBellows,
        cvDarrinWilliams,
        cvVivianLopez,
        cvMadameZostra,
        cvMissyDubourde,
        cvZoeIngstrom,
        cvPeterAkimoto,
        cvBrandonJaspers,
        cvProfessorLongfellow,
        cvFatherRhinehardt;
    ImageView ivHeatherGranville,
            ivJennyLeClerc,
            ivOxBellows,
            ivDarrinFlashWilliams,
            ivVivianLopez,
            ivMadameZostra,
            ivMissyDubourde,
            ivZoeIngstrom,
            ivPeterAkimoto,
            ivBrandonJaspers,
            ivProfessorLongfellow,
            ivFatherRhinehardt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_status_page);
        getAllView();
        setAllClickListener();
        setPicture();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }


    public void getAllView(){
        cvHeatherGranville = findViewById(R.id.HeatherGranvilleCard);
        cvJennyLeClerc = findViewById(R.id.JennyLeClercCard);
        cvOxBellows = findViewById(R.id.OxBellowsCard);
        cvDarrinWilliams = findViewById(R.id.DarrinFlashWilliamsCard);
        cvVivianLopez = findViewById(R.id.VivianLopezCard);
        cvMadameZostra = findViewById(R.id.MadameZostraCard);
        cvMissyDubourde = findViewById(R.id.MissyDubourdeCard);
        cvZoeIngstrom = findViewById(R.id.ZoeIngstromCard);
        cvPeterAkimoto = findViewById(R.id.PeterAkimotoCard);
        cvBrandonJaspers = findViewById(R.id.BrandonJaspersCard);
        cvProfessorLongfellow = findViewById(R.id.ProfessorLongfellowCard);
        cvFatherRhinehardt = findViewById(R.id.FatherRhinehardtCard);

        ivHeatherGranville = findViewById(R.id.ivHeatherGranville);
        ivJennyLeClerc = findViewById(R.id.ivJennyLeClerc);
        ivOxBellows = findViewById(R.id.ivOxBellows);
        ivDarrinFlashWilliams = findViewById(R.id.ivDarrinFlashWilliams);
        ivVivianLopez = findViewById(R.id.ivVivianLopez);
        ivMadameZostra = findViewById(R.id.ivMadameZostra);
        ivMissyDubourde = findViewById(R.id.ivMissyDubourde);
        ivZoeIngstrom = findViewById(R.id.ivZoeIngstrom);
        ivPeterAkimoto = findViewById(R.id.ivPeterAkimoto);
        ivBrandonJaspers = findViewById(R.id.ivBrandonJaspers);
        ivProfessorLongfellow = findViewById(R.id.ivProfessorLongfellow);
        ivFatherRhinehardt = findViewById(R.id.ivFatherRhinehardt);
    }
    public void setPicture(){

        ivHeatherGranville.setImageResource(R.drawable.char_heathergranville);
        ivJennyLeClerc.setImageResource(R.drawable.char_jennyleclerc);
        ivOxBellows.setImageResource(R.drawable.char_oxbellows);
        ivDarrinFlashWilliams.setImageResource(R.drawable.char_darrinflashwilliams);
        ivVivianLopez.setImageResource(R.drawable.char_vivianlopez);
        ivMadameZostra.setImageResource(R.drawable.char_madamezostra);
        ivMissyDubourde.setImageResource(R.drawable.char_missydubourde);
        ivZoeIngstrom.setImageResource(R.drawable.char_zoeingstrom);
        ivPeterAkimoto.setImageResource(R.drawable.char_peterakimoto);
        ivBrandonJaspers.setImageResource(R.drawable.char_brandonjasper);
        ivProfessorLongfellow.setImageResource(R.drawable.char_professorlongfellow);
        ivFatherRhinehardt.setImageResource(R.drawable.char_fatherrhinehardt);
    }
    public void setAllClickListener(){
//Heather Granville
        cvHeatherGranville.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Heather Granville");
                return true;
            }
        });
        cvHeatherGranville.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Heather Granville");
            }
        });

//Jenny Leclerc
        cvJennyLeClerc.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Jenny Leclerc");
                return true;
            }
        });
        cvJennyLeClerc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Jenny Leclerc");
            }
        });

//Ox Bellows
        cvOxBellows.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Ox Bellows");
                return true;
            }
        });
        cvOxBellows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Ox Bellows");
            }
        });

//Darrin Flash Williams
        cvDarrinWilliams.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Darrin 'Flash' Williams");
                return true;
            }
        });
        cvDarrinWilliams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Darrin 'Flash' Williams");
            }
        });

//Vivian Lopez
        cvVivianLopez.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Vivian Lopez");
                return true;
            }
        });
        cvVivianLopez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Vivian Lopez");
            }
        });

//Madame Zostra
        cvMadameZostra.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Madame Zostra");
                return true;
            }
        });
        cvMadameZostra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Madame Zostra");
            }
        });

//Missy Dubourde
        cvMissyDubourde.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Missy Dubourde");
                return true;
            }
        });
        cvMissyDubourde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Missy Dubourde");
            }
        });

//Zoe Ingstrom
        cvZoeIngstrom.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Zoe Ingstrom");
                return true;
            }
        });
        cvZoeIngstrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Zoe Ingstrom");
            }
        });

//Peter Akimoto
        cvPeterAkimoto.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Peter Akimoto");
                return true;
            }
        });
        cvPeterAkimoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Peter Akimoto");
            }
        });

//Brandon Jaspers
        cvBrandonJaspers.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Brandon Jaspers");
                return true;
            }
        });
        cvBrandonJaspers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Brandon Jaspers");
            }
        });

//Professor Longfellow
        cvProfessorLongfellow.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Professor Longfellow");
                return true;
            }
        });
        cvProfessorLongfellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Professor Longfellow");
            }
        });

//Father Rhinehardt
        cvFatherRhinehardt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ViewLore("Father Rhinehardt");
                return true;
            }
        });
        cvFatherRhinehardt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PlayAs("Father Rhinehardt");
            }
        });
    }


    public void PlayAs(final String explorerName){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Play as "+explorerName + " ?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        playGame(explorerName);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void playGame(String explorerName){
        Intent intent = new Intent(this,StatusActivity.class);
        intent.putExtra("EXPLORERNAME",explorerName);
        startActivity(intent);
    }
    public void ViewLore(final String explorerName){

        String basicStatus[] = getBasicStatus(explorerName);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(explorerName + "'s Basic Status \n"
        + "SPD : " + basicStatus[6] +"\n"
        + "MIG : " + basicStatus[7] +"\n"
        + "SAN : " + basicStatus[8] +"\n"
        + "KNO : " + basicStatus[9] +"\n"
        + "BDY : " + basicStatus[4])
                .setCancelable(false)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }

    public String[] getBasicStatus(String explorerName){
        String profile[] = {};
        if(explorerName.equals("Heather Granville")){
            profile = getResources().getStringArray(R.array.HeatherGranvilleProfile);

        }else if(explorerName.equals("Jenny Leclerc")){
            profile = getResources().getStringArray(R.array.JennyLeclercProfile);

        }else if(explorerName.equals("Ox Bellows")){
            profile = getResources().getStringArray(R.array.OxBellowsProfile);


        }else if(explorerName.equals("Darrin 'Flash' Williams")){
            profile = getResources().getStringArray(R.array.DarrinWilliamsProfile);


        }else if(explorerName.equals("Vivian Lopez")){
            profile = getResources().getStringArray(R.array.VivianLopezProfile);

        }else if(explorerName.equals("Madame Zostra")){
            profile = getResources().getStringArray(R.array.MadameZostraProfile);


        }else if(explorerName.equals("Missy Dubourde")){
            profile = getResources().getStringArray(R.array.MissyDubourdeProfile);

        }else if(explorerName.equals("Zoe Ingstrom")){
            profile = getResources().getStringArray(R.array.ZoeIngstromProfile);

        }else if(explorerName.equals("Peter Akimoto")){
            profile = getResources().getStringArray(R.array.PeterAkimotoProfile);


        }else if(explorerName.equals("Brandon Jaspers")){
            profile = getResources().getStringArray(R.array.BrandonJaspersProfile);


        }else if(explorerName.equals("Professor Longfellow")){
            profile = getResources().getStringArray(R.array.ProfessorLongfellowProfile);


        }else if(explorerName.equals("Father Rhinehardt")){
            profile = getResources().getStringArray(R.array.FatherRhinehardtProfile);
        }
        return profile;
    }
}
