package tyfighter98.nmsnamegenorator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String GENERATED_NAME = "tyfighter98.nmsnamegenorator.NAME";
    public String plantName = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendName(View view) {
        Intent nameIntent = new Intent(this, DisplayNameActivity.class);

        genName();

        nameIntent.putExtra(GENERATED_NAME, plantName);

        startActivity(nameIntent);
    }

    public void genName() {
        // Ensures planetName hasn't been initialized by something else
        plantName = "";

//      <<---------Biome--------->>
        EditText biomeText = (EditText)findViewById(R.id.biomeText);
        String biome = biomeText.getText().toString();

        switch (biome) {
            case "Desert":
                plantName+="De";
                break;
            case "Featureless":
                plantName+="Fe";
                break;
            case "Floating Islands":
                plantName+="Fi";
                break;
            case "Grassy":
            case "Plains":
                plantName+="Ga";
                break;
            case "Lava":
                plantName+="La";
                break;
            case "Liquid":
                plantName+="Li";
                break;
            case "Mountains":
                plantName+="Mo";
                break;
            case "Pillars":
                plantName+="Pi";
                break;
            case "Rocky":
                plantName+="Ro";
                break;
            case "Snow":
            case "Ice":
                plantName+="Si";
                break;
            case "Weird":
                plantName+="We";
                break;
            default:
                plantName="Invalid Biome";
                break;
        }
        EditText resourcesText = (EditText)findViewById(R.id.resourcesText);
        String resources = resourcesText.getText().toString();

        switch (resources) {
            case "Ship":
                plantName+="shp";
                break;
            case "Suit":
                plantName+="sut";
                break;
            case "Multi-Tool":
            case "Tool":
                plantName+="mul";
                break;
            case "Blueprint":
                plantName+="bup";
                break;
            case "Trading":
            case "Trade":
                plantName+="tar";
                break;
            case "Ship/Suit":
                plantName+="shs";
                break;
            case "Ship/Multi-Tool":
            case "Ship/Tool":
                plantName+="shm";
                break;
            case "Ship/Trading":
            case "Ship/Trade":
                plantName+="sht";
                break;
            case "Ship/Blueprint":
                plantName+="shb";
                break;
            case "Suit/Multi-Tool":
            case "Suit/Tool":
                plantName+="sum";
                break;
            case "Suit/Trading":
            case "Suit/Trade":
                plantName+="str";
                break;
            case "Suit/Blueprint":
                plantName+="sub";
                break;
            case "Multi-Tool/Trading":
            case "Tool/Trading":
            case "Multi-Tool/Trade":
            case "Tool/Trade":
                plantName+="mtr";
                break;
            case "Multi-Tool/Blueprint":
            case "Tool/Blueprint":
                plantName+="mbl";
                break;
            case "Blueprint/Trading":
            case "Blueprint/Trade":
                plantName+="btr";
                break;
            case "No Blueprint":
                plantName+="nth";
                break;
            default:
                plantName="Invalid Resource";
        }
    }
}

