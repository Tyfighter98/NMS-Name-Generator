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

        EditText biomeText = (EditText)findViewById(R.id.biomeText);
        String biome = biomeText.getText().toString();

        switch (biome) {
            case "Desert":
                plantName+="De";
                break;
            case "Lava":
                plantName+="La";
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
            default:
                plantName="Invalid Resource";
        }
    }
}

